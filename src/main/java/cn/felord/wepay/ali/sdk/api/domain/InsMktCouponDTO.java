package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险营销权益信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsMktCouponDTO extends AlipayObject {

	private static final long serialVersionUID = 2899544639352625339L;

	/**
	 * 权益资产Id，如券Id
	 */
	@ApiField("asset_id")
	private String assetId;

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
	 * 500元单品券
	 */
	@ApiField("coupon_value")
	private String couponValue;

	/**
	 * 是否推荐使用该优惠
	 */
	@ApiField("recommend")
	private Boolean recommend;

	/**
	 * 核销结束时间
	 */
	@ApiField("use_end_time")
	private Date useEndTime;

	/**
	 * 核销规则
	 */
	@ApiField("use_rule")
	private String useRule;

	/**
	 * 核销开始时间
	 */
	@ApiField("use_start_time")
	private Date useStartTime;

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
	 * <p>Getter for the field <code>recommend</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getRecommend() {
		return this.recommend;
	}
	/**
	 * <p>Setter for the field <code>recommend</code>.</p>
	 *
	 * @param recommend a {@link java.lang.Boolean} object.
	 */
	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
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
