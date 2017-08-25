package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.tpl.content.update response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassTplContentUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1841123934369632616L;

	/** 
	 * 业务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 业务结果数据：包含serialNumber, pass_Id和操作类型
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 操作是否成功标识：T标识成功；F标识失败
	 */
	@ApiField("success")
	private String success;

	/** {@inheritDoc} */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * <p>Getter for the field <code>errorCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorCode( ) {
		return this.errorCode;
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
	 * <p>Getter for the field <code>result</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResult( ) {
		return this.result;
	}

	/**
	 * <p>Setter for the field <code>success</code>.</p>
	 *
	 * @param success a {@link java.lang.String} object.
	 */
	public void setSuccess(String success) {
		this.success = success;
	}
	/**
	 * <p>Getter for the field <code>success</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSuccess( ) {
		return this.success;
	}

}
