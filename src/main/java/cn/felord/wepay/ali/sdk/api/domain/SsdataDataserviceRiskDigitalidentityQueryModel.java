package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 蚁盾设备指纹
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SsdataDataserviceRiskDigitalidentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7785665816627191197L;

	/**
	 * 服务端生成的设备码（由我方提供的sdk生成）
	 */
	@ApiField("device_code")
	private String deviceCode;

	/**
	 * <p>Getter for the field <code>deviceCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeviceCode() {
		return this.deviceCode;
	}
	/**
	 * <p>Setter for the field <code>deviceCode</code>.</p>
	 *
	 * @param deviceCode a {@link java.lang.String} object.
	 */
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

}
