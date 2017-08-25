package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.QRcode;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.cardbarcode.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingCardbarcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3219962743575414797L;

	/** 
	 * 停车车卡对应二维码列表
	 */
	@ApiListField("qrcodes")
	@ApiField("q_rcode")
	private List<QRcode> qrcodes;

	/**
	 * <p>Setter for the field <code>qrcodes</code>.</p>
	 *
	 * @param qrcodes a {@link java.util.List} object.
	 */
	public void setQrcodes(List<QRcode> qrcodes) {
		this.qrcodes = qrcodes;
	}
	/**
	 * <p>Getter for the field <code>qrcodes</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<QRcode> getQrcodes( ) {
		return this.qrcodes;
	}

}
