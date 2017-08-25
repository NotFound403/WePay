package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.account.unbind response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAssetAccountUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 4191581941517799575L;

	/** 
	 * 用户的支付宝账号对应的支付宝唯一用户标识，不可变更。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 使用该app提供用户信息的商户，可以和app相同。
	 */
	@ApiField("provider_id")
	private String providerId;

	/** 
	 * 用户在商户网站的会员标识。商户需确保其唯一性，不可变更。
	 */
	@ApiField("provider_user_id")
	private String providerUserId;

	/** 
	 * 用户在商户网站的会员名（登录号或昵称）。
	 */
	@ApiField("provider_user_name")
	private String providerUserName;

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
	 * <p>Setter for the field <code>providerId</code>.</p>
	 *
	 * @param providerId a {@link java.lang.String} object.
	 */
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	/**
	 * <p>Getter for the field <code>providerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProviderId( ) {
		return this.providerId;
	}

	/**
	 * <p>Setter for the field <code>providerUserId</code>.</p>
	 *
	 * @param providerUserId a {@link java.lang.String} object.
	 */
	public void setProviderUserId(String providerUserId) {
		this.providerUserId = providerUserId;
	}
	/**
	 * <p>Getter for the field <code>providerUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProviderUserId( ) {
		return this.providerUserId;
	}

	/**
	 * <p>Setter for the field <code>providerUserName</code>.</p>
	 *
	 * @param providerUserName a {@link java.lang.String} object.
	 */
	public void setProviderUserName(String providerUserName) {
		this.providerUserName = providerUserName;
	}
	/**
	 * <p>Getter for the field <code>providerUserName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProviderUserName( ) {
		return this.providerUserName;
	}

}
