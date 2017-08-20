package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.activity.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-09-20 14:23:46
 */
public class KoubeiMarketingDataActivityReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3315397493143812721L;

	/** 
	 * 报表
	 */
	@ApiField("report_data")
	private String reportData;

	public void setReportData(String reportData) {
		this.reportData = reportData;
	}
	public String getReportData( ) {
		return this.reportData;
	}

}
