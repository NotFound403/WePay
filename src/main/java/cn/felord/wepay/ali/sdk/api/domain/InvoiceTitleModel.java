package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 发票抬头
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvoiceTitleModel extends AlipayObject {

	private static final long serialVersionUID = 3546933298838469692L;

	/**
	 * 是否默认
可选值：
false：非默认
true：默认抬头
	 */
	@ApiField("is_default")
	private Boolean isDefault;

	/**
	 * 支付宝用户登录名（脱敏后登录名）
该字段输出接口只限
alipay.ebpp.invoice.title.dynamic.get
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 开户行账号
	 */
	@ApiField("open_bank_account")
	private String openBankAccount;

	/**
	 * 开户行
	 */
	@ApiField("open_bank_name")
	private String openBankName;

	/**
	 * 纳税人识别号
	 */
	@ApiField("tax_register_no")
	private String taxRegisterNo;

	/**
	 * 发票抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	/**
	 * 发票类型
可选值：
PERSONAL（个人抬头）
CORPORATION（公司抬头）
	 */
	@ApiField("title_type")
	private String titleType;

	/**
	 * 地址
	 */
	@ApiField("user_address")
	private String userAddress;

	/**
	 * 用户邮箱
	 */
	@ApiField("user_email")
	private String userEmail;

	/**
	 * 支付宝用户id
说明：动态码获取抬头时接口（alipay.ebpp.invoice.title.dynamic.get ）用户id返回结果为加密后密文
其他情况用户id来源于用户授权
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 联系电话，支持手机和固话两种格式
	 */
	@ApiField("user_mobile")
	private String userMobile;

	/**
	 * <p>Getter for the field <code>isDefault</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIsDefault() {
		return this.isDefault;
	}
	/**
	 * <p>Setter for the field <code>isDefault</code>.</p>
	 *
	 * @param isDefault a {@link java.lang.Boolean} object.
	 */
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	/**
	 * <p>Getter for the field <code>logonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogonId() {
		return this.logonId;
	}
	/**
	 * <p>Setter for the field <code>logonId</code>.</p>
	 *
	 * @param logonId a {@link java.lang.String} object.
	 */
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

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
	 * <p>Getter for the field <code>titleType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitleType() {
		return this.titleType;
	}
	/**
	 * <p>Setter for the field <code>titleType</code>.</p>
	 *
	 * @param titleType a {@link java.lang.String} object.
	 */
	public void setTitleType(String titleType) {
		this.titleType = titleType;
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
	 * <p>Getter for the field <code>userEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserEmail() {
		return this.userEmail;
	}
	/**
	 * <p>Setter for the field <code>userEmail</code>.</p>
	 *
	 * @param userEmail a {@link java.lang.String} object.
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
