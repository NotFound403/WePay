package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.tpl.add response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassTplAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7326717855429535783L;

	/** 
	 * 接口返回业务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 接口调用返回结果信息
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 操作成功标识【T：成功；F：失败】
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
