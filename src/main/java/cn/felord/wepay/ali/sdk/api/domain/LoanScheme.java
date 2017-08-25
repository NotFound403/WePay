package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 贷款方案
 *
 * @author auto create
 * @version $Id: $Id
 */
public class LoanScheme extends AlipayObject {

	private static final long serialVersionUID = 6825386229525426639L;

	/**
	 * 授信有效截止日期(日期精度为天,包含截止日)
	 */
	@ApiField("credit_expire_date")
	private Date creditExpireDate;

	/**
	 * 授信额度，默认人民币，精确到小数点两位，单位元
	 */
	@ApiField("credit_lmt_amt")
	private String creditLmtAmt;

	/**
	 * 授信编号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 授信方式
	 */
	@ApiField("credit_source")
	private String creditSource;

	/**
	 * 授信有效起始日期(日期精度为天,包含起始日)
	 */
	@ApiField("credit_start_date")
	private Date creditStartDate;

	/**
	 * 利率. 年利率小数
	 */
	@ApiField("int_rate")
	private String intRate;

	/**
	 * BC政策码
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 贷款期限
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 可贷额度，默认人民币，精确到小数点两位，单位元
	 */
	@ApiField("loanable_amt")
	private String loanableAmt;

	/**
	 * 统一还款日，若无统一还款日，则为空
	 */
	@ApiField("repay_day")
	private Long repayDay;

	/**
	 * 还款方式
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 销售产品版本
	 */
	@ApiField("sale_pd_version")
	private String salePdVersion;

	/**
	 * <p>Getter for the field <code>creditExpireDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getCreditExpireDate() {
		return this.creditExpireDate;
	}
	/**
	 * <p>Setter for the field <code>creditExpireDate</code>.</p>
	 *
	 * @param creditExpireDate a {@link java.util.Date} object.
	 */
	public void setCreditExpireDate(Date creditExpireDate) {
		this.creditExpireDate = creditExpireDate;
	}

	/**
	 * <p>Getter for the field <code>creditLmtAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreditLmtAmt() {
		return this.creditLmtAmt;
	}
	/**
	 * <p>Setter for the field <code>creditLmtAmt</code>.</p>
	 *
	 * @param creditLmtAmt a {@link java.lang.String} object.
	 */
	public void setCreditLmtAmt(String creditLmtAmt) {
		this.creditLmtAmt = creditLmtAmt;
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
	 * <p>Getter for the field <code>creditSource</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreditSource() {
		return this.creditSource;
	}
	/**
	 * <p>Setter for the field <code>creditSource</code>.</p>
	 *
	 * @param creditSource a {@link java.lang.String} object.
	 */
	public void setCreditSource(String creditSource) {
		this.creditSource = creditSource;
	}

	/**
	 * <p>Getter for the field <code>creditStartDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getCreditStartDate() {
		return this.creditStartDate;
	}
	/**
	 * <p>Setter for the field <code>creditStartDate</code>.</p>
	 *
	 * @param creditStartDate a {@link java.util.Date} object.
	 */
	public void setCreditStartDate(Date creditStartDate) {
		this.creditStartDate = creditStartDate;
	}

	/**
	 * <p>Getter for the field <code>intRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIntRate() {
		return this.intRate;
	}
	/**
	 * <p>Setter for the field <code>intRate</code>.</p>
	 *
	 * @param intRate a {@link java.lang.String} object.
	 */
	public void setIntRate(String intRate) {
		this.intRate = intRate;
	}

	/**
	 * <p>Getter for the field <code>loanPolicyCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoanPolicyCode() {
		return this.loanPolicyCode;
	}
	/**
	 * <p>Setter for the field <code>loanPolicyCode</code>.</p>
	 *
	 * @param loanPolicyCode a {@link java.lang.String} object.
	 */
	public void setLoanPolicyCode(String loanPolicyCode) {
		this.loanPolicyCode = loanPolicyCode;
	}

	/**
	 * <p>Getter for the field <code>loanTerm</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getLoanTerm() {
		return this.loanTerm;
	}
	/**
	 * <p>Setter for the field <code>loanTerm</code>.</p>
	 *
	 * @param loanTerm a {@link java.lang.Long} object.
	 */
	public void setLoanTerm(Long loanTerm) {
		this.loanTerm = loanTerm;
	}

	/**
	 * <p>Getter for the field <code>loanTermUnit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoanTermUnit() {
		return this.loanTermUnit;
	}
	/**
	 * <p>Setter for the field <code>loanTermUnit</code>.</p>
	 *
	 * @param loanTermUnit a {@link java.lang.String} object.
	 */
	public void setLoanTermUnit(String loanTermUnit) {
		this.loanTermUnit = loanTermUnit;
	}

	/**
	 * <p>Getter for the field <code>loanableAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoanableAmt() {
		return this.loanableAmt;
	}
	/**
	 * <p>Setter for the field <code>loanableAmt</code>.</p>
	 *
	 * @param loanableAmt a {@link java.lang.String} object.
	 */
	public void setLoanableAmt(String loanableAmt) {
		this.loanableAmt = loanableAmt;
	}

	/**
	 * <p>Getter for the field <code>repayDay</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRepayDay() {
		return this.repayDay;
	}
	/**
	 * <p>Setter for the field <code>repayDay</code>.</p>
	 *
	 * @param repayDay a {@link java.lang.Long} object.
	 */
	public void setRepayDay(Long repayDay) {
		this.repayDay = repayDay;
	}

	/**
	 * <p>Getter for the field <code>repayMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepayMode() {
		return this.repayMode;
	}
	/**
	 * <p>Setter for the field <code>repayMode</code>.</p>
	 *
	 * @param repayMode a {@link java.lang.String} object.
	 */
	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}

	/**
	 * <p>Getter for the field <code>salePdCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSalePdCode() {
		return this.salePdCode;
	}
	/**
	 * <p>Setter for the field <code>salePdCode</code>.</p>
	 *
	 * @param salePdCode a {@link java.lang.String} object.
	 */
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

	/**
	 * <p>Getter for the field <code>salePdVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSalePdVersion() {
		return this.salePdVersion;
	}
	/**
	 * <p>Setter for the field <code>salePdVersion</code>.</p>
	 *
	 * @param salePdVersion a {@link java.lang.String} object.
	 */
	public void setSalePdVersion(String salePdVersion) {
		this.salePdVersion = salePdVersion;
	}

}
