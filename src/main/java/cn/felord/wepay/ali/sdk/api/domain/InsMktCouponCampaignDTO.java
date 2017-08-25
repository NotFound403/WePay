package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险营销权益活动数据结构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsMktCouponCampaignDTO extends AlipayObject {

	private static final long serialVersionUID = 6441995849149381574L;

	/**
	 * 活动核销截止时间
	 */
	@ApiField("campaign_end_time")
	private Date campaignEndTime;

	/**
	 * 活动Id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 活动备注
	 */
	@ApiField("campaign_memo")
	private String campaignMemo;

	/**
	 * 活动描述
	 */
	@ApiField("campaign_name")
	private String campaignName;

	/**
	 * 活动开始时间
	 */
	@ApiField("campaign_start_time")
	private Date campaignStartTime;

	/**
	 * 活动的权益类型描述
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 权益盖帽值，如1000元优惠券
	 */
	@ApiField("coupon_upper_value")
	private String couponUpperValue;

	/**
	 * 权益值，如500元优惠券
	 */
	@ApiField("coupon_value")
	private String couponValue;

	/**
	 * <p>Getter for the field <code>campaignEndTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getCampaignEndTime() {
		return this.campaignEndTime;
	}
	/**
	 * <p>Setter for the field <code>campaignEndTime</code>.</p>
	 *
	 * @param campaignEndTime a {@link java.util.Date} object.
	 */
	public void setCampaignEndTime(Date campaignEndTime) {
		this.campaignEndTime = campaignEndTime;
	}

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
	 * <p>Getter for the field <code>campaignMemo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampaignMemo() {
		return this.campaignMemo;
	}
	/**
	 * <p>Setter for the field <code>campaignMemo</code>.</p>
	 *
	 * @param campaignMemo a {@link java.lang.String} object.
	 */
	public void setCampaignMemo(String campaignMemo) {
		this.campaignMemo = campaignMemo;
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
	 * <p>Getter for the field <code>campaignStartTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getCampaignStartTime() {
		return this.campaignStartTime;
	}
	/**
	 * <p>Setter for the field <code>campaignStartTime</code>.</p>
	 *
	 * @param campaignStartTime a {@link java.util.Date} object.
	 */
	public void setCampaignStartTime(Date campaignStartTime) {
		this.campaignStartTime = campaignStartTime;
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

}
