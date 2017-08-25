package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝单聊发消息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySocialBaseChatMsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 7691215423643396663L;

	/**
	 * 消息简短描述，显示在会话列表上，必填
	 */
	@ApiField("biz_memo")
	private String bizMemo;

	/**
	 * 消息业务类型，申请接入时和我们申请，用于统计和限流
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 客户端的消息id，需要全局唯一，必填
	 */
	@ApiField("client_msg_id")
	private String clientMsgId;

	/**
	 * 消息隐藏方案 默认不隐藏 1:上行隐藏 0:下行隐藏,例如 ：A给B发消息 
默认(空): A 看到一条上行消息 B看到一条下行消息(消息文本一样) 
上行隐藏(1): A给B 发消息 ，A 看不到消息 B看到消息
下行隐藏(0): A给B发消息，A看到消息 ，B 看不到消息
	 */
	@ApiField("hidden_side")
	private String hiddenSide;

	/**
	 * 点击消息card跳转的地址，选填
	 */
	@ApiField("link")
	private String link;

	/**
	 * 用于在用户客户端没有前台打开情况下，给用户通知提醒，示例值"发来一个红包"最终显示为"${发送者昵称}发来一个红包"
	 */
	@ApiField("push_str")
	private String pushStr;

	/**
	 * 接收消息者的userid，必填
	 */
	@ApiField("receiver_id")
	private String receiverId;

	/**
	 * 模板code值，根据这个值获取对应的模板填充数据协议
	 */
	@ApiField("template_code")
	private String templateCode;

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
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
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
	 * <p>Getter for the field <code>hiddenSide</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHiddenSide() {
		return this.hiddenSide;
	}
	/**
	 * <p>Setter for the field <code>hiddenSide</code>.</p>
	 *
	 * @param hiddenSide a {@link java.lang.String} object.
	 */
	public void setHiddenSide(String hiddenSide) {
		this.hiddenSide = hiddenSide;
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
	 * <p>Getter for the field <code>pushStr</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPushStr() {
		return this.pushStr;
	}
	/**
	 * <p>Setter for the field <code>pushStr</code>.</p>
	 *
	 * @param pushStr a {@link java.lang.String} object.
	 */
	public void setPushStr(String pushStr) {
		this.pushStr = pushStr;
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
	 * <p>Getter for the field <code>templateCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateCode() {
		return this.templateCode;
	}
	/**
	 * <p>Setter for the field <code>templateCode</code>.</p>
	 *
	 * @param templateCode a {@link java.lang.String} object.
	 */
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
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

}
