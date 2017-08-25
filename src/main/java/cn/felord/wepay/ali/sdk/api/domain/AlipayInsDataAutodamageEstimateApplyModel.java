package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 提交车险图像定损请求
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsDataAutodamageEstimateApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4862548931319755222L;

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
	 * 保险公司定损单号，唯一标识一个定损单的id
	 */
	@ApiField("estimate_no")
	private String estimateNo;

	/**
	 * 定损请求uuid，唯一标识一次定损请求，用于做幂等控制
	 */
	@ApiField("estimate_request_uuid")
	private String estimateRequestUuid;

	/**
	 * 车架号
	 */
	@ApiField("frame_no")
	private String frameNo;

	/**
	 * 车损图片信息列表
	 */
	@ApiListField("image_list")
	@ApiField("alipay_ins_data_autodamage_request_image_info")
	private List<AlipayInsDataAutodamageRequestImageInfo> imageList;

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
	 * 车险报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 请求发生时的时间戳
	 */
	@ApiField("request_timestamp")
	private Long requestTimestamp;

	/**
	 * 查勘号
	 */
	@ApiField("survey_no")
	private String surveyNo;

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
	 * <p>Getter for the field <code>estimateRequestUuid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEstimateRequestUuid() {
		return this.estimateRequestUuid;
	}
	/**
	 * <p>Setter for the field <code>estimateRequestUuid</code>.</p>
	 *
	 * @param estimateRequestUuid a {@link java.lang.String} object.
	 */
	public void setEstimateRequestUuid(String estimateRequestUuid) {
		this.estimateRequestUuid = estimateRequestUuid;
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
	 * <p>Getter for the field <code>imageList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlipayInsDataAutodamageRequestImageInfo> getImageList() {
		return this.imageList;
	}
	/**
	 * <p>Setter for the field <code>imageList</code>.</p>
	 *
	 * @param imageList a {@link java.util.List} object.
	 */
	public void setImageList(List<AlipayInsDataAutodamageRequestImageInfo> imageList) {
		this.imageList = imageList;
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
	 * <p>Getter for the field <code>requestTimestamp</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRequestTimestamp() {
		return this.requestTimestamp;
	}
	/**
	 * <p>Setter for the field <code>requestTimestamp</code>.</p>
	 *
	 * @param requestTimestamp a {@link java.lang.Long} object.
	 */
	public void setRequestTimestamp(Long requestTimestamp) {
		this.requestTimestamp = requestTimestamp;
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

}
