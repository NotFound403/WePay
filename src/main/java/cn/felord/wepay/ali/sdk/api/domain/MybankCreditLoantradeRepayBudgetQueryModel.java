package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 客户主动还款试算
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoantradeRepayBudgetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3881785855776593186L;

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

}
