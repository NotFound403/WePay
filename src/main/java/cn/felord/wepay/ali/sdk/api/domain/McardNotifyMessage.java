package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 通知消息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class McardNotifyMessage extends AlipayObject {

	private static final long serialVersionUID = 4494539649523813189L;

	/**
	 * 用户提醒信息，按如下格式拼装，需要ISV提供change_reason。
积分变动模板：{change_reason}，您的积分有变动
余额变动模板：{change_reason}，您的余额有变动
等级变更无需提供原因。
	 */
	@ApiField("change_reason")
	private String changeReason;

	/**
	 * JSON格式扩展信息，主要是发送消息中的变量
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 消息类型，每种消息都定义了固定消息模板，
POINT_UPDATE：积分变更消息
BALANCE_UPDATE：余额变更消息
LEVEL_UPDATE：等级变更消息
	 */
	@ApiField("message_type")
	private String messageType;

	/**
	 * <p>Getter for the field <code>changeReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChangeReason() {
		return this.changeReason;
	}
	/**
	 * <p>Setter for the field <code>changeReason</code>.</p>
	 *
	 * @param changeReason a {@link java.lang.String} object.
	 */
	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	/**
	 * <p>Getter for the field <code>messageType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMessageType() {
		return this.messageType;
	}
	/**
	 * <p>Setter for the field <code>messageType</code>.</p>
	 *
	 * @param messageType a {@link java.lang.String} object.
	 */
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

}
