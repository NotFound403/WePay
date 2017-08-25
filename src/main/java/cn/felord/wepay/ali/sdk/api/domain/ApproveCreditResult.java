package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 审批通过后返回的授信信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ApproveCreditResult extends AlipayObject {

	private static final long serialVersionUID = 5537581872252132673L;

	/**
	 * 费用列表，每个费用对象代码一个收费项； 若费用列表为空或空集合，表示不存在费用定价
	 */
	@ApiListField("charge_info_list")
	@ApiField("loan_charge_info")
	private List<LoanChargeInfo> chargeInfoList;

	/**
	 * 授信金额
	 */
	@ApiField("credit_amt")
	private String creditAmt;

	/**
	 * 授信编号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 授信期限长度，包含单位(年、月、日)
	 */
	@ApiField("credit_term")
	private String creditTerm;

	/**
	 * 授信有效截止日期(日期精度为天,包含截止日)
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 利率
	 */
	@ApiListField("instal_int_rate")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> instalIntRate;

	/**
	 * 贷款期限长度，包含单位(年、月、日)
	 */
	@ApiField("loan_term")
	private String loanTerm;

	/**
	 * 还款方式。若为分段还款，则存储的为分段还款方式的分段值。否则，该list仅含一个元素，为当前的还款方式
	 */
	@ApiListField("repay_modes")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> repayModes;

	/**
	 * 授信有效起始日期(日期精度为天,包含起始日)
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 授信状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>chargeInfoList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<LoanChargeInfo> getChargeInfoList() {
		return this.chargeInfoList;
	}
	/**
	 * <p>Setter for the field <code>chargeInfoList</code>.</p>
	 *
	 * @param chargeInfoList a {@link java.util.List} object.
	 */
	public void setChargeInfoList(List<LoanChargeInfo> chargeInfoList) {
		this.chargeInfoList = chargeInfoList;
	}

	/**
	 * <p>Getter for the field <code>creditAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreditAmt() {
		return this.creditAmt;
	}
	/**
	 * <p>Setter for the field <code>creditAmt</code>.</p>
	 *
	 * @param creditAmt a {@link java.lang.String} object.
	 */
	public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
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
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreditTerm() {
		return this.creditTerm;
	}
	/**
	 * <p>Setter for the field <code>creditTerm</code>.</p>
	 *
	 * @param creditTerm a {@link java.lang.String} object.
	 */
	public void setCreditTerm(String creditTerm) {
		this.creditTerm = creditTerm;
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
	 * <p>Getter for the field <code>instalIntRate</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InstallmentMetaInfo> getInstalIntRate() {
		return this.instalIntRate;
	}
	/**
	 * <p>Setter for the field <code>instalIntRate</code>.</p>
	 *
	 * @param instalIntRate a {@link java.util.List} object.
	 */
	public void setInstalIntRate(List<InstallmentMetaInfo> instalIntRate) {
		this.instalIntRate = instalIntRate;
	}

	/**
	 * <p>Getter for the field <code>loanTerm</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoanTerm() {
		return this.loanTerm;
	}
	/**
	 * <p>Setter for the field <code>loanTerm</code>.</p>
	 *
	 * @param loanTerm a {@link java.lang.String} object.
	 */
	public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}

	/**
	 * <p>Getter for the field <code>repayModes</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InstallmentMetaInfo> getRepayModes() {
		return this.repayModes;
	}
	/**
	 * <p>Setter for the field <code>repayModes</code>.</p>
	 *
	 * @param repayModes a {@link java.util.List} object.
	 */
	public void setRepayModes(List<InstallmentMetaInfo> repayModes) {
		this.repayModes = repayModes;
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
