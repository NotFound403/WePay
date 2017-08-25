package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险营销预营销活动DTO
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsMktPreUseCampaignDTO extends AlipayObject {

	private static final long serialVersionUID = 8874878392567757927L;

	/**
	 * 活动Id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 活动名称
	 */
	@ApiField("campaign_name")
	private String campaignName;

	/**
	 * 权益类型
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 权益盖帽值
	 */
	@ApiField("coupon_upper_value")
	private String couponUpperValue;

	/**
	 * 权益值
	 */
	@ApiField("coupon_value")
	private String couponValue;

	/**
	 * 是否预核销通过
	 */
	@ApiField("pre_use")
	private Boolean preUse;

	/**
	 * 预核销失败原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * <p>Getter for the field <code>campaignId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampaignId() {
		return this.campaignId;
	}
	/**
	 * <p>Setter for the field <code>campaignId</code>.</p>
	 *
	 * @param campaignId a {@link java.lang.String} object.
	 */
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	/**
	 * <p>Getter for the field <code>campaignName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampaignName() {
		return this.campaignName;
	}
	/**
	 * <p>Setter for the field <code>campaignName</code>.</p>
	 *
	 * @param campaignName a {@link java.lang.String} object.
	 */
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
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
	 * <p>Getter for the field <code>couponUpperValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCouponUpperValue() {
		return this.couponUpperValue;
	}
	/**
	 * <p>Setter for the field <code>couponUpperValue</code>.</p>
	 *
	 * @param couponUpperValue a {@link java.lang.String} object.
	 */
	public void setCouponUpperValue(String couponUpperValue) {
		this.couponUpperValue = couponUpperValue;
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
