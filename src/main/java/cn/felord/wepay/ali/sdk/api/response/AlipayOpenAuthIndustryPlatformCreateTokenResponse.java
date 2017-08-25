package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.industry.platform.create.token response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAuthIndustryPlatformCreateTokenResponse extends AlipayResponse {

	private static final long serialVersionUID = 3413236215327693415L;

	/** 
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/** 
	 * appid
	 */
	@ApiField("requst_app_id")
	private String requstAppId;

	/** 
	 * scope
	 */
	@ApiField("scope")
	private String scope;

	/**
	 * <p>Setter for the field <code>authCode</code>.</p>
	 *
	 * @param authCode a {@link java.lang.String} object.
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	/**
	 * <p>Getter for the field <code>authCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthCode( ) {
		return this.authCode;
	}

	/**
	 * <p>Setter for the field <code>requstAppId</code>.</p>
	 *
	 * @param requstAppId a {@link java.lang.String} object.
	 */
	public void setRequstAppId(String requstAppId) {
		this.requstAppId = requstAppId;
	}
	/**
	 * <p>Getter for the field <code>requstAppId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequstAppId( ) {
		return this.requstAppId;
	}

	/**
	 * <p>Setter for the field <code>scope</code>.</p>
	 *
	 * @param scope a {@link java.lang.String} object.
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}
	/**
	 * <p>Getter for the field <code>scope</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getScope( ) {
		return this.scope;
	}

}
