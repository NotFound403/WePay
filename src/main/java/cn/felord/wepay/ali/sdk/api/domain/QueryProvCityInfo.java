package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 省市下拉列表数据对象模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class QueryProvCityInfo extends AlipayObject {

	private static final long serialVersionUID = 2273174352198475823L;

	/**
	 * 省市编号
	 */
	@ApiField("adcode")
	private String adcode;

	/**
	 * 城市名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * <p>Getter for the field <code>adcode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdcode() {
		return this.adcode;
	}
	/**
	 * <p>Setter for the field <code>adcode</code>.</p>
	 *
	 * @param adcode a {@link java.lang.String} object.
	 */
	public void setAdcode(String adcode) {
		this.adcode = adcode;
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
