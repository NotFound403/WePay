package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.dataservice.violationinfo.share response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarDataserviceViolationinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 5762226786576657311L;

	/** 
	 * 车架号
	 */
	@ApiField("body_num")
	private String bodyNum;

	/** 
	 * 发动机号
	 */
	@ApiField("engine_num")
	private String engineNum;

	/** 
	 * 车辆id
	 */
	@ApiField("vehicle_id")
	private String vehicleId;

	/** 
	 * 车牌
	 */
	@ApiField("vi_number")
	private String viNumber;

	/**
	 * <p>Setter for the field <code>bodyNum</code>.</p>
	 *
	 * @param bodyNum a {@link java.lang.String} object.
	 */
	public void setBodyNum(String bodyNum) {
		this.bodyNum = bodyNum;
	}
	/**
	 * <p>Getter for the field <code>bodyNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBodyNum( ) {
		return this.bodyNum;
	}

	/**
	 * <p>Setter for the field <code>engineNum</code>.</p>
	 *
	 * @param engineNum a {@link java.lang.String} object.
	 */
	public void setEngineNum(String engineNum) {
		this.engineNum = engineNum;
	}
	/**
	 * <p>Getter for the field <code>engineNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEngineNum( ) {
		return this.engineNum;
	}

	/**
	 * <p>Setter for the field <code>vehicleId</code>.</p>
	 *
	 * @param vehicleId a {@link java.lang.String} object.
	 */
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	/**
	 * <p>Getter for the field <code>vehicleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVehicleId( ) {
		return this.vehicleId;
	}

	/**
	 * <p>Setter for the field <code>viNumber</code>.</p>
	 *
	 * @param viNumber a {@link java.lang.String} object.
	 */
	public void setViNumber(String viNumber) {
		this.viNumber = viNumber;
	}
	/**
	 * <p>Getter for the field <code>viNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViNumber( ) {
		return this.viNumber;
	}

}
