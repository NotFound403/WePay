package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 个体工商户的银行账户信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PersonnalBankAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 7122198147522872475L;

	/**
	 * 填入的银行账号对应的银行预留手机号
	 */
	@ApiField("personal_bank_account_mobile")
	private String personalBankAccountMobile;

	/**
	 * 个人或个体工商户的银行账号，在商户确认环节用来作为认证的一种材料。
	 */
	@ApiField("personal_bank_card_no")
	private String personalBankCardNo;

	/**
	 * 填入的银行账号对应的持卡人的身份证号码
	 */
	@ApiField("personal_bank_holder_certno")
	private String personalBankHolderCertno;

	/**
	 * 填入的银行账号对应的持卡人名称
	 */
	@ApiField("personal_bank_holder_name")
	private String personalBankHolderName;

	/**
	 * <p>Getter for the field <code>personalBankAccountMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPersonalBankAccountMobile() {
		return this.personalBankAccountMobile;
	}
	/**
	 * <p>Setter for the field <code>personalBankAccountMobile</code>.</p>
	 *
	 * @param personalBankAccountMobile a {@link java.lang.String} object.
	 */
	public void setPersonalBankAccountMobile(String personalBankAccountMobile) {
		this.personalBankAccountMobile = personalBankAccountMobile;
	}

	/**
	 * <p>Getter for the field <code>personalBankCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPersonalBankCardNo() {
		return this.personalBankCardNo;
	}
	/**
	 * <p>Setter for the field <code>personalBankCardNo</code>.</p>
	 *
	 * @param personalBankCardNo a {@link java.lang.String} object.
	 */
	public void setPersonalBankCardNo(String personalBankCardNo) {
		this.personalBankCardNo = personalBankCardNo;
	}

	/**
	 * <p>Getter for the field <code>personalBankHolderCertno</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPersonalBankHolderCertno() {
		return this.personalBankHolderCertno;
	}
	/**
	 * <p>Setter for the field <code>personalBankHolderCertno</code>.</p>
	 *
	 * @param personalBankHolderCertno a {@link java.lang.String} object.
	 */
	public void setPersonalBankHolderCertno(String personalBankHolderCertno) {
		this.personalBankHolderCertno = personalBankHolderCertno;
	}

	/**
	 * <p>Getter for the field <code>personalBankHolderName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPersonalBankHolderName() {
		return this.personalBankHolderName;
	}
	/**
	 * <p>Setter for the field <code>personalBankHolderName</code>.</p>
	 *
	 * @param personalBankHolderName a {@link java.lang.String} object.
	 */
	public void setPersonalBankHolderName(String personalBankHolderName) {
		this.personalBankHolderName = personalBankHolderName;
	}

}
