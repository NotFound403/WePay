package cn.felord.wepay.wechat.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 对账单记录
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /8/17  11:04
 */
public class Bill implements Serializable {

    private static final long serialVersionUID = -3916754831194743702L;
    private String tradeTime;
    private String appId;
    private String mchId;
    private String subMchId;
    private String deviceId;
    private String transactionId;
    private String outTradeNo;
    private String sign;
    private String tradeType;
    private String tradeStatus;
    private String bank;
    private String feeType;
    private String totalFee;
    private String enterpriseFee;
    private String refundId;
    private String outRefundNo;
    private String refundFee;
    private String enterpriseRefundFee;
    private String refundType;
    private String refundStatus;
    private String attach;
    private String sceneInfo;
    private String serviceFee;
    private String serviceFeeRate;

    /**
     * <p>Getter for the field <code>tradeTime</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTradeTime() {
        return tradeTime;
    }

    /**
     * <p>Setter for the field <code>tradeTime</code>.</p>
     *
     * @param tradeTime a {@link java.lang.String} object.
     */
    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    /**
     * <p>Getter for the field <code>appId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppId() {
        return appId;
    }

    /**
     * <p>Setter for the field <code>appId</code>.</p>
     *
     * @param appId a {@link java.lang.String} object.
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>Getter for the field <code>mchId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMchId() {
        return mchId;
    }

    /**
     * <p>Setter for the field <code>mchId</code>.</p>
     *
     * @param mchId a {@link java.lang.String} object.
     */
    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    /**
     * <p>Getter for the field <code>subMchId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSubMchId() {
        return subMchId;
    }

    /**
     * <p>Setter for the field <code>subMchId</code>.</p>
     *
     * @param subMchId a {@link java.lang.String} object.
     */
    public void setSubMchId(String subMchId) {
        this.subMchId = subMchId;
    }

    /**
     * <p>Getter for the field <code>deviceId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * <p>Setter for the field <code>deviceId</code>.</p>
     *
     * @param deviceId a {@link java.lang.String} object.
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>Getter for the field <code>transactionId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * <p>Setter for the field <code>transactionId</code>.</p>
     *
     * @param transactionId a {@link java.lang.String} object.
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>Getter for the field <code>outTradeNo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * <p>Setter for the field <code>outTradeNo</code>.</p>
     *
     * @param outTradeNo a {@link java.lang.String} object.
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
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
     * <p>Getter for the field <code>tradeType</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * <p>Setter for the field <code>tradeType</code>.</p>
     *
     * @param tradeType a {@link java.lang.String} object.
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * <p>Getter for the field <code>tradeStatus</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTradeStatus() {
        return tradeStatus;
    }

    /**
     * <p>Setter for the field <code>tradeStatus</code>.</p>
     *
     * @param tradeStatus a {@link java.lang.String} object.
     */
    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    /**
     * <p>Getter for the field <code>bank</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBank() {
        return bank;
    }

    /**
     * <p>Setter for the field <code>bank</code>.</p>
     *
     * @param bank a {@link java.lang.String} object.
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * <p>Getter for the field <code>feeType</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * <p>Setter for the field <code>feeType</code>.</p>
     *
     * @param feeType a {@link java.lang.String} object.
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    /**
     * <p>Getter for the field <code>totalFee</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTotalFee() {
        return totalFee;
    }

    /**
     * <p>Setter for the field <code>totalFee</code>.</p>
     *
     * @param totalFee a {@link java.lang.String} object.
     */
    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * <p>Getter for the field <code>enterpriseFee</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getEnterpriseFee() {
        return enterpriseFee;
    }

    /**
     * <p>Setter for the field <code>enterpriseFee</code>.</p>
     *
     * @param enterpriseFee a {@link java.lang.String} object.
     */
    public void setEnterpriseFee(String enterpriseFee) {
        this.enterpriseFee = enterpriseFee;
    }

    /**
     * <p>Getter for the field <code>refundId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRefundId() {
        return refundId;
    }

    /**
     * <p>Setter for the field <code>refundId</code>.</p>
     *
     * @param refundId a {@link java.lang.String} object.
     */
    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    /**
     * <p>Getter for the field <code>outRefundNo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOutRefundNo() {
        return outRefundNo;
    }

    /**
     * <p>Setter for the field <code>outRefundNo</code>.</p>
     *
     * @param outRefundNo a {@link java.lang.String} object.
     */
    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    /**
     * <p>Getter for the field <code>refundFee</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRefundFee() {
        return refundFee;
    }

    /**
     * <p>Setter for the field <code>refundFee</code>.</p>
     *
     * @param refundFee a {@link java.lang.String} object.
     */
    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee;
    }

    /**
     * <p>Getter for the field <code>enterpriseRefundFee</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getEnterpriseRefundFee() {
        return enterpriseRefundFee;
    }

    /**
     * <p>Setter for the field <code>enterpriseRefundFee</code>.</p>
     *
     * @param enterpriseRefundFee a {@link java.lang.String} object.
     */
    public void setEnterpriseRefundFee(String enterpriseRefundFee) {
        this.enterpriseRefundFee = enterpriseRefundFee;
    }

    /**
     * <p>Getter for the field <code>refundType</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     * <p>Setter for the field <code>refundType</code>.</p>
     *
     * @param refundType a {@link java.lang.String} object.
     */
    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    /**
     * <p>Getter for the field <code>refundStatus</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * <p>Setter for the field <code>refundStatus</code>.</p>
     *
     * @param refundStatus a {@link java.lang.String} object.
     */
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * <p>Getter for the field <code>attach</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAttach() {
        return attach;
    }

    /**
     * <p>Setter for the field <code>attach</code>.</p>
     *
     * @param attach a {@link java.lang.String} object.
     */
    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * <p>Getter for the field <code>sceneInfo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSceneInfo() {
        return sceneInfo;
    }

    /**
     * <p>Setter for the field <code>sceneInfo</code>.</p>
     *
     * @param sceneInfo a {@link java.lang.String} object.
     */
    public void setSceneInfo(String sceneInfo) {
        this.sceneInfo = sceneInfo;
    }

    /**
     * <p>Getter for the field <code>serviceFee</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getServiceFee() {
        return serviceFee;
    }

    /**
     * <p>Setter for the field <code>serviceFee</code>.</p>
     *
     * @param serviceFee a {@link java.lang.String} object.
     */
    public void setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee;
    }

    /**
     * <p>Getter for the field <code>serviceFeeRate</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getServiceFeeRate() {
        return serviceFeeRate;
    }

    /**
     * <p>Setter for the field <code>serviceFeeRate</code>.</p>
     *
     * @param serviceFeeRate a {@link java.lang.String} object.
     */
    public void setServiceFeeRate(String serviceFeeRate) {
        this.serviceFeeRate = serviceFeeRate;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "{" +
                "tradeTime:" + tradeTime +
                ", appId:" + appId +
                ", mchId:" + mchId +
                ", subMchId:" + subMchId +
                ", deviceId:" + deviceId +
                ", transactionId:" + transactionId +
                ", outTradeNo:" + outTradeNo +
                ", sign:" + sign +
                ", tradeType:" + tradeType +
                ", tradeStatus:" + tradeStatus +
                ", bank:" + bank +
                ", feeType:" + feeType +
                ", totalFee:" + totalFee +
                ", enterpriseFee:" + enterpriseFee +
                ", refundId:" + refundId +
                ", outRefundNo:" + outRefundNo +
                ", refundFee:" + refundFee +
                ", enterpriseRefundFee:" + enterpriseRefundFee +
                ", refundType:" + refundType +
                ", refundStatus:" + refundStatus +
                ", attach:" + attach +
                ", sceneInfo:" + sceneInfo +
                ", serviceFee:" + serviceFee +
                ", serviceFeeRate:" + serviceFeeRate +
                '}';
    }
}
