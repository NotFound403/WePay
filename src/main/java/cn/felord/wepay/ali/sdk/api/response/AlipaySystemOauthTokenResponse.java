package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.system.oauth.token response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySystemOauthTokenResponse extends AlipayResponse {

	private static final long serialVersionUID = 3435749172175636252L;

	/** 
	 * 访问令牌。通过该令牌调用需要授权类接口
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 已废弃，请勿使用
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 访问令牌的有效时间，单位是秒。
	 */
	@ApiField("expires_in")
	private String expiresIn;

	/** 
	 * 刷新令牌的有效时间，单位是秒。
	 */
	@ApiField("re_expires_in")
	private String reExpiresIn;

	/** 
	 * 刷新令牌。通过该令牌可以刷新access_token
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/** 
	 * 支付宝用户的唯一userId
	 */
	@ApiField("user_id")
	private String userId;

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
	 * <p>Setter for the field <code>alipayUserId</code>.</p>
	 *
	 * @param alipayUserId a {@link java.lang.String} object.
	 */
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	/**
	 * <p>Getter for the field <code>alipayUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayUserId( ) {
		return this.alipayUserId;
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
