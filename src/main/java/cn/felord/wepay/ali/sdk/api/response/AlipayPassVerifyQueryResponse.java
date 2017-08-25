package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.verify.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassVerifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1585874292675621777L;

	/** 
	 * 查询成功时返回的结果信息
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 返回码。
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 查询是否成功的标识
	 */
	@ApiField("success")
	private Boolean success;

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
	 * @param success a {@link java.lang.Boolean} object.
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	/**
	 * <p>Getter for the field <code>success</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getSuccess( ) {
		return this.success;
	}

}
