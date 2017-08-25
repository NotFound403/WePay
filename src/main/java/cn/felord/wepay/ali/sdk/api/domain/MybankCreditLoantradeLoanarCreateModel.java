package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 机构代客户签署合约并放款
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoantradeLoanarCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2684133525463215756L;

	/**
	 * 收款账号外标
对于支付宝账户，支付宝loginId；
对于网商银行账户，是虚拟卡号；
对于外部银行卡，是银行卡号
	 */
	@ApiField("account_ext_no")
	private String accountExtNo;

	/**
	 * 收款方参与机构码，当收款账户为网商银行或外部银行时填充，即银行联行号（总行）
	 */
	@ApiField("account_fin_code")
	private String accountFinCode;

	/**
	 * 收款方机构名称
	 */
	@ApiField("account_fin_name")
	private String accountFinName;

	/**
	 * 帐户类别，对公/对私，枚举值如下：
1：对私 
2：对公
	 */
	@ApiField("account_fin_type")
	private String accountFinType;

	/**
	 * 收款方名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 收款方账户号
对于支付宝账户，是支付宝会员id；
对于网商银行账户，是资金账号id；
对于外部银行卡，是银行卡号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 收款方账户类型，枚举值有：
ALIPAY（支付宝）
MY_BANK（网商银行）
OUT_BANK（外部银行）
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 本次发起支用的客户支付宝会员id，客户登录系统后由外部机构传入
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 支用金额，默认人民币，精确到小数点两位，单位元
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 外部业务单据号，在外部机构上发生的交易编号，如在菜鸟供销平台上发生的采购单的业务编号
	 */
	@ApiField("bsn_no")
	private String bsnNo;

	/**
	 * 本次支用的授信编号，网商银行审批通过后回传给外部机构，然后由外部机构传入
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 客户群体，由网商银行事先分配给客户机构
	 */
	@ApiField("cust_group")
	private String custGroup;

	/**
	 * 放款账户渠道，从贷款方案查询接口获取
DEFAULT_ALIPAY 默认支付宝
ASSIGNED_ACCOUNT 定向支付账户
MYBANK_ACCOUNT 网商银行二类户
	 */
	@ApiField("grant_channel")
	private String grantChannel;

	/**
	 * 经营行业，枚举值如下：
F5199：零售
H6190：餐饮住宿
L7299：商业服务
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 网商银行参与者id，外部机构调用创建网商会员接口获取，参见接口：mybank.credit.user.role.create
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 网商银行参与者会员角色ID，外部机构调用创建网商会员接口获取，参见接口：mybank.credit.user.role.create
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 本次支用的授信对应的BC政策码，由网商银行事先分配给外部机构
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 贷款期限
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位，枚举值：
Y：年
M：月
D：日
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 客户签约的销售产品编码，由网商银行事先分配给外部机构
	 */
	@ApiField("pd_code")
	private String pdCode;

	/**
	 * 客户签约的销售产品版本号，通过调用完整贷款方案（mybank.credit.loantrade.loanscheme.full.query）查询接口获取
	 */
	@ApiField("pd_version")
	private String pdVersion;

	/**
	 * 还款方式，枚举值如下：
1：等额本息
2：等额本金
3：按期付息到期还本
4：组合还款
6：一次性到期还本付息
7：固定利息等额分期
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/**
	 * 单次请求唯一流水号，用于幂等控制
结构为：客户机构ipRoleId_时间（日期、时分秒）_外部系统流水号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 签名值
	 */
	@ApiField("sign")
	private String sign;

	/**
	 * 交易备注
	 */
	@ApiField("trans_memo")
	private String transMemo;

	/**
	 * <p>Getter for the field <code>accountExtNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountExtNo() {
		return this.accountExtNo;
	}
	/**
	 * <p>Setter for the field <code>accountExtNo</code>.</p>
	 *
	 * @param accountExtNo a {@link java.lang.String} object.
	 */
	public void setAccountExtNo(String accountExtNo) {
		this.accountExtNo = accountExtNo;
	}

	/**
	 * <p>Getter for the field <code>accountFinCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountFinCode() {
		return this.accountFinCode;
	}
	/**
	 * <p>Setter for the field <code>accountFinCode</code>.</p>
	 *
	 * @param accountFinCode a {@link java.lang.String} object.
	 */
	public void setAccountFinCode(String accountFinCode) {
		this.accountFinCode = accountFinCode;
	}

	/**
	 * <p>Getter for the field <code>accountFinName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountFinName() {
		return this.accountFinName;
	}
	/**
	 * <p>Setter for the field <code>accountFinName</code>.</p>
	 *
	 * @param accountFinName a {@link java.lang.String} object.
	 */
	public void setAccountFinName(String accountFinName) {
		this.accountFinName = accountFinName;
	}

	/**
	 * <p>Getter for the field <code>accountFinType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountFinType() {
		return this.accountFinType;
	}
	/**
	 * <p>Setter for the field <code>accountFinType</code>.</p>
	 *
	 * @param accountFinType a {@link java.lang.String} object.
	 */
	public void setAccountFinType(String accountFinType) {
		this.accountFinType = accountFinType;
	}

	/**
	 * <p>Getter for the field <code>accountName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountName() {
		return this.accountName;
	}
	/**
	 * <p>Setter for the field <code>accountName</code>.</p>
	 *
	 * @param accountName a {@link java.lang.String} object.
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * <p>Getter for the field <code>accountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountNo() {
		return this.accountNo;
	}
	/**
	 * <p>Setter for the field <code>accountNo</code>.</p>
	 *
	 * @param accountNo a {@link java.lang.String} object.
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * <p>Getter for the field <code>accountType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountType() {
		return this.accountType;
	}
	/**
	 * <p>Setter for the field <code>accountType</code>.</p>
	 *
	 * @param accountType a {@link java.lang.String} object.
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

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
	 * <p>Getter for the field <code>bsnNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBsnNo() {
		return this.bsnNo;
	}
	/**
	 * <p>Setter for the field <code>bsnNo</code>.</p>
	 *
	 * @param bsnNo a {@link java.lang.String} object.
	 */
	public void setBsnNo(String bsnNo) {
		this.bsnNo = bsnNo;
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
	 * <p>Getter for the field <code>grantChannel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGrantChannel() {
		return this.grantChannel;
	}
	/**
	 * <p>Setter for the field <code>grantChannel</code>.</p>
	 *
	 * @param grantChannel a {@link java.lang.String} object.
	 */
	public void setGrantChannel(String grantChannel) {
		this.grantChannel = grantChannel;
	}

	/**
	 * <p>Getter for the field <code>industry</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIndustry() {
		return this.industry;
	}
	/**
	 * <p>Setter for the field <code>industry</code>.</p>
	 *
	 * @param industry a {@link java.lang.String} object.
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
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
	 * <p>Getter for the field <code>pdCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPdCode() {
		return this.pdCode;
	}
	/**
	 * <p>Setter for the field <code>pdCode</code>.</p>
	 *
	 * @param pdCode a {@link java.lang.String} object.
	 */
	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}

	/**
	 * <p>Getter for the field <code>pdVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPdVersion() {
		return this.pdVersion;
	}
	/**
	 * <p>Setter for the field <code>pdVersion</code>.</p>
	 *
	 * @param pdVersion a {@link java.lang.String} object.
	 */
	public void setPdVersion(String pdVersion) {
		this.pdVersion = pdVersion;
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

	/**
	 * <p>Getter for the field <code>sign</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSign() {
		return this.sign;
	}
	/**
	 * <p>Setter for the field <code>sign</code>.</p>
	 *
	 * @param sign a {@link java.lang.String} object.
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * <p>Getter for the field <code>transMemo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransMemo() {
		return this.transMemo;
	}
	/**
	 * <p>Setter for the field <code>transMemo</code>.</p>
	 *
	 * @param transMemo a {@link java.lang.String} object.
	 */
	public void setTransMemo(String transMemo) {
		this.transMemo = transMemo;
	}

}
