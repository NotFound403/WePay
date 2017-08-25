package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 开票信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvoiceInfo extends AlipayObject {

	private static final long serialVersionUID = 4275827255839961362L;

	/**
	 * 开票内容
注：json数组格式
	 */
	@ApiField("details")
	private String details;

	/**
	 * 开票关键信息
	 */
	@ApiField("key_info")
	private InvoiceKeyInfo keyInfo;

	/**
	 * <p>Getter for the field <code>details</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDetails() {
		return this.details;
	}
	/**
	 * <p>Setter for the field <code>details</code>.</p>
	 *
	 * @param details a {@link java.lang.String} object.
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 * <p>Getter for the field <code>keyInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InvoiceKeyInfo} object.
	 */
	public InvoiceKeyInfo getKeyInfo() {
		return this.keyInfo;
	}
	/**
	 * <p>Setter for the field <code>keyInfo</code>.</p>
	 *
	 * @param keyInfo a {@link cn.felord.wepay.ali.sdk.api.domain.InvoiceKeyInfo} object.
	 */
	public void setKeyInfo(InvoiceKeyInfo keyInfo) {
		this.keyInfo = keyInfo;
	}

}
