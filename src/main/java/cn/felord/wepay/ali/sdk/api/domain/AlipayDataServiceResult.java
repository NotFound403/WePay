package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 数据决策分析结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataServiceResult extends AlipayObject {

	private static final long serialVersionUID = 5632852586546426194L;

	/**
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 错误信息
	 */
	@ApiField("message")
	private String message;

	/**
	 * 调用结果，json格式
	 */
	@ApiField("result")
	private String result;

	/**
	 * 调用是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Getter for the field <code>message</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMessage() {
		return this.message;
	}
	/**
	 * <p>Setter for the field <code>message</code>.</p>
	 *
	 * @param message a {@link java.lang.String} object.
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * <p>Getter for the field <code>result</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResult() {
		return this.result;
	}
	/**
	 * <p>Setter for the field <code>result</code>.</p>
	 *
	 * @param result a {@link java.lang.String} object.
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * <p>Getter for the field <code>success</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getSuccess() {
		return this.success;
	}
	/**
	 * <p>Setter for the field <code>success</code>.</p>
	 *
	 * @param success a {@link java.lang.Boolean} object.
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
