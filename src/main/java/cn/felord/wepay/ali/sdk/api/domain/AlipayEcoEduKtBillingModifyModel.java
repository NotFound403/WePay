package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 教育缴费账单状态同步接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoEduKtBillingModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2322985251743655438L;

	/**
	 * 退款时，支付宝返回的用户的登录id
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/**
	 * 支付宝返回的买家支付宝用户id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 本次退款是否发生了资金变化
	 */
	@ApiField("fund_change")
	private String fundChange;

	/**
	 * 支付宝返回的退款时间，而不是商户退款申请的时间
	 */
	@ApiField("gmt_refund")
	private String gmtRefund;

	/**
	 * 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * isv系统的订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 支付宝返回的退款资金渠道，json格式字符串
	 */
	@ApiField("refund_detail_item_list")
	private String refundDetailItemList;

	/**
	 * 退款原因，商家根据客户实际退款原因填写
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 状态：1:缴费成功，2:关闭账单，3、退费
如果为退款状态，需要填写以下字段,字段都是支付宝退款返回的必填参数
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝返回的交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Getter for the field <code>buyerLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerLogonId() {
		return this.buyerLogonId;
	}
	/**
	 * <p>Setter for the field <code>buyerLogonId</code>.</p>
	 *
	 * @param buyerLogonId a {@link java.lang.String} object.
	 */
	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}

	/**
	 * <p>Getter for the field <code>buyerUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerUserId() {
		return this.buyerUserId;
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
	 * <p>Getter for the field <code>fundChange</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundChange() {
		return this.fundChange;
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
	 * <p>Getter for the field <code>gmtRefund</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtRefund() {
		return this.gmtRefund;
	}
	/**
	 * <p>Setter for the field <code>gmtRefund</code>.</p>
	 *
	 * @param gmtRefund a {@link java.lang.String} object.
	 */
	public void setGmtRefund(String gmtRefund) {
		this.gmtRefund = gmtRefund;
	}

	/**
	 * <p>Getter for the field <code>outRequestNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	/**
	 * <p>Setter for the field <code>outRequestNo</code>.</p>
	 *
	 * @param outRequestNo a {@link java.lang.String} object.
	 */
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	/**
	 * <p>Getter for the field <code>outTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutTradeNo() {
		return this.outTradeNo;
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
	 * <p>Getter for the field <code>refundAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundAmount() {
		return this.refundAmount;
	}
	/**
	 * <p>Setter for the field <code>refundAmount</code>.</p>
	 *
	 * @param refundAmount a {@link java.lang.String} object.
	 */
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	/**
	 * <p>Getter for the field <code>refundDetailItemList</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundDetailItemList() {
		return this.refundDetailItemList;
	}
	/**
	 * <p>Setter for the field <code>refundDetailItemList</code>.</p>
	 *
	 * @param refundDetailItemList a {@link java.lang.String} object.
	 */
	public void setRefundDetailItemList(String refundDetailItemList) {
		this.refundDetailItemList = refundDetailItemList;
	}

	/**
	 * <p>Getter for the field <code>refundReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundReason() {
		return this.refundReason;
	}
	/**
	 * <p>Setter for the field <code>refundReason</code>.</p>
	 *
	 * @param refundReason a {@link java.lang.String} object.
	 */
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * <p>Getter for the field <code>tradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeNo() {
		return this.tradeNo;
	}
	/**
	 * <p>Setter for the field <code>tradeNo</code>.</p>
	 *
	 * @param tradeNo a {@link java.lang.String} object.
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
