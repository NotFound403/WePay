package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 品牌信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ExtBrand extends AlipayObject {

	private static final long serialVersionUID = 6272422449586557527L;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 品牌名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * <p>Getter for the field <code>brandCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandCode() {
		return this.brandCode;
	}
	/**
	 * <p>Setter for the field <code>brandCode</code>.</p>
	 *
	 * @param brandCode a {@link java.lang.String} object.
	 */
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
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

}
