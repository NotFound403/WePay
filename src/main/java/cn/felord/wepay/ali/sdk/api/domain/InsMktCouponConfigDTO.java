package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险营销权益配置
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsMktCouponConfigDTO extends AlipayObject {

	private static final long serialVersionUID = 6722749957782528714L;

	/**
	 * 权益配置Id
	 */
	@ApiField("coupon_conf_id")
	private String couponConfId;

	/**
	 * 权益类型
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 200元优惠券
	 */
	@ApiField("coupon_value")
	private String couponValue;

	/**
	 * 核销结束时间
	 */
	@ApiField("use_end_time")
	private Date useEndTime;

	/**
	 * 核销使用规则
	 */
	@ApiField("use_rule")
	private String useRule;

	/**
	 * 核销开始时间
	 */
	@ApiField("use_start_time")
	private Date useStartTime;

	/**
	 * <p>Getter for the field <code>couponConfId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCouponConfId() {
		return this.couponConfId;
	}
	/**
	 * <p>Setter for the field <code>couponConfId</code>.</p>
	 *
	 * @param couponConfId a {@link java.lang.String} object.
	 */
	public void setCouponConfId(String couponConfId) {
		this.couponConfId = couponConfId;
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
	 * <p>Getter for the field <code>useEndTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getUseEndTime() {
		return this.useEndTime;
	}
	/**
	 * <p>Setter for the field <code>useEndTime</code>.</p>
	 *
	 * @param useEndTime a {@link java.util.Date} object.
	 */
	public void setUseEndTime(Date useEndTime) {
		this.useEndTime = useEndTime;
	}

	/**
	 * <p>Getter for the field <code>useRule</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUseRule() {
		return this.useRule;
	}
	/**
	 * <p>Setter for the field <code>useRule</code>.</p>
	 *
	 * @param useRule a {@link java.lang.String} object.
	 */
	public void setUseRule(String useRule) {
		this.useRule = useRule;
	}

	/**
	 * <p>Getter for the field <code>useStartTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getUseStartTime() {
		return this.useStartTime;
	}
	/**
	 * <p>Setter for the field <code>useStartTime</code>.</p>
	 *
	 * @param useStartTime a {@link java.util.Date} object.
	 */
	public void setUseStartTime(Date useStartTime) {
		this.useStartTime = useStartTime;
	}

}
