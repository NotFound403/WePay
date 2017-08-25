package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 赔案
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsClaim extends AlipayObject {

	private static final long serialVersionUID = 3285464121667826699L;

	/**
	 * 理赔因子;标准json 格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 实际赔付金额 ;单位分
	 */
	@ApiField("claim_fee")
	private Long claimFee;

	/**
	 * 赔案号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 赔付时间
	 */
	@ApiField("claim_pay_time")
	private Date claimPayTime;

	/**
	 * 赔案进度;根据更新时间倒序
	 */
	@ApiListField("claim_progress")
	@ApiField("claim_progress")
	private List<ClaimProgress> claimProgress;

	/**
	 * 赔案状态.ACCEPTED:已受理;REJECTED:已拒赔;PAID:已赔付
	 */
	@ApiField("claim_status")
	private String claimStatus;

	/**
	 * 商户生成的外部理赔请求单号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 当状态是拒赔时给出拒赔原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

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
	 * <p>Getter for the field <code>claimFee</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getClaimFee() {
		return this.claimFee;
	}
	/**
	 * <p>Setter for the field <code>claimFee</code>.</p>
	 *
	 * @param claimFee a {@link java.lang.Long} object.
	 */
	public void setClaimFee(Long claimFee) {
		this.claimFee = claimFee;
	}

	/**
	 * <p>Getter for the field <code>claimNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClaimNo() {
		return this.claimNo;
	}
	/**
	 * <p>Setter for the field <code>claimNo</code>.</p>
	 *
	 * @param claimNo a {@link java.lang.String} object.
	 */
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	/**
	 * <p>Getter for the field <code>claimPayTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getClaimPayTime() {
		return this.claimPayTime;
	}
	/**
	 * <p>Setter for the field <code>claimPayTime</code>.</p>
	 *
	 * @param claimPayTime a {@link java.util.Date} object.
	 */
	public void setClaimPayTime(Date claimPayTime) {
		this.claimPayTime = claimPayTime;
	}

	/**
	 * <p>Getter for the field <code>claimProgress</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ClaimProgress> getClaimProgress() {
		return this.claimProgress;
	}
	/**
	 * <p>Setter for the field <code>claimProgress</code>.</p>
	 *
	 * @param claimProgress a {@link java.util.List} object.
	 */
	public void setClaimProgress(List<ClaimProgress> claimProgress) {
		this.claimProgress = claimProgress;
	}

	/**
	 * <p>Getter for the field <code>claimStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClaimStatus() {
		return this.claimStatus;
	}
	/**
	 * <p>Setter for the field <code>claimStatus</code>.</p>
	 *
	 * @param claimStatus a {@link java.lang.String} object.
	 */
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	/**
	 * <p>Getter for the field <code>outRequestNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	/**
	 * <p>Setter for the field <code>outRequestNo</code>.</p>
	 *
	 * @param outRequestNo a {@link java.lang.String} object.
	 */
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	/**
	 * <p>Getter for the field <code>rejectReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRejectReason() {
		return this.rejectReason;
	}
	/**
	 * <p>Setter for the field <code>rejectReason</code>.</p>
	 *
	 * @param rejectReason a {@link java.lang.String} object.
	 */
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

}
