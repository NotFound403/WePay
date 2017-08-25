package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 异步单发消息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicMessageCustomSendModel extends AlipayObject {

	private static final long serialVersionUID = 2269563247165647866L;

	/**
	 * 图文消息，当msg_type为image-text时，必须存在相对应的值
	 */
	@ApiListField("articles")
	@ApiField("article")
	private List<Article> articles;

	/**
	 * 是否是聊天消息。支持值：0，1，当值为0时，代表是非聊天消息，消息显示在生活号主页，当值为1时，代表是聊天消息，消息显示在咨询反馈列表页。默认值为0
	 */
	@ApiField("chat")
	private String chat;

	/**
	 * 消息类型，text：文本消息，image-text：图文消息
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 当msg_type为text时，必须设置相对应的值
	 */
	@ApiField("text")
	private Text text;

	/**
	 * 消息接收用户的userid
	 */
	@ApiField("to_user_id")
	private String toUserId;

	/**
	 * <p>Getter for the field <code>articles</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Article> getArticles() {
		return this.articles;
	}
	/**
	 * <p>Setter for the field <code>articles</code>.</p>
	 *
	 * @param articles a {@link java.util.List} object.
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	/**
	 * <p>Getter for the field <code>chat</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChat() {
		return this.chat;
	}
	/**
	 * <p>Setter for the field <code>chat</code>.</p>
	 *
	 * @param chat a {@link java.lang.String} object.
	 */
	public void setChat(String chat) {
		this.chat = chat;
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
	 * <p>Getter for the field <code>text</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Text} object.
	 */
	public Text getText() {
		return this.text;
	}
	/**
	 * <p>Setter for the field <code>text</code>.</p>
	 *
	 * @param text a {@link cn.felord.wepay.ali.sdk.api.domain.Text} object.
	 */
	public void setText(Text text) {
		this.text = text;
	}

	/**
	 * <p>Getter for the field <code>toUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getToUserId() {
		return this.toUserId;
	}
	/**
	 * <p>Setter for the field <code>toUserId</code>.</p>
	 *
	 * @param toUserId a {@link java.lang.String} object.
	 */
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}
