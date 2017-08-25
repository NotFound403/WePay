package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 无授权模式的查询对账单下载地址
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataDataserviceBillDownloadurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7597625962168862245L;

	/**
	 * 账单时间：日账单格式为yyyy-MM-dd，月账单格式为yyyy-MM。
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型：trade、signcustomer；trade指商户基于支付宝交易收单的业务账单；signcustomer是指基于商户支付宝余额收入及支出等资金变动的帐务账单；
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * <p>Getter for the field <code>billDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillDate() {
		return this.billDate;
	}
	/**
	 * <p>Setter for the field <code>billDate</code>.</p>
	 *
	 * @param billDate a {@link java.lang.String} object.
	 */
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	/**
	 * <p>Getter for the field <code>billType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillType() {
		return this.billType;
	}
	/**
	 * <p>Setter for the field <code>billType</code>.</p>
	 *
	 * @param billType a {@link java.lang.String} object.
	 */
	public void setBillType(String billType) {
		this.billType = billType;
	}

}
