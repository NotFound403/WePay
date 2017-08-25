package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.prizesend.auth response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingToolPrizesendAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 2699419218349326432L;

	/** 
	 * 发奖token，用于校验商户是否有权限给制定用户发奖
	 */
	@ApiField("token")
	private String token;

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
