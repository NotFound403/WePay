package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.platform.openid.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPlatformOpenidGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2234673386194457982L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * id字典，key为userId和老的openId，value为新的openId
	 */
	@ApiField("dict")
	private String dict;

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

	/**
	 * <p>Setter for the field <code>dict</code>.</p>
	 *
	 * @param dict a {@link java.lang.String} object.
	 */
	public void setDict(String dict) {
		this.dict = dict;
	}
	/**
	 * <p>Getter for the field <code>dict</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDict( ) {
		return this.dict;
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
