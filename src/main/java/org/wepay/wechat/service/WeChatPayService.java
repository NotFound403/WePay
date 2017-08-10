package org.wepay.wechat.service;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wepay.common.exception.PayException;
import org.wepay.common.exception.RequiredParamException;
import org.wepay.common.pay.*;
import org.wepay.common.util.HttpKit;
import org.wepay.common.util.ObjectUtils;
import org.wepay.common.util.QRCodeUtil;
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

import static org.wepay.common.util.ObjectUtils.DEFAULT_CHARSET;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/17  17:21
 */


public class WeChatPayService implements Payable {
    private static final Logger log = LoggerFactory.getLogger(WeChatPayService.class);
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

    /**
     * 统一下单.
     * 相关支付方式调用 返回值  如果有返回值 说明 result_code  为 true     后续不需要判断是否业务处理成功
     *
     * @param payRequestParams the pay request params
     * @return the map
     * @throws PayException the pay exception
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_1">腾讯微信支付统一下单文档</a>
     */
    private Map<String, Object> unifiedOrder(Params payRequestParams) throws PayException {
        payRequestParams.setAppid(weChatPayConfig.getAppid());
        payRequestParams.setMch_id(weChatPayConfig.getMch_id());
        payRequestParams.setNotify_url(weChatPayConfig.getNotify_url());
        payRequestParams.setSign_type(weChatPayConfig.getSign_type());
        payRequestParams.setOpenid(weChatPayConfig.getOpenid());

        String secretKey = weChatPayConfig.getSecretKey();
        String tradeType = payRequestParams.getTrade_type();

        Map<String, Object> sortedMap = ObjectUtils.paramsSorter(payRequestParams);
        String sign = ObjectUtils.signatureGenerator(sortedMap, DEFAULT_CHARSET, secretKey);
        sortedMap.put("sign", sign);
        Map<String, Object> resultMap = new HashMap<>();
        try {
            String xml = ObjectUtils.mapToXML(sortedMap);
            resultMap = doWeChatPayRequest(WeChatPayTypeEnum.valueOf(tradeType).getApi(), xml);
            boolean flag = ObjectUtils.verifySignature(resultMap, secretKey);
            if ("SUCCESS".equals(resultMap.get("result_code")) && flag) {
                resultMap.put("secretKey", secretKey);
                return resultMap;
            }
        } catch (RequiredParamException e) {
            log.debug("统一下单参数处理异常", e);
        }
        throw new PayException("参数列表：" + resultMap);
    }

    @Override
    public Map<String, Object> payByJsApi(Params params) throws PayException {
        params.setTrade_type(WeChatPayTypeEnum.JSAPI);
        Map<String, Object> resultMap = unifiedOrder(params);
        Object appId = resultMap.get("appid");
        Object prepayId = resultMap.get("prepay_id");
        Object nonceStr = resultMap.get("nonce_str");
        String secretKey = (String) resultMap.get("secretKey");

        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("appId", appId);
        returnMap.put("package", "prepay_id=" + prepayId);
        returnMap.put("nonceStr", nonceStr);
        returnMap.put("timeStamp", System.currentTimeMillis() / 1000);
        returnMap.put("signType", "MD5");
        String paySign = ObjectUtils.signatureGenerator(ObjectUtils.paramsSorter(returnMap), DEFAULT_CHARSET, secretKey);
        returnMap.put("paySign", paySign);
        return returnMap;
    }

    @Override
    public Map<String, Object> payByApp(Params params) throws PayException {
        params.setTrade_type(WeChatPayTypeEnum.APP);
        Map<String, Object> resultMap = unifiedOrder(params);

        Object appId = resultMap.get("appid");
        Object prepayId = resultMap.get("prepay_id");
        Object nonceStr = resultMap.get("nonce_str");
        Object partnerId = resultMap.get("mch_id");
        String secretKey = (String) resultMap.get("secretKey");

        Map<String, Object> returnMap = new HashMap<>();

        returnMap.put("appid", appId);
        returnMap.put("partnerid", partnerId);
        returnMap.put("prepayid", prepayId);
        returnMap.put("package", "Sign=WXPay");
        returnMap.put("noncestr", nonceStr);
        returnMap.put("timestamp", System.currentTimeMillis() / 1000);

        String sign = ObjectUtils.signatureGenerator(ObjectUtils.paramsSorter(returnMap), DEFAULT_CHARSET, secretKey);
        returnMap.put("sign", sign);
        return returnMap;
    }

    @Override
    public Map<String, Object> nativeModeOneCallback(HttpServletRequest request, HttpServletResponse response, NativeBusiness nativeBusinessWrapper) throws PayException {
        Map<String, Object> params = HttpKit.resolveRequestData(request);
        String productId = (String) params.get("product_id");
        Params payRequestParams = nativeBusinessWrapper.getParams(productId);
        payRequestParams.setTrade_type(WeChatPayTypeEnum.NATIVE);
        Map<String, Object> map = unifiedOrder(payRequestParams);
        Object returnCode = map.get("return_code");
        Object resultCode = map.get("result_code");
        Object appId = map.get("appid");
        Object partnerId = map.get("mch_id");
        Object prepayId = map.get("prepay_id");
        Object nonceStr = map.get("nonce_str");

        Map<String, Object> result = new HashMap<>();
        result.put("return_code", returnCode);
        result.put("appid", appId);
        result.put("mch_id", partnerId);
        result.put("nonce_str", nonceStr);
        result.put("prepay_id", prepayId);
        result.put("result_code", resultCode);
        try (BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream())) {
            String xml = ObjectUtils.mapToXML(result);
            out.write(xml.getBytes());
            out.flush();
        } catch (RequiredParamException | IOException e) {
            log.debug("扫码支付模式一失败：", e);
        }
        return result;
    }

    @Override
    public Map<String, Object> nativeModeTwo(Params payRequestParams, HttpServletResponse response) throws PayException {
        payRequestParams.setTrade_type(WeChatPayTypeEnum.NATIVE);
        Map<String, Object> result = unifiedOrder(payRequestParams);
        String codeUrl = (String) result.get("code_url");
        try {
            QRCodeUtil.encode(codeUrl, 200, 200, "png", response.getOutputStream());
        } catch (IOException e) {
            log.debug("二维码转换异常：", e);
        }
        return result;
    }

    @Override
    public Map<String, Object> payByH5(Params payRequestParams) throws PayException {
        payRequestParams.setTrade_type(WeChatPayTypeEnum.MWEB);
        Map<String, Object> map = unifiedOrder(payRequestParams);
        Object appId = map.get("appid");
        Object partnerId = map.get("mch_id");
        Object resultCode = map.get("result_code");
        Object mwebUrl = map.get("mweb_url");
        Object nonceStr = map.get("nonce_str");

        Map<String, Object> result = new HashMap<>();
        result.put("appid", appId);
        result.put("mch_id", partnerId);
        result.put("nonce_str", nonceStr);
        result.put("result_code", resultCode);
        result.put("mweb_url", mwebUrl);
        return result;
    }

    /**
     * 生成二维码编码 用于扫码支付模式一
     *
     * @param productId 商品编号  此id 是商户端生成   用于标识该次商品交易的商品id  并不按照商品种类来规定
     * @return 规定格式的二维码编码 用于后续二维码的生成
     */
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
        String sign = ObjectUtils.signatureGenerator(ObjectUtils.paramsSorter(map), DEFAULT_CHARSET, secretKey);
        return String.format(QR_CODE_TEMPLATE, sign, appId, mchId, productId, timestamp, nonceStr);
    }

    /**
     * 生成带logo的支付二维码.
     *
     * @param out       二维码输出流
     * @param logoPath  logo的路径
     * @param productId 商品编号
     */
    public void createQRCodeImage(OutputStream out, String logoPath, String productId) {
        QRCodeUtil.encode(createQRCodeUrl(productId), 200, 200, "png", logoPath, out);
    }

    /**
     * 生成不带logo的支付二维码.
     *
     * @param out       二维码输出流
     * @param productId 商品编号
     */
    public void createQRCodeImage(OutputStream out, String productId) {
        QRCodeUtil.encode(createQRCodeUrl(productId), 200, 200, "png", out);
    }

    @Override
    public Map<String, Object> orderQuery(String orderId, OrderIdTypeEnum orderIdTypeEnum) throws PayException {
        if (OrderIdTypeEnum.OUT_REFUND_NO.name().equals(orderIdTypeEnum.name()) || OrderIdTypeEnum.REFUND_ID.name().equals(orderIdTypeEnum.name())) {
            throw new PayException("订单编号类型不匹配");
        }
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
        String sign = ObjectUtils.signatureGenerator(map, DEFAULT_CHARSET, secretKey);
        map.put("sign", sign);
        try {
            xml = ObjectUtils.mapToXML(map);
        } catch (RequiredParamException e) {
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
}
