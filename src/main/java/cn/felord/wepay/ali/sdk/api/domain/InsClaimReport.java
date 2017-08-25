package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保险报案信息实体
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsClaimReport extends AlipayObject {

	private static final long serialVersionUID = 4284691223626342552L;

	/**
	 * 出险地点
	 */
	@ApiField("accident_address")
	private String accidentAddress;

	/**
	 * 出险事故描述
	 */
	@ApiField("accident_desc")
	private String accidentDesc;

	/**
	 * 出险时间
	 */
	@ApiField("accident_time")
	private Date accidentTime;

	/**
	 * 案件附件列表
	 */
	@ApiListField("attachments")
	@ApiField("ins_claim_attachment")
	private List<InsClaimAttachment> attachments;

	/**
	 * 业务字段
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 报案号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 赔案信息
	 */
	@ApiListField("claims")
	@ApiField("ins_claim")
	private List<InsClaim> claims;

	/**
	 * 案件进度列表
	 */
	@ApiListField("progress")
	@ApiField("ins_claim_report_progress")
	private List<InsClaimReportProgress> progress;

	/**
	 * 当status 值为不予受理:REJECTED时候返回
	 */
	@ApiField("report_reject_reason")
	private String reportRejectReason;

	/**
	 * 报案人
	 */
	@ApiField("reporter")
	private InsPerson reporter;

	/**
	 * 案件状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>accidentAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccidentAddress() {
		return this.accidentAddress;
	}
	/**
	 * <p>Setter for the field <code>accidentAddress</code>.</p>
	 *
	 * @param accidentAddress a {@link java.lang.String} object.
	 */
	public void setAccidentAddress(String accidentAddress) {
		this.accidentAddress = accidentAddress;
	}

	/**
	 * <p>Getter for the field <code>accidentDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccidentDesc() {
		return this.accidentDesc;
	}
	/**
	 * <p>Setter for the field <code>accidentDesc</code>.</p>
	 *
	 * @param accidentDesc a {@link java.lang.String} object.
	 */
	public void setAccidentDesc(String accidentDesc) {
		this.accidentDesc = accidentDesc;
	}

	/**
	 * <p>Getter for the field <code>accidentTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getAccidentTime() {
		return this.accidentTime;
	}
	/**
	 * <p>Setter for the field <code>accidentTime</code>.</p>
	 *
	 * @param accidentTime a {@link java.util.Date} object.
	 */
	public void setAccidentTime(Date accidentTime) {
		this.accidentTime = accidentTime;
	}

	/**
	 * <p>Getter for the field <code>attachments</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsClaimAttachment> getAttachments() {
		return this.attachments;
	}
	/**
	 * <p>Setter for the field <code>attachments</code>.</p>
	 *
	 * @param attachments a {@link java.util.List} object.
	 */
	public void setAttachments(List<InsClaimAttachment> attachments) {
		this.attachments = attachments;
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
	 * <p>Getter for the field <code>claimReportNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	/**
	 * <p>Setter for the field <code>claimReportNo</code>.</p>
	 *
	 * @param claimReportNo a {@link java.lang.String} object.
	 */
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
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
	 * <p>Getter for the field <code>progress</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsClaimReportProgress> getProgress() {
		return this.progress;
	}
	/**
	 * <p>Setter for the field <code>progress</code>.</p>
	 *
	 * @param progress a {@link java.util.List} object.
	 */
	public void setProgress(List<InsClaimReportProgress> progress) {
		this.progress = progress;
	}

	/**
	 * <p>Getter for the field <code>reportRejectReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReportRejectReason() {
		return this.reportRejectReason;
	}
	/**
	 * <p>Setter for the field <code>reportRejectReason</code>.</p>
	 *
	 * @param reportRejectReason a {@link java.lang.String} object.
	 */
	public void setReportRejectReason(String reportRejectReason) {
		this.reportRejectReason = reportRejectReason;
	}

	/**
	 * <p>Getter for the field <code>reporter</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public InsPerson getReporter() {
		return this.reporter;
	}
	/**
	 * <p>Setter for the field <code>reporter</code>.</p>
	 *
	 * @param reporter a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public void setReporter(InsPerson reporter) {
		this.reporter = reporter;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
