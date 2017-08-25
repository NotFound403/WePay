package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支用还款流水实体
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RepaymentRecords extends AlipayObject {

	private static final long serialVersionUID = 5274151755377583956L;

	/**
	 * 交易时间
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 正常本金利息，单位为元，小数点保留2位
	 */
	@ApiField("interest")
	private String interest;

	/**
	 * 逾期本金利息，单位为元，小数点保留2位
	 */
	@ApiField("overdue_interest")
	private String overdueInterest;

	/**
	 * 逾期利息罚息，单位为元，小数点保留2位
	 */
	@ApiField("overdue_interest_penalty")
	private String overdueInterestPenalty;

	/**
	 * 逾期本金，单位为元，小数点保留2位
	 */
	@ApiField("overdue_principal")
	private String overduePrincipal;

	/**
	 * 逾期本金罚息，单位为元，小数点保留2位
	 */
	@ApiField("overdue_principal_penalty")
	private String overduePrincipalPenalty;

	/**
	 * 正常本金，单位为元，小数点保留2位
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 备注
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * 交易总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

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
	 * <p>Getter for the field <code>interest</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInterest() {
		return this.interest;
	}
	/**
	 * <p>Setter for the field <code>interest</code>.</p>
	 *
	 * @param interest a {@link java.lang.String} object.
	 */
	public void setInterest(String interest) {
		this.interest = interest;
	}

	/**
	 * <p>Getter for the field <code>overdueInterest</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOverdueInterest() {
		return this.overdueInterest;
	}
	/**
	 * <p>Setter for the field <code>overdueInterest</code>.</p>
	 *
	 * @param overdueInterest a {@link java.lang.String} object.
	 */
	public void setOverdueInterest(String overdueInterest) {
		this.overdueInterest = overdueInterest;
	}

	/**
	 * <p>Getter for the field <code>overdueInterestPenalty</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOverdueInterestPenalty() {
		return this.overdueInterestPenalty;
	}
	/**
	 * <p>Setter for the field <code>overdueInterestPenalty</code>.</p>
	 *
	 * @param overdueInterestPenalty a {@link java.lang.String} object.
	 */
	public void setOverdueInterestPenalty(String overdueInterestPenalty) {
		this.overdueInterestPenalty = overdueInterestPenalty;
	}

	/**
	 * <p>Getter for the field <code>overduePrincipal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOverduePrincipal() {
		return this.overduePrincipal;
	}
	/**
	 * <p>Setter for the field <code>overduePrincipal</code>.</p>
	 *
	 * @param overduePrincipal a {@link java.lang.String} object.
	 */
	public void setOverduePrincipal(String overduePrincipal) {
		this.overduePrincipal = overduePrincipal;
	}

	/**
	 * <p>Getter for the field <code>overduePrincipalPenalty</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOverduePrincipalPenalty() {
		return this.overduePrincipalPenalty;
	}
	/**
	 * <p>Setter for the field <code>overduePrincipalPenalty</code>.</p>
	 *
	 * @param overduePrincipalPenalty a {@link java.lang.String} object.
	 */
	public void setOverduePrincipalPenalty(String overduePrincipalPenalty) {
		this.overduePrincipalPenalty = overduePrincipalPenalty;
	}

	/**
	 * <p>Getter for the field <code>principal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrincipal() {
		return this.principal;
	}
	/**
	 * <p>Setter for the field <code>principal</code>.</p>
	 *
	 * @param principal a {@link java.lang.String} object.
	 */
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	/**
	 * <p>Getter for the field <code>remarks</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRemarks() {
		return this.remarks;
	}
	/**
	 * <p>Setter for the field <code>remarks</code>.</p>
	 *
	 * @param remarks a {@link java.lang.String} object.
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * <p>Getter for the field <code>totalAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalAmount() {
		return this.totalAmount;
	}
	/**
	 * <p>Setter for the field <code>totalAmount</code>.</p>
	 *
	 * @param totalAmount a {@link java.lang.String} object.
	 */
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
