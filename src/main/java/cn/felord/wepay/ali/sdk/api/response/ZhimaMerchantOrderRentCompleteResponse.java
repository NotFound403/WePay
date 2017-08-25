package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.rent.complete response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaMerchantOrderRentCompleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2559218563733963812L;

	/** 
	 * 资金流水号，用于商户与支付宝进行对账
	 */
	@ApiField("alipay_fund_order_no")
	private String alipayFundOrderNo;

	/** 
	 * 信用借还的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 借用人支付宝userId.
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Setter for the field <code>alipayFundOrderNo</code>.</p>
	 *
	 * @param alipayFundOrderNo a {@link java.lang.String} object.
	 */
	public void setAlipayFundOrderNo(String alipayFundOrderNo) {
		this.alipayFundOrderNo = alipayFundOrderNo;
	}
	/**
	 * <p>Getter for the field <code>alipayFundOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayFundOrderNo( ) {
		return this.alipayFundOrderNo;
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
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId( ) {
		return this.userId;
	}

}
