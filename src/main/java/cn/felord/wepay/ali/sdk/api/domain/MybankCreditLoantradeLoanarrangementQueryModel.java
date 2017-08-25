package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 外部商业平台合作-查询贷款合约
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoantradeLoanarrangementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8391294398142884859L;

	/**
	 * 网商银行参与者会员角色ID。客户在网商融资平台页面发起贷款申请或者机构调用代客户申贷接口mybank.credit.loanapply.apply.create后，网商会把申请结果以消息的方式通知机构，该字段包含在返回的消息体中。
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 合约编号，客户签署合约时获取。
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

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
