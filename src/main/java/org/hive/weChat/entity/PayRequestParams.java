package org.hive.weChat.entity;

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
    private int total_fee;
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

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public int getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(int total_fee) {
        this.total_fee = total_fee;
    }

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public String getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    public String getGoods_tag() {
        return goods_tag;
    }

    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
    }

    public String getLimit_pay() {
        return limit_pay;
    }

    public void setLimit_pay(String limit_pay) {
        this.limit_pay = limit_pay;
    }

    public String getScene_info() {
        return scene_info;
    }

    public void setScene_info(String scene_info) {
        this.scene_info = scene_info;
    }
}
