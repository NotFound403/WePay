package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 报表查询条件
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ReportQueryCondition extends AlipayObject {

	private static final long serialVersionUID = 3884724711917427579L;

	/**
	 * 字段名称
	 */
	@ApiField("key")
	private String key;

	/**
	 * 操作符号。可能值：EQ(等于),GT(大于),LT(小于),LTE(小于或等于),GTE(大于或等于),NOT_EQ(不等于),LIKE(like),NOT_LIKE(not like),IN(in),NOT_IN(not in),BETWEEN(between)
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 过滤值
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
