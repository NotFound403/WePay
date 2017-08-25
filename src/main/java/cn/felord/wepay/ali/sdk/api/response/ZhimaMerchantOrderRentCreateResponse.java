package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.rent.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaMerchantOrderRentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6767715372181211422L;

	/** 
	 * 是否准入：
Y-准入
N-不准入
	 */
	@ApiField("admit_state")
	private String admitState;

	/** 
	 * 商户发起借用服务时，需要在借用结束后返回给商户的参数
	 */
	@ApiField("invoke_state")
	private String invokeState;

	/** 
	 * 芝麻信用借还订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部订单号，需要唯一，由商户传入，芝麻内部会做幂等控制，格式为：yyyyMMddHHmmss+4位随机数
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 借用者的userId
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Setter for the field <code>admitState</code>.</p>
	 *
	 * @param admitState a {@link java.lang.String} object.
	 */
	public void setAdmitState(String admitState) {
		this.admitState = admitState;
	}
	/**
	 * <p>Getter for the field <code>admitState</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdmitState( ) {
		return this.admitState;
	}

	/**
	 * <p>Setter for the field <code>invokeState</code>.</p>
	 *
	 * @param invokeState a {@link java.lang.String} object.
	 */
	public void setInvokeState(String invokeState) {
		this.invokeState = invokeState;
	}
	/**
	 * <p>Getter for the field <code>invokeState</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvokeState( ) {
		return this.invokeState;
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
