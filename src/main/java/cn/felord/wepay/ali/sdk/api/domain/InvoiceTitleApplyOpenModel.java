package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 申请相关的发票抬头模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvoiceTitleApplyOpenModel extends AlipayObject {

	private static final long serialVersionUID = 2463136726799696421L;

	/**
	 * 购买方地址
	 */
	@ApiField("payer_address")
	private String payerAddress;

	/**
	 * 开户行账户
	 */
	@ApiField("payer_bank_account")
	private String payerBankAccount;

	/**
	 * 购买方开户银行
	 */
	@ApiField("payer_bank_name")
	private String payerBankName;

	/**
	 * 购买方纳税人识别号
	 */
	@ApiField("payer_register_no")
	private String payerRegisterNo;

	/**
	 * 购买方电话
	 */
	@ApiField("payer_tel")
	private String payerTel;

	/**
	 * 发票抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	/**
	 * <p>Getter for the field <code>payerAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayerAddress() {
		return this.payerAddress;
	}
	/**
	 * <p>Setter for the field <code>payerAddress</code>.</p>
	 *
	 * @param payerAddress a {@link java.lang.String} object.
	 */
	public void setPayerAddress(String payerAddress) {
		this.payerAddress = payerAddress;
	}

	/**
	 * <p>Getter for the field <code>payerBankAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayerBankAccount() {
		return this.payerBankAccount;
	}
	/**
	 * <p>Setter for the field <code>payerBankAccount</code>.</p>
	 *
	 * @param payerBankAccount a {@link java.lang.String} object.
	 */
	public void setPayerBankAccount(String payerBankAccount) {
		this.payerBankAccount = payerBankAccount;
	}

	/**
	 * <p>Getter for the field <code>payerBankName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayerBankName() {
		return this.payerBankName;
	}
	/**
	 * <p>Setter for the field <code>payerBankName</code>.</p>
	 *
	 * @param payerBankName a {@link java.lang.String} object.
	 */
	public void setPayerBankName(String payerBankName) {
		this.payerBankName = payerBankName;
	}

	/**
	 * <p>Getter for the field <code>payerRegisterNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayerRegisterNo() {
		return this.payerRegisterNo;
	}
	/**
	 * <p>Setter for the field <code>payerRegisterNo</code>.</p>
	 *
	 * @param payerRegisterNo a {@link java.lang.String} object.
	 */
	public void setPayerRegisterNo(String payerRegisterNo) {
		this.payerRegisterNo = payerRegisterNo;
	}

	/**
	 * <p>Getter for the field <code>payerTel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayerTel() {
		return this.payerTel;
	}
	/**
	 * <p>Setter for the field <code>payerTel</code>.</p>
	 *
	 * @param payerTel a {@link java.lang.String} object.
	 */
	public void setPayerTel(String payerTel) {
		this.payerTel = payerTel;
	}

	/**
	 * <p>Getter for the field <code>titleName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitleName() {
		return this.titleName;
	}
	/**
	 * <p>Setter for the field <code>titleName</code>.</p>
	 *
	 * @param titleName a {@link java.lang.String} object.
	 */
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

}
