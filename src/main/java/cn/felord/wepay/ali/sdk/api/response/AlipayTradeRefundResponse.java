package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.TradeFundBill;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.refund response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradeRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6783187269863742465L;

	/** 
	 * 用户的登录id
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 本次退款是否发生了资金变化
	 */
	@ApiField("fund_change")
	private String fundChange;

	/** 
	 * 退款支付时间
	 */
	@ApiField("gmt_refund_pay")
	private Date gmtRefundPay;

	/** 
	 * 买家支付宝用户号，该参数已废弃，请不要使用
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 退款使用的资金渠道
	 */
	@ApiListField("refund_detail_item_list")
	@ApiField("trade_fund_bill")
	private List<TradeFundBill> refundDetailItemList;

	/** 
	 * 退款总金额
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/** 
	 * 本次商户实际退回金额
注：在签约收单产品时需勾选“返回资金明细”才会返回
	 */
	@ApiField("send_back_fee")
	private String sendBackFee;

	/** 
	 * 交易在支付时候的门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/** 
	 * 2013112011001004330000121536
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Setter for the field <code>buyerLogonId</code>.</p>
	 *
	 * @param buyerLogonId a {@link java.lang.String} object.
	 */
	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}
	/**
	 * <p>Getter for the field <code>buyerLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerLogonId( ) {
		return this.buyerLogonId;
	}

	/**
	 * <p>Setter for the field <code>buyerUserId</code>.</p>
	 *
	 * @param buyerUserId a {@link java.lang.String} object.
	 */
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	/**
	 * <p>Getter for the field <code>buyerUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	/**
	 * <p>Setter for the field <code>fundChange</code>.</p>
	 *
	 * @param fundChange a {@link java.lang.String} object.
	 */
	public void setFundChange(String fundChange) {
		this.fundChange = fundChange;
	}
	/**
	 * <p>Getter for the field <code>fundChange</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundChange( ) {
		return this.fundChange;
	}

	/**
	 * <p>Setter for the field <code>gmtRefundPay</code>.</p>
	 *
	 * @param gmtRefundPay a {@link java.util.Date} object.
	 */
	public void setGmtRefundPay(Date gmtRefundPay) {
		this.gmtRefundPay = gmtRefundPay;
	}
	/**
	 * <p>Getter for the field <code>gmtRefundPay</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtRefundPay( ) {
		return this.gmtRefundPay;
	}

	/**
	 * <p>Setter for the field <code>openId</code>.</p>
	 *
	 * @param openId a {@link java.lang.String} object.
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	/**
	 * <p>Getter for the field <code>openId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpenId( ) {
		return this.openId;
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
	 * <p>Getter for the field <code>outTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	/**
	 * <p>Setter for the field <code>refundDetailItemList</code>.</p>
	 *
	 * @param refundDetailItemList a {@link java.util.List} object.
	 */
	public void setRefundDetailItemList(List<TradeFundBill> refundDetailItemList) {
		this.refundDetailItemList = refundDetailItemList;
	}
	/**
	 * <p>Getter for the field <code>refundDetailItemList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<TradeFundBill> getRefundDetailItemList( ) {
		return this.refundDetailItemList;
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
	 * <p>Getter for the field <code>refundFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundFee( ) {
		return this.refundFee;
	}

	/**
	 * <p>Setter for the field <code>sendBackFee</code>.</p>
	 *
	 * @param sendBackFee a {@link java.lang.String} object.
	 */
	public void setSendBackFee(String sendBackFee) {
		this.sendBackFee = sendBackFee;
	}
	/**
	 * <p>Getter for the field <code>sendBackFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSendBackFee( ) {
		return this.sendBackFee;
	}

	/**
	 * <p>Setter for the field <code>storeName</code>.</p>
	 *
	 * @param storeName a {@link java.lang.String} object.
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	/**
	 * <p>Getter for the field <code>storeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStoreName( ) {
		return this.storeName;
	}

	/**
	 * <p>Setter for the field <code>tradeNo</code>.</p>
	 *
	 * @param tradeNo a {@link java.lang.String} object.
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	/**
	 * <p>Getter for the field <code>tradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
