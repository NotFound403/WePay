package cn.felord.wepay.wechat.service;

import cn.felord.wepay.common.exception.PayException;
import cn.felord.wepay.common.pay.*;
import cn.felord.wepay.common.util.HttpKit;
import cn.felord.wepay.common.util.ObjectUtils;
import cn.felord.wepay.common.util.QRCodeUtil;
import cn.felord.wepay.wechat.entity.Bill;
import cn.felord.wepay.wechat.entity.PayRequestParams;
import cn.felord.wepay.wechat.entity.RefundRequestParams;
import cn.felord.wepay.wechat.enumeration.OrderIdTypeEnum;
import cn.felord.wepay.wechat.enumeration.WeChatPayTypeEnum;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static cn.felord.wepay.common.pay.Constant.BILL_KEY;
import static cn.felord.wepay.common.pay.Constant.PARAMS_KEY;
import static cn.felord.wepay.common.util.ObjectUtils.DEFAULT_CHARSET;
import static cn.felord.wepay.common.util.ObjectUtils.MD5;

/**
 * 微信支付客户端.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/17  17:21
 */
public class WeChatPayClient implements Payable {

    private static final Logger log = LoggerFactory.getLogger(WeChatPayClient.class);
    private static final String QR_CODE_TEMPLATE = "weixin：//wxpay/bizpayurl?sign=%s&appid=%s&mch_id=%s&product_id=%s&time_stamp=%s&nonce_str=%s";
    private PayConfig weChatPayConfig;

    /**
     * Instantiates a new We chat pay service.
     *
     * @param weChatPayConfig the we chat pay config
     */
    public WeChatPayClient(PayConfig weChatPayConfig) {
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

        String appId = weChatPayConfig.getAppid();
        String mchId = weChatPayConfig.getMch_id();
        String notifyUrl = weChatPayConfig.getNotify_url();
        String signType = weChatPayConfig.getSign_type();
        String secretKey = weChatPayConfig.getSecretKey();
        String devMode = weChatPayConfig.getDevMode();
        Params params = paramsBuilder(payRequestParams, appId, mchId, notifyUrl, signType);
        String tradeType = getPayTpye(params);
        Map<String, Object> sortedMap = ObjectUtils.paramsSorter(params);
        String sign = ObjectUtils.signatureGenerator(sortedMap, MD5, DEFAULT_CHARSET, secretKey);
        sortedMap.put("sign", sign);
        String xml = ObjectUtils.mapToXML(sortedMap);
        if ("true".equals(devMode)) {
            log.info(String.format("payRequestParams: %s", params));
            log.info(String.format("sortMap：%s", sortedMap));
            log.info(String.format("weChatPayConfig： %s", weChatPayConfig));
            log.info(String.format("统一下单参数xml： %s", xml));
        }
        Map<String, Object> resultMap = doWeChatPayRequest(WeChatPayTypeEnum.valueOf(tradeType).getApi(), xml);
        if ("true".equals(devMode)) {
            log.info(String.format("统一下单返回结果：%s", resultMap));
        }
        if ("SUCCESS".equals(resultMap.get("result_code"))) {
            ObjectUtils.verifySignature(resultMap, MD5, secretKey);
            resultMap.put("secretKey", secretKey);
            return resultMap;
        }
        throw new PayException("参数列表：" + resultMap);
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> payByMicro(Params payRequestParams) throws PayException {
        if (weChatPayConfig.isDevMode()) {
            String[] names = {"body", "out_trade_no", "total_fee", "spbill_create_ip", "auth_code"};
            List<String> fieldNames = Arrays.asList(names);
            ObjectUtils.checkParams(payRequestParams, fieldNames);
        }
        String appId = weChatPayConfig.getAppid();
        String mchId = weChatPayConfig.getMch_id();
        String signType = weChatPayConfig.getSign_type();
        Params params = paramsBuilder(payRequestParams, appId, mchId, signType);
        String secretKey = weChatPayConfig.getSecretKey();


        Map<String, Object> sortedMap = ObjectUtils.paramsSorter(params);
        String sign = ObjectUtils.signatureGenerator(sortedMap, MD5, DEFAULT_CHARSET, secretKey);
        sortedMap.put("sign", sign);
        String xml = ObjectUtils.mapToXML(sortedMap);
        Map<String, Object> resultMap = doWeChatPayRequest(WeChatPayTypeEnum.MICRO_PAY.getApi(), xml);
        if ("SUCCESS".equals(resultMap.get("result_code"))) {
            ObjectUtils.verifySignature(resultMap, MD5, secretKey);
            return injector(resultMap, payRequestParams);
        }
        throw new PayException("参数列表：" + resultMap);
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> payByJsApi(Params payRequestParams) throws PayException {
        if (weChatPayConfig.isDevMode()) {
            String[] names = {"body", "out_trade_no", "total_fee", "spbill_create_ip","openid"};
            List<String> fieldNames = Arrays.asList(names);
            ObjectUtils.checkParams(payRequestParams, fieldNames);
        }

        Params params = setPayTpye(payRequestParams, WeChatPayTypeEnum.JSAPI);
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
        String paySign = ObjectUtils.signatureGenerator(ObjectUtils.paramsSorter(returnMap), MD5, DEFAULT_CHARSET, secretKey);
        returnMap.put("paySign", paySign);
        return injector(resultMap, payRequestParams);
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> payByApp(Params payRequestParams) throws PayException {
        if (weChatPayConfig.isDevMode()) {
            String[] names = {"body", "out_trade_no", "total_fee", "spbill_create_ip"};
            List<String> fieldNames = Arrays.asList(names);
            ObjectUtils.checkParams(payRequestParams, fieldNames);
        }


        Params params = setPayTpye(payRequestParams, WeChatPayTypeEnum.APP);
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

        String sign = ObjectUtils.signatureGenerator(ObjectUtils.paramsSorter(returnMap), MD5, DEFAULT_CHARSET, secretKey);
        returnMap.put("sign", sign);
        return injector(returnMap, payRequestParams);
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> nativeModeOneCallback(HttpServletRequest request, HttpServletResponse response, NativeBusiness nativeBusinessWrapper) throws PayException {
        Map<String, Object> paramsMap = HttpKit.resolveRequestData(request);
        String productId = (String) paramsMap.get("product_id");
        Params payRequestParams = nativeBusinessWrapper.getParams(productId);

        if (weChatPayConfig.isDevMode()) {
            String[] names = {"body", "out_trade_no", "total_fee", "spbill_create_ip", "product_id"};
            List<String> fieldNames = Arrays.asList(names);
            ObjectUtils.checkParams(paramsMap, fieldNames);
        }
        Params params = setPayTpye(payRequestParams, WeChatPayTypeEnum.NATIVE);
        Map<String, Object> map = unifiedOrder(params);
        Object returnCode = map.get("return_code");
        Object resultCode = map.get("result_code");
        Object appId = map.get("appid");
        Object partnerId = map.get("mch_id");
        Object prepayId = map.get("prepay_id");
        Object nonceStr = map.get("nonce_str");

        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("return_code", returnCode);
        returnMap.put("appid", appId);
        returnMap.put("mch_id", partnerId);
        returnMap.put("nonce_str", nonceStr);
        returnMap.put("prepay_id", prepayId);
        returnMap.put("result_code", resultCode);
        try (BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream())) {
            String xml = ObjectUtils.mapToXML(returnMap);
            out.write(xml.getBytes());
            out.flush();
        } catch (IOException e) {
            log.debug("扫码支付模式一失败：", e);
        }
        return injector(returnMap, payRequestParams);
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> nativeModeTwo(Params payRequestParams, HttpServletResponse response) throws PayException {

        if (weChatPayConfig.isDevMode()) {
            String[] names = {"body", "out_trade_no", "total_fee", "spbill_create_ip", "product_id"};
            List<String> fieldNames = Arrays.asList(names);
            ObjectUtils.checkParams(payRequestParams, fieldNames);
        }

        Params params = setPayTpye(payRequestParams, WeChatPayTypeEnum.NATIVE);
        Map<String, Object> resultMap = unifiedOrder(params);
        String codeUrl = (String) resultMap.get("code_url");
        try {
            QRCodeUtil.encode(codeUrl, 200, 200, "png", response.getOutputStream());
        } catch (IOException e) {
            log.debug("二维码转换异常：", e);
        }
        return injector(resultMap, payRequestParams);
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> payByH5(Params payRequestParams) throws PayException {
        if (weChatPayConfig.isDevMode()) {
            String[] names = {"body", "out_trade_no", "total_fee", "spbill_create_ip", "scene_info","openid"};
            List<String> fieldNames = Arrays.asList(names);
            ObjectUtils.checkParams(payRequestParams, fieldNames);
        }
        Params params = setPayTpye(payRequestParams, WeChatPayTypeEnum.MWEB);
        Map<String, Object> map = unifiedOrder(params);
        Object appId = map.get("appid");
        Object partnerId = map.get("mch_id");
        Object resultCode = map.get("result_code");
        Object mwebUrl = map.get("mweb_url");
        Object nonceStr = map.get("nonce_str");

        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("appid", appId);
        returnMap.put("mch_id", partnerId);
        returnMap.put("nonce_str", nonceStr);
        returnMap.put("result_code", resultCode);
        returnMap.put("mweb_url", mwebUrl);
        return injector(returnMap, payRequestParams);
    }

    /**
     * 生成二维码编码 用于扫码支付模式一
     *
     * @param productId 商品编号  此id 是商户端生成   用于标识该次商品交易的商品id  并不按照商品种类来规定
     * @return 规定格式的二维码编码 用于后续二维码的生成
     */
    private String createQRCodeUrl(String productId) throws PayException {
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
        String sign = ObjectUtils.signatureGenerator(ObjectUtils.paramsSorter(map), MD5, DEFAULT_CHARSET, secretKey);
        return String.format(QR_CODE_TEMPLATE, sign, appId, mchId, productId, timestamp, nonceStr);
    }

    /**
     * 生成带logo的支付二维码.
     *
     * @param out       二维码输出流
     * @param logoPath  logo的路径
     * @param productId 商品编号
     * @throws cn.felord.wepay.common.exception.PayException the pay exception
     */
    public void createQRCodeImage(OutputStream out, String logoPath, String productId) throws PayException {
        QRCodeUtil.encode(createQRCodeUrl(productId), 200, 200, "png", logoPath, out);
    }

    /**
     * 生成不带logo的支付二维码.
     *
     * @param out       二维码输出流
     * @param productId 商品编号
     * @throws cn.felord.wepay.common.exception.PayException the pay exception
     */
    public void createQRCodeImage(OutputStream out, String productId) throws PayException {
        QRCodeUtil.encode(createQRCodeUrl(productId), 200, 200, "png", out);
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> orderQuery(String orderId, OrderIdTypeEnum orderIdTypeEnum) throws PayException {
        if (OrderIdTypeEnum.OUT_REFUND_NO.name().equals(orderIdTypeEnum.name()) || OrderIdTypeEnum.REFUND_ID.name().equals(orderIdTypeEnum.name())) {
            throw new PayException("OrderIdType  is mismatched");
        }
        return orderHandler(WeChatPayTypeEnum.ORDER_QUERY, orderId, orderIdTypeEnum);
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> closeOrder(String outTradeNo) throws PayException {
        return orderHandler(WeChatPayTypeEnum.ORDER_CLOSE, outTradeNo, OrderIdTypeEnum.OUT_TRADE_NO);
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> refundQuery(String orderId, OrderIdTypeEnum orderIdTypeEnum) throws PayException {
        return orderHandler(WeChatPayTypeEnum.REFUND_QUERY, orderId, orderIdTypeEnum);
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> refund(RefundRequestParams refundRequestParams) throws PayException {

        String mchId = weChatPayConfig.getMch_id();
        String appId = weChatPayConfig.getAppid();
        String signType = weChatPayConfig.getSign_type();
        refundRequestParams.setAppid(appId);
        refundRequestParams.setMch_id(mchId);
        refundRequestParams.setSign_type(signType);

        if (weChatPayConfig.isDevMode()) {
            String[] names = {"out_refund_no", "total_fee", "refund_fee"};
            List<String> fieldNames = Arrays.asList(names);
            ObjectUtils.checkParams(refundRequestParams, fieldNames);
            String outTradeNo = refundRequestParams.getOut_trade_no();
            String transactionId = refundRequestParams.getTransaction_id();
            if (!StringUtils.isNotEmpty(outTradeNo) && !StringUtils.isNotEmpty(transactionId)) {
                throw new PayException(" only out_trade_no and transaction_id  is supported");
            }
        }

        String secretKey = weChatPayConfig.getSecretKey();
        String certPath = weChatPayConfig.getCertPath();
        Map<String, Object> sortedMap = ObjectUtils.paramsSorter(refundRequestParams);
        String sign = ObjectUtils.signatureGenerator(sortedMap, MD5, DEFAULT_CHARSET, secretKey);
        sortedMap.put("sign", sign);
        String xml = ObjectUtils.mapToXML(sortedMap);

        Map<String, Object> returnMap = doWeChatPayRequest(WeChatPayTypeEnum.REFUND.getApi(), xml, certPath, mchId);
        if ("SUCCESS".equals(returnMap.get("result_code"))) {
            ObjectUtils.verifySignature(returnMap, MD5, secretKey);
            returnMap.put("secretKey", secretKey);
            return injector(returnMap, refundRequestParams);
        }
        throw new PayException("refund return result：" + returnMap);
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> billDownload(String billDate) throws PayException {
        Map<String, Object> result = new HashMap<>();

        String appId = weChatPayConfig.getAppid();
        String mchId = weChatPayConfig.getMch_id();
        String nonceStr = ObjectUtils.onceStrGenerator();
        String secretKey = weChatPayConfig.getSecretKey();
        result.put("appid", appId);
        result.put("mch_id", mchId);
        result.put("nonce_str", nonceStr);
        result.put("bill_date", billDate);
        result.put("bill_type", "ALL");
        String sign = ObjectUtils.signatureGenerator(ObjectUtils.paramsSorter(result), MD5, DEFAULT_CHARSET, secretKey);
        result.put("sign", sign);
        String xml = ObjectUtils.mapToXML(result);
        String str = doWeChatPayRequest(xml);
        String newStr = str.replaceAll(",", " "); // 去空格
        String[] tempStr = newStr.split("`"); // 数据分组
//        String[] t = tempStr[0].split(" ");// 分组标题

        String[] t = {"tradeTime", "appId", "mchId", "subMchId", "deviceId", "transactionId", "outTradeNo", "sign", "tradeType", "tradeStatus", "bank", "feeType", "totalFee", "enterpriseFee", "refundId", "outRefundNo", "refundFee", "enterpriseRefundFee", "refundType", "refundStatus", "attach", "sceneInfo", "serviceFee", "serviceFeeRate"};
        int k = 1; // 纪录数组下标
        int j = tempStr.length / t.length; // 计算循环次数
        List<Bill> bills = new ArrayList<>();
        for (int i = 0; i < j; i++) {
            Map<String, Object> map = new TreeMap<>();
            for (int l = 0; l < t.length; l++) {
                //如果是最后列且是最后一行数据时，去除数据里的汉字
                if ((i == j - 1) && (l == t.length - 1)) {
                    String reg = "[\u4e00-\u9fa5]";//汉字的正则表达式
                    Pattern pat = Pattern.compile(reg);
                    Matcher mat = pat.matcher(tempStr[l + k]);
                    String repickStr = mat.replaceAll("");
                    map.put(t[l], repickStr);
                } else {
                    map.put(t[l], tempStr[l + k]);
                }
            }
            ObjectMapper mapper = new ObjectMapper();

            try {
                String json = mapper.writeValueAsString(map);
                Bill bill = mapper.readValue(json, Bill.class);
                bills.add(bill);
            } catch (IOException e) {
                log.debug("bill data can't be read", e);
            }
            k = k + t.length;
        }
        Map<String, Object> resultList = new HashMap<>();
        resultList.put(BILL_KEY, bills);
        return resultList;
    }

    private Map<String, Object> orderHandler(PayType weChatPayTypeEnum, String orderId, OrderIdTypeEnum orderIdTypeEnum) throws PayException {
        String xml = xmlForQueryWrapper(orderId, orderIdTypeEnum, weChatPayConfig);
        return doWeChatPayRequest(weChatPayTypeEnum.getApi(), xml);
    }

    /**
     * 将查询订单参数包装成Xml.
     *
     * @param orderId the order id
     * @return the string
     */
    private String xmlForQueryWrapper(String orderId, OrderIdTypeEnum orderIdTypeEnum, PayConfig payConfig) throws PayException {
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
        String sign = ObjectUtils.signatureGenerator(map, MD5, DEFAULT_CHARSET, secretKey);
        map.put("sign", sign);
        return ObjectUtils.mapToXML(map);
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
        return xmlTo8859Map(xmlResult);
    }

    private String doWeChatPayRequest(String xml) {
        return HttpKit.httpPost(WeChatPayTypeEnum.BILL_DOWNLOAD.getApi(), xml);


    }

    /**
     * 请求SSL腾讯支付
     *
     * @param url 调用腾讯支付对应的API
     * @param xml 封装好的xml格式的参数
     * @return the map
     */
    private Map<String, Object> doWeChatPayRequest(String url, String xml, String path, String mchId) {
        String xmlResult = HttpKit.httpPost(url, xml, path, mchId);
        return xmlTo8859Map(xmlResult);
    }

    private Map<String, Object> xmlTo8859Map(String xmlResult) {
        Map<String, Object> resultMap = new HashMap<>();
        if (StringUtils.isNotEmpty(xmlResult)) {
            String responseXml = null;
            try {
                responseXml = new String(xmlResult.getBytes("ISO-8859-1"), DEFAULT_CHARSET);
            } catch (UnsupportedEncodingException e) {
                log.debug("encode is not supported", e);
            }
            resultMap = ObjectUtils.xmlToMap(responseXml);
        }
        return resultMap;
    }

    private <T> Map<String, Object> injector(Map<String, Object> map, T t) {
        map.put(PARAMS_KEY, t);
        return map;
    }

    private Params paramsBuilder(Params params, String appId, String mchId, String notifyUrl, String signType) {
        PayRequestParams payRequestParams = (PayRequestParams) params;
        payRequestParams.setAppid(appId);
        payRequestParams.setMch_id(mchId);
        payRequestParams.setNotify_url(notifyUrl);
        payRequestParams.setSign_type(signType);
        return payRequestParams;
    }

    private Params paramsBuilder(Params params, String appId, String mchId, String signType) {
        PayRequestParams payRequestParams = (PayRequestParams) params;
        payRequestParams.setAppid(appId);
        payRequestParams.setMch_id(mchId);
        payRequestParams.setSign_type(signType);
        return payRequestParams;
    }


    private Params setPayTpye(Params params, PayType weChatPayTypeEnum) {
        PayRequestParams payRequestParams = (PayRequestParams) params;
        payRequestParams.setTrade_type(weChatPayTypeEnum);
        return payRequestParams;
    }

    private String getPayTpye(Params params) {
        PayRequestParams payRequestParams = (PayRequestParams) params;
        return payRequestParams.getTrade_type();
    }
}
