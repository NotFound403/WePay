package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ReportDataItem;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataCustomreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6183736442295218118L;

	/** 
	 * 数据量
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 满足自定义报表规则的报表数据
	 */
	@ApiListField("report_data")
	@ApiField("report_data_item")
	private List<ReportDataItem> reportData;

	/**
	 * <p>Setter for the field <code>count</code>.</p>
	 *
	 * @param count a {@link java.lang.String} object.
	 */
	public void setCount(String count) {
		this.count = count;
	}
	/**
	 * <p>Getter for the field <code>count</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCount( ) {
		return this.count;
	}

	/**
	 * <p>Setter for the field <code>reportData</code>.</p>
	 *
	 * @param reportData a {@link java.util.List} object.
	 */
	public void setReportData(List<ReportDataItem> reportData) {
		this.reportData = reportData;
	}
	/**
	 * <p>Getter for the field <code>reportData</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ReportDataItem> getReportData( ) {
		return this.reportData;
	}

}
