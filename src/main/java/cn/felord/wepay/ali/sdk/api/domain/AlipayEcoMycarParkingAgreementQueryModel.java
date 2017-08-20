package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 车牌代扣状态查询API
 *
 * @author auto create
 * @since 1.0, 2016-12-22 21:53:37
 */
public class AlipayEcoMycarParkingAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6835915352125196413L;

	/**
	 * 车牌，用户车辆进场时ISV设备识别到的车辆牌照
	 */
	@ApiField("car_number")
	private String carNumber;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

}
