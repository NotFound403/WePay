package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 产品区域关联信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
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

	public String getLoCode() {
		return this.loCode;
	}
	public void setLoCode(String loCode) {
		this.loCode = loCode;
	}

	public String getLoType() {
		return this.loType;
	}
	public void setLoType(String loType) {
		this.loType = loType;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdVersion() {
		return this.prodVersion;
	}
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

}
