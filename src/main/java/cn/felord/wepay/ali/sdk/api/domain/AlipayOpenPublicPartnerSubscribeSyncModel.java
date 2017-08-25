package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 用于为服务窗合作伙伴（如YunOS），提供订阅关系（关注与取消关注）同步功能
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicPartnerSubscribeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3881191378378696991L;

	/**
	 * 是否接受服务窗消息
	 */
	@ApiField("accept_msg")
	private String acceptMsg;

	/**
	 * 关注的服务窗id
	 */
	@ApiField("follow_object_id")
	private String followObjectId;

	/**
	 * 操作类型，添加关注或取消关注
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 是否打开接收公众号PUSH提醒开关 ON:打开 OFF:关闭
	 */
	@ApiField("push_switch")
	private String pushSwitch;

	/**
	 * 关注来源
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 关注服务窗的用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>acceptMsg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAcceptMsg() {
		return this.acceptMsg;
	}
	/**
	 * <p>Setter for the field <code>acceptMsg</code>.</p>
	 *
	 * @param acceptMsg a {@link java.lang.String} object.
	 */
	public void setAcceptMsg(String acceptMsg) {
		this.acceptMsg = acceptMsg;
	}

	/**
	 * <p>Getter for the field <code>followObjectId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFollowObjectId() {
		return this.followObjectId;
	}
	/**
	 * <p>Setter for the field <code>followObjectId</code>.</p>
	 *
	 * @param followObjectId a {@link java.lang.String} object.
	 */
	public void setFollowObjectId(String followObjectId) {
		this.followObjectId = followObjectId;
	}

	/**
	 * <p>Getter for the field <code>operateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateType() {
		return this.operateType;
	}
	/**
	 * <p>Setter for the field <code>operateType</code>.</p>
	 *
	 * @param operateType a {@link java.lang.String} object.
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	/**
	 * <p>Getter for the field <code>pushSwitch</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPushSwitch() {
		return this.pushSwitch;
	}
	/**
	 * <p>Setter for the field <code>pushSwitch</code>.</p>
	 *
	 * @param pushSwitch a {@link java.lang.String} object.
	 */
	public void setPushSwitch(String pushSwitch) {
		this.pushSwitch = pushSwitch;
	}

	/**
	 * <p>Getter for the field <code>sourceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceId() {
		return this.sourceId;
	}
	/**
	 * <p>Setter for the field <code>sourceId</code>.</p>
	 *
	 * @param sourceId a {@link java.lang.String} object.
	 */
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
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
