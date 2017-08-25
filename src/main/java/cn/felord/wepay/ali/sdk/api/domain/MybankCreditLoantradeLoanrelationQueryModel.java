package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询客户的申贷记录
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoantradeLoanrelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8241329724143678349L;

	/**
	 * 工商注册号或者身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 当客户为公司时，certtype是全国组织机构代码证书。当客户为个人时，是居民身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 预留的扩展字段
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 政策码
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 当客户是公司时，entityname是公司名全称；当客户是个人时，entityname是姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * <p>Getter for the field <code>certNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertNo() {
		return this.certNo;
	}
	/**
	 * <p>Setter for the field <code>certNo</code>.</p>
	 *
	 * @param certNo a {@link java.lang.String} object.
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	/**
	 * <p>Getter for the field <code>certType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertType() {
		return this.certType;
	}
	/**
	 * <p>Setter for the field <code>certType</code>.</p>
	 *
	 * @param certType a {@link java.lang.String} object.
	 */
	public void setCertType(String certType) {
		this.certType = certType;
	}

	/**
	 * <p>Getter for the field <code>extParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtParams() {
		return this.extParams;
	}
	/**
	 * <p>Setter for the field <code>extParams</code>.</p>
	 *
	 * @param extParams a {@link java.lang.String} object.
	 */
	public void setExtParams(String extParams) {
		this.extParams = extParams;
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
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>productCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductCode() {
		return this.productCode;
	}
	/**
	 * <p>Setter for the field <code>productCode</code>.</p>
	 *
	 * @param productCode a {@link java.lang.String} object.
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
