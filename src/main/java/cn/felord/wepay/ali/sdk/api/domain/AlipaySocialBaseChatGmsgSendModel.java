package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 支付宝群聊发消息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySocialBaseChatGmsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 1884725344847835533L;

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
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线客户端的消息id，需要全局唯一，必填时间。
	 */
	@ApiField("client_msg_id")
	private String clientMsgId;

	/**
	 * 投递方式 1: 群里所有人都收到 2:部分人可见,只发给群里的部分人员看到,rangeUsers是接受者的userId列表 3:部分人不可见,只有部分人无法看到,rangeUsers是不投递的userId列表
	 */
	@ApiField("delivery_mode")
	private String deliveryMode;

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
	 * 部分投递的用户uid列表
	 */
	@ApiListField("range_users")
	@ApiField("string")
	private List<String> rangeUsers;

	/**
	 * 群的id，必填
	 */
	@ApiField("receiver_id")
	private String receiverId;

	/**
	 * 接受者的用户类型，群组2，讨论组3，必填
	 */
	@ApiField("receiver_usertype")
	private String receiverUsertype;

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
	 * <p>Getter for the field <code>deliveryMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliveryMode() {
		return this.deliveryMode;
	}
	/**
	 * <p>Setter for the field <code>deliveryMode</code>.</p>
	 *
	 * @param deliveryMode a {@link java.lang.String} object.
	 */
	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
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
	 * <p>Getter for the field <code>rangeUsers</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getRangeUsers() {
		return this.rangeUsers;
	}
	/**
	 * <p>Setter for the field <code>rangeUsers</code>.</p>
	 *
	 * @param rangeUsers a {@link java.util.List} object.
	 */
	public void setRangeUsers(List<String> rangeUsers) {
		this.rangeUsers = rangeUsers;
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
