package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 外部商业平台合作-查询可贷款方案
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoantradeLoanschemeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7131917229572727344L;

	/**
	 * 授信编号
	 */
	@ApiField("biz")
	private String biz;

	/**
	 * 业务编号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 客户身份编码-个人是身份证号码、企业是工商注册号、会员是会员编号-具体的数字编号
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 客户身份标识-个人是姓名、企业是公司名称、会员是会员名称，如支付宝的手机号或者邮箱号
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 客户身份类型-个人是PERSON、企业是COMPAY、会员是具体的站点如ALIPAY或者MYBANK
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 微贷政策码
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 金融云产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 基于哪个场景查询授信方案(FIXED_CREDIT:固化授信；PROD：产品；APPLY：申请；BL:保理)
	 */
	@ApiField("scen")
	private String scen;

	/**
	 * <p>Getter for the field <code>biz</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBiz() {
		return this.biz;
	}
	/**
	 * <p>Setter for the field <code>biz</code>.</p>
	 *
	 * @param biz a {@link java.lang.String} object.
	 */
	public void setBiz(String biz) {
		this.biz = biz;
	}

	/**
	 * <p>Getter for the field <code>bizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNo() {
		return this.bizNo;
	}
	/**
	 * <p>Setter for the field <code>bizNo</code>.</p>
	 *
	 * @param bizNo a {@link java.lang.String} object.
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	/**
	 * <p>Getter for the field <code>entityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityCode() {
		return this.entityCode;
	}
	/**
	 * <p>Setter for the field <code>entityCode</code>.</p>
	 *
	 * @param entityCode a {@link java.lang.String} object.
	 */
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	/**
	 * <p>Getter for the field <code>entityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityName() {
		return this.entityName;
	}
	/**
	 * <p>Setter for the field <code>entityName</code>.</p>
	 *
	 * @param entityName a {@link java.lang.String} object.
	 */
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	/**
	 * <p>Getter for the field <code>entityType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityType() {
		return this.entityType;
	}
	/**
	 * <p>Setter for the field <code>entityType</code>.</p>
	 *
	 * @param entityType a {@link java.lang.String} object.
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
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
	 * <p>Getter for the field <code>scen</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getScen() {
		return this.scen;
	}
	/**
	 * <p>Setter for the field <code>scen</code>.</p>
	 *
	 * @param scen a {@link java.lang.String} object.
	 */
	public void setScen(String scen) {
		this.scen = scen;
	}

}
