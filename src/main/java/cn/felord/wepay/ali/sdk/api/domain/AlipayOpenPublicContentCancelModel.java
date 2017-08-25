package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 生活号素材内容撤回接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicContentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3197532454783845445L;

	/**
	 * message_id 是发布接口调用之后拿到的返回值，用来撤回已经发布的对应内容
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
