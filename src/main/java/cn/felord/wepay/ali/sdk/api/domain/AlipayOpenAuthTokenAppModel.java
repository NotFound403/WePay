package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 用应用授权码（app_auth_code）换取或者刷新应用授权令牌(app_auth_token)
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAuthTokenAppModel extends AlipayObject {

	private static final long serialVersionUID = 7397269323943872183L;

	/**
	 * 授权码，如果grant_type的值为authorization_code。该值必须填写
	 */
	@ApiField("code")
	private String code;

	/**
	 * authorization_code表示换取app_auth_token。
refresh_token表示刷新app_auth_token。
	 */
	@ApiField("grant_type")
	private String grantType;

	/**
	 * 刷新令牌，如果grant_type值为refresh_token。该值不能为空。该值来源于此接口的返回值app_refresh_token（至少需要通过grant_type=authorization_code调用此接口一次才能获取）
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Getter for the field <code>grantType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGrantType() {
		return this.grantType;
	}
	/**
	 * <p>Setter for the field <code>grantType</code>.</p>
	 *
	 * @param grantType a {@link java.lang.String} object.
	 */
	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	/**
	 * <p>Getter for the field <code>refreshToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefreshToken() {
		return this.refreshToken;
	}
	/**
	 * <p>Setter for the field <code>refreshToken</code>.</p>
	 *
	 * @param refreshToken a {@link java.lang.String} object.
	 */
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

}
