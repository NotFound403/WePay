package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.vehicle.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingVehicleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8368956938559985173L;

	/** 
	 * 车牌信息（utf-8编码）
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * <p>Setter for the field <code>carNumber</code>.</p>
	 *
	 * @param carNumber a {@link java.lang.String} object.
	 */
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	/**
	 * <p>Getter for the field <code>carNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCarNumber( ) {
		return this.carNumber;
	}

}
