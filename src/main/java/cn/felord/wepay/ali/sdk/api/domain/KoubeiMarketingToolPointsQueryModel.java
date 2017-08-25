package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 集点查询
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>activityAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityAccount() {
		return this.activityAccount;
	}
	/**
	 * <p>Setter for the field <code>activityAccount</code>.</p>
	 *
	 * @param activityAccount a {@link java.lang.String} object.
	 */
	public void setActivityAccount(String activityAccount) {
		this.activityAccount = activityAccount;
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
