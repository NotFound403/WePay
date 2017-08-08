package org.wepay.wechat.service;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger log = LoggerFactory.getLogger(WeChatPayService.class);
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
        String tradeType = weChatPayTypeEnum.name();
        payRequestParams.setTrade_type(tradeType);
        //        密钥需要排除不然影响签名生成
        if (!WeChatPayTypeEnum.JSAPI.name().equals(tradeType)) {
            payRequestParams.setOpenid(null);
        }
        payRequestParams.setSecretKey(null);
        Map<String, Object> sortedMap = ObjectUtils.paramsSorter(payRequestParams);
        Map<String, Object> resultMap = new HashMap<>();
        try {
            String sign = ObjectUtils.signatureGenerator(sortedMap, DEFAULT_CHARSET, secretKey);
            log.info("生成签名：" + sign);
            sortedMap.put("sign", sign);
            String xml = ObjectUtils.mapToXML(sortedMap);
//            请求
            resultMap = doWeChatPayRequest(weChatPayTypeEnum.getApi(), xml);
            if ("SUCCESS".equals(resultMap.get("result_code"))) {
                Map<String, Object> params = initReRequestParams(resultMap, tradeType);
                String signature = ObjectUtils.signatureGenerator(ObjectUtils.paramsSorter(params), DEFAULT_CHARSET, secretKey);
                if (WeChatPayTypeEnum.APP.name().equals(tradeType)) {
                    params.put("sign", signature);
                }
                if (WeChatPayTypeEnum.JSAPI.name().equals(tradeType)) {
                    params.put("paySign", signature);
                }
                return params;
            }
        } catch (SignatureException | RequiredParamException e) {
            log.debug("统一下单参数处理异常", e);
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
        return resultMap;
    }

    /**
     * 第二次发请求 封装参数  主要根据不同的支付请求 进行的二次封装   没办法 微信的文档跟代码风格太烂了
     *
     * @param map
     * @param tradeType
     * @return
     */
    private Map<String, Object> initReRequestParams(Map<String, Object> map, String tradeType) {
        Map<String, Object> result = new HashMap<>();
        //TODO 其他类型的 未实现 待补充
        Object appId = map.get("appid");
        Object partnerId = map.get("mch_id");
        Object prepayId = map.get("prepay_id");
        Object nonceStr = map.get("nonce_str");
//        APP支付
        if (WeChatPayTypeEnum.APP.name().equals(tradeType)) {
            result.put("appid", appId);
            result.put("partnerid", partnerId);
            result.put("prepayid", prepayId);
            result.put("package", "Sign=WXPay");
            result.put("noncestr", nonceStr);
            result.put("timestamp", System.currentTimeMillis() / 1000);
        }
//        公众号内H5发起支付  公众号支付
        if (WeChatPayTypeEnum.JSAPI.name().equals(tradeType)) {
            result.put("appId", appId);
            result.put("package", "prepay_id=" + prepayId);
            result.put("nonceStr", nonceStr);
            result.put("timeStamp", System.currentTimeMillis() / 1000);
            result.put("signType", "MD5");
        }
        return result;
    }
}
