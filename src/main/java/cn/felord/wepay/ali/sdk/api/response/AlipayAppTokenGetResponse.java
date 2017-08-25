package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.app.token.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAppTokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6511118445555956632L;

	/** 
	 * 应用访问令牌
	 */
	@ApiField("app_access_token")
	private String appAccessToken;

	/** 
	 * 应用访问凭证有效时间，单位：秒
	 */
	@ApiField("expires_in")
	private Long expiresIn;

	/**
	 * <p>Setter for the field <code>appAccessToken</code>.</p>
	 *
	 * @param appAccessToken a {@link java.lang.String} object.
	 */
	public void setAppAccessToken(String appAccessToken) {
		this.appAccessToken = appAccessToken;
	}
	/**
	 * <p>Getter for the field <code>appAccessToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppAccessToken( ) {
		return this.appAccessToken;
	}

	/**
	 * <p>Setter for the field <code>expiresIn</code>.</p>
	 *
	 * @param expiresIn a {@link java.lang.Long} object.
	 */
	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}
	/**
	 * <p>Getter for the field <code>expiresIn</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getExpiresIn( ) {
		return this.expiresIn;
	}

}
