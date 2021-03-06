package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 自定义数据报表规则详情查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataCustomreportDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6484212883284145612L;

	/**
	 * 自定义报表的规则KEY
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
