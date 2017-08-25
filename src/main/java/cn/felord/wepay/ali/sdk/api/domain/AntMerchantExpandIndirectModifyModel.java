package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 银行间连商户修改
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntMerchantExpandIndirectModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5427572132774822977L;

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
	 * 商户经营类目，参考文档：https://doc.open.alipay.com/doc2/detail?&docType=1&articleId=105444
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商户负责人信息
	 */
	@ApiListField("contact_info")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfo;

	/**
	 * 商户编号，由机构定义，需要保证在机构下唯一，与sub_merchant_id二选一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 受理商户的支付宝账号（用于关联商户生活号、原服务窗，打通口碑营销活动）
	 */
	@ApiListField("logon_id")
	@ApiField("string")
	private List<String> logonId;

	/**
	 * 商户备注信息，可填写额外信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 受理商户的固定二维码链接地址（即一码多付页面地址，用于后续支付宝营销活动）
商户所属的银行或ISV 给商户的二维码url值
一码多付方案:https://doc.open.alipay.com/docs/doc.htm?&docType=1&articleId=105672
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
	 * 商户来源机构标识，填写机构在支付宝的pid
	 */
	@ApiField("source")
	private String source;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号，与external_id二选一
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

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
	 * <p>Getter for the field <code>categoryId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryId() {
		return this.categoryId;
	}
	/**
	 * <p>Setter for the field <code>categoryId</code>.</p>
	 *
	 * @param categoryId a {@link java.lang.String} object.
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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
	 * <p>Getter for the field <code>externalId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalId() {
		return this.externalId;
	}
	/**
	 * <p>Setter for the field <code>externalId</code>.</p>
	 *
	 * @param externalId a {@link java.lang.String} object.
	 */
	public void setExternalId(String externalId) {
		this.externalId = externalId;
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
	 * <p>Getter for the field <code>source</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSource() {
		return this.source;
	}
	/**
	 * <p>Setter for the field <code>source</code>.</p>
	 *
	 * @param source a {@link java.lang.String} object.
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * <p>Getter for the field <code>subMerchantId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	/**
	 * <p>Setter for the field <code>subMerchantId</code>.</p>
	 *
	 * @param subMerchantId a {@link java.lang.String} object.
	 */
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
