package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 模型数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ModelColumn extends AlipayObject {

	private static final long serialVersionUID = 7381867125385528434L;

	/**
	 * 列别名
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 列值
	 */
	@ApiField("data")
	private String data;

	/**
	 * <p>Getter for the field <code>alias</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlias() {
		return this.alias;
	}
	/**
	 * <p>Setter for the field <code>alias</code>.</p>
	 *
	 * @param alias a {@link java.lang.String} object.
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * <p>Getter for the field <code>data</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getData() {
		return this.data;
	}
	/**
	 * <p>Setter for the field <code>data</code>.</p>
	 *
	 * @param data a {@link java.lang.String} object.
	 */
	public void setData(String data) {
		this.data = data;
	}

}
