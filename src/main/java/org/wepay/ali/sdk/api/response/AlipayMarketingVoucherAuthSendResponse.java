package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.auth.send response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-19 11:27:25
 */
public class AlipayMarketingVoucherAuthSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6712832266865738394L;

	/** 
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
