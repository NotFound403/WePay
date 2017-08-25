package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.hide.deviceid.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityRiskHideDeviceidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4239232835423925736L;

	/** 
	 * 设备指纹的apdid
	 */
	@ApiField("deviceid")
	private String deviceid;

	/**
	 * <p>Setter for the field <code>deviceid</code>.</p>
	 *
	 * @param deviceid a {@link java.lang.String} object.
	 */
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	/**
	 * <p>Getter for the field <code>deviceid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeviceid( ) {
		return this.deviceid;
	}

}
