package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 产品基本信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ProductBaseVO extends AlipayObject {

	private static final long serialVersionUID = 3375282415987859225L;

	/**
	 * 产品业务状态,产品中心目前暂时不消费该业务状态，由外围业务消费
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 是否是组合产品,默认为false,填02
	 */
	@ApiField("is_combinate")
	private String isCombinate;

	/**
	 * 产品环境类型，默认是线上
	 */
	@ApiField("prod_env")
	private String prodEnv;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 产品模板编码
	 */
	@ApiField("prod_template_code")
	private String prodTemplateCode;

	/**
	 * 产品模板版本
	 */
	@ApiField("prod_template_version")
	private String prodTemplateVersion;

	/**
	 * 产品类型 :01: 普通产品；02：标准产品
	 */
	@ApiField("prod_type")
	private String prodType;

	/**
	 * 产品编码
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 产品管理状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 标准产品编码
	 */
	@ApiField("std_prod_code")
	private String stdProdCode;

	/**
	 * 标准产品版本
	 */
	@ApiField("std_prod_version")
	private String stdProdVersion;

	/**
	 * <p>Getter for the field <code>bizStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizStatus() {
		return this.bizStatus;
	}
	/**
	 * <p>Setter for the field <code>bizStatus</code>.</p>
	 *
	 * @param bizStatus a {@link java.lang.String} object.
	 */
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	/**
	 * <p>Getter for the field <code>isCombinate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsCombinate() {
		return this.isCombinate;
	}
	/**
	 * <p>Setter for the field <code>isCombinate</code>.</p>
	 *
	 * @param isCombinate a {@link java.lang.String} object.
	 */
	public void setIsCombinate(String isCombinate) {
		this.isCombinate = isCombinate;
	}

	/**
	 * <p>Getter for the field <code>prodEnv</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdEnv() {
		return this.prodEnv;
	}
	/**
	 * <p>Setter for the field <code>prodEnv</code>.</p>
	 *
	 * @param prodEnv a {@link java.lang.String} object.
	 */
	public void setProdEnv(String prodEnv) {
		this.prodEnv = prodEnv;
	}

	/**
	 * <p>Getter for the field <code>prodName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdName() {
		return this.prodName;
	}
	/**
	 * <p>Setter for the field <code>prodName</code>.</p>
	 *
	 * @param prodName a {@link java.lang.String} object.
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	/**
	 * <p>Getter for the field <code>prodTemplateCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdTemplateCode() {
		return this.prodTemplateCode;
	}
	/**
	 * <p>Setter for the field <code>prodTemplateCode</code>.</p>
	 *
	 * @param prodTemplateCode a {@link java.lang.String} object.
	 */
	public void setProdTemplateCode(String prodTemplateCode) {
		this.prodTemplateCode = prodTemplateCode;
	}

	/**
	 * <p>Getter for the field <code>prodTemplateVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdTemplateVersion() {
		return this.prodTemplateVersion;
	}
	/**
	 * <p>Setter for the field <code>prodTemplateVersion</code>.</p>
	 *
	 * @param prodTemplateVersion a {@link java.lang.String} object.
	 */
	public void setProdTemplateVersion(String prodTemplateVersion) {
		this.prodTemplateVersion = prodTemplateVersion;
	}

	/**
	 * <p>Getter for the field <code>prodType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdType() {
		return this.prodType;
	}
	/**
	 * <p>Setter for the field <code>prodType</code>.</p>
	 *
	 * @param prodType a {@link java.lang.String} object.
	 */
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	/**
	 * <p>Getter for the field <code>prodVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdVersion() {
		return this.prodVersion;
	}
	/**
	 * <p>Setter for the field <code>prodVersion</code>.</p>
	 *
	 * @param prodVersion a {@link java.lang.String} object.
	 */
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * <p>Getter for the field <code>stdProdCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStdProdCode() {
		return this.stdProdCode;
	}
	/**
	 * <p>Setter for the field <code>stdProdCode</code>.</p>
	 *
	 * @param stdProdCode a {@link java.lang.String} object.
	 */
	public void setStdProdCode(String stdProdCode) {
		this.stdProdCode = stdProdCode;
	}

	/**
	 * <p>Getter for the field <code>stdProdVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStdProdVersion() {
		return this.stdProdVersion;
	}
	/**
	 * <p>Setter for the field <code>stdProdVersion</code>.</p>
	 *
	 * @param stdProdVersion a {@link java.lang.String} object.
	 */
	public void setStdProdVersion(String stdProdVersion) {
		this.stdProdVersion = stdProdVersion;
	}

}
