package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.group.send response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicMessageGroupSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1556823868282966555L;

	/** 
	 * 2013121100055554f1000b64-3f05-4581-a5e1-16e29d242950
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
