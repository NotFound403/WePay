package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 自定义数据报表删除接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataCustomreportDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4246376342753114575L;

	/**
	 * 自定义报表规则的KEY
	 */
	@ApiField("condition_key")
	private String conditionKey;

	/**
	 * <p>Getter for the field <code>conditionKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConditionKey() {
		return this.conditionKey;
	}
	/**
	 * <p>Setter for the field <code>conditionKey</code>.</p>
	 *
	 * @param conditionKey a {@link java.lang.String} object.
	 */
	public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}

}
