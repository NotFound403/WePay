package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 发送钉钉企业会话消息接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAppMsgDingSendModel extends AlipayObject {

	private static final long serialVersionUID = 7693526323948518256L;

	/**
	 * 钉钉企业应用ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 消息类型为text时表示消息内容、消息类型为link时表示消息描述
	 */
	@ApiField("content")
	private String content;

	/**
	 * 消息类型为link时的消息点击链接地址
	 */
	@ApiField("goto_url")
	private String gotoUrl;

	/**
	 * 消息类型为link时的图片地址，支持jpg格式图片，大小不超过1MB
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 消息类型，文本为text；链接为link
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 接收者，个人为single；部门为department
	 */
	@ApiField("receiver")
	private String receiver;

	/**
	 * 消息类型为link时的消息标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 用户UID列表
	 */
	@ApiListField("user_ids")
	@ApiField("string")
	private List<String> userIds;

	/**
	 * <p>Getter for the field <code>agentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgentId() {
		return this.agentId;
	}
	/**
	 * <p>Setter for the field <code>agentId</code>.</p>
	 *
	 * @param agentId a {@link java.lang.String} object.
	 */
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	/**
	 * <p>Getter for the field <code>content</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * <p>Setter for the field <code>content</code>.</p>
	 *
	 * @param content a {@link java.lang.String} object.
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * <p>Getter for the field <code>gotoUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGotoUrl() {
		return this.gotoUrl;
	}
	/**
	 * <p>Setter for the field <code>gotoUrl</code>.</p>
	 *
	 * @param gotoUrl a {@link java.lang.String} object.
	 */
	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

	/**
	 * <p>Getter for the field <code>imageUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImageUrl() {
		return this.imageUrl;
	}
	/**
	 * <p>Setter for the field <code>imageUrl</code>.</p>
	 *
	 * @param imageUrl a {@link java.lang.String} object.
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * <p>Getter for the field <code>msgType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsgType() {
		return this.msgType;
	}
	/**
	 * <p>Setter for the field <code>msgType</code>.</p>
	 *
	 * @param msgType a {@link java.lang.String} object.
	 */
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	/**
	 * <p>Getter for the field <code>receiver</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiver() {
		return this.receiver;
	}
	/**
	 * <p>Setter for the field <code>receiver</code>.</p>
	 *
	 * @param receiver a {@link java.lang.String} object.
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
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
