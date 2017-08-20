package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 生活号消息撤回接口
 *
 * @author auto create
 * @since 1.0, 2016-12-19 20:51:25
 */
public class AlipayOpenPublicLifeMsgRecallModel extends AlipayObject {

	private static final long serialVersionUID = 6858139885913537885L;

	/**
	 * 消息id
	 */
	@ApiField("message_id")
	private String messageId;

	public String getMessageId() {
		return this.messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

}
