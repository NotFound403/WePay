package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.qrcode.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7521697255641892932L;

	/** 
	 * 二维码图片地址，可跳转到实际图片
	 */
	@ApiField("code_img")
	private String codeImg;

	/** 
	 * 二维码有效时间，单位（秒）。永久码暂时忽略该信息
	 */
	@ApiField("expire_second")
	private String expireSecond;

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
	 * @param expireSecond a {@link java.lang.String} object.
	 */
	public void setExpireSecond(String expireSecond) {
		this.expireSecond = expireSecond;
	}
	/**
	 * <p>Getter for the field <code>expireSecond</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpireSecond( ) {
		return this.expireSecond;
	}

}
