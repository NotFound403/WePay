package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 设备指纹H5版本
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SsdataDataserviceRiskDeviceidentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1627578194722165282L;

	/**
	 * 设备token值， 服务端JS生成的设备token值（由我方提供的JS生成），界面引入我方提供的js即可获取afs_token值，token的失效期为12个小时，基本上是190位的一串字符。
	 */
	@ApiField("device_token")
	private String deviceToken;

	/**
	 * <p>Getter for the field <code>deviceToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeviceToken() {
		return this.deviceToken;
	}
	/**
	 * <p>Setter for the field <code>deviceToken</code>.</p>
	 *
	 * @param deviceToken a {@link java.lang.String} object.
	 */
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

}
