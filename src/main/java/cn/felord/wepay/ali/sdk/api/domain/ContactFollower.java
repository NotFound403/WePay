package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务窗联系人关注者模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ContactFollower extends AlipayObject {

	private static final long serialVersionUID = 3391921191894943337L;

	/**
	 * 支付宝头像
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 默认头像
	 */
	@ApiField("default_avatar")
	private String defaultAvatar;

	/**
	 * false
	 */
	@ApiField("each_record_flag")
	private String eachRecordFlag;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>avatar</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAvatar() {
		return this.avatar;
	}
	/**
	 * <p>Setter for the field <code>avatar</code>.</p>
	 *
	 * @param avatar a {@link java.lang.String} object.
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * <p>Getter for the field <code>defaultAvatar</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDefaultAvatar() {
		return this.defaultAvatar;
	}
	/**
	 * <p>Setter for the field <code>defaultAvatar</code>.</p>
	 *
	 * @param defaultAvatar a {@link java.lang.String} object.
	 */
	public void setDefaultAvatar(String defaultAvatar) {
		this.defaultAvatar = defaultAvatar;
	}

	/**
	 * <p>Getter for the field <code>eachRecordFlag</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEachRecordFlag() {
		return this.eachRecordFlag;
	}
	/**
	 * <p>Setter for the field <code>eachRecordFlag</code>.</p>
	 *
	 * @param eachRecordFlag a {@link java.lang.String} object.
	 */
	public void setEachRecordFlag(String eachRecordFlag) {
		this.eachRecordFlag = eachRecordFlag;
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
