package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 外部商业平台合作-查询贷款合约
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoantradeLoanarQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1634176957666229818L;

	/**
	 * 客户的角色编号
	 */
	@ApiField("iproleid")
	private String iproleid;

	/**
	 * 合约编号
	 */
	@ApiField("loanarno")
	private String loanarno;

	/**
	 * <p>Getter for the field <code>iproleid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIproleid() {
		return this.iproleid;
	}
	/**
	 * <p>Setter for the field <code>iproleid</code>.</p>
	 *
	 * @param iproleid a {@link java.lang.String} object.
	 */
	public void setIproleid(String iproleid) {
		this.iproleid = iproleid;
	}

	/**
	 * <p>Getter for the field <code>loanarno</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoanarno() {
		return this.loanarno;
	}
	/**
	 * <p>Setter for the field <code>loanarno</code>.</p>
	 *
	 * @param loanarno a {@link java.lang.String} object.
	 */
	public void setLoanarno(String loanarno) {
		this.loanarno = loanarno;
	}

}
