package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.activity.bill.download response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataActivityBillDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2189621528171789775L;

	/** 
	 * 账单下载地址
	 */
	@ApiField("url")
	private String url;

	/**
	 * <p>Setter for the field <code>url</code>.</p>
	 *
	 * @param url a {@link java.lang.String} object.
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * <p>Getter for the field <code>url</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUrl( ) {
		return this.url;
	}

}
