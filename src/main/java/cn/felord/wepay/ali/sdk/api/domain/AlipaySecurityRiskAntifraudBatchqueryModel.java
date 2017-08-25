package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 反舞弊风险批量查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityRiskAntifraudBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7238154979766112764L;

	/**
	 * company_list+传入的一批待检查的企业名单+用户传入+还可以传入{"creditCode":"企业信用代码"}或者{"regNo":"企业工商注册号"}
	 */
	@ApiListField("company_list")
	@ApiField("string")
	private List<String> companyList;

	/**
	 * partner_name+唯一+作为标识调用者身份的字段+用户填入
	 */
	@ApiField("partner_name")
	private String partnerName;

	/**
	 * staff_list+传入的一批待检查员工信息+用户传入+手机号/身份证姓名二选一+还可以传入{"name":"姓名","phone":"手机号码"}
	 */
	@ApiListField("staff_list")
	@ApiField("string")
	private List<String> staffList;

	/**
	 * <p>Getter for the field <code>companyList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getCompanyList() {
		return this.companyList;
	}
	/**
	 * <p>Setter for the field <code>companyList</code>.</p>
	 *
	 * @param companyList a {@link java.util.List} object.
	 */
	public void setCompanyList(List<String> companyList) {
		this.companyList = companyList;
	}

	/**
	 * <p>Getter for the field <code>partnerName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerName() {
		return this.partnerName;
	}
	/**
	 * <p>Setter for the field <code>partnerName</code>.</p>
	 *
	 * @param partnerName a {@link java.lang.String} object.
	 */
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	/**
	 * <p>Getter for the field <code>staffList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getStaffList() {
		return this.staffList;
	}
	/**
	 * <p>Setter for the field <code>staffList</code>.</p>
	 *
	 * @param staffList a {@link java.util.List} object.
	 */
	public void setStaffList(List<String> staffList) {
		this.staffList = staffList;
	}

}
