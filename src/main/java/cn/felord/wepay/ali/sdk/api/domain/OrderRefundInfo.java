package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 第三方的订单退款明细：包括服务号和单个服务的退款金额
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OrderRefundInfo extends AlipayObject {

	private static final long serialVersionUID = 6732634221635847646L;

	/**
	 * 服务订单的退款金额，单位为元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 服务订单号，当商家退款时，可能包含多个服务订单
	 */
	@ApiField("service_order_no")
	private String serviceOrderNo;

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
	 * <p>Getter for the field <code>serviceOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServiceOrderNo() {
		return this.serviceOrderNo;
	}
	/**
	 * <p>Setter for the field <code>serviceOrderNo</code>.</p>
	 *
	 * @param serviceOrderNo a {@link java.lang.String} object.
	 */
	public void setServiceOrderNo(String serviceOrderNo) {
		this.serviceOrderNo = serviceOrderNo;
	}

}
