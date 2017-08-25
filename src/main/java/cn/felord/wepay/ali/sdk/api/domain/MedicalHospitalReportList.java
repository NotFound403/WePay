package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 医院报告明细
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MedicalHospitalReportList extends AlipayObject {

	private static final long serialVersionUID = 3372644547611153544L;

	/**
	 * 报告产出日期 格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("report_date")
	private Date reportDate;

	/**
	 * 报告说明
	 */
	@ApiField("report_desc")
	private String reportDesc;

	/**
	 * 报告详情连接
	 */
	@ApiField("report_link")
	private String reportLink;

	/**
	 * 报告名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报告类型:
CHECK_REPORT 检查报告
EXAM_REPORT检验报告
	 */
	@ApiField("report_type")
	private String reportType;

	/**
	 * <p>Getter for the field <code>reportDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getReportDate() {
		return this.reportDate;
	}
	/**
	 * <p>Setter for the field <code>reportDate</code>.</p>
	 *
	 * @param reportDate a {@link java.util.Date} object.
	 */
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
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
	 * <p>Getter for the field <code>reportLink</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReportLink() {
		return this.reportLink;
	}
	/**
	 * <p>Setter for the field <code>reportLink</code>.</p>
	 *
	 * @param reportLink a {@link java.lang.String} object.
	 */
	public void setReportLink(String reportLink) {
		this.reportLink = reportLink;
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
	 * <p>Getter for the field <code>reportType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReportType() {
		return this.reportType;
	}
	/**
	 * <p>Setter for the field <code>reportType</code>.</p>
	 *
	 * @param reportType a {@link java.lang.String} object.
	 */
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

}
