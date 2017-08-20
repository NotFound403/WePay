package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.QRcode;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.cardbarcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-14 15:08:57
 */
public class AlipayEcoMycarParkingCardbarcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3219962743575414797L;

	/** 
	 * 停车车卡对应二维码列表
	 */
	@ApiListField("qrcodes")
	@ApiField("q_rcode")
	private List<QRcode> qrcodes;

	public void setQrcodes(List<QRcode> qrcodes) {
		this.qrcodes = qrcodes;
	}
	public List<QRcode> getQrcodes( ) {
		return this.qrcodes;
	}

}
