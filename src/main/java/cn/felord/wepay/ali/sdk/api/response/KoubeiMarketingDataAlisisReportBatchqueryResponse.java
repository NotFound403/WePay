package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.AlisisReport;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.alisis.report.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataAlisisReportBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1645359545421163991L;

	/** 
	 * 报表列表信息
	 */
	@ApiListField("report_list")
	@ApiField("alisis_report")
	private List<AlisisReport> reportList;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private String totalCount;

	/**
	 * <p>Setter for the field <code>reportList</code>.</p>
	 *
	 * @param reportList a {@link java.util.List} object.
	 */
	public void setReportList(List<AlisisReport> reportList) {
		this.reportList = reportList;
	}
	/**
	 * <p>Getter for the field <code>reportList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlisisReport> getReportList( ) {
		return this.reportList;
	}

	/**
	 * <p>Setter for the field <code>totalCount</code>.</p>
	 *
	 * @param totalCount a {@link java.lang.String} object.
	 */
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	/**
	 * <p>Getter for the field <code>totalCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
