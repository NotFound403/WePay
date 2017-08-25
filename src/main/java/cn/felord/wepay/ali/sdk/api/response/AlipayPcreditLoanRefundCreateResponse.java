package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.refund.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPcreditLoanRefundCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8757761784723397666L;

	/** 
	 * 受理的还款申请单号
	 */
	@ApiField("loan_repay_no")
	private String loanRepayNo;

	/**
	 * <p>Setter for the field <code>loanRepayNo</code>.</p>
	 *
	 * @param loanRepayNo a {@link java.lang.String} object.
	 */
	public void setLoanRepayNo(String loanRepayNo) {
		this.loanRepayNo = loanRepayNo;
	}
	/**
	 * <p>Getter for the field <code>loanRepayNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoanRepayNo( ) {
		return this.loanRepayNo;
	}

}
