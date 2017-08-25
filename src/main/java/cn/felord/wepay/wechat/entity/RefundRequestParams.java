package cn.felord.wepay.wechat.entity;

import cn.felord.wepay.common.util.ObjectUtils;
import cn.felord.wepay.wechat.enumeration.RefundAccountEnum;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/8/15  10:38
 */
public class RefundRequestParams implements Serializable {

    private static final long serialVersionUID = -6361621242668237804L;
    // 微信开放平台审核通过的应用APPID 必传
    private String appid;
    // 私钥  签名算法使用 必传
    private String secretKey;
    // 微信支付分配的商户号 必传
    private String mch_id;
    // 签名算法 默认MD5
    private String sign_type;
    // 随机字符串，不长于32位。必传
    private String nonce_str = ObjectUtils.onceStrGenerator();
    // 签名 重要
    private String sign;
    // 微信订单号   out_trade_no 二选一
    private String transaction_id;
    // 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一
    private String out_trade_no;
    // 商户退款单号
    private String out_refund_no;
    // 货币类型 人民币为CNY
    private String refund_fee_type;
    // 订单总金额 订单总金额，单位为分  重要
    private int total_fee;
    // 退款金额 订单总金额，单位为分  重要
    private int refund_fee;
    // 退款原因
    private String refund_desc;
    // 退款资金来源 仅针对老资金流商户使用
    private String refund_account;

    /**
     * <p>Getter for the field <code>appid</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppid() {
        return appid;
    }

    /**
     * <p>Setter for the field <code>appid</code>.</p>
     *
     * @param appid a {@link java.lang.String} object.
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * <p>Getter for the field <code>secretKey</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * <p>Setter for the field <code>secretKey</code>.</p>
     *
     * @param secretKey a {@link java.lang.String} object.
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * <p>Getter for the field <code>mch_id</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMch_id() {
        return mch_id;
    }

    /**
     * <p>Setter for the field <code>mch_id</code>.</p>
     *
     * @param mch_id a {@link java.lang.String} object.
     */
    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    /**
     * <p>Getter for the field <code>sign_type</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSign_type() {
        return sign_type;
    }

    /**
     * <p>Setter for the field <code>sign_type</code>.</p>
     *
     * @param sign_type a {@link java.lang.String} object.
     */
    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    /**
     * <p>Getter for the field <code>nonce_str</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getNonce_str() {
        return nonce_str;
    }

    /**
     * <p>Setter for the field <code>nonce_str</code>.</p>
     *
     * @param nonce_str a {@link java.lang.String} object.
     */
    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    /**
     * <p>Getter for the field <code>sign</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSign() {
        return sign;
    }

    /**
     * <p>Setter for the field <code>sign</code>.</p>
     *
     * @param sign a {@link java.lang.String} object.
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * <p>Getter for the field <code>transaction_id</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTransaction_id() {
        return transaction_id;
    }

    /**
     * <p>Setter for the field <code>transaction_id</code>.</p>
     *
     * @param transaction_id a {@link java.lang.String} object.
     */
    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    /**
     * <p>Getter for the field <code>out_trade_no</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOut_trade_no() {
        return out_trade_no;
    }

    /**
     * <p>Setter for the field <code>out_trade_no</code>.</p>
     *
     * @param out_trade_no a {@link java.lang.String} object.
     */
    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * <p>Getter for the field <code>out_refund_no</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOut_refund_no() {
        return out_refund_no;
    }

    /**
     * <p>Setter for the field <code>out_refund_no</code>.</p>
     *
     * @param out_refund_no a {@link java.lang.String} object.
     */
    public void setOut_refund_no(String out_refund_no) {
        this.out_refund_no = out_refund_no;
    }

    /**
     * <p>Getter for the field <code>refund_fee_type</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRefund_fee_type() {
        return refund_fee_type;
    }

    /**
     * <p>Setter for the field <code>refund_fee_type</code>.</p>
     *
     * @param refund_fee_type a {@link java.lang.String} object.
     */
    public void setRefund_fee_type(String refund_fee_type) {
        this.refund_fee_type = refund_fee_type;
    }

    /**
     * <p>Getter for the field <code>total_fee</code>.</p>
     *
     * @return a int.
     */
    public int getTotal_fee() {
        return total_fee;
    }

    /**
     * <p>Setter for the field <code>total_fee</code>.</p>
     *
     * @param total_fee a int.
     */
    public void setTotal_fee(int total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * <p>Getter for the field <code>refund_fee</code>.</p>
     *
     * @return a int.
     */
    public int getRefund_fee() {
        return refund_fee;
    }

    /**
     * <p>Setter for the field <code>refund_fee</code>.</p>
     *
     * @param refund_fee a int.
     */
    public void setRefund_fee(int refund_fee) {
        this.refund_fee = refund_fee;
    }

    /**
     * <p>Getter for the field <code>refund_desc</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRefund_desc() {
        return refund_desc;
    }

    /**
     * <p>Setter for the field <code>refund_desc</code>.</p>
     *
     * @param refund_desc a {@link java.lang.String} object.
     */
    public void setRefund_desc(String refund_desc) {
        this.refund_desc = refund_desc;
    }

    /**
     * <p>Getter for the field <code>refund_account</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRefund_account() {
        return refund_account;
    }

    /**
     * <p>Setter for the field <code>refund_account</code>.</p>
     *
     * @param refundAccountEnum a {@link cn.felord.wepay.wechat.enumeration.RefundAccountEnum} object.
     */
    public void setRefund_account(RefundAccountEnum refundAccountEnum) {
        this.refund_account = refundAccountEnum.name();
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "{" +
                "appid:" + appid +
                ", secretKey:" + secretKey +
                ", mch_id:" + mch_id +
                ", sign_type:" + sign_type +
                ", nonce_str:" + nonce_str +
                ", sign:" + sign +
                ", transaction_id:" + transaction_id +
                ", out_trade_no:" + out_trade_no +
                ", out_refund_no:" + out_refund_no +
                ", refund_fee_type:" + refund_fee_type +
                ", total_fee:" + total_fee +
                ", refund_fee:" + refund_fee +
                ", refund_desc:" + refund_desc +
                ", refund_account:" + refund_account +
                '}';
    }
}
