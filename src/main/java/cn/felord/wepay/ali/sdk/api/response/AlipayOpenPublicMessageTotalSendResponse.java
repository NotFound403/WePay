package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.total.send response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicMessageTotalSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6168942563191945792L;

	/** 
	 * 消息ID
	 */
	@ApiField("message_id")
	private String messageId;

	/**
	 * <p>Setter for the field <code>messageId</code>.</p>
	 *
	 * @param messageId a {@link java.lang.String} object.
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	/**
	 * <p>Getter for the field <code>messageId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMessageId( ) {
		return this.messageId;
	}

}
