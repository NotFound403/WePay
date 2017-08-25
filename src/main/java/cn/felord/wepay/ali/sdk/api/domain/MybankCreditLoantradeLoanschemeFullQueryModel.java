package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询客户完整贷款方案
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoantradeLoanschemeFullQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6515452235626717861L;

	/**
	 * 支付宝会员id，支付宝内部用于标识会员的唯一ID，以2088开头，不是支付宝登录账号
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 支用金额，默认单位是人民币，精确到小数点两位，单位元
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 申请支用日期(精度为天)，格式：YYYY-MM-DD，如：2017-01-01
	 */
	@ApiField("apply_date")
	private Date applyDate;

	/**
	 * 固化授信模式下的授信编号，由网商银行内部的系统生成，示例值：20161227BC2343C0000000001。若为预授信，则此值为空。
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 客群，信贷申请领域用来标识客户种类，由网商银行内部系统生成。
	 */
	@ApiField("cust_group")
	private String custGroup;

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
	 * 网商银行在对客户授信时，使用的政策产品唯一标识码，由网商银行内部生成，长度8位，字母和数字组成，示例值：BC32001C
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 贷款期限，数值，在客户签署贷款合约时，会展示此值
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位，枚举值：Y、M、D，分别表示年月日，在客户签署贷款合约时，会展示此值
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 还款方式，枚举值：1（等额本息）、2（等额本金）、3（按期付息到期还本）、4（组合还款）、6（一次性到期还本付息）、7（固定利息等额分期），客户签署贷款合约时会展示此值
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/**
	 * 销售产品码，一个信贷产品对外销售时的唯一标识，由网商银行内部分配，长度20位的一串数字，示例值：01021000100000000169
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 收款账号信息，注意：子参数不能全为空
	 */
	@ApiField("trans_in_account")
	private MyBkAccountVO transInAccount;

	/**
	 * <p>Getter for the field <code>alipayId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayId() {
		return this.alipayId;
	}
	/**
	 * <p>Setter for the field <code>alipayId</code>.</p>
	 *
	 * @param alipayId a {@link java.lang.String} object.
	 */
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	/**
	 * <p>Getter for the field <code>applyAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyAmt() {
		return this.applyAmt;
	}
	/**
	 * <p>Setter for the field <code>applyAmt</code>.</p>
	 *
	 * @param applyAmt a {@link java.lang.String} object.
	 */
	public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}

	/**
	 * <p>Getter for the field <code>applyDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getApplyDate() {
		return this.applyDate;
	}
	/**
	 * <p>Setter for the field <code>applyDate</code>.</p>
	 *
	 * @param applyDate a {@link java.util.Date} object.
	 */
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
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
	 * <p>Getter for the field <code>custGroup</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCustGroup() {
		return this.custGroup;
	}
	/**
	 * <p>Setter for the field <code>custGroup</code>.</p>
	 *
	 * @param custGroup a {@link java.lang.String} object.
	 */
	public void setCustGroup(String custGroup) {
		this.custGroup = custGroup;
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
	 * <p>Getter for the field <code>transInAccount</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MyBkAccountVO} object.
	 */
	public MyBkAccountVO getTransInAccount() {
		return this.transInAccount;
	}
	/**
	 * <p>Setter for the field <code>transInAccount</code>.</p>
	 *
	 * @param transInAccount a {@link cn.felord.wepay.ali.sdk.api.domain.MyBkAccountVO} object.
	 */
	public void setTransInAccount(MyBkAccountVO transInAccount) {
		this.transInAccount = transInAccount;
	}

}
