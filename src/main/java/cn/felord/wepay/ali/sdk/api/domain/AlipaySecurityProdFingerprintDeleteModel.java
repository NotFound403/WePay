package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 指纹解注册
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdFingerprintDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7496984136668544861L;

	/**
	 * IFAA协议的版本，目前为2.0
	 */
	@ApiField("ifaa_version")
	private String ifaaVersion;

	/**
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token为注册时保存的token，传入此token，用于生成服务端去注册信息。
	 */
	@ApiField("token")
	private String token;

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

	/**
	 * <p>Getter for the field <code>token</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getToken() {
		return this.token;
	}
	/**
	 * <p>Setter for the field <code>token</code>.</p>
	 *
	 * @param token a {@link java.lang.String} object.
	 */
	public void setToken(String token) {
		this.token = token;
	}

}
