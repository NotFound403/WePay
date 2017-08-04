package org.hive.weChat.service;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hive.common.exception.PayException;
import org.hive.common.exception.RequiredParamException;
import org.hive.common.exception.SignatureException;
import org.hive.common.pay.PayType;
import org.hive.common.pay.Payable;
import org.hive.common.util.HttpKit;
import org.hive.common.util.ObjectUtils;
import org.hive.weChat.entity.PayRequestParams;

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


public class WeChatPayHandler implements Payable {
    private static final Log log = LogFactory.getLog(WeChatPayHandler.class);
    private PayType weChatPayTypeEnum;
    private PayRequestParams payRequestParams;

    /**
     * Instantiates a new Pay handler.
     *
     * @param weChatPayTypeEnum the we chat pay type enum
     * @param payRequestParams  the pay request params
     */
    public WeChatPayHandler(PayType weChatPayTypeEnum, PayRequestParams payRequestParams) {
        this.weChatPayTypeEnum = weChatPayTypeEnum;
        this.payRequestParams = payRequestParams;
    }

    @Override
    public Map<String, String> unifiedOrder() throws PayException {
        payRequestParams.setNonce_str(ObjectUtils.onceStrGenerator());
//        密钥需要排除不然影响签名生成
        payRequestParams.setSecretKey(null);
        String secretKey = payRequestParams.getSecretKey();
        Map<String, Object> sortedMap = ObjectUtils.paramsSorter(payRequestParams);
        Map<String, String> resultMap = new HashMap<>();
        try {
            String sign = ObjectUtils.signatureGenerator(sortedMap, "UTF-8", secretKey);
            log.info("生成签名：" + sign);
            sortedMap.put("sign", sign);
            String xml = ObjectUtils.mapToXML(sortedMap);
            resultMap = doHttpRequest(weChatPayTypeEnum.getApi(), xml);
        } catch (SignatureException | RequiredParamException e) {
            log.debug("统一下单参数处理异常", e);
        }
        if ("SUCCESS".equals(resultMap.get("result_code"))) {
            return resultMap;
        }
        throw new PayException(resultMap.get("err_code_des"));
    }

    @Override
    public Map<String, String> orderQuery(String orderId, boolean isTransactionId) throws PayException {

        try {
            String xml = xmlForQueryWrapper(orderId, isTransactionId);
            String url = "https://api.mch.weixin.qq.com/pay/orderquery";
            return doHttpRequest(url, xml);
        } catch (SignatureException | RequiredParamException e) {
            log.debug("查询订单参数处理异常：", e);
        }
        throw new PayException("查询订单异常");
    }


    /**
     * 将查询订单参数包装成Xml.
     *
     * @param orderId         the order id
     * @param isTransactionId the is transaction id
     * @return the string
     * @throws SignatureException     the signature exception
     * @throws RequiredParamException the required param exception
     */
    private String xmlForQueryWrapper(String orderId, boolean isTransactionId) throws SignatureException, RequiredParamException {
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
        if (isTransactionId) {
            map.put("transaction_id", orderId);
        } else {
            map.put("out_trade_no", orderId);
        }
        String sign = ObjectUtils.signatureGenerator(map, "UTF-8", secretKey);
        log.info("生成签名：" + sign);
        map.put("sign", sign);
        return ObjectUtils.mapToXML(map);
    }

    private Map<String, String> doHttpRequest(String url, String xml) throws PayException {
        String xmlResult = HttpKit.httpPost(url, xml);
        Map<String, String> resultMap = new HashMap<>();
        if (StringUtils.isNotEmpty(xmlResult)) {
            String responseXml = null;
            try {
                responseXml = new String(xmlResult.getBytes("ISO-8859-1"), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                log.debug("编码不支持", e);
            }
            resultMap = ObjectUtils.xmlToMap(responseXml);
        }
        if ("SUCCESS".equals(resultMap.get("result_code"))) {
            return resultMap;
        }
        throw new PayException(resultMap.get("err_code_des"));
    }
}
