package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险营销权益基础信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsMktCouponBaseDTO extends AlipayObject {

	private static final long serialVersionUID = 2239443794787431463L;

	/**
	 * 权益Id
	 */
	@ApiField("coupon_id")
	private String couponId;

	/**
	 * 权益类型
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 权益值
	 */
	@ApiField("coupon_value")
	private String couponValue;

	/**
	 * <p>Getter for the field <code>couponId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCouponId() {
		return this.couponId;
	}
	/**
	 * <p>Setter for the field <code>couponId</code>.</p>
	 *
	 * @param couponId a {@link java.lang.String} object.
	 */
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	/**
	 * <p>Getter for the field <code>couponType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCouponType() {
		return this.couponType;
	}
	/**
	 * <p>Setter for the field <code>couponType</code>.</p>
	 *
	 * @param couponType a {@link java.lang.String} object.
	 */
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	/**
	 * <p>Getter for the field <code>couponValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCouponValue() {
		return this.couponValue;
	}
	/**
	 * <p>Setter for the field <code>couponValue</code>.</p>
	 *
	 * @param couponValue a {@link java.lang.String} object.
	 */
	public void setCouponValue(String couponValue) {
		this.couponValue = couponValue;
	}

}
