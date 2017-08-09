package org.wepay.wechat.service;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wepay.common.exception.PayException;
import org.wepay.common.exception.RequiredParamException;
import org.wepay.common.exception.SignatureException;
import org.wepay.common.pay.*;
import org.wepay.common.util.HttpKit;
import org.wepay.common.util.ObjectUtils;
import org.wepay.common.util.QRCodeUtil;
import org.wepay.wechat.entity.PayRequestParams;
import org.wepay.wechat.enumeration.OrderIdTypeEnum;
import org.wepay.wechat.enumeration.WeChatPayTypeEnum;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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
    private static final String QR_CODE_TEMPLATE = "weixin：//wxpay/bizpayurl?sign=%s&appid=%s&mch_id=%s&product_id=%s&time_stamp=%s&nonce_str=%s";
    private PayConfig weChatPayConfig;

    /**
     * Instantiates a new We chat pay service.
     *
     * @param weChatPayConfig the we chat pay config
     */
    public WeChatPayService(PayConfig weChatPayConfig) {
        this.weChatPayConfig = weChatPayConfig;
    }

    @Override
    public Map<String, Object> unifiedOrder(PayType weChatPayTypeEnum, Params payRequestParams) throws PayException {
        payRequestParams.setAppid(weChatPayConfig.getAppid());
        payRequestParams.setMch_id(weChatPayConfig.getMch_id());
        payRequestParams.setNotify_url(weChatPayConfig.getNotify_url());
        payRequestParams.setSign_type(weChatPayConfig.getSign_type());
        String secretKey = weChatPayConfig.getSecretKey();
        String tradeType = weChatPayTypeEnum.name();
        payRequestParams.setTrade_type(tradeType);
        payRequestParams.setOpenid(weChatPayConfig.getOpenid());
        Map<String, Object> sortedMap = ObjectUtils.paramsSorter(payRequestParams);
        Map<String, Object> resultMap = new HashMap<>();
        try {
            String sign = ObjectUtils.signatureGenerator(sortedMap, DEFAULT_CHARSET, secretKey);
            log.info("生成签名：" + sign);
            sortedMap.put("sign", sign);
            String xml = ObjectUtils.mapToXML(sortedMap);
            resultMap = doWeChatPayRequest(weChatPayTypeEnum.getApi(), xml);
            if ("SUCCESS".equals(resultMap.get("result_code"))) {
                Map<String, Object> params = initReRequestParams(resultMap, tradeType);
                String signature = ObjectUtils.signatureGenerator(ObjectUtils.paramsSorter(params), DEFAULT_CHARSET, secretKey);
                if (WeChatPayTypeEnum.JSAPI.name().equals(tradeType)) {
                    params.put("paySign", signature);
                } else {
                    params.put("sign", signature);
                }
                return params;
            }
        } catch (SignatureException | RequiredParamException e) {
            log.debug("统一下单参数处理异常", e);
        }
        throw new PayException("参数列表：" + resultMap);
    }

    /**
     * Native mode one.
     *
     * @param request               the request
     * @param response              the response
     * @param nativeBusinessWrapper the native business wrapper
     * @throws PayException the pay exception
     */
    @Override
    public Map<String, Object> nativeModeOne(HttpServletRequest request, HttpServletResponse response, NativeBusiness nativeBusinessWrapper) throws PayException {
        Map<String, Object> params = HttpKit.resolveRequestData(request);
        String productId = (String) params.get("product_id");
        PayRequestParams payRequestParams = nativeBusinessWrapper.getParams(productId);
        Map<String, Object> result = unifiedOrder(WeChatPayTypeEnum.NATIVE, payRequestParams);
        try (BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream())) {
            String xml = ObjectUtils.mapToXML(result);
            out.write(xml.getBytes());
            out.flush();
        } catch (RequiredParamException | IOException e) {
            log.debug("扫码支付模式一失败：", e);
        }
        result.put("product_id", productId);
        return result;
    }

    private String createQRCodeUrl(String productId) {
        String appId = weChatPayConfig.getAppid();
        String mchId = weChatPayConfig.getMch_id();
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        String secretKey = weChatPayConfig.getSecretKey();
        String nonceStr = ObjectUtils.onceStrGenerator();
        Map<String, String> map = new HashMap<>();
        map.put("appid", appId);
        map.put("time_stamp", timestamp);
        map.put("mch_id", mchId);
        map.put("nonce_str", nonceStr);
        map.put("product_id", productId);
        String sign = null;
        try {
            sign = ObjectUtils.signatureGenerator(ObjectUtils.paramsSorter(map), DEFAULT_CHARSET, secretKey);
        } catch (SignatureException e) {
            log.debug("生成签名异常: ", e);
        }
        return String.format(QR_CODE_TEMPLATE, sign, appId, mchId, productId, timestamp, nonceStr);
    }

    /**
     * 生成带logo的支付二维码.
     *
     * @param out       the out
     * @param logoPath  the logo path
     * @param productId the product id
     */
    public void createQRCodeImage(OutputStream out, String logoPath, String productId) {
        QRCodeUtil.encode(createQRCodeUrl(productId), 200, 200, "png", logoPath, out);
    }

    /**
     * 生成不带logo的支付二维码.
     *
     * @param out       the out
     * @param productId the product id
     */
    public void createQRCodeImage(OutputStream out, String productId) {
        QRCodeUtil.encode(createQRCodeUrl(productId), 200, 200, "png", out);
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
        String xml = xmlForQueryWrapper(orderId, orderIdTypeEnum, weChatPayConfig);
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
    private String xmlForQueryWrapper(String orderId, OrderIdTypeEnum orderIdTypeEnum, PayConfig payConfig) {
        String nonceStr = ObjectUtils.onceStrGenerator();
        String appId = payConfig.getAppid();
        String mchId = payConfig.getMch_id();
        String secretKey = payConfig.getSecretKey();

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
            log.info(String.format("生成签名：%s", sign));
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
        if (WeChatPayTypeEnum.NATIVE.name().equals(tradeType)) {
            Object returnCode = map.get("return_code");
            Object resultCode = map.get("result_code");
            result.put("return_code", returnCode);
            result.put("appid", appId);
            result.put("mch_id", partnerId);
            result.put("nonce_str", nonceStr);
            result.put("prepay_id", prepayId);
            result.put("result_code", resultCode);
        }
        return result;
    }
}
