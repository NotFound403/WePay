package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 个性化扩展区标签规则
 *
 * @author auto create
 * @version $Id: $Id
 */
public class LabelRule extends AlipayObject {

	private static final long serialVersionUID = 3382627969686837221L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签值，当有多个取值时用英文","分隔，不允许传入下划线"_"、竖线"|"或者空格" "和方括号"["、"]"
	 */
	@ApiField("label_value")
	private String labelValue;

	/**
	 * 目前支持EQ（等于）、BETWEEN（范围）、IN（包含）三种操作符；每个标签支持的运算符可以通过查询接口获得。该字段允许为空，默认运算符为IN
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * <p>Getter for the field <code>labelId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabelId() {
		return this.labelId;
	}
	/**
	 * <p>Setter for the field <code>labelId</code>.</p>
	 *
	 * @param labelId a {@link java.lang.String} object.
	 */
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	/**
	 * <p>Getter for the field <code>labelValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabelValue() {
		return this.labelValue;
	}
	/**
	 * <p>Setter for the field <code>labelValue</code>.</p>
	 *
	 * @param labelValue a {@link java.lang.String} object.
	 */
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

	/**
	 * <p>Getter for the field <code>operator</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperator() {
		return this.operator;
	}
	/**
	 * <p>Setter for the field <code>operator</code>.</p>
	 *
	 * @param operator a {@link java.lang.String} object.
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
