package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.downloadurl.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataBillDownloadurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3734857478958546959L;

	/** 
	 * 账单下载地址链接，获取连接后30秒后未下载，链接地址失效。
	 */
	@ApiField("bill_download_url")
	private String billDownloadUrl;

	/**
	 * <p>Setter for the field <code>billDownloadUrl</code>.</p>
	 *
	 * @param billDownloadUrl a {@link java.lang.String} object.
	 */
	public void setBillDownloadUrl(String billDownloadUrl) {
		this.billDownloadUrl = billDownloadUrl;
	}
	/**
	 * <p>Getter for the field <code>billDownloadUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillDownloadUrl( ) {
		return this.billDownloadUrl;
	}

}
