package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.qrcode.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3749628898125431674L;

	/** 
	 * 返回结果码，如200，标识成功
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 图片地址
	 */
	@ApiField("code_img")
	private String codeImg;

	/** 
	 * 码过期时间，单位：秒
	 */
	@ApiField("expire_second")
	private Long expireSecond;

	/** 
	 * 结果吗描述信息
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
	 * <p>Setter for the field <code>codeImg</code>.</p>
	 *
	 * @param codeImg a {@link java.lang.String} object.
	 */
	public void setCodeImg(String codeImg) {
		this.codeImg = codeImg;
	}
	/**
	 * <p>Getter for the field <code>codeImg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeImg( ) {
		return this.codeImg;
	}

	/**
	 * <p>Setter for the field <code>expireSecond</code>.</p>
	 *
	 * @param expireSecond a {@link java.lang.Long} object.
	 */
	public void setExpireSecond(Long expireSecond) {
		this.expireSecond = expireSecond;
	}
	/**
	 * <p>Getter for the field <code>expireSecond</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getExpireSecond( ) {
		return this.expireSecond;
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
