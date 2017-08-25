package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动触发
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignDrawcampTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 7136822335235869996L;

	/**
	 * 用户参与活动的手机号（如果是用户直接输入手机号的活动形式，该项必填，作为识别用户的依据）
	 */
	@ApiField("bind_mobile")
	private String bindMobile;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 请求来源，目前支持：1微信 2 微博 3虾米 4淘宝  5天猫
	 */
	@ApiField("camp_source")
	private Long campSource;

	/**
	 * 用户登录号/用户uid，非脱敏账号
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>bindMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBindMobile() {
		return this.bindMobile;
	}
	/**
	 * <p>Setter for the field <code>bindMobile</code>.</p>
	 *
	 * @param bindMobile a {@link java.lang.String} object.
	 */
	public void setBindMobile(String bindMobile) {
		this.bindMobile = bindMobile;
	}

	/**
	 * <p>Getter for the field <code>campId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampId() {
		return this.campId;
	}
	/**
	 * <p>Setter for the field <code>campId</code>.</p>
	 *
	 * @param campId a {@link java.lang.String} object.
	 */
	public void setCampId(String campId) {
		this.campId = campId;
	}

	/**
	 * <p>Getter for the field <code>campSource</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCampSource() {
		return this.campSource;
	}
	/**
	 * <p>Setter for the field <code>campSource</code>.</p>
	 *
	 * @param campSource a {@link java.lang.Long} object.
	 */
	public void setCampSource(Long campSource) {
		this.campSource = campSource;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
