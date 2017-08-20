package org.wepay.ali.sdk.api.domain;

import java.util.List;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 报表详情查询接口
 *
 * @author auto create
 * @since 1.0, 2017-06-16 20:33:10
 */
public class KoubeiMarketingDataAlisisReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4472138329176551767L;

	/**
	 * 报表查询过滤条件
	 */
	@ApiListField("conditions")
	@ApiField("report_query_condition")
	private List<ReportQueryCondition> conditions;

	/**
	 * 报表唯一标识
	 */
	@ApiField("report_uk")
	private String reportUk;

	public List<ReportQueryCondition> getConditions() {
		return this.conditions;
	}
	public void setConditions(List<ReportQueryCondition> conditions) {
		this.conditions = conditions;
	}

	public String getReportUk() {
		return this.reportUk;
	}
	public void setReportUk(String reportUk) {
		this.reportUk = reportUk;
	}

}
