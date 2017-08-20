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

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getSubMchId() {
        return subMchId;
    }

    public void setSubMchId(String subMchId) {
        this.subMchId = subMchId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getEnterpriseFee() {
        return enterpriseFee;
    }

    public void setEnterpriseFee(String enterpriseFee) {
        this.enterpriseFee = enterpriseFee;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public String getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee;
    }

    public String getEnterpriseRefundFee() {
        return enterpriseRefundFee;
    }

    public void setEnterpriseRefundFee(String enterpriseRefundFee) {
        this.enterpriseRefundFee = enterpriseRefundFee;
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getSceneInfo() {
        return sceneInfo;
    }

    public void setSceneInfo(String sceneInfo) {
        this.sceneInfo = sceneInfo;
    }

    public String getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getServiceFeeRate() {
        return serviceFeeRate;
    }

    public void setServiceFeeRate(String serviceFeeRate) {
        this.serviceFeeRate = serviceFeeRate;
    }

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
