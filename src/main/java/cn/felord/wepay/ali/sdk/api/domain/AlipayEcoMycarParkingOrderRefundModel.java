package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 停车代扣退款接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2361928443717257695L;

	/**
	 * 代扣时返回的支付宝支付交易流水号，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * ISV代扣订单号，ISV唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部申请退款请求流水，ISV唯一
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/**
	 * 退款金额，保留小数点后两位
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退款理由
	 */
	@ApiField("refund_reason")
	private String refundReason;

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
	 * <p>Getter for the field <code>outOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	/**
	 * <p>Setter for the field <code>outOrderNo</code>.</p>
	 *
	 * @param outOrderNo a {@link java.lang.String} object.
	 */
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	/**
	 * <p>Getter for the field <code>outRefundNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRefundNo() {
		return this.outRefundNo;
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

}
