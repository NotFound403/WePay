package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.bill.pay.status response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppPdeductBillPayStatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 1616541853847377422L;

	/** 
	 * 支付宝协议流水
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 支付宝流billNo
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单的结果码
	 */
	@ApiField("order_result_code")
	private String orderResultCode;

	/** 
	 * 订单的结果描述
	 */
	@ApiField("order_result_msg")
	private String orderResultMsg;

	/** 
	 * 外部订单流水
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 支付宝订单支付状态。
0：未知状态。
1：支付成功。
2：支付失败。
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Setter for the field <code>agreementId</code>.</p>
	 *
	 * @param agreementId a {@link java.lang.String} object.
	 */
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	/**
	 * <p>Getter for the field <code>agreementId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgreementId( ) {
		return this.agreementId;
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
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo( ) {
		return this.orderNo;
	}

	/**
	 * <p>Setter for the field <code>orderResultCode</code>.</p>
	 *
	 * @param orderResultCode a {@link java.lang.String} object.
	 */
	public void setOrderResultCode(String orderResultCode) {
		this.orderResultCode = orderResultCode;
	}
	/**
	 * <p>Getter for the field <code>orderResultCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderResultCode( ) {
		return this.orderResultCode;
	}

	/**
	 * <p>Setter for the field <code>orderResultMsg</code>.</p>
	 *
	 * @param orderResultMsg a {@link java.lang.String} object.
	 */
	public void setOrderResultMsg(String orderResultMsg) {
		this.orderResultMsg = orderResultMsg;
	}
	/**
	 * <p>Getter for the field <code>orderResultMsg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderResultMsg( ) {
		return this.orderResultMsg;
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
	 * <p>Getter for the field <code>outOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutOrderNo( ) {
		return this.outOrderNo;
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
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus( ) {
		return this.status;
	}

}
