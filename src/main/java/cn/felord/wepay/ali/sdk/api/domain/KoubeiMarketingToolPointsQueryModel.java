package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 集点查询
 *
 * @author auto create
 * @since 1.0, 2016-10-09 11:45:18
 */
public class KoubeiMarketingToolPointsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1495349198529845595L;

	/**
	 * 活动积分帐户
	 */
	@ApiField("activity_account")
	private String activityAccount;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityAccount() {
		return this.activityAccount;
	}
	public void setActivityAccount(String activityAccount) {
		this.activityAccount = activityAccount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
