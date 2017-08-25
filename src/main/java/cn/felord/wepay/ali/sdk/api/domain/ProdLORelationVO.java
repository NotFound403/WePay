package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 产品区域关联信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ProdLORelationVO extends AlipayObject {

	private static final long serialVersionUID = 3311777831397693521L;

	/**
	 * 区域编码
	 */
	@ApiField("lo_code")
	private String loCode;

	/**
	 * 区域类型
	 */
	@ApiField("lo_type")
	private String loType;

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
	 * <p>Getter for the field <code>loCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoCode() {
		return this.loCode;
	}
	/**
	 * <p>Setter for the field <code>loCode</code>.</p>
	 *
	 * @param loCode a {@link java.lang.String} object.
	 */
	public void setLoCode(String loCode) {
		this.loCode = loCode;
	}

	/**
	 * <p>Getter for the field <code>loType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoType() {
		return this.loType;
	}
	/**
	 * <p>Setter for the field <code>loType</code>.</p>
	 *
	 * @param loType a {@link java.lang.String} object.
	 */
	public void setLoType(String loType) {
		this.loType = loType;
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
