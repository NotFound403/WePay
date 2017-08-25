package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 工商个体户入驻接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntMerchantExpandPersonalApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3815882749341543958L;

	/**
	 * 企业基本信息
	 */
	@ApiField("base_info")
	private BaseInfo baseInfo;

	/**
	 * 营业执照信息
	 */
	@ApiField("business_license_info")
	private BusinessLicenceInfo businessLicenseInfo;

	/**
	 * 支付宝登录别名,邮箱地址或手机号码，入驻申请结果会通知到该邮箱地址或手机号码。如填入的是已有的企业版支付宝账号则后续认证与签约基于该账号进行，如填入的邮箱地址或手机号码没有对应的支付宝账号则用该邮箱地址或手机号码创建一个企业版支付宝账户，如填入的是已有的非企业版支付宝账号则预校验失败。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 个体工商户经营者信息
	 */
	@ApiField("operator_info")
	private OperatorInfo operatorInfo;

	/**
	 * 外部入驻申请单据号，需保证在开发者端不重复
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 工商个体户或个人银行账户信息
	 */
	@ApiField("personal_bank_account_info")
	private PersonnalBankAccountInfo personalBankAccountInfo;

	/**
	 * 门店信息
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
	 * <p>Getter for the field <code>operatorInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.OperatorInfo} object.
	 */
	public OperatorInfo getOperatorInfo() {
		return this.operatorInfo;
	}
	/**
	 * <p>Setter for the field <code>operatorInfo</code>.</p>
	 *
	 * @param operatorInfo a {@link cn.felord.wepay.ali.sdk.api.domain.OperatorInfo} object.
	 */
	public void setOperatorInfo(OperatorInfo operatorInfo) {
		this.operatorInfo = operatorInfo;
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
	 * <p>Getter for the field <code>personalBankAccountInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.PersonnalBankAccountInfo} object.
	 */
	public PersonnalBankAccountInfo getPersonalBankAccountInfo() {
		return this.personalBankAccountInfo;
	}
	/**
	 * <p>Setter for the field <code>personalBankAccountInfo</code>.</p>
	 *
	 * @param personalBankAccountInfo a {@link cn.felord.wepay.ali.sdk.api.domain.PersonnalBankAccountInfo} object.
	 */
	public void setPersonalBankAccountInfo(PersonnalBankAccountInfo personalBankAccountInfo) {
		this.personalBankAccountInfo = personalBankAccountInfo;
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
