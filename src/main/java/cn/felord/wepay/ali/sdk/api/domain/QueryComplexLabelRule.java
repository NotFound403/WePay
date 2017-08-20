package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 复杂标签规则项查询模型
 *
 * @author auto create
 * @since 1.0, 2017-06-14 11:01:41
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

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
