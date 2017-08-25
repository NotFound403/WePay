package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * ISV获取违章车辆信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarDataserviceViolationinfoShareModel extends AlipayObject {

	private static final long serialVersionUID = 1414238146522129499L;

	/**
	 * 支付宝app_id
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 车辆id
	 */
	@ApiField("vehicle_id")
	private String vehicleId;

	/**
	 * <p>Getter for the field <code>appId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppId() {
		return this.appId;
	}
	/**
	 * <p>Setter for the field <code>appId</code>.</p>
	 *
	 * @param appId a {@link java.lang.String} object.
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * <p>Getter for the field <code>vehicleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVehicleId() {
		return this.vehicleId;
	}
	/**
	 * <p>Setter for the field <code>vehicleId</code>.</p>
	 *
	 * @param vehicleId a {@link java.lang.String} object.
	 */
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

}
