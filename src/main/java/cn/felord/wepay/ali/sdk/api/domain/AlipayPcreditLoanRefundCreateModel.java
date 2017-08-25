package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户还款
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPcreditLoanRefundCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4698313197214855845L;

	/**
	 * 蚂蚁借呗贷款申请编号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/**
	 * 商户还款订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户还款金额
	 */
	@ApiField("repay_amt")
	private String repayAmt;

	/**
	 * 请求流水号，用于控制幂等
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * <p>Getter for the field <code>loanApplyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoanApplyNo() {
		return this.loanApplyNo;
	}
	/**
	 * <p>Setter for the field <code>loanApplyNo</code>.</p>
	 *
	 * @param loanApplyNo a {@link java.lang.String} object.
	 */
	public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
	}

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * <p>Getter for the field <code>repayAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepayAmt() {
		return this.repayAmt;
	}
	/**
	 * <p>Setter for the field <code>repayAmt</code>.</p>
	 *
	 * @param repayAmt a {@link java.lang.String} object.
	 */
	public void setRepayAmt(String repayAmt) {
		this.repayAmt = repayAmt;
	}

	/**
	 * <p>Getter for the field <code>reqId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReqId() {
		return this.reqId;
	}
	/**
	 * <p>Setter for the field <code>reqId</code>.</p>
	 *
	 * @param reqId a {@link java.lang.String} object.
	 */
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

}
