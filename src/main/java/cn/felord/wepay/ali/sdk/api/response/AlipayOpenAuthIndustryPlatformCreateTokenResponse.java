package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.industry.platform.create.token response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-13 18:02:26
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

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getAuthCode( ) {
		return this.authCode;
	}

	public void setRequstAppId(String requstAppId) {
		this.requstAppId = requstAppId;
	}
	public String getRequstAppId( ) {
		return this.requstAppId;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getScope( ) {
		return this.scope;
	}

}
