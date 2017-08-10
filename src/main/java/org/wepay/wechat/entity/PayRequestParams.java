package org.wepay.wechat.entity;

import org.wepay.common.pay.Params;
import org.wepay.common.pay.PayType;
import org.wepay.common.util.ObjectUtils;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 微信支付请求参数封装实体
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/17  14:14
 */


public class PayRequestParams implements Params, Serializable {
    private static final long serialVersionUID = 8926973745023186819L;
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
    private String nonce_str = ObjectUtils.onceStrGenerator();
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
    // 终端设备号(门店号或收银设备ID)，默认请传"WEB"  选填
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
    // 商品id   扫码支付必传 用户自定义
    private String product_id;
    // 用户标识  公众号支付必传
    private String openid;
    // 扫码支付必填  设备读取用户微信中的条码或者二维码信息
    private String auth_code;

    @Override
    public void setAppid(String appId) {
        this.appid = appId;
    }

    @Override
    public void setMch_id(String mchId) {
        this.mch_id = mchId;
    }

    @Override
    public void setNotify_url(String notifyUrl) {
        this.notify_url = notifyUrl;
    }

    @Override
    public void setSign_type(String signType) {
        this.sign_type = signType;
    }



    @Override
    public void setOpenid(String openId) {
        this.openid = openId;
    }

    @Override
    public void setProduct_id(String productId) {
        this.product_id = productId;
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
     * Gets notify url.
     *
     * @return the notify url
     */
    public String getNotify_url() {
        return notify_url;
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
     * @param nonceStr the nonce str
     */
    public void setNonce_str(String nonceStr) {
        this.nonce_str = nonceStr;
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
     * @param outTradeNo the out trade no
     */
    public void setOut_trade_no(String outTradeNo) {
        this.out_trade_no = outTradeNo;
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
     * @param feeType the fee type
     */
    public void setFee_type(String feeType) {
        this.fee_type = feeType;
    }

    /**
     * Gets total fee.
     *
     * @return the total fee
     */
    public int getTotal_fee() {
        return total_fee;
    }

    /**
     * Sets total fee.
     *
     * @param totalFee the total fee
     */
    public void setTotal_fee(int totalFee) {
        this.total_fee = totalFee;
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
     * @param spbillCreateIp the spbill create ip
     */
    public void setSpbill_create_ip(String spbillCreateIp) {
        this.spbill_create_ip = spbillCreateIp;
    }

    /**
     * Gets trade type.
     *
     * @return the trade type
     */
    public String getTrade_type() {
        return trade_type;
    }

    @Override
    public void setTrade_type(PayType payType) {

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
     * @param deviceInfo the device info
     */
    public void setDevice_info(String deviceInfo) {
        this.device_info = deviceInfo;
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
     * @param timeStart the time start
     */
    public void setTime_start(String timeStart) {
        this.time_start = timeStart;
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
     * @param timeExpire the time expire
     */
    public void setTime_expire(String timeExpire) {
        this.time_expire = timeExpire;
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
     * @param goodsTag the goods tag
     */
    public void setGoods_tag(String goodsTag) {
        this.goods_tag = goodsTag;
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
     * @param limitPay the limit pay
     */
    public void setLimit_pay(String limitPay) {
        this.limit_pay = limitPay;
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
     * @param sceneInfo the scene info
     */
    public void setScene_info(String sceneInfo) {
        this.scene_info = sceneInfo;
    }

    /**
     * Gets product id.
     *
     * @return the product id
     */
    public String getProduct_id() {
        return product_id;
    }
    /**
     * Gets openid.
     *
     * @return the openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuth_code() {
        return auth_code;
    }

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuth_code(String authCode) {
        this.auth_code = authCode;
    }

    /**
     * 场景信息 按照腾讯文档上为json字符串 此处直接用bean来进行转换.
     *
     * @param <T> 场景信息的封装  具体参见腾讯开发文档
     * @param t   the t
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_1">腾讯微信支付开发文档</a>
     */
    public <T> void setScene_info(T t) {
        this.scene_info = ObjectUtils.beanToJson(t);
    }

}
