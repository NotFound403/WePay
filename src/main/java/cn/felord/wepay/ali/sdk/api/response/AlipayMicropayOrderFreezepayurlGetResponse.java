package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.freezepayurl.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMicropayOrderFreezepayurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5815351763274584278L;

	/** 
	 * 支付冻结金的地址
	 */
	@ApiField("pay_freeze_url")
	private String payFreezeUrl;

	/**
	 * <p>Setter for the field <code>payFreezeUrl</code>.</p>
	 *
	 * @param payFreezeUrl a {@link java.lang.String} object.
	 */
	public void setPayFreezeUrl(String payFreezeUrl) {
		this.payFreezeUrl = payFreezeUrl;
	}
	/**
	 * <p>Getter for the field <code>payFreezeUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayFreezeUrl( ) {
		return this.payFreezeUrl;
	}

}
