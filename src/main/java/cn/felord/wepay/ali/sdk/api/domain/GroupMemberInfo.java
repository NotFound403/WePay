package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 群成员基本信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class GroupMemberInfo extends AlipayObject {

	private static final long serialVersionUID = 1389347844443774547L;

	/**
	 * 用户在这个群里的昵称
	 */
	@ApiField("group_nickname")
	private String groupNickname;

	/**
	 * 个人昵称
	 */
	@ApiField("nickname")
	private String nickname;

	/**
	 * 用户的uid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>groupNickname</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGroupNickname() {
		return this.groupNickname;
	}
	/**
	 * <p>Setter for the field <code>groupNickname</code>.</p>
	 *
	 * @param groupNickname a {@link java.lang.String} object.
	 */
	public void setGroupNickname(String groupNickname) {
		this.groupNickname = groupNickname;
	}

	/**
	 * <p>Getter for the field <code>nickname</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNickname() {
		return this.nickname;
	}
	/**
	 * <p>Setter for the field <code>nickname</code>.</p>
	 *
	 * @param nickname a {@link java.lang.String} object.
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
