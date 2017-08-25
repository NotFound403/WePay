package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 合约还款计划
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InstRepayPlan extends AlipayObject {

	private static final long serialVersionUID = 1845565278281213555L;

	/**
	 * 是否是当期。 默认值为不是当期计划。如果合约最后一期计划都已经逾期，就不再存在当期计划，合约下所有计划明细的该值都为false
	 */
	@ApiField("cur_term")
	private Boolean curTerm;

	/**
	 * 当期利息，单位：元
	 */
	@ApiField("cur_term_interest")
	private String curTermInterest;

	/**
	 * 当期利息罚息，单位：元
	 */
	@ApiField("cur_term_interest_penalty")
	private String curTermInterestPenalty;

	/**
	 * 当期本金，单位：元
	 */
	@ApiField("cur_term_principal")
	private String curTermPrincipal;

	/**
	 * 当期本金罚息，单位：元
	 */
	@ApiField("cur_term_principal_penalty")
	private String curTermPrincipalPenalty;

	/**
	 * 当期已还利息，单位：元
	 */
	@ApiField("repaid_interest")
	private String repaidInterest;

	/**
	 * 当期已还利息罚息，单位：元
	 */
	@ApiField("repaid_interest_penalty")
	private String repaidInterestPenalty;

	/**
	 * 当期已还本金，单位：元
	 */
	@ApiField("repaid_principal")
	private String repaidPrincipal;

	/**
	 * 当期已还本金罚息，单位：元
	 */
	@ApiField("repaid_principal_penalty")
	private String repaidPrincipalPenalty;

	/**
	 * 分期状态（NORMAL：正常，OVD：逾期，CLEAR：已结清)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 本期到期日
	 */
	@ApiField("term_end_date")
	private String termEndDate;

	/**
	 * 期次号
	 */
	@ApiField("term_no")
	private Long termNo;

	/**
	 * 本期开始日
	 */
	@ApiField("term_start_date")
	private String termStartDate;

	/**
	 * <p>Getter for the field <code>curTerm</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getCurTerm() {
		return this.curTerm;
	}
	/**
	 * <p>Setter for the field <code>curTerm</code>.</p>
	 *
	 * @param curTerm a {@link java.lang.Boolean} object.
	 */
	public void setCurTerm(Boolean curTerm) {
		this.curTerm = curTerm;
	}

	/**
	 * <p>Getter for the field <code>curTermInterest</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurTermInterest() {
		return this.curTermInterest;
	}
	/**
	 * <p>Setter for the field <code>curTermInterest</code>.</p>
	 *
	 * @param curTermInterest a {@link java.lang.String} object.
	 */
	public void setCurTermInterest(String curTermInterest) {
		this.curTermInterest = curTermInterest;
	}

	/**
	 * <p>Getter for the field <code>curTermInterestPenalty</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurTermInterestPenalty() {
		return this.curTermInterestPenalty;
	}
	/**
	 * <p>Setter for the field <code>curTermInterestPenalty</code>.</p>
	 *
	 * @param curTermInterestPenalty a {@link java.lang.String} object.
	 */
	public void setCurTermInterestPenalty(String curTermInterestPenalty) {
		this.curTermInterestPenalty = curTermInterestPenalty;
	}

	/**
	 * <p>Getter for the field <code>curTermPrincipal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurTermPrincipal() {
		return this.curTermPrincipal;
	}
	/**
	 * <p>Setter for the field <code>curTermPrincipal</code>.</p>
	 *
	 * @param curTermPrincipal a {@link java.lang.String} object.
	 */
	public void setCurTermPrincipal(String curTermPrincipal) {
		this.curTermPrincipal = curTermPrincipal;
	}

	/**
	 * <p>Getter for the field <code>curTermPrincipalPenalty</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurTermPrincipalPenalty() {
		return this.curTermPrincipalPenalty;
	}
	/**
	 * <p>Setter for the field <code>curTermPrincipalPenalty</code>.</p>
	 *
	 * @param curTermPrincipalPenalty a {@link java.lang.String} object.
	 */
	public void setCurTermPrincipalPenalty(String curTermPrincipalPenalty) {
		this.curTermPrincipalPenalty = curTermPrincipalPenalty;
	}

	/**
	 * <p>Getter for the field <code>repaidInterest</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepaidInterest() {
		return this.repaidInterest;
	}
	/**
	 * <p>Setter for the field <code>repaidInterest</code>.</p>
	 *
	 * @param repaidInterest a {@link java.lang.String} object.
	 */
	public void setRepaidInterest(String repaidInterest) {
		this.repaidInterest = repaidInterest;
	}

	/**
	 * <p>Getter for the field <code>repaidInterestPenalty</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepaidInterestPenalty() {
		return this.repaidInterestPenalty;
	}
	/**
	 * <p>Setter for the field <code>repaidInterestPenalty</code>.</p>
	 *
	 * @param repaidInterestPenalty a {@link java.lang.String} object.
	 */
	public void setRepaidInterestPenalty(String repaidInterestPenalty) {
		this.repaidInterestPenalty = repaidInterestPenalty;
	}

	/**
	 * <p>Getter for the field <code>repaidPrincipal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepaidPrincipal() {
		return this.repaidPrincipal;
	}
	/**
	 * <p>Setter for the field <code>repaidPrincipal</code>.</p>
	 *
	 * @param repaidPrincipal a {@link java.lang.String} object.
	 */
	public void setRepaidPrincipal(String repaidPrincipal) {
		this.repaidPrincipal = repaidPrincipal;
	}

	/**
	 * <p>Getter for the field <code>repaidPrincipalPenalty</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepaidPrincipalPenalty() {
		return this.repaidPrincipalPenalty;
	}
	/**
	 * <p>Setter for the field <code>repaidPrincipalPenalty</code>.</p>
	 *
	 * @param repaidPrincipalPenalty a {@link java.lang.String} object.
	 */
	public void setRepaidPrincipalPenalty(String repaidPrincipalPenalty) {
		this.repaidPrincipalPenalty = repaidPrincipalPenalty;
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

	/**
	 * <p>Getter for the field <code>termEndDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTermEndDate() {
		return this.termEndDate;
	}
	/**
	 * <p>Setter for the field <code>termEndDate</code>.</p>
	 *
	 * @param termEndDate a {@link java.lang.String} object.
	 */
	public void setTermEndDate(String termEndDate) {
		this.termEndDate = termEndDate;
	}

	/**
	 * <p>Getter for the field <code>termNo</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTermNo() {
		return this.termNo;
	}
	/**
	 * <p>Setter for the field <code>termNo</code>.</p>
	 *
	 * @param termNo a {@link java.lang.Long} object.
	 */
	public void setTermNo(Long termNo) {
		this.termNo = termNo;
	}

	/**
	 * <p>Getter for the field <code>termStartDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTermStartDate() {
		return this.termStartDate;
	}
	/**
	 * <p>Setter for the field <code>termStartDate</code>.</p>
	 *
	 * @param termStartDate a {@link java.lang.String} object.
	 */
	public void setTermStartDate(String termStartDate) {
		this.termStartDate = termStartDate;
	}

}
