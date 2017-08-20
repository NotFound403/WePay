package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-08 11:59:38
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

	public void setCodeImg(String codeImg) {
		this.codeImg = codeImg;
	}
	public String getCodeImg( ) {
		return this.codeImg;
	}

	public void setExpireSecond(String expireSecond) {
		this.expireSecond = expireSecond;
	}
	public String getExpireSecond( ) {
		return this.expireSecond;
	}

}
