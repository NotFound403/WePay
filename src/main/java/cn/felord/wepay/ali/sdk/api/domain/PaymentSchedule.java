package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支用还款计划（包括虚拟还款和真实还款）
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PaymentSchedule extends AlipayObject {

	private static final long serialVersionUID = 6842356183897785647L;

	/**
	 * 还款日
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 已还利息总和，单位为元，小数点保留2位
	 */
	@ApiField("repaid_interest_total")
	private String repaidInterestTotal;

	/**
	 * 已还罚息总和，单位为元，小数点保留2位
	 */
	@ApiField("repaid_penalty_total")
	private String repaidPenaltyTotal;

	/**
	 * 已还本金总和，单位为元，小数点保留2位
	 */
	@ApiField("repaid_principal_total")
	private String repaidPrincipalTotal;

	/**
	 * 期初时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 期次
	 */
	@ApiField("term")
	private Long term;

	/**
	 * 应还利息总和，单位为元，小数点保留2位
	 */
	@ApiField("unpaid_interest_total")
	private String unpaidInterestTotal;

	/**
	 * 应还罚息总和，单位为元，小数点保留2位
	 */
	@ApiField("unpaid_penalty_total")
	private String unpaidPenaltyTotal;

	/**
	 * 应还本金总和，单位为元，小数点保留2位
	 */
	@ApiField("unpaid_principal_total")
	private String unpaidPrincipalTotal;

	/**
	 * <p>Getter for the field <code>date</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getDate() {
		return this.date;
	}
	/**
	 * <p>Setter for the field <code>date</code>.</p>
	 *
	 * @param date a {@link java.util.Date} object.
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * <p>Getter for the field <code>repaidInterestTotal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepaidInterestTotal() {
		return this.repaidInterestTotal;
	}
	/**
	 * <p>Setter for the field <code>repaidInterestTotal</code>.</p>
	 *
	 * @param repaidInterestTotal a {@link java.lang.String} object.
	 */
	public void setRepaidInterestTotal(String repaidInterestTotal) {
		this.repaidInterestTotal = repaidInterestTotal;
	}

	/**
	 * <p>Getter for the field <code>repaidPenaltyTotal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepaidPenaltyTotal() {
		return this.repaidPenaltyTotal;
	}
	/**
	 * <p>Setter for the field <code>repaidPenaltyTotal</code>.</p>
	 *
	 * @param repaidPenaltyTotal a {@link java.lang.String} object.
	 */
	public void setRepaidPenaltyTotal(String repaidPenaltyTotal) {
		this.repaidPenaltyTotal = repaidPenaltyTotal;
	}

	/**
	 * <p>Getter for the field <code>repaidPrincipalTotal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepaidPrincipalTotal() {
		return this.repaidPrincipalTotal;
	}
	/**
	 * <p>Setter for the field <code>repaidPrincipalTotal</code>.</p>
	 *
	 * @param repaidPrincipalTotal a {@link java.lang.String} object.
	 */
	public void setRepaidPrincipalTotal(String repaidPrincipalTotal) {
		this.repaidPrincipalTotal = repaidPrincipalTotal;
	}

	/**
	 * <p>Getter for the field <code>startDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartDate() {
		return this.startDate;
	}
	/**
	 * <p>Setter for the field <code>startDate</code>.</p>
	 *
	 * @param startDate a {@link java.util.Date} object.
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * <p>Getter for the field <code>term</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTerm() {
		return this.term;
	}
	/**
	 * <p>Setter for the field <code>term</code>.</p>
	 *
	 * @param term a {@link java.lang.Long} object.
	 */
	public void setTerm(Long term) {
		this.term = term;
	}

	/**
	 * <p>Getter for the field <code>unpaidInterestTotal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUnpaidInterestTotal() {
		return this.unpaidInterestTotal;
	}
	/**
	 * <p>Setter for the field <code>unpaidInterestTotal</code>.</p>
	 *
	 * @param unpaidInterestTotal a {@link java.lang.String} object.
	 */
	public void setUnpaidInterestTotal(String unpaidInterestTotal) {
		this.unpaidInterestTotal = unpaidInterestTotal;
	}

	/**
	 * <p>Getter for the field <code>unpaidPenaltyTotal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUnpaidPenaltyTotal() {
		return this.unpaidPenaltyTotal;
	}
	/**
	 * <p>Setter for the field <code>unpaidPenaltyTotal</code>.</p>
	 *
	 * @param unpaidPenaltyTotal a {@link java.lang.String} object.
	 */
	public void setUnpaidPenaltyTotal(String unpaidPenaltyTotal) {
		this.unpaidPenaltyTotal = unpaidPenaltyTotal;
	}

	/**
	 * <p>Getter for the field <code>unpaidPrincipalTotal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUnpaidPrincipalTotal() {
		return this.unpaidPrincipalTotal;
	}
	/**
	 * <p>Setter for the field <code>unpaidPrincipalTotal</code>.</p>
	 *
	 * @param unpaidPrincipalTotal a {@link java.lang.String} object.
	 */
	public void setUnpaidPrincipalTotal(String unpaidPrincipalTotal) {
		this.unpaidPrincipalTotal = unpaidPrincipalTotal;
	}

}
