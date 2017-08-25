package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.msg.send response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLifeMsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2526613263848329754L;

	/** 
	 * 生活号消息唯一标识
	 */
	@ApiField("alipay_msg_id")
	private String alipayMsgId;

	/**
	 * <p>Setter for the field <code>alipayMsgId</code>.</p>
	 *
	 * @param alipayMsgId a {@link java.lang.String} object.
	 */
	public void setAlipayMsgId(String alipayMsgId) {
		this.alipayMsgId = alipayMsgId;
	}
	/**
	 * <p>Getter for the field <code>alipayMsgId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayMsgId( ) {
		return this.alipayMsgId;
	}

}
