package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 线上间连商户入驻
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntMerchantExpandIndirectOnlineCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5739567331747447536L;

	/**
	 * 商户地址信息
	 */
	@ApiListField("address_info")
	@ApiField("address_info")
	private List<AddressInfo> addressInfo;

	/**
	 * 商户简称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 签约受理机构pid
	 */
	@ApiField("bank_pid")
	private String bankPid;

	/**
	 * 商户对应银行所开立的结算卡信息
	 */
	@ApiListField("bankcard_info")
	@ApiField("bank_card_info")
	private List<BankCardInfo> bankcardInfo;

	/**
	 * 商户证件编号（企业或者个体工商户提供营业执照，事业单位提供事证号）
	 */
	@ApiField("business_license")
	private String businessLicense;

	/**
	 * 商户证件类型，取值范围：NATIONAL_LEGAL：营业执照；NATIONAL_LEGAL_MERGE:营业执照(多证合一)；INST_RGST_CTF：事业单位法人证书
	 */
	@ApiField("business_license_type")
	private String businessLicenseType;

	/**
	 * 商户联系人信息
	 */
	@ApiListField("contact_info")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfo;

	/**
	 * 支付机构pid/source id；服务商PID；
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 商户的支付宝账号
	 */
	@ApiListField("logon_id")
	@ApiField("string")
	private List<String> logonId;

	/**
	 * mcc编码
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商户特殊资质等
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户的支付二维码中信息，用于营销活动
	 */
	@ApiListField("pay_code_info")
	@ApiField("string")
	private List<String> payCodeInfo;

	/**
	 * 商户客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 商户在银行端的签约时间
	 */
	@ApiField("sign_bank_time")
	private Date signBankTime;

	/**
	 * 站点信息
	 */
	@ApiListField("site_info")
	@ApiField("site_info")
	private List<SiteInfo> siteInfo;

	/**
	 * 商户在受理机构的唯一代码，该代号在该机构下保持唯一；extenalID；
	 */
	@ApiField("unique_id_by_bank")
	private String uniqueIdByBank;

	/**
	 * 商户在支付机构的的唯一代码；服务商对该商户分配的ID；
	 */
	@ApiField("unique_id_by_isv")
	private String uniqueIdByIsv;

	/**
	 * <p>Getter for the field <code>addressInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AddressInfo> getAddressInfo() {
		return this.addressInfo;
	}
	/**
	 * <p>Setter for the field <code>addressInfo</code>.</p>
	 *
	 * @param addressInfo a {@link java.util.List} object.
	 */
	public void setAddressInfo(List<AddressInfo> addressInfo) {
		this.addressInfo = addressInfo;
	}

	/**
	 * <p>Getter for the field <code>aliasName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAliasName() {
		return this.aliasName;
	}
	/**
	 * <p>Setter for the field <code>aliasName</code>.</p>
	 *
	 * @param aliasName a {@link java.lang.String} object.
	 */
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	/**
	 * <p>Getter for the field <code>bankPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBankPid() {
		return this.bankPid;
	}
	/**
	 * <p>Setter for the field <code>bankPid</code>.</p>
	 *
	 * @param bankPid a {@link java.lang.String} object.
	 */
	public void setBankPid(String bankPid) {
		this.bankPid = bankPid;
	}

	/**
	 * <p>Getter for the field <code>bankcardInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<BankCardInfo> getBankcardInfo() {
		return this.bankcardInfo;
	}
	/**
	 * <p>Setter for the field <code>bankcardInfo</code>.</p>
	 *
	 * @param bankcardInfo a {@link java.util.List} object.
	 */
	public void setBankcardInfo(List<BankCardInfo> bankcardInfo) {
		this.bankcardInfo = bankcardInfo;
	}

	/**
	 * <p>Getter for the field <code>businessLicense</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessLicense() {
		return this.businessLicense;
	}
	/**
	 * <p>Setter for the field <code>businessLicense</code>.</p>
	 *
	 * @param businessLicense a {@link java.lang.String} object.
	 */
	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	/**
	 * <p>Getter for the field <code>businessLicenseType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessLicenseType() {
		return this.businessLicenseType;
	}
	/**
	 * <p>Setter for the field <code>businessLicenseType</code>.</p>
	 *
	 * @param businessLicenseType a {@link java.lang.String} object.
	 */
	public void setBusinessLicenseType(String businessLicenseType) {
		this.businessLicenseType = businessLicenseType;
	}

	/**
	 * <p>Getter for the field <code>contactInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ContactInfo> getContactInfo() {
		return this.contactInfo;
	}
	/**
	 * <p>Setter for the field <code>contactInfo</code>.</p>
	 *
	 * @param contactInfo a {@link java.util.List} object.
	 */
	public void setContactInfo(List<ContactInfo> contactInfo) {
		this.contactInfo = contactInfo;
	}

	/**
	 * <p>Getter for the field <code>isvPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvPid() {
		return this.isvPid;
	}
	/**
	 * <p>Setter for the field <code>isvPid</code>.</p>
	 *
	 * @param isvPid a {@link java.lang.String} object.
	 */
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	/**
	 * <p>Getter for the field <code>logonId</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getLogonId() {
		return this.logonId;
	}
	/**
	 * <p>Setter for the field <code>logonId</code>.</p>
	 *
	 * @param logonId a {@link java.util.List} object.
	 */
	public void setLogonId(List<String> logonId) {
		this.logonId = logonId;
	}

	/**
	 * <p>Getter for the field <code>mcc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMcc() {
		return this.mcc;
	}
	/**
	 * <p>Setter for the field <code>mcc</code>.</p>
	 *
	 * @param mcc a {@link java.lang.String} object.
	 */
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>payCodeInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getPayCodeInfo() {
		return this.payCodeInfo;
	}
	/**
	 * <p>Setter for the field <code>payCodeInfo</code>.</p>
	 *
	 * @param payCodeInfo a {@link java.util.List} object.
	 */
	public void setPayCodeInfo(List<String> payCodeInfo) {
		this.payCodeInfo = payCodeInfo;
	}

	/**
	 * <p>Getter for the field <code>servicePhone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServicePhone() {
		return this.servicePhone;
	}
	/**
	 * <p>Setter for the field <code>servicePhone</code>.</p>
	 *
	 * @param servicePhone a {@link java.lang.String} object.
	 */
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	/**
	 * <p>Getter for the field <code>signBankTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getSignBankTime() {
		return this.signBankTime;
	}
	/**
	 * <p>Setter for the field <code>signBankTime</code>.</p>
	 *
	 * @param signBankTime a {@link java.util.Date} object.
	 */
	public void setSignBankTime(Date signBankTime) {
		this.signBankTime = signBankTime;
	}

	/**
	 * <p>Getter for the field <code>siteInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<SiteInfo> getSiteInfo() {
		return this.siteInfo;
	}
	/**
	 * <p>Setter for the field <code>siteInfo</code>.</p>
	 *
	 * @param siteInfo a {@link java.util.List} object.
	 */
	public void setSiteInfo(List<SiteInfo> siteInfo) {
		this.siteInfo = siteInfo;
	}

	/**
	 * <p>Getter for the field <code>uniqueIdByBank</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUniqueIdByBank() {
		return this.uniqueIdByBank;
	}
	/**
	 * <p>Setter for the field <code>uniqueIdByBank</code>.</p>
	 *
	 * @param uniqueIdByBank a {@link java.lang.String} object.
	 */
	public void setUniqueIdByBank(String uniqueIdByBank) {
		this.uniqueIdByBank = uniqueIdByBank;
	}

	/**
	 * <p>Getter for the field <code>uniqueIdByIsv</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUniqueIdByIsv() {
		return this.uniqueIdByIsv;
	}
	/**
	 * <p>Setter for the field <code>uniqueIdByIsv</code>.</p>
	 *
	 * @param uniqueIdByIsv a {@link java.lang.String} object.
	 */
	public void setUniqueIdByIsv(String uniqueIdByIsv) {
		this.uniqueIdByIsv = uniqueIdByIsv;
	}

}
