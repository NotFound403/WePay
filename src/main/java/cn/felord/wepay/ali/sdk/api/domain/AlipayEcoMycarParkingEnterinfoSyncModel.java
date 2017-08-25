package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 车辆驶入上送接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingEnterinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4823881376357796531L;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 车辆入场的时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("in_time")
	private String inTime;

	/**
	 * 支付宝停车场ID ，系统唯一
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * <p>Getter for the field <code>carNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCarNumber() {
		return this.carNumber;
	}
	/**
	 * <p>Setter for the field <code>carNumber</code>.</p>
	 *
	 * @param carNumber a {@link java.lang.String} object.
	 */
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	/**
	 * <p>Getter for the field <code>inTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInTime() {
		return this.inTime;
	}
	/**
	 * <p>Setter for the field <code>inTime</code>.</p>
	 *
	 * @param inTime a {@link java.lang.String} object.
	 */
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	/**
	 * <p>Getter for the field <code>parkingId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParkingId() {
		return this.parkingId;
	}
	/**
	 * <p>Setter for the field <code>parkingId</code>.</p>
	 *
	 * @param parkingId a {@link java.lang.String} object.
	 */
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

}
