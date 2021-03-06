package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.AlisisReportRow;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.alisis.report.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataAlisisReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1143635332155661159L;

	/** 
	 * 报表数据
	 */
	@ApiListField("report_data")
	@ApiField("alisis_report_row")
	private List<AlisisReportRow> reportData;

	/**
	 * <p>Setter for the field <code>reportData</code>.</p>
	 *
	 * @param reportData a {@link java.util.List} object.
	 */
	public void setReportData(List<AlisisReportRow> reportData) {
		this.reportData = reportData;
	}
	/**
	 * <p>Getter for the field <code>reportData</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlisisReportRow> getReportData( ) {
		return this.reportData;
	}

}
