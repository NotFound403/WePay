package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CustomReportCondition;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataCustomreportBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3898122731874669856L;

	/** 
	 * 分页输出自定义开放数据规则列表
	 */
	@ApiListField("report_condition_list")
	@ApiField("custom_report_condition")
	private List<CustomReportCondition> reportConditionList;

	/**
	 * <p>Setter for the field <code>reportConditionList</code>.</p>
	 *
	 * @param reportConditionList a {@link java.util.List} object.
	 */
	public void setReportConditionList(List<CustomReportCondition> reportConditionList) {
		this.reportConditionList = reportConditionList;
	}
	/**
	 * <p>Getter for the field <code>reportConditionList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CustomReportCondition> getReportConditionList( ) {
		return this.reportConditionList;
	}

}
