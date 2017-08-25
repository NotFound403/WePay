package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 复杂标签规则项查询模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class QueryComplexLabelRule extends AlipayObject {

	private static final long serialVersionUID = 2347578129343129937L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签名
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 当有多个取值时用英文","分隔，不允许传入下划线"_"、竖线"|"或者空格" "
	 */
	@ApiField("label_value")
	private String labelValue;

	/**
	 * 运算符
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
	 * <p>Getter for the field <code>labelName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabelName() {
		return this.labelName;
	}
	/**
	 * <p>Setter for the field <code>labelName</code>.</p>
	 *
	 * @param labelName a {@link java.lang.String} object.
	 */
	public void setLabelName(String labelName) {
		this.labelName = labelName;
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
