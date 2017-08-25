package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 仪表盘操作运算参数
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DashboardParam extends AlipayObject {

	private static final long serialVersionUID = 4281418857381413973L;

	/**
	 * 仪表盘中的字段列名称
	 */
	@ApiField("key")
	private String key;

	/**
	 * 操作计算符，现支持的包括：EQ(等于),GT(大于),LT(小于),LTE(小于或等于),GTE(大于或等于),NOT_EQ(不等于),LIKE(like),NOT_LIKE(not like)
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 过滤条件值
	 */
	@ApiField("value")
	private String value;

	/**
	 * <p>Getter for the field <code>key</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getKey() {
		return this.key;
	}
	/**
	 * <p>Setter for the field <code>key</code>.</p>
	 *
	 * @param key a {@link java.lang.String} object.
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * <p>Getter for the field <code>operate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperate() {
		return this.operate;
	}
	/**
	 * <p>Setter for the field <code>operate</code>.</p>
	 *
	 * @param operate a {@link java.lang.String} object.
	 */
	public void setOperate(String operate) {
		this.operate = operate;
	}

	/**
	 * <p>Getter for the field <code>value</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValue() {
		return this.value;
	}
	/**
	 * <p>Setter for the field <code>value</code>.</p>
	 *
	 * @param value a {@link java.lang.String} object.
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
