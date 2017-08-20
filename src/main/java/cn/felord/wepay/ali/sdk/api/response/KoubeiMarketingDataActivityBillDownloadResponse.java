package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.activity.bill.download response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-11 19:58:38
 */
public class KoubeiMarketingDataActivityBillDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2189621528171789775L;

	/** 
	 * 账单下载地址
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
