package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.CustomReportCondition;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.detail.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataCustomreportDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7135222968361223118L;

	/** 
	 * 自定义报表规则条件的详细信息
	 */
	@ApiField("report_condition_info")
	private CustomReportCondition reportConditionInfo;

	/**
	 * <p>Setter for the field <code>reportConditionInfo</code>.</p>
	 *
	 * @param reportConditionInfo a {@link cn.felord.wepay.ali.sdk.api.domain.CustomReportCondition} object.
	 */
	public void setReportConditionInfo(CustomReportCondition reportConditionInfo) {
		this.reportConditionInfo = reportConditionInfo;
	}
	/**
	 * <p>Getter for the field <code>reportConditionInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.CustomReportCondition} object.
	 */
	public CustomReportCondition getReportConditionInfo( ) {
		return this.reportConditionInfo;
	}

}
