package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 停车卡生成二维码
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingCardbarcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4376735192187939664L;

	/**
	 * 设备商订单id
	 */
	@ApiField("equipment_id")
	private String equipmentId;

	/**
	 * 支付宝交易流水号订单
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * <p>Getter for the field <code>equipmentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEquipmentId() {
		return this.equipmentId;
	}
	/**
	 * <p>Setter for the field <code>equipmentId</code>.</p>
	 *
	 * @param equipmentId a {@link java.lang.String} object.
	 */
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
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
