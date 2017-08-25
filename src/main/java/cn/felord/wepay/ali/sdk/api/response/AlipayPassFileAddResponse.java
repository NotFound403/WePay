package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.file.add response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassFileAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3899395813731769395L;

	/** 
	 * 业务结果
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 业务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 是否成功标识:T-成功；F-失败
	 */
	@ApiField("success")
	private String success;

	/**
	 * <p>Setter for the field <code>bizResult</code>.</p>
	 *
	 * @param bizResult a {@link java.lang.String} object.
	 */
	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	/**
	 * <p>Getter for the field <code>bizResult</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizResult( ) {
		return this.bizResult;
	}

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
