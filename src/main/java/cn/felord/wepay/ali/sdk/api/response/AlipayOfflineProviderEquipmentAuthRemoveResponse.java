package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.equipment.auth.remove response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-29 17:01:40
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

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceId( ) {
		return this.deviceId;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

}
