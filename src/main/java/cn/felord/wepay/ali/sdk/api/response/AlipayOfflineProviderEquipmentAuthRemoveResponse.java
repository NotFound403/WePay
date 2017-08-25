package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.equipment.auth.remove response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineProviderEquipmentAuthRemoveResponse extends AlipayResponse {

	private static final long serialVersionUID = 3779618698583246639L;

	/** 
	 * 被解绑的机具编号
	 */
	@ApiField("device_id")
	private String deviceId;

	/** 
	 * 机具厂商PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

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
	 * <p>Setter for the field <code>merchantPid</code>.</p>
	 *
	 * @param merchantPid a {@link java.lang.String} object.
	 */
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	/**
	 * <p>Getter for the field <code>merchantPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

}
