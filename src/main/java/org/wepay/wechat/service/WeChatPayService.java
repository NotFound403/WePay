package org.wepay.wechat.service;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wepay.common.exception.PayException;
import org.wepay.common.exception.RequiredParamException;
import org.wepay.common.exception.SignatureException;
import org.wepay.common.pay.PayType;
import org.wepay.common.pay.Payable;
import org.wepay.common.util.HttpKit;
import org.wepay.common.util.ObjectUtils;
import org.wepay.wechat.entity.PayRequestParams;
import org.wepay.wechat.enumeration.OrderIdTypeEnum;
import org.wepay.wechat.enumeration.WeChatPayTypeEnum;

import java.io.UnsupportedEncodingException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/17  17:21
 */


public class WeChatPayService implements Payable {
    private static final Log log = LogFactory.getLog(WeChatPayService.class);
    private static final String DEFAULT_CHARSET = "UTF-8";
    private PayRequestParams payRequestParams;

    /**
     * Instantiates a new Pay handler.
     *
     * @param payRequestParams the pay request params
     */
    public WeChatPayService(PayRequestParams payRequestParams) {
        this.payRequestParams = payRequestParams;
    }

    @Override
    public Map<String, Object> unifiedOrder(PayType weChatPayTypeEnum) throws PayException {
        String secretKey = payRequestParams.getSecretKey();
        payRequestParams.setTrade_type(weChatPayTypeEnum.name());
        //        密钥需要排除不然影响签名生成
        payRequestParams.setSecretKey(null);
        Map<String, Object> sortedMap = ObjectUtils.paramsSorter(payRequestParams);
        Map<String, Object> resultMap = new HashMap<>();
        try {
            String sign = ObjectUtils.signatureGenerator(sortedMap, DEFAULT_CHARSET, secretKey);
            log.info("生成签名：" + sign);
            sortedMap.put("sign", sign);
            String xml = ObjectUtils.mapToXML(sortedMap);
            resultMap = doWeChatPayRequest(weChatPayTypeEnum.getApi(), xml);
        } catch (SignatureException | RequiredParamException e) {
            log.debug("统一下单参数处理异常", e);
        }
        if ("SUCCESS".equals(resultMap.get("result_code"))) {
            return resultMap;
        }
        throw new PayException("参数列表：" + resultMap);
    }

    @Override
    public Map<String, Object> orderQuery(String orderId, OrderIdTypeEnum orderIdTypeEnum) throws PayException {
        return orderHandler(WeChatPayTypeEnum.ORDER_QUERY, orderId, orderIdTypeEnum);
    }

    @Override
    public Map<String, Object> closeOrder(String outTradeNo) throws PayException {
        return orderHandler(WeChatPayTypeEnum.CLOSE_ORDER, outTradeNo, OrderIdTypeEnum.OUT_TRADE_NO);
    }

    @Override
    public Map<String, Object> refundQuery(String orderId, OrderIdTypeEnum orderIdTypeEnum) throws PayException {
        return orderHandler(WeChatPayTypeEnum.REFUND_QUERY, orderId, orderIdTypeEnum);
    }

    private Map<String, Object> orderHandler(PayType weChatPayTypeEnum, String orderId, OrderIdTypeEnum orderIdTypeEnum) throws PayException {
        String xml = xmlForQueryWrapper(orderId, orderIdTypeEnum);
        Map<String, Object> result = doWeChatPayRequest(weChatPayTypeEnum.getApi(), xml);
        if ("SUCCESS".equals(result.get("result_code"))) {
            return result;
        }
        throw new PayException("结果集：" + result);
    }

    /**
     * 将查询订单参数包装成Xml.
     *
     * @param orderId the order id
     * @return the string
     */
    private String xmlForQueryWrapper(String orderId, OrderIdTypeEnum orderIdTypeEnum) {
        String nonceStr = ObjectUtils.onceStrGenerator();
        String appId = payRequestParams.getAppid();
        String mchId = payRequestParams.getMch_id();
        String secretKey = payRequestParams.getSecretKey();

        Map<String, Object> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        map.put("nonce_str", nonceStr);
        map.put("appid", appId);
        map.put("mch_id", mchId);
        map.put(orderIdTypeEnum.name().toLowerCase(), orderId);
        String xml = null;
        try {
            String sign = ObjectUtils.signatureGenerator(map, DEFAULT_CHARSET, secretKey);
            log.info("生成签名：" + sign);
            map.put("sign", sign);
            xml = ObjectUtils.mapToXML(map);
        } catch (SignatureException | RequiredParamException e) {
            log.debug("包装xml异常：", e);
        }
        return xml;
    }

    /**
     * 请求腾讯支付
     *
     * @param url 调用腾讯支付对应的API
     * @param xml 封装好的xml格式的参数
     * @return the map
     */
    private Map<String, Object> doWeChatPayRequest(String url, String xml) {
        String xmlResult = HttpKit.httpPost(url, xml);
        Map<String, Object> resultMap = new HashMap<>();
        if (StringUtils.isNotEmpty(xmlResult)) {
            String responseXml = null;
            try {
                responseXml = new String(xmlResult.getBytes("ISO-8859-1"), DEFAULT_CHARSET);
            } catch (UnsupportedEncodingException e) {
                log.debug("编码不支持", e);
            }
            resultMap = ObjectUtils.xmlToMap(responseXml);
        }
        log.debug("结果集： " + resultMap);
        return resultMap;
    }
}
