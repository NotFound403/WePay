package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 同步定损/核损结果到蚂蚁
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsDataAutodamageEstimateConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4679323555145352174L;

	/**
	 * 业务类型，2表示机构核损，3表示机构定损
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 车险商业险保单号
	 */
	@ApiField("commercial_policy_no")
	private String commercialPolicyNo;

	/**
	 * 交强险保单号
	 */
	@ApiField("compulsory_policy_no")
	private String compulsoryPolicyNo;

	/**
	 * 汽车发动机号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 核损详情对象列表
	 */
	@ApiListField("estimate_detail_list")
	@ApiField("ins_data_autodamage_estimate_confirm_model")
	private List<InsDataAutodamageEstimateConfirmModel> estimateDetailList;

	/**
	 * 保险公司定损单号，唯一标识一个定损单的id
	 */
	@ApiField("estimate_no")
	private String estimateNo;

	/**
	 * 车架号
	 */
	@ApiField("frame_no")
	private String frameNo;

	/**
	 * 车牌号
	 */
	@ApiField("license_no")
	private String licenseNo;

	/**
	 * 车型厂牌
	 */
	@ApiField("model_brand")
	private String modelBrand;

	/**
	 * 维修企业名称
	 */
	@ApiField("repair_corp_name")
	private String repairCorpName;

	/**
	 * 维修企业类型
	 */
	@ApiField("repair_corp_type")
	private String repairCorpType;

	/**
	 * 车险报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 查勘号
	 */
	@ApiField("survey_no")
	private String surveyNo;

	/**
	 * 车损总金额，单位：元
	 */
	@ApiField("total_damage_amount")
	private String totalDamageAmount;

	/**
	 * 残值扣除总金额，单位：元
	 */
	@ApiField("total_remain_value")
	private String totalRemainValue;

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>commercialPolicyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommercialPolicyNo() {
		return this.commercialPolicyNo;
	}
	/**
	 * <p>Setter for the field <code>commercialPolicyNo</code>.</p>
	 *
	 * @param commercialPolicyNo a {@link java.lang.String} object.
	 */
	public void setCommercialPolicyNo(String commercialPolicyNo) {
		this.commercialPolicyNo = commercialPolicyNo;
	}

	/**
	 * <p>Getter for the field <code>compulsoryPolicyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompulsoryPolicyNo() {
		return this.compulsoryPolicyNo;
	}
	/**
	 * <p>Setter for the field <code>compulsoryPolicyNo</code>.</p>
	 *
	 * @param compulsoryPolicyNo a {@link java.lang.String} object.
	 */
	public void setCompulsoryPolicyNo(String compulsoryPolicyNo) {
		this.compulsoryPolicyNo = compulsoryPolicyNo;
	}

	/**
	 * <p>Getter for the field <code>engineNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEngineNo() {
		return this.engineNo;
	}
	/**
	 * <p>Setter for the field <code>engineNo</code>.</p>
	 *
	 * @param engineNo a {@link java.lang.String} object.
	 */
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	/**
	 * <p>Getter for the field <code>estimateDetailList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsDataAutodamageEstimateConfirmModel> getEstimateDetailList() {
		return this.estimateDetailList;
	}
	/**
	 * <p>Setter for the field <code>estimateDetailList</code>.</p>
	 *
	 * @param estimateDetailList a {@link java.util.List} object.
	 */
	public void setEstimateDetailList(List<InsDataAutodamageEstimateConfirmModel> estimateDetailList) {
		this.estimateDetailList = estimateDetailList;
	}

	/**
	 * <p>Getter for the field <code>estimateNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEstimateNo() {
		return this.estimateNo;
	}
	/**
	 * <p>Setter for the field <code>estimateNo</code>.</p>
	 *
	 * @param estimateNo a {@link java.lang.String} object.
	 */
	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}

	/**
	 * <p>Getter for the field <code>frameNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFrameNo() {
		return this.frameNo;
	}
	/**
	 * <p>Setter for the field <code>frameNo</code>.</p>
	 *
	 * @param frameNo a {@link java.lang.String} object.
	 */
	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	/**
	 * <p>Getter for the field <code>licenseNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicenseNo() {
		return this.licenseNo;
	}
	/**
	 * <p>Setter for the field <code>licenseNo</code>.</p>
	 *
	 * @param licenseNo a {@link java.lang.String} object.
	 */
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	/**
	 * <p>Getter for the field <code>modelBrand</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModelBrand() {
		return this.modelBrand;
	}
	/**
	 * <p>Setter for the field <code>modelBrand</code>.</p>
	 *
	 * @param modelBrand a {@link java.lang.String} object.
	 */
	public void setModelBrand(String modelBrand) {
		this.modelBrand = modelBrand;
	}

	/**
	 * <p>Getter for the field <code>repairCorpName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepairCorpName() {
		return this.repairCorpName;
	}
	/**
	 * <p>Setter for the field <code>repairCorpName</code>.</p>
	 *
	 * @param repairCorpName a {@link java.lang.String} object.
	 */
	public void setRepairCorpName(String repairCorpName) {
		this.repairCorpName = repairCorpName;
	}

	/**
	 * <p>Getter for the field <code>repairCorpType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepairCorpType() {
		return this.repairCorpType;
	}
	/**
	 * <p>Setter for the field <code>repairCorpType</code>.</p>
	 *
	 * @param repairCorpType a {@link java.lang.String} object.
	 */
	public void setRepairCorpType(String repairCorpType) {
		this.repairCorpType = repairCorpType;
	}

	/**
	 * <p>Getter for the field <code>reportNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReportNo() {
		return this.reportNo;
	}
	/**
	 * <p>Setter for the field <code>reportNo</code>.</p>
	 *
	 * @param reportNo a {@link java.lang.String} object.
	 */
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	/**
	 * <p>Getter for the field <code>surveyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSurveyNo() {
		return this.surveyNo;
	}
	/**
	 * <p>Setter for the field <code>surveyNo</code>.</p>
	 *
	 * @param surveyNo a {@link java.lang.String} object.
	 */
	public void setSurveyNo(String surveyNo) {
		this.surveyNo = surveyNo;
	}

	/**
	 * <p>Getter for the field <code>totalDamageAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalDamageAmount() {
		return this.totalDamageAmount;
	}
	/**
	 * <p>Setter for the field <code>totalDamageAmount</code>.</p>
	 *
	 * @param totalDamageAmount a {@link java.lang.String} object.
	 */
	public void setTotalDamageAmount(String totalDamageAmount) {
		this.totalDamageAmount = totalDamageAmount;
	}

	/**
	 * <p>Getter for the field <code>totalRemainValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalRemainValue() {
		return this.totalRemainValue;
	}
	/**
	 * <p>Setter for the field <code>totalRemainValue</code>.</p>
	 *
	 * @param totalRemainValue a {@link java.lang.String} object.
	 */
	public void setTotalRemainValue(String totalRemainValue) {
		this.totalRemainValue = totalRemainValue;
	}

}
