package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 余额宝负债端预测数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataDataserviceYuebaolqdDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7272488781728924112L;

	/**
	 * 服务入参，格式为yyyymmdd
	 */
	@ApiField("report_date")
	private String reportDate;

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

}
