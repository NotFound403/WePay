package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 客户主动还款申请
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoantradeRepayCustApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5795184639576757622L;

	/**
	 * 申请还款费用（提前还款费除外）
	 */
	@ApiField("apply_repay_fee")
	private String applyRepayFee;

	/**
	 * 申请还款利息
	 */
	@ApiField("apply_repay_int")
	private String applyRepayInt;

	/**
	 * 提前还款费
	 */
	@ApiField("apply_repay_pre_fee")
	private String applyRepayPreFee;

	/**
	 * 申请还款本金
	 */
	@ApiField("apply_repay_prin")
	private String applyRepayPrin;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 银行参与者id，是在网商银行创建会员后生成的id，网商银行会员的唯一标识
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 银行参与者角色id，是在网商银行创建会员后生成的角色id，网商银行会员角色的唯一标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 贷款合约编号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/**
	 * 请求流水号，用于幂等控制.以"ipRoleId_"开头
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * <p>Getter for the field <code>applyRepayFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyRepayFee() {
		return this.applyRepayFee;
	}
	/**
	 * <p>Setter for the field <code>applyRepayFee</code>.</p>
	 *
	 * @param applyRepayFee a {@link java.lang.String} object.
	 */
	public void setApplyRepayFee(String applyRepayFee) {
		this.applyRepayFee = applyRepayFee;
	}

	/**
	 * <p>Getter for the field <code>applyRepayInt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyRepayInt() {
		return this.applyRepayInt;
	}
	/**
	 * <p>Setter for the field <code>applyRepayInt</code>.</p>
	 *
	 * @param applyRepayInt a {@link java.lang.String} object.
	 */
	public void setApplyRepayInt(String applyRepayInt) {
		this.applyRepayInt = applyRepayInt;
	}

	/**
	 * <p>Getter for the field <code>applyRepayPreFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyRepayPreFee() {
		return this.applyRepayPreFee;
	}
	/**
	 * <p>Setter for the field <code>applyRepayPreFee</code>.</p>
	 *
	 * @param applyRepayPreFee a {@link java.lang.String} object.
	 */
	public void setApplyRepayPreFee(String applyRepayPreFee) {
		this.applyRepayPreFee = applyRepayPreFee;
	}

	/**
	 * <p>Getter for the field <code>applyRepayPrin</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyRepayPrin() {
		return this.applyRepayPrin;
	}
	/**
	 * <p>Setter for the field <code>applyRepayPrin</code>.</p>
	 *
	 * @param applyRepayPrin a {@link java.lang.String} object.
	 */
	public void setApplyRepayPrin(String applyRepayPrin) {
		this.applyRepayPrin = applyRepayPrin;
	}

	/**
	 * <p>Getter for the field <code>extData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtData() {
		return this.extData;
	}
	/**
	 * <p>Setter for the field <code>extData</code>.</p>
	 *
	 * @param extData a {@link java.lang.String} object.
	 */
	public void setExtData(String extData) {
		this.extData = extData;
	}

	/**
	 * <p>Getter for the field <code>ipId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpId() {
		return this.ipId;
	}
	/**
	 * <p>Setter for the field <code>ipId</code>.</p>
	 *
	 * @param ipId a {@link java.lang.String} object.
	 */
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	/**
	 * <p>Getter for the field <code>ipRoleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpRoleId() {
		return this.ipRoleId;
	}
	/**
	 * <p>Setter for the field <code>ipRoleId</code>.</p>
	 *
	 * @param ipRoleId a {@link java.lang.String} object.
	 */
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
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
