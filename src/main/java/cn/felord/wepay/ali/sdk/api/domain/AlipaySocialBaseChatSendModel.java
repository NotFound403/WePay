package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 发送分享消息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySocialBaseChatSendModel extends AlipayObject {

	private static final long serialVersionUID = 8359197426593771643L;

	/**
	 * 消息简短描述，显示在会话列表上，必填
	 */
	@ApiField("biz_memo")
	private String bizMemo;

	/**
	 * 客户端的消息id，需要全局唯一，必填
	 */
	@ApiField("client_msg_id")
	private String clientMsgId;

	/**
	 * 点击消息card跳转的地址，选填
	 */
	@ApiField("link")
	private String link;

	/**
	 * 如果是个人消息，是接收消息者的userid，如果是群消息，是群的id，必填
	 */
	@ApiField("receiver_id")
	private String receiverId;

	/**
	 * 接受者的用户类型，支付宝1，群组2，讨论组3，必填
	 */
	@ApiField("receiver_usertype")
	private String receiverUsertype;

	/**
	 * 消息体的内容，形式为json字符串，必填
分享模板
{
	"title":支付宝聊天,
	"desc":"支付宝聊天",
	"image":"图片地址",
	"thumb":"缩略图地址"
}
文本模板
{
         "m":"文本消息"
}
	 */
	@ApiField("template_data")
	private String templateData;

	/**
	 * 消息模板的类型，分享SHARE，文本TEXT，图片IMAGE，必填
	 */
	@ApiField("template_type")
	private String templateType;

	/**
	 * <p>Getter for the field <code>bizMemo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizMemo() {
		return this.bizMemo;
	}
	/**
	 * <p>Setter for the field <code>bizMemo</code>.</p>
	 *
	 * @param bizMemo a {@link java.lang.String} object.
	 */
	public void setBizMemo(String bizMemo) {
		this.bizMemo = bizMemo;
	}

	/**
	 * <p>Getter for the field <code>clientMsgId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClientMsgId() {
		return this.clientMsgId;
	}
	/**
	 * <p>Setter for the field <code>clientMsgId</code>.</p>
	 *
	 * @param clientMsgId a {@link java.lang.String} object.
	 */
	public void setClientMsgId(String clientMsgId) {
		this.clientMsgId = clientMsgId;
	}

	/**
	 * <p>Getter for the field <code>link</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLink() {
		return this.link;
	}
	/**
	 * <p>Setter for the field <code>link</code>.</p>
	 *
	 * @param link a {@link java.lang.String} object.
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * <p>Getter for the field <code>receiverId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiverId() {
		return this.receiverId;
	}
	/**
	 * <p>Setter for the field <code>receiverId</code>.</p>
	 *
	 * @param receiverId a {@link java.lang.String} object.
	 */
	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	/**
	 * <p>Getter for the field <code>receiverUsertype</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiverUsertype() {
		return this.receiverUsertype;
	}
	/**
	 * <p>Setter for the field <code>receiverUsertype</code>.</p>
	 *
	 * @param receiverUsertype a {@link java.lang.String} object.
	 */
	public void setReceiverUsertype(String receiverUsertype) {
		this.receiverUsertype = receiverUsertype;
	}

	/**
	 * <p>Getter for the field <code>templateData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateData() {
		return this.templateData;
	}
	/**
	 * <p>Setter for the field <code>templateData</code>.</p>
	 *
	 * @param templateData a {@link java.lang.String} object.
	 */
	public void setTemplateData(String templateData) {
		this.templateData = templateData;
	}

	/**
	 * <p>Getter for the field <code>templateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateType() {
		return this.templateType;
	}
	/**
	 * <p>Setter for the field <code>templateType</code>.</p>
	 *
	 * @param templateType a {@link java.lang.String} object.
	 */
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

}
