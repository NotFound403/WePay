package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 电子发票抬头添加
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppInvoiceTitleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4152542299616638376L;

	/**
	 * 开户银行账号
	 */
	@ApiField("open_bank_account")
	private String openBankAccount;

	/**
	 * 开户银行
	 */
	@ApiField("open_bank_name")
	private String openBankName;

	/**
	 * 税号
	 */
	@ApiField("tax_register_no")
	private String taxRegisterNo;

	/**
	 * 抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	/**
	 * 地址
	 */
	@ApiField("user_address")
	private String userAddress;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 电话
	 */
	@ApiField("user_mobile")
	private String userMobile;

	/**
	 * <p>Getter for the field <code>openBankAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpenBankAccount() {
		return this.openBankAccount;
	}
	/**
	 * <p>Setter for the field <code>openBankAccount</code>.</p>
	 *
	 * @param openBankAccount a {@link java.lang.String} object.
	 */
	public void setOpenBankAccount(String openBankAccount) {
		this.openBankAccount = openBankAccount;
	}

	/**
	 * <p>Getter for the field <code>openBankName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpenBankName() {
		return this.openBankName;
	}
	/**
	 * <p>Setter for the field <code>openBankName</code>.</p>
	 *
	 * @param openBankName a {@link java.lang.String} object.
	 */
	public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
	}

	/**
	 * <p>Getter for the field <code>taxRegisterNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTaxRegisterNo() {
		return this.taxRegisterNo;
	}
	/**
	 * <p>Setter for the field <code>taxRegisterNo</code>.</p>
	 *
	 * @param taxRegisterNo a {@link java.lang.String} object.
	 */
	public void setTaxRegisterNo(String taxRegisterNo) {
		this.taxRegisterNo = taxRegisterNo;
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

	/**
	 * <p>Getter for the field <code>userAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserAddress() {
		return this.userAddress;
	}
	/**
	 * <p>Setter for the field <code>userAddress</code>.</p>
	 *
	 * @param userAddress a {@link java.lang.String} object.
	 */
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
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

	/**
	 * <p>Getter for the field <code>userMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserMobile() {
		return this.userMobile;
	}
	/**
	 * <p>Setter for the field <code>userMobile</code>.</p>
	 *
	 * @param userMobile a {@link java.lang.String} object.
	 */
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

}
