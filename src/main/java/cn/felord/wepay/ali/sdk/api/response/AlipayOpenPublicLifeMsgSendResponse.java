package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.msg.send response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-11 11:21:11
 */
public class AlipayOpenPublicLifeMsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2526613263848329754L;

	/** 
	 * 生活号消息唯一标识
	 */
	@ApiField("alipay_msg_id")
	private String alipayMsgId;

	public void setAlipayMsgId(String alipayMsgId) {
		this.alipayMsgId = alipayMsgId;
	}
	public String getAlipayMsgId( ) {
		return this.alipayMsgId;
	}

}
