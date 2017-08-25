package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.message.single.send response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicMessageSingleSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3444791599868262176L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

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

}
