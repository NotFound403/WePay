package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险营销预核销权益
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsMktPreUseCouponDTO extends AlipayObject {

	private static final long serialVersionUID = 3649939136879778274L;

	/**
	 * 资产Id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 权益id
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
	 * 是否支持预核销
	 */
	@ApiField("pre_use")
	private Boolean preUse;

	/**
	 * 预核销失败原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * <p>Getter for the field <code>assetId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAssetId() {
		return this.assetId;
	}
	/**
	 * <p>Setter for the field <code>assetId</code>.</p>
	 *
	 * @param assetId a {@link java.lang.String} object.
	 */
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

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

	/**
	 * <p>Getter for the field <code>preUse</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getPreUse() {
		return this.preUse;
	}
	/**
	 * <p>Setter for the field <code>preUse</code>.</p>
	 *
	 * @param preUse a {@link java.lang.Boolean} object.
	 */
	public void setPreUse(Boolean preUse) {
		this.preUse = preUse;
	}

	/**
	 * <p>Getter for the field <code>reason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReason() {
		return this.reason;
	}
	/**
	 * <p>Setter for the field <code>reason</code>.</p>
	 *
	 * @param reason a {@link java.lang.String} object.
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

}
