package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 报表详情查询接口
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>conditions</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ReportQueryCondition> getConditions() {
		return this.conditions;
	}
	/**
	 * <p>Setter for the field <code>conditions</code>.</p>
	 *
	 * @param conditions a {@link java.util.List} object.
	 */
	public void setConditions(List<ReportQueryCondition> conditions) {
		this.conditions = conditions;
	}

	/**
	 * <p>Getter for the field <code>reportUk</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReportUk() {
		return this.reportUk;
	}
	/**
	 * <p>Setter for the field <code>reportUk</code>.</p>
	 *
	 * @param reportUk a {@link java.lang.String} object.
	 */
	public void setReportUk(String reportUk) {
		this.reportUk = reportUk;
	}

}
