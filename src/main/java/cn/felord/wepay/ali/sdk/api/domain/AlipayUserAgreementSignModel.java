package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝个人协议签约接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserAgreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 2155654613711729971L;

	/**
	 * 用户的支付宝登录账号，支持邮箱或手机号码格式。
本参数与alipay_user_id不可同时为空，若都填写，则以alipay_user_id为准。
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 用户的支付宝id，本参数与alipay_logon_id不可同时为空，若都填写，则以本参数为准，优先级高于alipay_logon_id。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 资产信息，针对于泛金融机构，签约时必须传入资产信息。json格式。
	 */
	@ApiField("asset_params")
	private AssetParams assetParams;

	/**
	 * 支付宝账户绑定的手机，系统会对账户绑定的手机与传入的手机号做一致性校验。
商户调用必传。
阿里集团内部调用，可不传。
	 */
	@ApiField("binded_mobile")
	private String bindedMobile;

	/**
	 * 签约确认方式，用户进行协议签约时的确认方式，不同产品所支持的确认方式不同。
目前仅支持如下两类：
M：手机校验码回填确认方式。
如果为空，则默认为无需用户确认。
	 */
	@ApiField("confirm_type")
	private String confirmType;

	/**
	 * 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。
格式规则：支持大写小写字母和数字，最长32位。
商户系统按需传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 用户在商户网站的登录账号，用于在签约页面展示，如果为空，则不展示
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/**
	 * 个人签约产品码，商户和支付宝签约时确定，商户可咨询技术支持。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/**
	 * 签约产品属性，json格式
	 */
	@ApiField("prod_params")
	private ProdParams prodParams;

	/**
	 * 销售产品码，商户签约的支付宝合同所对应的产品码。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 签约营销参数，此值为json格式；具体的key需与营销约定
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * 协议签约场景，商户和支付宝签约时确定，商户可咨询技术支持。
当传入商户签约号external_sign_no时，场景不能为默认值DEFAULT|DEFAULT。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 当前用户签约请求的协议有效周期。
整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。
目前支持的时间单位：
1. d：天
2. m：月
如果未传入，默认为长期有效。
	 */
	@ApiField("sign_validity_period")
	private String signValidityPeriod;

	/**
	 * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。
取值范围：
1. PARTNER（平台商户）
2. MERCHANT（集团商户），集团下子商户可共享用户签约内容
默认为PARTNER。
	 */
	@ApiField("third_party_type")
	private String thirdPartyType;

	/**
	 * 校验信息，针对双因子校验逻辑，如果logonId为email时，必须传入证件号后4位信息。Json格式。
	 */
	@ApiField("verify_params")
	private VerifyParams verifyParams;

	/**
	 * 芝麻授权信息，针对于信用代扣签约。json格式。
	 */
	@ApiField("zm_auth_params")
	private ZmAuthParams zmAuthParams;

	/**
	 * <p>Getter for the field <code>alipayLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	/**
	 * <p>Setter for the field <code>alipayLogonId</code>.</p>
	 *
	 * @param alipayLogonId a {@link java.lang.String} object.
	 */
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	/**
	 * <p>Getter for the field <code>alipayUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	/**
	 * <p>Setter for the field <code>alipayUserId</code>.</p>
	 *
	 * @param alipayUserId a {@link java.lang.String} object.
	 */
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	/**
	 * <p>Getter for the field <code>assetParams</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AssetParams} object.
	 */
	public AssetParams getAssetParams() {
		return this.assetParams;
	}
	/**
	 * <p>Setter for the field <code>assetParams</code>.</p>
	 *
	 * @param assetParams a {@link cn.felord.wepay.ali.sdk.api.domain.AssetParams} object.
	 */
	public void setAssetParams(AssetParams assetParams) {
		this.assetParams = assetParams;
	}

	/**
	 * <p>Getter for the field <code>bindedMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBindedMobile() {
		return this.bindedMobile;
	}
	/**
	 * <p>Setter for the field <code>bindedMobile</code>.</p>
	 *
	 * @param bindedMobile a {@link java.lang.String} object.
	 */
	public void setBindedMobile(String bindedMobile) {
		this.bindedMobile = bindedMobile;
	}

	/**
	 * <p>Getter for the field <code>confirmType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConfirmType() {
		return this.confirmType;
	}
	/**
	 * <p>Setter for the field <code>confirmType</code>.</p>
	 *
	 * @param confirmType a {@link java.lang.String} object.
	 */
	public void setConfirmType(String confirmType) {
		this.confirmType = confirmType;
	}

	/**
	 * <p>Getter for the field <code>externalAgreementNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	/**
	 * <p>Setter for the field <code>externalAgreementNo</code>.</p>
	 *
	 * @param externalAgreementNo a {@link java.lang.String} object.
	 */
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	/**
	 * <p>Getter for the field <code>externalLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalLogonId() {
		return this.externalLogonId;
	}
	/**
	 * <p>Setter for the field <code>externalLogonId</code>.</p>
	 *
	 * @param externalLogonId a {@link java.lang.String} object.
	 */
	public void setExternalLogonId(String externalLogonId) {
		this.externalLogonId = externalLogonId;
	}

	/**
	 * <p>Getter for the field <code>personalProductCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPersonalProductCode() {
		return this.personalProductCode;
	}
	/**
	 * <p>Setter for the field <code>personalProductCode</code>.</p>
	 *
	 * @param personalProductCode a {@link java.lang.String} object.
	 */
	public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}

	/**
	 * <p>Getter for the field <code>prodParams</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ProdParams} object.
	 */
	public ProdParams getProdParams() {
		return this.prodParams;
	}
	/**
	 * <p>Setter for the field <code>prodParams</code>.</p>
	 *
	 * @param prodParams a {@link cn.felord.wepay.ali.sdk.api.domain.ProdParams} object.
	 */
	public void setProdParams(ProdParams prodParams) {
		this.prodParams = prodParams;
	}

	/**
	 * <p>Getter for the field <code>productCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductCode() {
		return this.productCode;
	}
	/**
	 * <p>Setter for the field <code>productCode</code>.</p>
	 *
	 * @param productCode a {@link java.lang.String} object.
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * <p>Getter for the field <code>promoParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPromoParams() {
		return this.promoParams;
	}
	/**
	 * <p>Setter for the field <code>promoParams</code>.</p>
	 *
	 * @param promoParams a {@link java.lang.String} object.
	 */
	public void setPromoParams(String promoParams) {
		this.promoParams = promoParams;
	}

	/**
	 * <p>Getter for the field <code>signScene</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSignScene() {
		return this.signScene;
	}
	/**
	 * <p>Setter for the field <code>signScene</code>.</p>
	 *
	 * @param signScene a {@link java.lang.String} object.
	 */
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

	/**
	 * <p>Getter for the field <code>signValidityPeriod</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSignValidityPeriod() {
		return this.signValidityPeriod;
	}
	/**
	 * <p>Setter for the field <code>signValidityPeriod</code>.</p>
	 *
	 * @param signValidityPeriod a {@link java.lang.String} object.
	 */
	public void setSignValidityPeriod(String signValidityPeriod) {
		this.signValidityPeriod = signValidityPeriod;
	}

	/**
	 * <p>Getter for the field <code>thirdPartyType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getThirdPartyType() {
		return this.thirdPartyType;
	}
	/**
	 * <p>Setter for the field <code>thirdPartyType</code>.</p>
	 *
	 * @param thirdPartyType a {@link java.lang.String} object.
	 */
	public void setThirdPartyType(String thirdPartyType) {
		this.thirdPartyType = thirdPartyType;
	}

	/**
	 * <p>Getter for the field <code>verifyParams</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.VerifyParams} object.
	 */
	public VerifyParams getVerifyParams() {
		return this.verifyParams;
	}
	/**
	 * <p>Setter for the field <code>verifyParams</code>.</p>
	 *
	 * @param verifyParams a {@link cn.felord.wepay.ali.sdk.api.domain.VerifyParams} object.
	 */
	public void setVerifyParams(VerifyParams verifyParams) {
		this.verifyParams = verifyParams;
	}

	/**
	 * <p>Getter for the field <code>zmAuthParams</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ZmAuthParams} object.
	 */
	public ZmAuthParams getZmAuthParams() {
		return this.zmAuthParams;
	}
	/**
	 * <p>Setter for the field <code>zmAuthParams</code>.</p>
	 *
	 * @param zmAuthParams a {@link cn.felord.wepay.ali.sdk.api.domain.ZmAuthParams} object.
	 */
	public void setZmAuthParams(ZmAuthParams zmAuthParams) {
		this.zmAuthParams = zmAuthParams;
	}

}
