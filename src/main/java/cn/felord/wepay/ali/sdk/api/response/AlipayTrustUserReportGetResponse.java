package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.report.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTrustUserReportGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5329243849861516137L;

	/** 
	 * 报告内容，格式详见示例代码
	 */
	@ApiField("report")
	private String report;

	/**
	 * <p>Setter for the field <code>report</code>.</p>
	 *
	 * @param report a {@link java.lang.String} object.
	 */
	public void setReport(String report) {
		this.report = report;
	}
	/**
	 * <p>Getter for the field <code>report</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReport( ) {
		return this.report;
	}

}
