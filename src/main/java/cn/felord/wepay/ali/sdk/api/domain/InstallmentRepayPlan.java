package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 开放平台查询得到的每期还款计划
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InstallmentRepayPlan extends AlipayObject {

	private static final long serialVersionUID = 4743897727148483581L;

	/**
	 * 是否是当期 ?? 默认值为不是当期计划。如果合约最后一期计划都已经逾期，就不再存在当期计划，合约下所有计划明细的该值都为false
	 */
	@ApiField("cur_term")
	private Boolean curTerm;

	/**
	 * 当期已还利息
	 */
	@ApiField("paid_int_bal")
	private String paidIntBal;

	/**
	 * 当期已还本金
	 */
	@ApiField("paid_prin_bal")
	private String paidPrinBal;

	/**
	 * 分期状态（NORMAL：正常，OVD：逾期，CLEAR：已结清)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 本期到期日
	 */
	@ApiField("term_end_date")
	private Date termEndDate;

	/**
	 * 期次号
	 */
	@ApiField("term_no")
	private Long termNo;

	/**
	 * 当期利息
	 */
	@ApiField("term_nom_int")
	private String termNomInt;

	/**
	 * 当期本金
	 */
	@ApiField("term_nom_prin")
	private String termNomPrin;

	/**
	 * 当期已还利息罚息
	 */
	@ApiField("term_ovd_int")
	private String termOvdInt;

	/**
	 * 当期利息罚息
	 */
	@ApiField("term_ovd_int_pen_int")
	private String termOvdIntPenInt;

	/**
	 * 当期已还本金罚息
	 */
	@ApiField("term_ovd_prin")
	private String termOvdPrin;

	/**
	 * 当期本金罚息
	 */
	@ApiField("term_ovd_prin_pen_int")
	private String termOvdPrinPenInt;

	/**
	 * 本期开始日
	 */
	@ApiField("term_start_date")
	private Date termStartDate;

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
	 * <p>Getter for the field <code>paidIntBal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaidIntBal() {
		return this.paidIntBal;
	}
	/**
	 * <p>Setter for the field <code>paidIntBal</code>.</p>
	 *
	 * @param paidIntBal a {@link java.lang.String} object.
	 */
	public void setPaidIntBal(String paidIntBal) {
		this.paidIntBal = paidIntBal;
	}

	/**
	 * <p>Getter for the field <code>paidPrinBal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaidPrinBal() {
		return this.paidPrinBal;
	}
	/**
	 * <p>Setter for the field <code>paidPrinBal</code>.</p>
	 *
	 * @param paidPrinBal a {@link java.lang.String} object.
	 */
	public void setPaidPrinBal(String paidPrinBal) {
		this.paidPrinBal = paidPrinBal;
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
	 * @return a {@link java.util.Date} object.
	 */
	public Date getTermEndDate() {
		return this.termEndDate;
	}
	/**
	 * <p>Setter for the field <code>termEndDate</code>.</p>
	 *
	 * @param termEndDate a {@link java.util.Date} object.
	 */
	public void setTermEndDate(Date termEndDate) {
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
	 * <p>Getter for the field <code>termNomInt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTermNomInt() {
		return this.termNomInt;
	}
	/**
	 * <p>Setter for the field <code>termNomInt</code>.</p>
	 *
	 * @param termNomInt a {@link java.lang.String} object.
	 */
	public void setTermNomInt(String termNomInt) {
		this.termNomInt = termNomInt;
	}

	/**
	 * <p>Getter for the field <code>termNomPrin</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTermNomPrin() {
		return this.termNomPrin;
	}
	/**
	 * <p>Setter for the field <code>termNomPrin</code>.</p>
	 *
	 * @param termNomPrin a {@link java.lang.String} object.
	 */
	public void setTermNomPrin(String termNomPrin) {
		this.termNomPrin = termNomPrin;
	}

	/**
	 * <p>Getter for the field <code>termOvdInt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTermOvdInt() {
		return this.termOvdInt;
	}
	/**
	 * <p>Setter for the field <code>termOvdInt</code>.</p>
	 *
	 * @param termOvdInt a {@link java.lang.String} object.
	 */
	public void setTermOvdInt(String termOvdInt) {
		this.termOvdInt = termOvdInt;
	}

	/**
	 * <p>Getter for the field <code>termOvdIntPenInt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTermOvdIntPenInt() {
		return this.termOvdIntPenInt;
	}
	/**
	 * <p>Setter for the field <code>termOvdIntPenInt</code>.</p>
	 *
	 * @param termOvdIntPenInt a {@link java.lang.String} object.
	 */
	public void setTermOvdIntPenInt(String termOvdIntPenInt) {
		this.termOvdIntPenInt = termOvdIntPenInt;
	}

	/**
	 * <p>Getter for the field <code>termOvdPrin</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTermOvdPrin() {
		return this.termOvdPrin;
	}
	/**
	 * <p>Setter for the field <code>termOvdPrin</code>.</p>
	 *
	 * @param termOvdPrin a {@link java.lang.String} object.
	 */
	public void setTermOvdPrin(String termOvdPrin) {
		this.termOvdPrin = termOvdPrin;
	}

	/**
	 * <p>Getter for the field <code>termOvdPrinPenInt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTermOvdPrinPenInt() {
		return this.termOvdPrinPenInt;
	}
	/**
	 * <p>Setter for the field <code>termOvdPrinPenInt</code>.</p>
	 *
	 * @param termOvdPrinPenInt a {@link java.lang.String} object.
	 */
	public void setTermOvdPrinPenInt(String termOvdPrinPenInt) {
		this.termOvdPrinPenInt = termOvdPrinPenInt;
	}

	/**
	 * <p>Getter for the field <code>termStartDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getTermStartDate() {
		return this.termStartDate;
	}
	/**
	 * <p>Setter for the field <code>termStartDate</code>.</p>
	 *
	 * @param termStartDate a {@link java.util.Date} object.
	 */
	public void setTermStartDate(Date termStartDate) {
		this.termStartDate = termStartDate;
	}

}
