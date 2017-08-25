package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户入驻接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntMerchantExpandEnterpriseApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2572513525992411124L;

	/**
	 * 企业基础信息
	 */
	@ApiField("base_info")
	private BaseInfo baseInfo;

	/**
	 * 企业对公账户信息
	 */
	@ApiField("business_bank_account_info")
	private BusinessBankAccountInfo businessBankAccountInfo;

	/**
	 * 企业营业执照信息
	 */
	@ApiField("business_license_info")
	private BusinessLicenceInfo businessLicenseInfo;

	/**
	 * 企业级商户法人信息
	 */
	@ApiField("legal_representative_info")
	private LegalRepresentativeInfo legalRepresentativeInfo;

	/**
	 * 支付宝登录别名,必须是邮箱地址。入驻申请结果会通知到该邮箱地址或手机号码。如填入的是已有的企业版支付宝账号则后续认证与签约基于该账号进行，如填入的邮箱地址没有对应的支付宝账号则用该邮箱地址创建一个企业版支付宝账户，如填入的是已有的非企业版支付宝账号则预校验失败。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 外部入驻申请单据号，需保证在开发者端不重复
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 企业的门店信息，签约当面付时必选
	 */
	@ApiField("shop_info")
	private ShopInfo shopInfo;

	/**
	 * <p>Getter for the field <code>baseInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.BaseInfo} object.
	 */
	public BaseInfo getBaseInfo() {
		return this.baseInfo;
	}
	/**
	 * <p>Setter for the field <code>baseInfo</code>.</p>
	 *
	 * @param baseInfo a {@link cn.felord.wepay.ali.sdk.api.domain.BaseInfo} object.
	 */
	public void setBaseInfo(BaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

	/**
	 * <p>Getter for the field <code>businessBankAccountInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.BusinessBankAccountInfo} object.
	 */
	public BusinessBankAccountInfo getBusinessBankAccountInfo() {
		return this.businessBankAccountInfo;
	}
	/**
	 * <p>Setter for the field <code>businessBankAccountInfo</code>.</p>
	 *
	 * @param businessBankAccountInfo a {@link cn.felord.wepay.ali.sdk.api.domain.BusinessBankAccountInfo} object.
	 */
	public void setBusinessBankAccountInfo(BusinessBankAccountInfo businessBankAccountInfo) {
		this.businessBankAccountInfo = businessBankAccountInfo;
	}

	/**
	 * <p>Getter for the field <code>businessLicenseInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.BusinessLicenceInfo} object.
	 */
	public BusinessLicenceInfo getBusinessLicenseInfo() {
		return this.businessLicenseInfo;
	}
	/**
	 * <p>Setter for the field <code>businessLicenseInfo</code>.</p>
	 *
	 * @param businessLicenseInfo a {@link cn.felord.wepay.ali.sdk.api.domain.BusinessLicenceInfo} object.
	 */
	public void setBusinessLicenseInfo(BusinessLicenceInfo businessLicenseInfo) {
		this.businessLicenseInfo = businessLicenseInfo;
	}

	/**
	 * <p>Getter for the field <code>legalRepresentativeInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.LegalRepresentativeInfo} object.
	 */
	public LegalRepresentativeInfo getLegalRepresentativeInfo() {
		return this.legalRepresentativeInfo;
	}
	/**
	 * <p>Setter for the field <code>legalRepresentativeInfo</code>.</p>
	 *
	 * @param legalRepresentativeInfo a {@link cn.felord.wepay.ali.sdk.api.domain.LegalRepresentativeInfo} object.
	 */
	public void setLegalRepresentativeInfo(LegalRepresentativeInfo legalRepresentativeInfo) {
		this.legalRepresentativeInfo = legalRepresentativeInfo;
	}

	/**
	 * <p>Getter for the field <code>loginId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoginId() {
		return this.loginId;
	}
	/**
	 * <p>Setter for the field <code>loginId</code>.</p>
	 *
	 * @param loginId a {@link java.lang.String} object.
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * <p>Getter for the field <code>shopInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ShopInfo} object.
	 */
	public ShopInfo getShopInfo() {
		return this.shopInfo;
	}
	/**
	 * <p>Setter for the field <code>shopInfo</code>.</p>
	 *
	 * @param shopInfo a {@link cn.felord.wepay.ali.sdk.api.domain.ShopInfo} object.
	 */
	public void setShopInfo(ShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

}
