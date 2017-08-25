package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.fingerprint.verify response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdFingerprintVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5887694859936322652L;

	/** 
	 * IFAA服务端校验结果，true为通过，false为未通过
	 */
	@ApiField("auth_result")
	private Boolean authResult;

	/** 
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token用于提供给业务方关联校验结果。
	 */
	@ApiField("token")
	private String token;

	/**
	 * <p>Setter for the field <code>authResult</code>.</p>
	 *
	 * @param authResult a {@link java.lang.Boolean} object.
	 */
	public void setAuthResult(Boolean authResult) {
		this.authResult = authResult;
	}
	/**
	 * <p>Getter for the field <code>authResult</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getAuthResult( ) {
		return this.authResult;
	}

	/**
	 * <p>Setter for the field <code>token</code>.</p>
	 *
	 * @param token a {@link java.lang.String} object.
	 */
	public void setToken(String token) {
		this.token = token;
	}
	/**
	 * <p>Getter for the field <code>token</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getToken( ) {
		return this.token;
	}

}
