package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 自定义数据报表删除接口
 *
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:26
 */
public class KoubeiMarketingDataCustomreportDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4246376342753114575L;

	/**
	 * 自定义报表规则的KEY
	 */
	@ApiField("condition_key")
	private String conditionKey;

	public String getConditionKey() {
		return this.conditionKey;
	}
	public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}

}
