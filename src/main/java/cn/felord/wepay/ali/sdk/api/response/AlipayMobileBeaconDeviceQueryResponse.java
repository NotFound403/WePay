package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.BeaconDeviceInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.beacon.device.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobileBeaconDeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7665582217841246265L;

	/** 
	 * 蓝牙设备信息
	 */
	@ApiField("beacon_device_info")
	private BeaconDeviceInfo beaconDeviceInfo;

	/** 
	 * 操作返回码，200为成功
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 请求处理结果
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * <p>Setter for the field <code>beaconDeviceInfo</code>.</p>
	 *
	 * @param beaconDeviceInfo a {@link cn.felord.wepay.ali.sdk.api.domain.BeaconDeviceInfo} object.
	 */
	public void setBeaconDeviceInfo(BeaconDeviceInfo beaconDeviceInfo) {
		this.beaconDeviceInfo = beaconDeviceInfo;
	}
	/**
	 * <p>Getter for the field <code>beaconDeviceInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.BeaconDeviceInfo} object.
	 */
	public BeaconDeviceInfo getBeaconDeviceInfo( ) {
		return this.beaconDeviceInfo;
	}

	/** {@inheritDoc} */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode( ) {
		return this.code;
	}

	/** {@inheritDoc} */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * <p>Getter for the field <code>msg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsg( ) {
		return this.msg;
	}

}
