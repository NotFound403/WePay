package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.fingerprint.apply response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdFingerprintApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1729316574618363892L;

	/** 
	 * IFAA标准中的校验类型，目前1为指纹
	 */
	@ApiField("auth_type")
	private String authType;

	/** 
	 * 设备的唯一ID，IFAA标准体系中的设备的唯一标识，用于关联设备的开通状态
	 */
	@ApiField("device_id")
	private String deviceId;

	/** 
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token用于后续校验和注销操作。
	 */
	@ApiField("token")
	private String token;

	/**
	 * <p>Setter for the field <code>authType</code>.</p>
	 *
	 * @param authType a {@link java.lang.String} object.
	 */
	public void setAuthType(String authType) {
		this.authType = authType;
	}
	/**
	 * <p>Getter for the field <code>authType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthType( ) {
		return this.authType;
	}

	/**
	 * <p>Setter for the field <code>deviceId</code>.</p>
	 *
	 * @param deviceId a {@link java.lang.String} object.
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	/**
	 * <p>Getter for the field <code>deviceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeviceId( ) {
		return this.deviceId;
	}

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
