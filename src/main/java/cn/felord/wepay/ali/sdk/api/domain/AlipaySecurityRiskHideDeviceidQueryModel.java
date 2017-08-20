package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 设备指纹查询接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:13
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

	public String getAppKeyClient() {
		return this.appKeyClient;
	}
	public void setAppKeyClient(String appKeyClient) {
		this.appKeyClient = appKeyClient;
	}

	public String getAppKeyServer() {
		return this.appKeyServer;
	}
	public void setAppKeyServer(String appKeyServer) {
		this.appKeyServer = appKeyServer;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDeviceidToken() {
		return this.deviceidToken;
	}
	public void setDeviceidToken(String deviceidToken) {
		this.deviceidToken = deviceidToken;
	}

}
