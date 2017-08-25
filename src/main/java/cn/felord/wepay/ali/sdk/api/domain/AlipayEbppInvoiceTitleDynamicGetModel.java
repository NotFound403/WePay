package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 根据条形码获取抬头
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppInvoiceTitleDynamicGetModel extends AlipayObject {

	private static final long serialVersionUID = 7364717316714363748L;

	/**
	 * 抬头动态码
	 */
	@ApiField("bar_code")
	private String barCode;

	/**
	 * <p>Getter for the field <code>barCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBarCode() {
		return this.barCode;
	}
	/**
	 * <p>Setter for the field <code>barCode</code>.</p>
	 *
	 * @param barCode a {@link java.lang.String} object.
	 */
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

}
