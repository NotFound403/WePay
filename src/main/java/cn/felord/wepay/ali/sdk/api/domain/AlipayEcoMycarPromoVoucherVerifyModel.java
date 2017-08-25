package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 核销
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarPromoVoucherVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 8341419782983143987L;

	/**
	 * 订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单状态 1. 待支付 4. 交易关闭 6. 待发货 53. 已评价 55. 已核销 56. 交易完成
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 核销码
	 */
	@ApiField("sms_code")
	private String smsCode;

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
	 * <p>Getter for the field <code>orderStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderStatus() {
		return this.orderStatus;
	}
	/**
	 * <p>Setter for the field <code>orderStatus</code>.</p>
	 *
	 * @param orderStatus a {@link java.lang.String} object.
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * <p>Getter for the field <code>smsCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSmsCode() {
		return this.smsCode;
	}
	/**
	 * <p>Setter for the field <code>smsCode</code>.</p>
	 *
	 * @param smsCode a {@link java.lang.String} object.
	 */
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

}
