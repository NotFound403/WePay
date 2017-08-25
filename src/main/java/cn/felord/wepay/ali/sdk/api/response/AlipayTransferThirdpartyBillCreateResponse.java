package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.transfer.thirdparty.bill.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTransferThirdpartyBillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7247325893199262151L;

	/** 
	 * 支付宝转账交易号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 交易类型，固定为transfer
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 外部应用创建的交易ID
	 */
	@ApiField("payment_id")
	private String paymentId;

	/**
	 * <p>Setter for the field <code>orderId</code>.</p>
	 *
	 * @param orderId a {@link java.lang.String} object.
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * <p>Getter for the field <code>orderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderId( ) {
		return this.orderId;
	}

	/**
	 * <p>Setter for the field <code>orderType</code>.</p>
	 *
	 * @param orderType a {@link java.lang.String} object.
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	/**
	 * <p>Getter for the field <code>orderType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderType( ) {
		return this.orderType;
	}

	/**
	 * <p>Setter for the field <code>paymentId</code>.</p>
	 *
	 * @param paymentId a {@link java.lang.String} object.
	 */
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	/**
	 * <p>Getter for the field <code>paymentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentId( ) {
		return this.paymentId;
	}

}
