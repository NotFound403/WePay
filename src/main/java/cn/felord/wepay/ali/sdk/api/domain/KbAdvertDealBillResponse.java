package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统账单查询结果(交易账单)
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertDealBillResponse extends AlipayObject {

	private static final long serialVersionUID = 4444642292798891351L;

	/**
	 * 账单下载地址(为空表示查无账单)
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * <p>Getter for the field <code>downloadUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	/**
	 * <p>Setter for the field <code>downloadUrl</code>.</p>
	 *
	 * @param downloadUrl a {@link java.lang.String} object.
	 */
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

}
