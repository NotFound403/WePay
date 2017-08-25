package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 物料二维码
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingLotbarcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2468367754265962535L;

	/**
	 * 停车场编号
	 */
	@ApiField("parking_id")
	private String parkingId;

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
