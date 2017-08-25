package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 机构代客户还款
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoantradeLoanarRepayModel extends AlipayObject {

	private static final long serialVersionUID = 7234962567653994439L;

	/**
	 * 贷款客户在网商的会员ID
	 */
	@ApiField("cust_iprole_id")
	private String custIproleId;

	/**
	 * 还款日，精确到日，格式为yyyyMMdd，必须是当天
	 */
	@ApiField("date")
	private String date;

	/**
	 * 贷款合约号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/**
	 * 还款本金金额，单位默认为元，支持小数点两位，为了便于传输用合作方将数值型转换为字符串型
	 */
	@ApiField("prin_amt")
	private String prinAmt;

	/**
	 * 外部流水号格式：日期(8位)+序列号(8位）,序列号是数字，如00000001（必须是16位且符合该格式）
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * <p>Getter for the field <code>custIproleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCustIproleId() {
		return this.custIproleId;
	}
	/**
	 * <p>Setter for the field <code>custIproleId</code>.</p>
	 *
	 * @param custIproleId a {@link java.lang.String} object.
	 */
	public void setCustIproleId(String custIproleId) {
		this.custIproleId = custIproleId;
	}

	/**
	 * <p>Getter for the field <code>date</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDate() {
		return this.date;
	}
	/**
	 * <p>Setter for the field <code>date</code>.</p>
	 *
	 * @param date a {@link java.lang.String} object.
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * <p>Getter for the field <code>loanArNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoanArNo() {
		return this.loanArNo;
	}
	/**
	 * <p>Setter for the field <code>loanArNo</code>.</p>
	 *
	 * @param loanArNo a {@link java.lang.String} object.
	 */
	public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}

	/**
	 * <p>Getter for the field <code>prinAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrinAmt() {
		return this.prinAmt;
	}
	/**
	 * <p>Setter for the field <code>prinAmt</code>.</p>
	 *
	 * @param prinAmt a {@link java.lang.String} object.
	 */
	public void setPrinAmt(String prinAmt) {
		this.prinAmt = prinAmt;
	}

	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId() {
		return this.requestId;
	}
	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
