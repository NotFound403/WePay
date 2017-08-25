package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 平台险赠险投保申请
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneCouponReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 6424939748424325455L;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 保险发奖凭证
	 */
	@ApiField("certificate")
	private InsCertificate certificate;

	/**
	 * 被保险人
	 */
	@ApiField("insured")
	private InsPerson insured;

	/**
	 * 市场类型;TAOBAO:淘宝平台,ANT: 蚂蚁平台
	 */
	@ApiField("market_type")
	private String marketType;

	/**
	 * 商户生成的外部业务号,必须保证唯一，幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 产品编码;由蚂蚁保险平台分配
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品版本号
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 服务场景;
propertyPaySuccess:蚂蚁物业支付成功页面
	 */
	@ApiField("service_scenario")
	private String serviceScenario;

	/**
	 * <p>Getter for the field <code>applicant</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public InsPerson getApplicant() {
		return this.applicant;
	}
	/**
	 * <p>Setter for the field <code>applicant</code>.</p>
	 *
	 * @param applicant a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	/**
	 * <p>Getter for the field <code>certificate</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsCertificate} object.
	 */
	public InsCertificate getCertificate() {
		return this.certificate;
	}
	/**
	 * <p>Setter for the field <code>certificate</code>.</p>
	 *
	 * @param certificate a {@link cn.felord.wepay.ali.sdk.api.domain.InsCertificate} object.
	 */
	public void setCertificate(InsCertificate certificate) {
		this.certificate = certificate;
	}

	/**
	 * <p>Getter for the field <code>insured</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public InsPerson getInsured() {
		return this.insured;
	}
	/**
	 * <p>Setter for the field <code>insured</code>.</p>
	 *
	 * @param insured a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public void setInsured(InsPerson insured) {
		this.insured = insured;
	}

	/**
	 * <p>Getter for the field <code>marketType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMarketType() {
		return this.marketType;
	}
	/**
	 * <p>Setter for the field <code>marketType</code>.</p>
	 *
	 * @param marketType a {@link java.lang.String} object.
	 */
	public void setMarketType(String marketType) {
		this.marketType = marketType;
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
	 * <p>Getter for the field <code>partnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerId() {
		return this.partnerId;
	}
	/**
	 * <p>Setter for the field <code>partnerId</code>.</p>
	 *
	 * @param partnerId a {@link java.lang.String} object.
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	/**
	 * <p>Getter for the field <code>prodCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdCode() {
		return this.prodCode;
	}
	/**
	 * <p>Setter for the field <code>prodCode</code>.</p>
	 *
	 * @param prodCode a {@link java.lang.String} object.
	 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	/**
	 * <p>Getter for the field <code>prodVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdVersion() {
		return this.prodVersion;
	}
	/**
	 * <p>Setter for the field <code>prodVersion</code>.</p>
	 *
	 * @param prodVersion a {@link java.lang.String} object.
	 */
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

	/**
	 * <p>Getter for the field <code>serviceScenario</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServiceScenario() {
		return this.serviceScenario;
	}
	/**
	 * <p>Setter for the field <code>serviceScenario</code>.</p>
	 *
	 * @param serviceScenario a {@link java.lang.String} object.
	 */
	public void setServiceScenario(String serviceScenario) {
		this.serviceScenario = serviceScenario;
	}

}
