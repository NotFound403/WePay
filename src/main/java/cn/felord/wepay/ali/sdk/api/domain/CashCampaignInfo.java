package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 现金活动信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CashCampaignInfo extends AlipayObject {

	private static final long serialVersionUID = 6126332171431316395L;

	/**
	 * 活动状态
	 */
	@ApiField("camp_status")
	private String campStatus;

	/**
	 * 现金红包名称
	 */
	@ApiField("coupon_name")
	private String couponName;

	/**
	 * 现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/**
	 * 原始活动号,商户进行问题排查时提供
	 */
	@ApiField("origin_crowd_no")
	private String originCrowdNo;

	/**
	 * <p>Getter for the field <code>campStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampStatus() {
		return this.campStatus;
	}
	/**
	 * <p>Setter for the field <code>campStatus</code>.</p>
	 *
	 * @param campStatus a {@link java.lang.String} object.
	 */
	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

	/**
	 * <p>Getter for the field <code>couponName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCouponName() {
		return this.couponName;
	}
	/**
	 * <p>Setter for the field <code>couponName</code>.</p>
	 *
	 * @param couponName a {@link java.lang.String} object.
	 */
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	/**
	 * <p>Getter for the field <code>crowdNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCrowdNo() {
		return this.crowdNo;
	}
	/**
	 * <p>Setter for the field <code>crowdNo</code>.</p>
	 *
	 * @param crowdNo a {@link java.lang.String} object.
	 */
	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

	/**
	 * <p>Getter for the field <code>originCrowdNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginCrowdNo() {
		return this.originCrowdNo;
	}
	/**
	 * <p>Setter for the field <code>originCrowdNo</code>.</p>
	 *
	 * @param originCrowdNo a {@link java.lang.String} object.
	 */
	public void setOriginCrowdNo(String originCrowdNo) {
		this.originCrowdNo = originCrowdNo;
	}

}
