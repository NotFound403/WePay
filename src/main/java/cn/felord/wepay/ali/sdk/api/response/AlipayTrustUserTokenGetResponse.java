package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.token.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTrustUserTokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4231975511352374196L;

	/** 
	 * 访问令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 本字段已废弃
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/**
	 * <p>Setter for the field <code>accessToken</code>.</p>
	 *
	 * @param accessToken a {@link java.lang.String} object.
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	/**
	 * <p>Getter for the field <code>accessToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccessToken( ) {
		return this.accessToken;
	}

	/**
	 * <p>Setter for the field <code>refreshToken</code>.</p>
	 *
	 * @param refreshToken a {@link java.lang.String} object.
	 */
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	/**
	 * <p>Getter for the field <code>refreshToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefreshToken( ) {
		return this.refreshToken;
	}

}
