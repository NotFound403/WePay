package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 企业对公账户信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BusinessBankAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 4191997698591161946L;

	/**
	 * 企业对公账户名称
	 */
	@ApiField("business_bank_account_name")
	private String businessBankAccountName;

	/**
	 * 企业对公银行账户号
	 */
	@ApiField("business_bank_card_no")
	private String businessBankCardNo;

	/**
	 * 企业对公账户开户行名称
	 */
	@ApiField("business_bank_name")
	private String businessBankName;

	/**
	 * 企业对公账户开户行支行全称
	 */
	@ApiField("business_bank_sub")
	private String businessBankSub;

	/**
	 * <p>Getter for the field <code>businessBankAccountName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessBankAccountName() {
		return this.businessBankAccountName;
	}
	/**
	 * <p>Setter for the field <code>businessBankAccountName</code>.</p>
	 *
	 * @param businessBankAccountName a {@link java.lang.String} object.
	 */
	public void setBusinessBankAccountName(String businessBankAccountName) {
		this.businessBankAccountName = businessBankAccountName;
	}

	/**
	 * <p>Getter for the field <code>businessBankCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessBankCardNo() {
		return this.businessBankCardNo;
	}
	/**
	 * <p>Setter for the field <code>businessBankCardNo</code>.</p>
	 *
	 * @param businessBankCardNo a {@link java.lang.String} object.
	 */
	public void setBusinessBankCardNo(String businessBankCardNo) {
		this.businessBankCardNo = businessBankCardNo;
	}

	/**
	 * <p>Getter for the field <code>businessBankName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessBankName() {
		return this.businessBankName;
	}
	/**
	 * <p>Setter for the field <code>businessBankName</code>.</p>
	 *
	 * @param businessBankName a {@link java.lang.String} object.
	 */
	public void setBusinessBankName(String businessBankName) {
		this.businessBankName = businessBankName;
	}

	/**
	 * <p>Getter for the field <code>businessBankSub</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessBankSub() {
		return this.businessBankSub;
	}
	/**
	 * <p>Setter for the field <code>businessBankSub</code>.</p>
	 *
	 * @param businessBankSub a {@link java.lang.String} object.
	 */
	public void setBusinessBankSub(String businessBankSub) {
		this.businessBankSub = businessBankSub;
	}

}
