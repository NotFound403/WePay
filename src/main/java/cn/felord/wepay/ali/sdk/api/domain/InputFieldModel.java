package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 输入域模型集合对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InputFieldModel extends AlipayObject {

	private static final long serialVersionUID = 2423373795235253275L;

	/**
	 * 默认提示值，例如歌华宽带的金额为100的倍数
	 */
	@ApiField("default_value")
	private String defaultValue;

	/**
	 * 域英文名称 例如：billkey
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 输入框下方文字提示，例如： 户号为10位数字
	 */
	@ApiField("field_tips")
	private String fieldTips;

	/**
	 * 页面显示提示 例如：手机号码
	 */
	@ApiField("field_title")
	private String fieldTitle;

	/**
	 * 控件类型 输入框类型 例如：inputText (文本输入框)
	 */
	@ApiField("field_type")
	private String fieldType;

	/**
	 * 控件展示顺序 例如：优选级 1
	 */
	@ApiField("priority")
	private String priority;

	/**
	 * 输入域的校验规则模型
	 */
	@ApiListField("regexp_rule_list")
	@ApiField("validation_rule")
	private List<ValidationRule> regexpRuleList;

	/**
	 * <p>Getter for the field <code>defaultValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDefaultValue() {
		return this.defaultValue;
	}
	/**
	 * <p>Setter for the field <code>defaultValue</code>.</p>
	 *
	 * @param defaultValue a {@link java.lang.String} object.
	 */
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

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
	 * <p>Getter for the field <code>fieldTips</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFieldTips() {
		return this.fieldTips;
	}
	/**
	 * <p>Setter for the field <code>fieldTips</code>.</p>
	 *
	 * @param fieldTips a {@link java.lang.String} object.
	 */
	public void setFieldTips(String fieldTips) {
		this.fieldTips = fieldTips;
	}

	/**
	 * <p>Getter for the field <code>fieldTitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFieldTitle() {
		return this.fieldTitle;
	}
	/**
	 * <p>Setter for the field <code>fieldTitle</code>.</p>
	 *
	 * @param fieldTitle a {@link java.lang.String} object.
	 */
	public void setFieldTitle(String fieldTitle) {
		this.fieldTitle = fieldTitle;
	}

	/**
	 * <p>Getter for the field <code>fieldType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFieldType() {
		return this.fieldType;
	}
	/**
	 * <p>Setter for the field <code>fieldType</code>.</p>
	 *
	 * @param fieldType a {@link java.lang.String} object.
	 */
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	/**
	 * <p>Getter for the field <code>priority</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPriority() {
		return this.priority;
	}
	/**
	 * <p>Setter for the field <code>priority</code>.</p>
	 *
	 * @param priority a {@link java.lang.String} object.
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * <p>Getter for the field <code>regexpRuleList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ValidationRule> getRegexpRuleList() {
		return this.regexpRuleList;
	}
	/**
	 * <p>Setter for the field <code>regexpRuleList</code>.</p>
	 *
	 * @param regexpRuleList a {@link java.util.List} object.
	 */
	public void setRegexpRuleList(List<ValidationRule> regexpRuleList) {
		this.regexpRuleList = regexpRuleList;
	}

}
