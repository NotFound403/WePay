package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 电子发票开票关键信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvoiceKeyInfo extends AlipayObject {

	private static final long serialVersionUID = 6346159776793822965L;

	/**
	 * 开票商户名称：商户品牌简称|商户门店简称
	 */
	@ApiField("invoice_merchant_name")
	private String invoiceMerchantName;

	/**
	 * 该交易是否支持开票
	 */
	@ApiField("is_support_invoice")
	private Boolean isSupportInvoice;

	/**
	 * 税号
	 */
	@ApiField("tax_num")
	private String taxNum;

	/**
	 * <p>Getter for the field <code>invoiceMerchantName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceMerchantName() {
		return this.invoiceMerchantName;
	}
	/**
	 * <p>Setter for the field <code>invoiceMerchantName</code>.</p>
	 *
	 * @param invoiceMerchantName a {@link java.lang.String} object.
	 */
	public void setInvoiceMerchantName(String invoiceMerchantName) {
		this.invoiceMerchantName = invoiceMerchantName;
	}

	/**
	 * <p>Getter for the field <code>isSupportInvoice</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIsSupportInvoice() {
		return this.isSupportInvoice;
	}
	/**
	 * <p>Setter for the field <code>isSupportInvoice</code>.</p>
	 *
	 * @param isSupportInvoice a {@link java.lang.Boolean} object.
	 */
	public void setIsSupportInvoice(Boolean isSupportInvoice) {
		this.isSupportInvoice = isSupportInvoice;
	}

	/**
	 * <p>Getter for the field <code>taxNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTaxNum() {
		return this.taxNum;
	}
	/**
	 * <p>Setter for the field <code>taxNum</code>.</p>
	 *
	 * @param taxNum a {@link java.lang.String} object.
	 */
	public void setTaxNum(String taxNum) {
		this.taxNum = taxNum;
	}

}
