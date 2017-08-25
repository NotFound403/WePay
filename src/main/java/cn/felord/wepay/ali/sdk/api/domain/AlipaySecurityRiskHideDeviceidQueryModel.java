package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 设备指纹查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityRiskHideDeviceidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3846526295967559726L;

	/**
	 * 商户的sdk客户端key
	 */
	@ApiField("app_key_client")
	private String appKeyClient;

	/**
	 * 商户使用的设备指纹服务端key
	 */
	@ApiField("app_key_server")
	private String appKeyServer;

	/**
	 * 商户应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 设备指纹deviceid对应的token
	 */
	@ApiField("deviceid_token")
	private String deviceidToken;

	/**
	 * <p>Getter for the field <code>appKeyClient</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppKeyClient() {
		return this.appKeyClient;
	}
	/**
	 * <p>Setter for the field <code>appKeyClient</code>.</p>
	 *
	 * @param appKeyClient a {@link java.lang.String} object.
	 */
	public void setAppKeyClient(String appKeyClient) {
		this.appKeyClient = appKeyClient;
	}

	/**
	 * <p>Getter for the field <code>appKeyServer</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppKeyServer() {
		return this.appKeyServer;
	}
	/**
	 * <p>Setter for the field <code>appKeyServer</code>.</p>
	 *
	 * @param appKeyServer a {@link java.lang.String} object.
	 */
	public void setAppKeyServer(String appKeyServer) {
		this.appKeyServer = appKeyServer;
	}

	/**
	 * <p>Getter for the field <code>appName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppName() {
		return this.appName;
	}
	/**
	 * <p>Setter for the field <code>appName</code>.</p>
	 *
	 * @param appName a {@link java.lang.String} object.
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * <p>Getter for the field <code>deviceidToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeviceidToken() {
		return this.deviceidToken;
	}
	/**
	 * <p>Setter for the field <code>deviceidToken</code>.</p>
	 *
	 * @param deviceidToken a {@link java.lang.String} object.
	 */
	public void setDeviceidToken(String deviceidToken) {
		this.deviceidToken = deviceidToken;
	}

}
