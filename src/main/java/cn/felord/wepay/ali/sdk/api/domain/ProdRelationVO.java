package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 产品间关系
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ProdRelationVO extends AlipayObject {

	private static final long serialVersionUID = 2241221888559177527L;

	/**
	 * 数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 数量类型
	 */
	@ApiField("num_type")
	private String numType;

	/**
	 * 产品码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 关联的产品编码
	 */
	@ApiField("prod_rel_code")
	private String prodRelCode;

	/**
	 * 关联的产品名称
	 */
	@ApiField("prod_rel_name")
	private String prodRelName;

	/**
	 * 产品关联类型
	 */
	@ApiField("prod_rel_type")
	private String prodRelType;

	/**
	 * 关联的产品版本
	 */
	@ApiField("prod_rel_version")
	private String prodRelVersion;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 产品关联子类型
	 */
	@ApiField("sub_prod_rel_type")
	private String subProdRelType;

	/**
	 * <p>Getter for the field <code>num</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getNum() {
		return this.num;
	}
	/**
	 * <p>Setter for the field <code>num</code>.</p>
	 *
	 * @param num a {@link java.lang.Long} object.
	 */
	public void setNum(Long num) {
		this.num = num;
	}

	/**
	 * <p>Getter for the field <code>numType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNumType() {
		return this.numType;
	}
	/**
	 * <p>Setter for the field <code>numType</code>.</p>
	 *
	 * @param numType a {@link java.lang.String} object.
	 */
	public void setNumType(String numType) {
		this.numType = numType;
	}

	/**
	 * <p>Getter for the field <code>prodCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdCode() {
		return this.prodCode;
	}
	/**
	 * <p>Setter for the field <code>prodCode</code>.</p>
	 *
	 * @param prodCode a {@link java.lang.String} object.
	 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	/**
	 * <p>Getter for the field <code>prodRelCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdRelCode() {
		return this.prodRelCode;
	}
	/**
	 * <p>Setter for the field <code>prodRelCode</code>.</p>
	 *
	 * @param prodRelCode a {@link java.lang.String} object.
	 */
	public void setProdRelCode(String prodRelCode) {
		this.prodRelCode = prodRelCode;
	}

	/**
	 * <p>Getter for the field <code>prodRelName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdRelName() {
		return this.prodRelName;
	}
	/**
	 * <p>Setter for the field <code>prodRelName</code>.</p>
	 *
	 * @param prodRelName a {@link java.lang.String} object.
	 */
	public void setProdRelName(String prodRelName) {
		this.prodRelName = prodRelName;
	}

	/**
	 * <p>Getter for the field <code>prodRelType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdRelType() {
		return this.prodRelType;
	}
	/**
	 * <p>Setter for the field <code>prodRelType</code>.</p>
	 *
	 * @param prodRelType a {@link java.lang.String} object.
	 */
	public void setProdRelType(String prodRelType) {
		this.prodRelType = prodRelType;
	}

	/**
	 * <p>Getter for the field <code>prodRelVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdRelVersion() {
		return this.prodRelVersion;
	}
	/**
	 * <p>Setter for the field <code>prodRelVersion</code>.</p>
	 *
	 * @param prodRelVersion a {@link java.lang.String} object.
	 */
	public void setProdRelVersion(String prodRelVersion) {
		this.prodRelVersion = prodRelVersion;
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
	 * <p>Getter for the field <code>subProdRelType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubProdRelType() {
		return this.subProdRelType;
	}
	/**
	 * <p>Setter for the field <code>subProdRelType</code>.</p>
	 *
	 * @param subProdRelType a {@link java.lang.String} object.
	 */
	public void setSubProdRelType(String subProdRelType) {
		this.subProdRelType = subProdRelType;
	}

}
