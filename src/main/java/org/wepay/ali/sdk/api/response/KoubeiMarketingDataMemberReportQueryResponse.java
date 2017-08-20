package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.member.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:18
 */
public class KoubeiMarketingDataMemberReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3721452725334936894L;

	/** 
	 * 查询成功时返回json格式数据
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
