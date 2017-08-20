package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户还款
 *
 * @author auto create
 * @since 1.0, 2016-08-25 10:32:15
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

	public String getLoanApplyNo() {
		return this.loanApplyNo;
	}
	public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRepayAmt() {
		return this.repayAmt;
	}
	public void setRepayAmt(String repayAmt) {
		this.repayAmt = repayAmt;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

}
