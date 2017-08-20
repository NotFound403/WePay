package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动触发
 *
 * @author auto create
 * @since 1.0, 2017-07-19 08:37:11
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

	public String getBindMobile() {
		return this.bindMobile;
	}
	public void setBindMobile(String bindMobile) {
		this.bindMobile = bindMobile;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public Long getCampSource() {
		return this.campSource;
	}
	public void setCampSource(Long campSource) {
		this.campSource = campSource;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
