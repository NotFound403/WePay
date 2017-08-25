package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保单
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsPolicy extends AlipayObject {

	private static final long serialVersionUID = 6454865363365292885L;

	/**
	 * 保单邮寄地址
	 */
	@ApiField("addressee")
	private InsAddressee addressee;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 投保参数;标准json 格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 赔案
	 */
	@ApiListField("claims")
	@ApiField("ins_claim")
	private List<InsClaim> claims;

	/**
	 * 险种列表
	 */
	@ApiListField("coverages")
	@ApiField("ins_coverage")
	private List<InsCoverage> coverages;

	/**
	 * 保单失效时间
	 */
	@ApiField("effect_end_time")
	private String effectEndTime;

	/**
	 * 保单生效时间
	 */
	@ApiField("effect_start_time")
	private String effectStartTime;

	/**
	 * 标的列表
	 */
	@ApiListField("ins_objects")
	@ApiField("ins_object")
	private List<InsObject> insObjects;

	/**
	 * 被保险人
	 */
	@ApiListField("insureds")
	@ApiField("ins_person")
	private List<InsPerson> insureds;

	/**
	 * 机构名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 保单凭证号;蚂蚁保险平台生成的保单凭证号,用户可以通过此单号去保险公司查询保单信息.
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 保单状态.INEFFECTIVE:未生效、GUARANTEE:保障中、EXPIRED:已失效、SURRENDER:已退保
	 */
	@ApiField("policy_status")
	private String policyStatus;

	/**
	 * 保费 ;单位分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 保额 ;单位分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	/**
	 * 退保金额
	 */
	@ApiField("surrender_fee")
	private Long surrenderFee;

	/**
	 * 退保时间
	 */
	@ApiField("surrender_time")
	private Date surrenderTime;

	/**
	 * <p>Getter for the field <code>addressee</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsAddressee} object.
	 */
	public InsAddressee getAddressee() {
		return this.addressee;
	}
	/**
	 * <p>Setter for the field <code>addressee</code>.</p>
	 *
	 * @param addressee a {@link cn.felord.wepay.ali.sdk.api.domain.InsAddressee} object.
	 */
	public void setAddressee(InsAddressee addressee) {
		this.addressee = addressee;
	}

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
	 * <p>Getter for the field <code>bizData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizData() {
		return this.bizData;
	}
	/**
	 * <p>Setter for the field <code>bizData</code>.</p>
	 *
	 * @param bizData a {@link java.lang.String} object.
	 */
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	/**
	 * <p>Getter for the field <code>claims</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsClaim> getClaims() {
		return this.claims;
	}
	/**
	 * <p>Setter for the field <code>claims</code>.</p>
	 *
	 * @param claims a {@link java.util.List} object.
	 */
	public void setClaims(List<InsClaim> claims) {
		this.claims = claims;
	}

	/**
	 * <p>Getter for the field <code>coverages</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsCoverage> getCoverages() {
		return this.coverages;
	}
	/**
	 * <p>Setter for the field <code>coverages</code>.</p>
	 *
	 * @param coverages a {@link java.util.List} object.
	 */
	public void setCoverages(List<InsCoverage> coverages) {
		this.coverages = coverages;
	}

	/**
	 * <p>Getter for the field <code>effectEndTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEffectEndTime() {
		return this.effectEndTime;
	}
	/**
	 * <p>Setter for the field <code>effectEndTime</code>.</p>
	 *
	 * @param effectEndTime a {@link java.lang.String} object.
	 */
	public void setEffectEndTime(String effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	/**
	 * <p>Getter for the field <code>effectStartTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEffectStartTime() {
		return this.effectStartTime;
	}
	/**
	 * <p>Setter for the field <code>effectStartTime</code>.</p>
	 *
	 * @param effectStartTime a {@link java.lang.String} object.
	 */
	public void setEffectStartTime(String effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	/**
	 * <p>Getter for the field <code>insObjects</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsObject> getInsObjects() {
		return this.insObjects;
	}
	/**
	 * <p>Setter for the field <code>insObjects</code>.</p>
	 *
	 * @param insObjects a {@link java.util.List} object.
	 */
	public void setInsObjects(List<InsObject> insObjects) {
		this.insObjects = insObjects;
	}

	/**
	 * <p>Getter for the field <code>insureds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsPerson> getInsureds() {
		return this.insureds;
	}
	/**
	 * <p>Setter for the field <code>insureds</code>.</p>
	 *
	 * @param insureds a {@link java.util.List} object.
	 */
	public void setInsureds(List<InsPerson> insureds) {
		this.insureds = insureds;
	}

	/**
	 * <p>Getter for the field <code>merchantName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantName() {
		return this.merchantName;
	}
	/**
	 * <p>Setter for the field <code>merchantName</code>.</p>
	 *
	 * @param merchantName a {@link java.lang.String} object.
	 */
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	/**
	 * <p>Getter for the field <code>policyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPolicyNo() {
		return this.policyNo;
	}
	/**
	 * <p>Setter for the field <code>policyNo</code>.</p>
	 *
	 * @param policyNo a {@link java.lang.String} object.
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	/**
	 * <p>Getter for the field <code>policyStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPolicyStatus() {
		return this.policyStatus;
	}
	/**
	 * <p>Setter for the field <code>policyStatus</code>.</p>
	 *
	 * @param policyStatus a {@link java.lang.String} object.
	 */
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	/**
	 * <p>Getter for the field <code>premium</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPremium() {
		return this.premium;
	}
	/**
	 * <p>Setter for the field <code>premium</code>.</p>
	 *
	 * @param premium a {@link java.lang.Long} object.
	 */
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	/**
	 * <p>Getter for the field <code>prodName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdName() {
		return this.prodName;
	}
	/**
	 * <p>Setter for the field <code>prodName</code>.</p>
	 *
	 * @param prodName a {@link java.lang.String} object.
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	/**
	 * <p>Getter for the field <code>sumInsured</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getSumInsured() {
		return this.sumInsured;
	}
	/**
	 * <p>Setter for the field <code>sumInsured</code>.</p>
	 *
	 * @param sumInsured a {@link java.lang.Long} object.
	 */
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

	/**
	 * <p>Getter for the field <code>surrenderFee</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getSurrenderFee() {
		return this.surrenderFee;
	}
	/**
	 * <p>Setter for the field <code>surrenderFee</code>.</p>
	 *
	 * @param surrenderFee a {@link java.lang.Long} object.
	 */
	public void setSurrenderFee(Long surrenderFee) {
		this.surrenderFee = surrenderFee;
	}

	/**
	 * <p>Getter for the field <code>surrenderTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getSurrenderTime() {
		return this.surrenderTime;
	}
	/**
	 * <p>Setter for the field <code>surrenderTime</code>.</p>
	 *
	 * @param surrenderTime a {@link java.util.Date} object.
	 */
	public void setSurrenderTime(Date surrenderTime) {
		this.surrenderTime = surrenderTime;
	}

}
