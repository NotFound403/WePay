package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.exchangevoucher.use response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingExchangevoucherUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2278334684479888993L;

	/** 
	 * 被核销的券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * <p>Setter for the field <code>voucherId</code>.</p>
	 *
	 * @param voucherId a {@link java.lang.String} object.
	 */
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	/**
	 * <p>Getter for the field <code>voucherId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
