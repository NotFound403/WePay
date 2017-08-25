package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 模板字段规则
 *
 * @author auto create
 * @version $Id: $Id
 */
public class TemplateFieldRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 5456348447568334472L;

	/**
	 * 字段名称，现在支持如下几个Key（暂不支持自定义）
Balance：金额
Point：整数
Level：任意字符串
OpenDate：开卡日期
ValidDate：过期日期
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 规则名
1、ASSIGN_FROM_REQUEST:  以rule_value为key值，表示该栏位的值从会员卡开卡接口中获取，会员卡开卡接口的card_info中获取对应参数值
2、DATE_IN_FUTURE: 生成一个未来的日期（格式YYYY-MM-DD)，当选择DATE_IN_FUTURE的时候，field_name 必须是OpenDate或ValidDate， 值为(10m或10d 分别表示10个月或10天)
3、CONST: 常量，会员卡开卡接口进行开卡的时候使用模板创建时候设置的值，即取rule_value的值
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 根据rule_name，采取相应取值策略
CONST：直接取rule_value作为卡属性值
DATE_IN_FUTURE：10m或10d 分别表示10个月或10天
ASSIGN_FROM_REQUEST：在开卡Reuqest请求中按rule_value取值，现在和field_name对应的为（OpenDate、ValidDate、Level、Point、Balance）
	 */
	@ApiField("rule_value")
	private String ruleValue;

	/**
	 * <p>Getter for the field <code>fieldName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFieldName() {
		return this.fieldName;
	}
	/**
	 * <p>Setter for the field <code>fieldName</code>.</p>
	 *
	 * @param fieldName a {@link java.lang.String} object.
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * <p>Getter for the field <code>ruleName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRuleName() {
		return this.ruleName;
	}
	/**
	 * <p>Setter for the field <code>ruleName</code>.</p>
	 *
	 * @param ruleName a {@link java.lang.String} object.
	 */
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	/**
	 * <p>Getter for the field <code>ruleValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRuleValue() {
		return this.ruleValue;
	}
	/**
	 * <p>Setter for the field <code>ruleValue</code>.</p>
	 *
	 * @param ruleValue a {@link java.lang.String} object.
	 */
	public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue;
	}

}
