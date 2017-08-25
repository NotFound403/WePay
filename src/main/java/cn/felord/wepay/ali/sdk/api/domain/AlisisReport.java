package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 报表概述信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlisisReport extends AlipayObject {

	private static final long serialVersionUID = 6748876724425641534L;

	/**
	 * ：	
报表可过滤字段条件
	 */
	@ApiListField("conditions")
	@ApiField("report_condition")
	private List<ReportCondition> conditions;

	/**
	 * 报表描述
	 */
	@ApiField("report_desc")
	private String reportDesc;

	/**
	 * 报表名称
	 */
	@ApiField("report_name")
	private String reportName;

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
	public List<ReportCondition> getConditions() {
		return this.conditions;
	}
	/**
	 * <p>Setter for the field <code>conditions</code>.</p>
	 *
	 * @param conditions a {@link java.util.List} object.
	 */
	public void setConditions(List<ReportCondition> conditions) {
		this.conditions = conditions;
	}

	/**
	 * <p>Getter for the field <code>reportDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReportDesc() {
		return this.reportDesc;
	}
	/**
	 * <p>Setter for the field <code>reportDesc</code>.</p>
	 *
	 * @param reportDesc a {@link java.lang.String} object.
	 */
	public void setReportDesc(String reportDesc) {
		this.reportDesc = reportDesc;
	}

	/**
	 * <p>Getter for the field <code>reportName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReportName() {
		return this.reportName;
	}
	/**
	 * <p>Setter for the field <code>reportName</code>.</p>
	 *
	 * @param reportName a {@link java.lang.String} object.
	 */
	public void setReportName(String reportName) {
		this.reportName = reportName;
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
