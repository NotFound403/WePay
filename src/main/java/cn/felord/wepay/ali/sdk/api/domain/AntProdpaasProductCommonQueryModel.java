package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询产品平台产品信息接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntProdpaasProductCommonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4435125611813448685L;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品查询维度，主要分为基础信息，条件信息和产品关联关系信息等
	 */
	@ApiField("product_options")
	private ProductVOOptions productOptions;

	/**
	 * 产品版本
	 */
	@ApiField("product_version")
	private String productVersion;

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

	/**
	 * <p>Getter for the field <code>productOptions</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ProductVOOptions} object.
	 */
	public ProductVOOptions getProductOptions() {
		return this.productOptions;
	}
	/**
	 * <p>Setter for the field <code>productOptions</code>.</p>
	 *
	 * @param productOptions a {@link cn.felord.wepay.ali.sdk.api.domain.ProductVOOptions} object.
	 */
	public void setProductOptions(ProductVOOptions productOptions) {
		this.productOptions = productOptions;
	}

	/**
	 * <p>Getter for the field <code>productVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductVersion() {
		return this.productVersion;
	}
	/**
	 * <p>Setter for the field <code>productVersion</code>.</p>
	 *
	 * @param productVersion a {@link java.lang.String} object.
	 */
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

}
