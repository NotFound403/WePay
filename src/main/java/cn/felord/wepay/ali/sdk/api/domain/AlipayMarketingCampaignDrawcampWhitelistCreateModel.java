package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动白名单创建
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignDrawcampWhitelistCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6322245934378177148L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 用户信息列表，有多个时用逗号隔开，最大支持100个白名单账户，账户必须是非脱敏的登录账号或者2088开头的userid，以覆盖的形式执行。为空（“”）时，则清空白名单，不进行白名单校验。
	 */
	@ApiField("user_id_list")
	private String userIdList;

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
	 * <p>Getter for the field <code>userIdList</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserIdList() {
		return this.userIdList;
	}
	/**
	 * <p>Setter for the field <code>userIdList</code>.</p>
	 *
	 * @param userIdList a {@link java.lang.String} object.
	 */
	public void setUserIdList(String userIdList) {
		this.userIdList = userIdList;
	}

}
