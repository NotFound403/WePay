package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 账号信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MyBkAccountVO extends AlipayObject {

	private static final long serialVersionUID = 6363948159454323649L;

	/**
	 * 账号外标，如支付宝登录号
	 */
	@ApiField("account_ext_no")
	private String accountExtNo;

	/**
	 * 金融机构支行联行号
	 */
	@ApiField("account_fip_branch_code")
	private String accountFipBranchCode;

	/**
	 * 金融机构码
	 */
	@ApiField("account_fip_code")
	private String accountFipCode;

	/**
	 * 金融机构名称
	 */
	@ApiField("account_fip_name")
	private String accountFipName;

	/**
	 * 资金账号,支付宝2088开头或银行卡号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账号分类，ALIPAY("ALIPAY", "Alipay", "支付宝账号", "支付宝账号"),MY_BANK("MY_BANK", "MayiBank", "网商银行账号", "网商银行账号"),OUT_BANK("OUT_BANK", "OutBank", "外部银行账号", "外部银行账号")
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 是否可用，Y-可用；N-不可用
	 */
	@ApiField("available")
	private String available;

	/**
	 * 账户对公对私类型,P-对私，B-对公
	 */
	@ApiField("bank_card_category")
	private String bankCardCategory;

	/**
	 * 持卡人姓名
	 */
	@ApiField("card_holder_name")
	private String cardHolderName;

	/**
	 * 放款来源
	 */
	@ApiField("grant_channel")
	private String grantChannel;

	/**
	 * 账户不可用原因
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/**
	 * <p>Getter for the field <code>accountExtNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountExtNo() {
		return this.accountExtNo;
	}
	/**
	 * <p>Setter for the field <code>accountExtNo</code>.</p>
	 *
	 * @param accountExtNo a {@link java.lang.String} object.
	 */
	public void setAccountExtNo(String accountExtNo) {
		this.accountExtNo = accountExtNo;
	}

	/**
	 * <p>Getter for the field <code>accountFipBranchCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountFipBranchCode() {
		return this.accountFipBranchCode;
	}
	/**
	 * <p>Setter for the field <code>accountFipBranchCode</code>.</p>
	 *
	 * @param accountFipBranchCode a {@link java.lang.String} object.
	 */
	public void setAccountFipBranchCode(String accountFipBranchCode) {
		this.accountFipBranchCode = accountFipBranchCode;
	}

	/**
	 * <p>Getter for the field <code>accountFipCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountFipCode() {
		return this.accountFipCode;
	}
	/**
	 * <p>Setter for the field <code>accountFipCode</code>.</p>
	 *
	 * @param accountFipCode a {@link java.lang.String} object.
	 */
	public void setAccountFipCode(String accountFipCode) {
		this.accountFipCode = accountFipCode;
	}

	/**
	 * <p>Getter for the field <code>accountFipName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountFipName() {
		return this.accountFipName;
	}
	/**
	 * <p>Setter for the field <code>accountFipName</code>.</p>
	 *
	 * @param accountFipName a {@link java.lang.String} object.
	 */
	public void setAccountFipName(String accountFipName) {
		this.accountFipName = accountFipName;
	}

	/**
	 * <p>Getter for the field <code>accountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountNo() {
		return this.accountNo;
	}
	/**
	 * <p>Setter for the field <code>accountNo</code>.</p>
	 *
	 * @param accountNo a {@link java.lang.String} object.
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * <p>Getter for the field <code>accountType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountType() {
		return this.accountType;
	}
	/**
	 * <p>Setter for the field <code>accountType</code>.</p>
	 *
	 * @param accountType a {@link java.lang.String} object.
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * <p>Getter for the field <code>available</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAvailable() {
		return this.available;
	}
	/**
	 * <p>Setter for the field <code>available</code>.</p>
	 *
	 * @param available a {@link java.lang.String} object.
	 */
	public void setAvailable(String available) {
		this.available = available;
	}

	/**
	 * <p>Getter for the field <code>bankCardCategory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBankCardCategory() {
		return this.bankCardCategory;
	}
	/**
	 * <p>Setter for the field <code>bankCardCategory</code>.</p>
	 *
	 * @param bankCardCategory a {@link java.lang.String} object.
	 */
	public void setBankCardCategory(String bankCardCategory) {
		this.bankCardCategory = bankCardCategory;
	}

	/**
	 * <p>Getter for the field <code>cardHolderName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardHolderName() {
		return this.cardHolderName;
	}
	/**
	 * <p>Setter for the field <code>cardHolderName</code>.</p>
	 *
	 * @param cardHolderName a {@link java.lang.String} object.
	 */
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	/**
	 * <p>Getter for the field <code>grantChannel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGrantChannel() {
		return this.grantChannel;
	}
	/**
	 * <p>Setter for the field <code>grantChannel</code>.</p>
	 *
	 * @param grantChannel a {@link java.lang.String} object.
	 */
	public void setGrantChannel(String grantChannel) {
		this.grantChannel = grantChannel;
	}

	/**
	 * <p>Getter for the field <code>refuseCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefuseCode() {
		return this.refuseCode;
	}
	/**
	 * <p>Setter for the field <code>refuseCode</code>.</p>
	 *
	 * @param refuseCode a {@link java.lang.String} object.
	 */
	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

}
