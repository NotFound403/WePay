package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.activity.report.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataActivityReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3315397493143812721L;

	/** 
	 * 报表
	 */
	@ApiField("report_data")
	private String reportData;

	/**
	 * <p>Setter for the field <code>reportData</code>.</p>
	 *
	 * @param reportData a {@link java.lang.String} object.
	 */
	public void setReportData(String reportData) {
		this.reportData = reportData;
	}
	/**
	 * <p>Getter for the field <code>reportData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReportData( ) {
		return this.reportData;
	}

}
