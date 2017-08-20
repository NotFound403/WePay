package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 输入域规则校验模型
 *
 * @author auto create
 * @since 1.0, 2013-12-05 14:40:29
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

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getRuleText() {
		return this.ruleText;
	}
	public void setRuleText(String ruleText) {
		this.ruleText = ruleText;
	}

}
