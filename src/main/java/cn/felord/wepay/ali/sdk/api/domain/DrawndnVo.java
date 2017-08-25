package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支用数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DrawndnVo extends AlipayObject {

	private static final long serialVersionUID = 6199411496622758793L;

	/**
	 * 实收利息，单位为元，小数点保留2位
	 */
	@ApiField("actual_collected_interest")
	private String actualCollectedInterest;

	/**
	 * 贷款余额(本金余额)
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 已收本息，单位为元，小数点保留2位
	 */
	@ApiField("collected_principal_and_interest")
	private String collectedPrincipalAndInterest;

	/**
	 * 授信编号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 支用日,这里代表的是客户这笔支用放款成功日期，如果支用还在放款中或者支用放款失败等，则该值为空
	 */
	@ApiField("drawndn_date")
	private Date drawndnDate;

	/**
	 * 支用编号，代表一笔支用的唯一编号
	 */
	@ApiField("drawndn_no")
	private String drawndnNo;

	/**
	 * 到期日
	 */
	@ApiField("due_date")
	private Date dueDate;

	/**
	 * 五级分类，值类型：NORMAL（正常）、ATTENTION（关注）、SUBPRIME（次级）、DOUBTFUL（可疑）、LOSSES（损失）
	 */
	@ApiField("five_tier_classification")
	private String fiveTierClassification;

	/**
	 * 正常利息，单位为元，小数点保留2位
	 */
	@ApiField("interest")
	private String interest;

	/**
	 * 年利率，小数点保留2位
	 */
	@ApiField("interest_rate")
	private String interestRate;

	/**
	 * 贷款发放额，单位为元，小数点保留2位
	 */
	@ApiField("lending_amount")
	private String lendingAmount;

	/**
	 * 当前逾期期次
	 */
	@ApiField("overduce_terms")
	private Long overduceTerms;

	/**
	 * 当前逾期天数
	 */
	@ApiField("overdue_days")
	private Long overdueDays;

	/**
	 * 逾期利息，单位为元，小数点保留2位
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
	 * 支用状态 ,值类型：INIT(初始),LENDING(发放中),NORMAL(正常),OVD(逾期), CLEAR(结清),OFF(核销), LENDFAIL(发放失败)
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>actualCollectedInterest</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActualCollectedInterest() {
		return this.actualCollectedInterest;
	}
	/**
	 * <p>Setter for the field <code>actualCollectedInterest</code>.</p>
	 *
	 * @param actualCollectedInterest a {@link java.lang.String} object.
	 */
	public void setActualCollectedInterest(String actualCollectedInterest) {
		this.actualCollectedInterest = actualCollectedInterest;
	}

	/**
	 * <p>Getter for the field <code>balance</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBalance() {
		return this.balance;
	}
	/**
	 * <p>Setter for the field <code>balance</code>.</p>
	 *
	 * @param balance a {@link java.lang.String} object.
	 */
	public void setBalance(String balance) {
		this.balance = balance;
	}

	/**
	 * <p>Getter for the field <code>collectedPrincipalAndInterest</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCollectedPrincipalAndInterest() {
		return this.collectedPrincipalAndInterest;
	}
	/**
	 * <p>Setter for the field <code>collectedPrincipalAndInterest</code>.</p>
	 *
	 * @param collectedPrincipalAndInterest a {@link java.lang.String} object.
	 */
	public void setCollectedPrincipalAndInterest(String collectedPrincipalAndInterest) {
		this.collectedPrincipalAndInterest = collectedPrincipalAndInterest;
	}

	/**
	 * <p>Getter for the field <code>creditNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreditNo() {
		return this.creditNo;
	}
	/**
	 * <p>Setter for the field <code>creditNo</code>.</p>
	 *
	 * @param creditNo a {@link java.lang.String} object.
	 */
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

	/**
	 * <p>Getter for the field <code>drawndnDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getDrawndnDate() {
		return this.drawndnDate;
	}
	/**
	 * <p>Setter for the field <code>drawndnDate</code>.</p>
	 *
	 * @param drawndnDate a {@link java.util.Date} object.
	 */
	public void setDrawndnDate(Date drawndnDate) {
		this.drawndnDate = drawndnDate;
	}

	/**
	 * <p>Getter for the field <code>drawndnNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDrawndnNo() {
		return this.drawndnNo;
	}
	/**
	 * <p>Setter for the field <code>drawndnNo</code>.</p>
	 *
	 * @param drawndnNo a {@link java.lang.String} object.
	 */
	public void setDrawndnNo(String drawndnNo) {
		this.drawndnNo = drawndnNo;
	}

	/**
	 * <p>Getter for the field <code>dueDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getDueDate() {
		return this.dueDate;
	}
	/**
	 * <p>Setter for the field <code>dueDate</code>.</p>
	 *
	 * @param dueDate a {@link java.util.Date} object.
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * <p>Getter for the field <code>fiveTierClassification</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFiveTierClassification() {
		return this.fiveTierClassification;
	}
	/**
	 * <p>Setter for the field <code>fiveTierClassification</code>.</p>
	 *
	 * @param fiveTierClassification a {@link java.lang.String} object.
	 */
	public void setFiveTierClassification(String fiveTierClassification) {
		this.fiveTierClassification = fiveTierClassification;
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
	 * <p>Getter for the field <code>interestRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInterestRate() {
		return this.interestRate;
	}
	/**
	 * <p>Setter for the field <code>interestRate</code>.</p>
	 *
	 * @param interestRate a {@link java.lang.String} object.
	 */
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * <p>Getter for the field <code>lendingAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLendingAmount() {
		return this.lendingAmount;
	}
	/**
	 * <p>Setter for the field <code>lendingAmount</code>.</p>
	 *
	 * @param lendingAmount a {@link java.lang.String} object.
	 */
	public void setLendingAmount(String lendingAmount) {
		this.lendingAmount = lendingAmount;
	}

	/**
	 * <p>Getter for the field <code>overduceTerms</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getOverduceTerms() {
		return this.overduceTerms;
	}
	/**
	 * <p>Setter for the field <code>overduceTerms</code>.</p>
	 *
	 * @param overduceTerms a {@link java.lang.Long} object.
	 */
	public void setOverduceTerms(Long overduceTerms) {
		this.overduceTerms = overduceTerms;
	}

	/**
	 * <p>Getter for the field <code>overdueDays</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getOverdueDays() {
		return this.overdueDays;
	}
	/**
	 * <p>Setter for the field <code>overdueDays</code>.</p>
	 *
	 * @param overdueDays a {@link java.lang.Long} object.
	 */
	public void setOverdueDays(Long overdueDays) {
		this.overdueDays = overdueDays;
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
