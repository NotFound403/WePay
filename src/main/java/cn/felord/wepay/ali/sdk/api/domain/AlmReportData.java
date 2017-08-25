package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 资产负债报表数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlmReportData extends AlipayObject {

	private static final long serialVersionUID = 6837775598454573938L;

	/**
	 * 数据大类
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 期限类别
	 */
	@ApiField("date_type")
	private String dateType;

	/**
	 * 数据日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 报表名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报表数据，只支持整数（可为负），详细见下面描述。
金额单位：分，1万即传 1000000
百分比：乘以1万后的值。例如：50%，则提供 0.5*10000即：5000
偏离度bp：bp*1万提供。例如：30.5bp，提供值：305000
	 */
	@ApiField("report_value")
	private Long reportValue;

	/**
	 * 报表小类
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>dateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDateType() {
		return this.dateType;
	}
	/**
	 * <p>Setter for the field <code>dateType</code>.</p>
	 *
	 * @param dateType a {@link java.lang.String} object.
	 */
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

	/**
	 * <p>Getter for the field <code>reportDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReportDate() {
		return this.reportDate;
	}
	/**
	 * <p>Setter for the field <code>reportDate</code>.</p>
	 *
	 * @param reportDate a {@link java.lang.String} object.
	 */
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
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
	 * <p>Getter for the field <code>reportValue</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getReportValue() {
		return this.reportValue;
	}
	/**
	 * <p>Setter for the field <code>reportValue</code>.</p>
	 *
	 * @param reportValue a {@link java.lang.Long} object.
	 */
	public void setReportValue(Long reportValue) {
		this.reportValue = reportValue;
	}

	/**
	 * <p>Getter for the field <code>subBizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubBizType() {
		return this.subBizType;
	}
	/**
	 * <p>Setter for the field <code>subBizType</code>.</p>
	 *
	 * @param subBizType a {@link java.lang.String} object.
	 */
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
