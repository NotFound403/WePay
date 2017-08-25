package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 支付宝增加群成员
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySocialBaseGroupmemberAddModel extends AlipayObject {

	private static final long serialVersionUID = 6361951889234184598L;

	/**
	 * 加人的时候，是否需要校验加人者和被加的人的好友关系
	 */
	@ApiField("friend_validate")
	private Boolean friendValidate;

	/**
	 * 群的id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 增加群成员的时候，选择的用户userid,每次不能超过50个，每个群人数上限500人，user_ids的值为错误的uid时，多个uid的情况下会添加成功正确的uid，如果所有添加的uid全部错误，则会报错
	 */
	@ApiListField("user_ids")
	@ApiField("string")
	private List<String> userIds;

	/**
	 * <p>Getter for the field <code>friendValidate</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getFriendValidate() {
		return this.friendValidate;
	}
	/**
	 * <p>Setter for the field <code>friendValidate</code>.</p>
	 *
	 * @param friendValidate a {@link java.lang.Boolean} object.
	 */
	public void setFriendValidate(Boolean friendValidate) {
		this.friendValidate = friendValidate;
	}

	/**
	 * <p>Getter for the field <code>groupId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGroupId() {
		return this.groupId;
	}
	/**
	 * <p>Setter for the field <code>groupId</code>.</p>
	 *
	 * @param groupId a {@link java.lang.String} object.
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * <p>Getter for the field <code>userIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getUserIds() {
		return this.userIds;
	}
	/**
	 * <p>Setter for the field <code>userIds</code>.</p>
	 *
	 * @param userIds a {@link java.util.List} object.
	 */
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

}
