package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.parkinglotinfo.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingParkinglotinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1555712749528597846L;

	/** 
	 * 支付宝返回停车场id。成功不为空，失败返回空
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * <p>Setter for the field <code>parkingId</code>.</p>
	 *
	 * @param parkingId a {@link java.lang.String} object.
	 */
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}
	/**
	 * <p>Getter for the field <code>parkingId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParkingId( ) {
		return this.parkingId;
	}

}
