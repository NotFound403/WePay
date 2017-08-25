package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统账单查询结果(结算账单)
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertSettleBillResponse extends AlipayObject {

	private static final long serialVersionUID = 6615577228431729674L;

	/**
	 * 账单下载地址(为空表示查无账单)
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 结算账单打款日期(为空表示未打款)
	 */
	@ApiField("paid_date")
	private String paidDate;

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

	/**
	 * <p>Getter for the field <code>paidDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaidDate() {
		return this.paidDate;
	}
	/**
	 * <p>Setter for the field <code>paidDate</code>.</p>
	 *
	 * @param paidDate a {@link java.lang.String} object.
	 */
	public void setPaidDate(String paidDate) {
		this.paidDate = paidDate;
	}

}
