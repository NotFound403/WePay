package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 发起退款
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 7419725335374111269L;

	/**
	 * 退款交易编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 退款金额（单位：元）
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款请求编号，针对一笔退款需保证唯一
	 */
	@ApiField("req_no")
	private String reqNo;

	/**
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo() {
		return this.orderNo;
	}
	/**
	 * <p>Setter for the field <code>orderNo</code>.</p>
	 *
	 * @param orderNo a {@link java.lang.String} object.
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * <p>Getter for the field <code>refundFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundFee() {
		return this.refundFee;
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
	 * <p>Getter for the field <code>reqNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReqNo() {
		return this.reqNo;
	}
	/**
	 * <p>Setter for the field <code>reqNo</code>.</p>
	 *
	 * @param reqNo a {@link java.lang.String} object.
	 */
	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}

}
