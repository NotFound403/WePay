package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.message.label.send response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicMessageLabelSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5843364715716174226L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 结果信息
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 消息ID
	 */
	@ApiField("msg_id")
	private String msgId;

	/** {@inheritDoc} */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode( ) {
		return this.code;
	}

	/** {@inheritDoc} */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * <p>Getter for the field <code>msg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsg( ) {
		return this.msg;
	}

	/**
	 * <p>Setter for the field <code>msgId</code>.</p>
	 *
	 * @param msgId a {@link java.lang.String} object.
	 */
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	/**
	 * <p>Getter for the field <code>msgId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsgId( ) {
		return this.msgId;
	}

}
