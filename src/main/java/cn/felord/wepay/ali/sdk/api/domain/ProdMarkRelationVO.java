package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 产品外标关系
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ProdMarkRelationVO extends AlipayObject {

	private static final long serialVersionUID = 5796615331619384838L;

	/**
	 * 产品外标编码
	 */
	@ApiField("mark_code")
	private String markCode;

	/**
	 * 产品外标类型
	 */
	@ApiField("mark_type")
	private String markType;

	/**
	 * 产品码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * <p>Getter for the field <code>markCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMarkCode() {
		return this.markCode;
	}
	/**
	 * <p>Setter for the field <code>markCode</code>.</p>
	 *
	 * @param markCode a {@link java.lang.String} object.
	 */
	public void setMarkCode(String markCode) {
		this.markCode = markCode;
	}

	/**
	 * <p>Getter for the field <code>markType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMarkType() {
		return this.markType;
	}
	/**
	 * <p>Setter for the field <code>markType</code>.</p>
	 *
	 * @param markType a {@link java.lang.String} object.
	 */
	public void setMarkType(String markType) {
		this.markType = markType;
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

}
