package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 电子发票查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppInvoiceInfoGetModel extends AlipayObject {

	private static final long serialVersionUID = 4358734253816483468L;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 用户id，当用户发起发票查询时，可以先通过用户授权获取当前访问用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>invoiceCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	/**
	 * <p>Setter for the field <code>invoiceCode</code>.</p>
	 *
	 * @param invoiceCode a {@link java.lang.String} object.
	 */
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	/**
	 * <p>Getter for the field <code>invoiceNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	/**
	 * <p>Setter for the field <code>invoiceNo</code>.</p>
	 *
	 * @param invoiceNo a {@link java.lang.String} object.
	 */
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
