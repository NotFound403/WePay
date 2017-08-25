package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.token.app response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAuthTokenAppResponse extends AlipayResponse {

	private static final long serialVersionUID = 2843589957798437745L;

	/** 
	 * 应用授权令牌
	 */
	@ApiField("app_auth_token")
	private String appAuthToken;

	/** 
	 * 刷新令牌
	 */
	@ApiField("app_refresh_token")
	private String appRefreshToken;

	/** 
	 * 授权商户的appid
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/** 
	 * 应用授权令牌的有效时间（从接口调用时间作为起始时间），单位到秒
	 */
	@ApiField("expires_in")
	private String expiresIn;

	/** 
	 * 刷新令牌的有效时间（从接口调用时间作为起始时间），单位到秒
	 */
	@ApiField("re_expires_in")
	private String reExpiresIn;

	/** 
	 * 授权商户的user_id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Setter for the field <code>appAuthToken</code>.</p>
	 *
	 * @param appAuthToken a {@link java.lang.String} object.
	 */
	public void setAppAuthToken(String appAuthToken) {
		this.appAuthToken = appAuthToken;
	}
	/**
	 * <p>Getter for the field <code>appAuthToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppAuthToken( ) {
		return this.appAuthToken;
	}

	/**
	 * <p>Setter for the field <code>appRefreshToken</code>.</p>
	 *
	 * @param appRefreshToken a {@link java.lang.String} object.
	 */
	public void setAppRefreshToken(String appRefreshToken) {
		this.appRefreshToken = appRefreshToken;
	}
	/**
	 * <p>Getter for the field <code>appRefreshToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppRefreshToken( ) {
		return this.appRefreshToken;
	}

	/**
	 * <p>Setter for the field <code>authAppId</code>.</p>
	 *
	 * @param authAppId a {@link java.lang.String} object.
	 */
	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}
	/**
	 * <p>Getter for the field <code>authAppId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthAppId( ) {
		return this.authAppId;
	}

	/**
	 * <p>Setter for the field <code>expiresIn</code>.</p>
	 *
	 * @param expiresIn a {@link java.lang.String} object.
	 */
	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}
	/**
	 * <p>Getter for the field <code>expiresIn</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpiresIn( ) {
		return this.expiresIn;
	}

	/**
	 * <p>Setter for the field <code>reExpiresIn</code>.</p>
	 *
	 * @param reExpiresIn a {@link java.lang.String} object.
	 */
	public void setReExpiresIn(String reExpiresIn) {
		this.reExpiresIn = reExpiresIn;
	}
	/**
	 * <p>Getter for the field <code>reExpiresIn</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReExpiresIn( ) {
		return this.reExpiresIn;
	}

	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId( ) {
		return this.userId;
	}

}
