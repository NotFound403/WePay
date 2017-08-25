package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 商品适用信息(数据)
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataItemLimitPeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 5551376761649112283L;

	/**
	 * 区间范围枚举，分为： INCLUDE（包含） EXCLUDE（排除）
	 */
	@ApiField("rule")
	private String rule;

	/**
	 * 单位描述，分为：
MINUTE（分钟）
HOUR（小时）
WEEK_DAY（星期几）
DAY（日）
WEEK（周）
MONTH（月）
ALL（整个销售周期）
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 区间范围值
	 */
	@ApiListField("value")
	@ApiField("number")
	private List<Long> value;

	/**
	 * <p>Getter for the field <code>rule</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRule() {
		return this.rule;
	}
	/**
	 * <p>Setter for the field <code>rule</code>.</p>
	 *
	 * @param rule a {@link java.lang.String} object.
	 */
	public void setRule(String rule) {
		this.rule = rule;
	}

	/**
	 * <p>Getter for the field <code>unit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUnit() {
		return this.unit;
	}
	/**
	 * <p>Setter for the field <code>unit</code>.</p>
	 *
	 * @param unit a {@link java.lang.String} object.
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * <p>Getter for the field <code>value</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Long> getValue() {
		return this.value;
	}
	/**
	 * <p>Setter for the field <code>value</code>.</p>
	 *
	 * @param value a {@link java.util.List} object.
	 */
	public void setValue(List<Long> value) {
		this.value = value;
	}

}
