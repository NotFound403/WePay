package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.shortlink.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicShortlinkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8446121481574959217L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 成功
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 短链接url
	 */
	@ApiField("shortlink")
	private String shortlink;

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
	 * <p>Setter for the field <code>shortlink</code>.</p>
	 *
	 * @param shortlink a {@link java.lang.String} object.
	 */
	public void setShortlink(String shortlink) {
		this.shortlink = shortlink;
	}
	/**
	 * <p>Getter for the field <code>shortlink</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShortlink( ) {
		return this.shortlink;
	}

}
