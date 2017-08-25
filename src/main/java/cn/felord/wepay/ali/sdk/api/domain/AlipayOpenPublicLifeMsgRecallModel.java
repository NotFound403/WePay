package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 生活号消息撤回接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLifeMsgRecallModel extends AlipayObject {

	private static final long serialVersionUID = 6858139885913537885L;

	/**
	 * 消息id
	 */
	@ApiField("message_id")
	private String messageId;

	/**
	 * <p>Getter for the field <code>messageId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMessageId() {
		return this.messageId;
	}
	/**
	 * <p>Setter for the field <code>messageId</code>.</p>
	 *
	 * @param messageId a {@link java.lang.String} object.
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

}
