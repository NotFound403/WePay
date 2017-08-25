package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 客户申贷记录查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoanapplyApplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5147517389847936658L;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 扩展查询参数
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 客户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 子申请单编号
	 */
	@ApiField("subapply_no")
	private String subapplyNo;

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
	 * <p>Getter for the field <code>subapplyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubapplyNo() {
		return this.subapplyNo;
	}
	/**
	 * <p>Setter for the field <code>subapplyNo</code>.</p>
	 *
	 * @param subapplyNo a {@link java.lang.String} object.
	 */
	public void setSubapplyNo(String subapplyNo) {
		this.subapplyNo = subapplyNo;
	}

}
