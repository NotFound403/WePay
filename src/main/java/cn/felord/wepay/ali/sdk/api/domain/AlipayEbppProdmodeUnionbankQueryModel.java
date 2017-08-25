package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 联行信息查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppProdmodeUnionbankQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7627939665768355534L;

	/**
	 * 银联编号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * <p>Getter for the field <code>bankCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBankCode() {
		return this.bankCode;
	}
	/**
	 * <p>Setter for the field <code>bankCode</code>.</p>
	 *
	 * @param bankCode a {@link java.lang.String} object.
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

}
