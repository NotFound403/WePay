package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 用户打标接口失败的匹配器
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ErrorMatcher extends AlipayObject {

	private static final long serialVersionUID = 1267632632131753111L;

	/**
	 * 失败原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 用户打标接口出错的匹配器
	 */
	@ApiField("matcher")
	private Matcher matcher;

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
	 * <p>Getter for the field <code>matcher</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Matcher} object.
	 */
	public Matcher getMatcher() {
		return this.matcher;
	}
	/**
	 * <p>Setter for the field <code>matcher</code>.</p>
	 *
	 * @param matcher a {@link cn.felord.wepay.ali.sdk.api.domain.Matcher} object.
	 */
	public void setMatcher(Matcher matcher) {
		this.matcher = matcher;
	}

}
