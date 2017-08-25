package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.car.save response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsAutoCarSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8358473897656597697L;

	/** 
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * <p>Setter for the field <code>carNo</code>.</p>
	 *
	 * @param carNo a {@link java.lang.String} object.
	 */
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	/**
	 * <p>Getter for the field <code>carNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCarNo( ) {
		return this.carNo;
	}

}
