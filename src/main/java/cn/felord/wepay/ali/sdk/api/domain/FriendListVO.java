package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 好友列表的模型对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class FriendListVO extends AlipayObject {

	private static final long serialVersionUID = 5596275364828149413L;

	/**
	 * 头像的服务地址
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 是否双向好友
	 */
	@ApiField("real_friend")
	private Boolean realFriend;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 有可能包含emoji表情，业务方要注意编码
	 */
	@ApiField("view_name")
	private String viewName;

	/**
	 * <p>Getter for the field <code>headImg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHeadImg() {
		return this.headImg;
	}
	/**
	 * <p>Setter for the field <code>headImg</code>.</p>
	 *
	 * @param headImg a {@link java.lang.String} object.
	 */
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	/**
	 * <p>Getter for the field <code>realFriend</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getRealFriend() {
		return this.realFriend;
	}
	/**
	 * <p>Setter for the field <code>realFriend</code>.</p>
	 *
	 * @param realFriend a {@link java.lang.Boolean} object.
	 */
	public void setRealFriend(Boolean realFriend) {
		this.realFriend = realFriend;
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

	/**
	 * <p>Getter for the field <code>viewName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViewName() {
		return this.viewName;
	}
	/**
	 * <p>Setter for the field <code>viewName</code>.</p>
	 *
	 * @param viewName a {@link java.lang.String} object.
	 */
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

}
