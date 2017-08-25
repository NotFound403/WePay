package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.leads.qrcode.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketLeadsQrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5157251649644749442L;

	/** 
	 * 开店二维码URL地址
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * <p>Setter for the field <code>qrCode</code>.</p>
	 *
	 * @param qrCode a {@link java.lang.String} object.
	 */
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	/**
	 * <p>Getter for the field <code>qrCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrCode( ) {
		return this.qrCode;
	}

}
