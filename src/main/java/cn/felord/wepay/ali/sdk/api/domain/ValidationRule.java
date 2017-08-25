package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 输入域规则校验模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ValidationRule extends AlipayObject {

	private static final long serialVersionUID = 4188811621944968415L;

	/**
	 * 规则校验对应的错误提示 如：户号必须为10位数字
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 正则表达式规则 如十位数字的正则表达式为：^\d{10}$
	 */
	@ApiField("rule_text")
	private String ruleText;

	/**
	 * <p>Getter for the field <code>errorMsg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorMsg() {
		return this.errorMsg;
	}
	/**
	 * <p>Setter for the field <code>errorMsg</code>.</p>
	 *
	 * @param errorMsg a {@link java.lang.String} object.
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * <p>Getter for the field <code>ruleText</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRuleText() {
		return this.ruleText;
	}
	/**
	 * <p>Setter for the field <code>ruleText</code>.</p>
	 *
	 * @param ruleText a {@link java.lang.String} object.
	 */
	public void setRuleText(String ruleText) {
		this.ruleText = ruleText;
	}

}
