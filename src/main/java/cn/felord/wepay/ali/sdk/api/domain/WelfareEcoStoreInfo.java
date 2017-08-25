package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 福利使用的门店信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class WelfareEcoStoreInfo extends AlipayObject {

	private static final long serialVersionUID = 2486723457179695381L;

	/**
	 * 门店具体位置（中文）
	 */
	@ApiField("address")
	private String address;

	/**
	 * 品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 门店编号
	 */
	@ApiField("code")
	private String code;

	/**
	 * 门店名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * <p>Getter for the field <code>address</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * <p>Setter for the field <code>address</code>.</p>
	 *
	 * @param address a {@link java.lang.String} object.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * <p>Getter for the field <code>brand</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrand() {
		return this.brand;
	}
	/**
	 * <p>Setter for the field <code>brand</code>.</p>
	 *
	 * @param brand a {@link java.lang.String} object.
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
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
