package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务窗联系人关注者模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
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

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getDefaultAvatar() {
		return this.defaultAvatar;
	}
	public void setDefaultAvatar(String defaultAvatar) {
		this.defaultAvatar = defaultAvatar;
	}

	public String getEachRecordFlag() {
		return this.eachRecordFlag;
	}
	public void setEachRecordFlag(String eachRecordFlag) {
		this.eachRecordFlag = eachRecordFlag;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
