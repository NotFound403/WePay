package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 车牌查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingVehicleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4687981295774163635L;

	/**
	 * 支付宝用户车辆ID，系统唯一。（该参数会在停车平台用户点击查询缴费，跳转到ISV停车缴费查询页面时，从请求中传递）
	 */
	@ApiField("car_id")
	private String carId;

	/**
	 * <p>Getter for the field <code>carId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCarId() {
		return this.carId;
	}
	/**
	 * <p>Setter for the field <code>carId</code>.</p>
	 *
	 * @param carId a {@link java.lang.String} object.
	 */
	public void setCarId(String carId) {
		this.carId = carId;
	}

}
