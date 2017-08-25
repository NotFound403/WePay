package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.qrcode.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAppQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5882727481386768152L;

	/** 
	 * 二维码图片链接地址
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/**
	 * <p>Setter for the field <code>qrCodeUrl</code>.</p>
	 *
	 * @param qrCodeUrl a {@link java.lang.String} object.
	 */
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	/**
	 * <p>Getter for the field <code>qrCodeUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

}
