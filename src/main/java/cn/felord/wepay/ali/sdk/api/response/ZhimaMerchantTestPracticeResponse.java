package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.XXXXsdasdasd;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.test.practice response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaMerchantTestPracticeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2469791916245319775L;

	/** 
	 * xxxx
	 */
	@ApiField("dddd")
	private XXXXsdasdasd dddd;

	/** 
	 * ccc
	 */
	@ApiField("sss")
	private String sss;

	/**
	 * <p>Setter for the field <code>dddd</code>.</p>
	 *
	 * @param dddd a {@link cn.felord.wepay.ali.sdk.api.domain.XXXXsdasdasd} object.
	 */
	public void setDddd(XXXXsdasdasd dddd) {
		this.dddd = dddd;
	}
	/**
	 * <p>Getter for the field <code>dddd</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.XXXXsdasdasd} object.
	 */
	public XXXXsdasdasd getDddd( ) {
		return this.dddd;
	}

	/**
	 * <p>Setter for the field <code>sss</code>.</p>
	 *
	 * @param sss a {@link java.lang.String} object.
	 */
	public void setSss(String sss) {
		this.sss = sss;
	}
	/**
	 * <p>Getter for the field <code>sss</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSss( ) {
		return this.sss;
	}

}
