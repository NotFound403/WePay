package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 授信结果,每一笔授信编号对应的一笔授信结果；主要提供ISV查看
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CreditResult extends AlipayObject {

	private static final long serialVersionUID = 6178719283126564952L;

	/**
	 * 授信金额
	 */
	@ApiField("credit_line")
	private String creditLine;

	/**
	 * 授信编号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 一笔授信规定的从开始到结束的周期，例如12个月，30天等。
	 */
	@ApiField("credit_term")
	private Long creditTerm;

	/**
	 * 年、月、日
	 */
	@ApiField("credit_term_unit")
	private String creditTermUnit;

	/**
	 * 当贷款机构给客户一个可使用的授信时，只有在某一个日期之后客户才能使用，这个日期就是授信使用生效日期。
	 */
	@ApiField("effective_date")
	private Date effectiveDate;

	/**
	 * 当贷款机构给客户一个可使用的授信时，客户必须要在某一个日期之前必须支用，否则此笔授信就会失效。
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 技术服务费
	 */
	@ApiField("fee_rate")
	private String feeRate;

	/**
	 * 贷款利率
	 */
	@ApiField("interest_rate")
	private String interestRate;

	/**
	 * 一笔授信支用规定的从开始到结束的周期，例如12个月，30天等。
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 年、月、日
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 还款方式，例如等额本息
	 */
	@ApiField("repayment_mode")
	private String repaymentMode;

	/**
	 * <p>Getter for the field <code>creditLine</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreditLine() {
		return this.creditLine;
	}
	/**
	 * <p>Setter for the field <code>creditLine</code>.</p>
	 *
	 * @param creditLine a {@link java.lang.String} object.
	 */
	public void setCreditLine(String creditLine) {
		this.creditLine = creditLine;
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
	 * <p>Getter for the field <code>creditTerm</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCreditTerm() {
		return this.creditTerm;
	}
	/**
	 * <p>Setter for the field <code>creditTerm</code>.</p>
	 *
	 * @param creditTerm a {@link java.lang.Long} object.
	 */
	public void setCreditTerm(Long creditTerm) {
		this.creditTerm = creditTerm;
	}

	/**
	 * <p>Getter for the field <code>creditTermUnit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreditTermUnit() {
		return this.creditTermUnit;
	}
	/**
	 * <p>Setter for the field <code>creditTermUnit</code>.</p>
	 *
	 * @param creditTermUnit a {@link java.lang.String} object.
	 */
	public void setCreditTermUnit(String creditTermUnit) {
		this.creditTermUnit = creditTermUnit;
	}

	/**
	 * <p>Getter for the field <code>effectiveDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEffectiveDate() {
		return this.effectiveDate;
	}
	/**
	 * <p>Setter for the field <code>effectiveDate</code>.</p>
	 *
	 * @param effectiveDate a {@link java.util.Date} object.
	 */
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/**
	 * <p>Getter for the field <code>expireDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getExpireDate() {
		return this.expireDate;
	}
	/**
	 * <p>Setter for the field <code>expireDate</code>.</p>
	 *
	 * @param expireDate a {@link java.util.Date} object.
	 */
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	/**
	 * <p>Getter for the field <code>feeRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFeeRate() {
		return this.feeRate;
	}
	/**
	 * <p>Setter for the field <code>feeRate</code>.</p>
	 *
	 * @param feeRate a {@link java.lang.String} object.
	 */
	public void setFeeRate(String feeRate) {
		this.feeRate = feeRate;
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
	 * <p>Getter for the field <code>repaymentMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepaymentMode() {
		return this.repaymentMode;
	}
	/**
	 * <p>Setter for the field <code>repaymentMode</code>.</p>
	 *
	 * @param repaymentMode a {@link java.lang.String} object.
	 */
	public void setRepaymentMode(String repaymentMode) {
		this.repaymentMode = repaymentMode;
	}

}
