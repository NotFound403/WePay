package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 自定义数据报表创建及更新接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataCustomreportSaveModel extends AlipayObject {

	private static final long serialVersionUID = 2399195757811915113L;

	/**
	 * 自定义报表规则条件信息
	 */
	@ApiField("report_condition_info")
	private CustomReportCondition reportConditionInfo;

	/**
	 * <p>Getter for the field <code>reportConditionInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.CustomReportCondition} object.
	 */
	public CustomReportCondition getReportConditionInfo() {
		return this.reportConditionInfo;
	}
	/**
	 * <p>Setter for the field <code>reportConditionInfo</code>.</p>
	 *
	 * @param reportConditionInfo a {@link cn.felord.wepay.ali.sdk.api.domain.CustomReportCondition} object.
	 */
	public void setReportConditionInfo(CustomReportCondition reportConditionInfo) {
		this.reportConditionInfo = reportConditionInfo;
	}

}
