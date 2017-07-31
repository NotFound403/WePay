package org.hive.weChat.entity;

import org.hive.common.pay.PayConfig;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 微信支付请求参数封装实体
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/17  14:14
 */


public class PayRequestParams {
    private volatile static PayRequestParams payRequestParams;
    // 微信开放平台审核通过的应用APPID 必传
    private String appid;
    // 私钥  签名算法使用 必传
    private String secretKey;
    // 微信支付分配的商户号 必传
    private String mch_id;
    // 通知地址  必传
    private String notify_url;
    // 签名算法 默认MD5
    private String sign_type;
    // 随机字符串，不长于32位。必传
    private String nonce_str;
    // 签名 重要
    private String sign;
    // 商品描述 格式 APP名称-实际商品名称 必传
    private String body;
    // 附加数据  该字段主要用于商户携带订单的自定义数据  具体业务中使用 非必传
    private String attach;
    // 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一  必传
    private String out_trade_no;
    // 货币类型 人民币为CNY
    private String fee_type;
    // 总金额 订单总金额，单位为分  重要
    private String total_fee;
    // 用户端实际IP  必传
    private String spbill_create_ip;
    // 交易类型  必传
    private String trade_type;
    // 终端设备号(门店号或收银设备ID)，默认请传"WEB"
    private String device_info;
    // 商品详情
    private String detail;
    // 交易起始时间 格式yyyyMMddHHmmss
    private String time_start;
    // 交易结束时间
    private String time_expire;
    // 订单优惠标记
    private String goods_tag;
    // 指定支付方式
    private String limit_pay;
    // 场景信息  JSON 格式
    private String scene_info;

    private PayRequestParams(PayConfig payConfig) {
        this.appid = payConfig.getAppid();
        this.mch_id = payConfig.getMch_id();
        this.secretKey = payConfig.getSecretKey();
        this.notify_url = payConfig.getNotify_url();
        this.sign_type = payConfig.getSign_type();
    }

    /**
     * 实例化参数.
     *
     * @param payConfig the pay config
     * @return the instance
     */
    public static PayRequestParams getInstance(PayConfig payConfig) {
         if (payRequestParams==null){
             synchronized (PayRequestParams.class){
                 if (payRequestParams==null){
                     return new PayRequestParams(payConfig);
                 }
             }
         }
         return payRequestParams;
    }


    /**
     * Gets appid.
     *
     * @return the appid
     */
    public String getAppid() {
        return appid;
    }

    /**
     * Sets appid.
     *
     * @param appid the appid
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * Gets secret key.
     *
     * @return the secret key
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * Sets secret key.
     *
     * @param secretKey the secret key
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * Gets mch id.
     *
     * @return the mch id
     */
    public String getMch_id() {
        return mch_id;
    }

    /**
     * Sets mch id.
     *
     * @param mch_id the mch id
     */
    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    /**
     * Gets notify url.
     *
     * @return the notify url
     */
    public String getNotify_url() {
        return notify_url;
    }

    /**
     * Sets notify url.
     *
     * @param notify_url the notify url
     */
    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    /**
     * Gets sign type.
     *
     * @return the sign type
     */
    public String getSign_type() {
        return sign_type;
    }

    /**
     * Sets sign type.
     *
     * @param sign_type the sign type
     */
    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    /**
     * Gets nonce str.
     *
     * @return the nonce str
     */
    public String getNonce_str() {
        return nonce_str;
    }

    /**
     * Sets nonce str.
     *
     * @param nonce_str the nonce str
     */
    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    /**
     * Gets sign.
     *
     * @return the sign
     */
    public String getSign() {
        return sign;
    }

    /**
     * Sets sign.
     *
     * @param sign the sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets body.
     *
     * @param body the body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Gets attach.
     *
     * @return the attach
     */
    public String getAttach() {
        return attach;
    }

    /**
     * Sets attach.
     *
     * @param attach the attach
     */
    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOut_trade_no() {
        return out_trade_no;
    }

    /**
     * Sets out trade no.
     *
     * @param out_trade_no the out trade no
     */
    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * Gets fee type.
     *
     * @return the fee type
     */
    public String getFee_type() {
        return fee_type;
    }

    /**
     * Sets fee type.
     *
     * @param fee_type the fee type
     */
    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    /**
     * Gets total fee.
     *
     * @return the total fee
     */
    public String getTotal_fee() {
        return total_fee;
    }

    /**
     * Sets total fee.
     *
     * @param total_fee the total fee
     */
    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * Gets spbill create ip.
     *
     * @return the spbill create ip
     */
    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    /**
     * Sets spbill create ip.
     *
     * @param spbill_create_ip the spbill create ip
     */
    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    /**
     * Gets trade type.
     *
     * @return the trade type
     */
    public String getTrade_type() {
        return trade_type;
    }

    /**
     * Sets trade type.
     *
     * @param trade_type the trade type
     */
    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    /**
     * Gets device info.
     *
     * @return the device info
     */
    public String getDevice_info() {
        return device_info;
    }

    /**
     * Sets device info.
     *
     * @param device_info the device info
     */
    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    /**
     * Gets detail.
     *
     * @return the detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Sets detail.
     *
     * @param detail the detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * Gets time start.
     *
     * @return the time start
     */
    public String getTime_start() {
        return time_start;
    }

    /**
     * Sets time start.
     *
     * @param time_start the time start
     */
    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    /**
     * Gets time expire.
     *
     * @return the time expire
     */
    public String getTime_expire() {
        return time_expire;
    }

    /**
     * Sets time expire.
     *
     * @param time_expire the time expire
     */
    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    /**
     * Gets goods tag.
     *
     * @return the goods tag
     */
    public String getGoods_tag() {
        return goods_tag;
    }

    /**
     * Sets goods tag.
     *
     * @param goods_tag the goods tag
     */
    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
    }

    /**
     * Gets limit pay.
     *
     * @return the limit pay
     */
    public String getLimit_pay() {
        return limit_pay;
    }

    /**
     * Sets limit pay.
     *
     * @param limit_pay the limit pay
     */
    public void setLimit_pay(String limit_pay) {
        this.limit_pay = limit_pay;
    }

    /**
     * Gets scene info.
     *
     * @return the scene info
     */
    public String getScene_info() {
        return scene_info;
    }

    /**
     * Sets scene info.
     *
     * @param scene_info the scene info
     */
    public void setScene_info(String scene_info) {
        this.scene_info = scene_info;
    }
}
