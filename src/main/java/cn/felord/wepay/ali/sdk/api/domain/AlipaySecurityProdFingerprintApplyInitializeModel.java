package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 指纹注册初始化
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdFingerprintApplyInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1264196762351528554L;

	/**
	 * IFAA标准中的校验类型，目前1为指纹
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * IFAA协议的版本，目前为2.0
	 */
	@ApiField("ifaa_version")
	private String ifaaVersion;

	/**
	 * <p>Getter for the field <code>authType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthType() {
		return this.authType;
	}
	/**
	 * <p>Setter for the field <code>authType</code>.</p>
	 *
	 * @param authType a {@link java.lang.String} object.
	 */
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	/**
	 * <p>Getter for the field <code>ifaaVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIfaaVersion() {
		return this.ifaaVersion;
	}
	/**
	 * <p>Setter for the field <code>ifaaVersion</code>.</p>
	 *
	 * @param ifaaVersion a {@link java.lang.String} object.
	 */
	public void setIfaaVersion(String ifaaVersion) {
		this.ifaaVersion = ifaaVersion;
	}

}
