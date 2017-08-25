package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 依据发票id查询发票文件信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppInvoiceFileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4598377884816353397L;

	/**
	 * 支付宝端生成的发票id，该字段可从发票详情查询接口获得
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * <p>Getter for the field <code>invoiceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceId() {
		return this.invoiceId;
	}
	/**
	 * <p>Setter for the field <code>invoiceId</code>.</p>
	 *
	 * @param invoiceId a {@link java.lang.String} object.
	 */
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

}
