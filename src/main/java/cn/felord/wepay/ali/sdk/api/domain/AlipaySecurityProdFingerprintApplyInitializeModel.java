package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 指纹注册初始化
 *
 * @author auto create
 * @since 1.0, 2017-01-12 17:27:31
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

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getIfaaVersion() {
		return this.ifaaVersion;
	}
	public void setIfaaVersion(String ifaaVersion) {
		this.ifaaVersion = ifaaVersion;
	}

}
