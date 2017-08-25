package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 条件模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Condition extends AlipayObject {

	private static final long serialVersionUID = 8415341571234386937L;

	/**
	 * 字段名称，目前支持以下字段：
name: 活动名称 
startTime: 开始时间
endTime: 结束时间
status：活动状态
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 对应于field_name的字段值，当field_name为status时，field_value支持STARTED、STARTING、MODIFYING、CLOSED、CLOSING、DISABLED几种值，用|分隔，代表查询这些状态中的活动，此时operator只能为IN,field_name为name时候value表示要查询的活动名，field_name为时间时,field_value为开始或结束时间，格式如2016-10-01 00:00:00
	 */
	@ApiField("field_value")
	private String fieldValue;

	/**
	 * 操作符,EQUAL:等于,IN:范围。目前支持field_name=status且operator=IN,多个状态以"|"分隔
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * <p>Getter for the field <code>fieldName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFieldName() {
		return this.fieldName;
	}
	/**
	 * <p>Setter for the field <code>fieldName</code>.</p>
	 *
	 * @param fieldName a {@link java.lang.String} object.
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * <p>Getter for the field <code>fieldValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFieldValue() {
		return this.fieldValue;
	}
	/**
	 * <p>Setter for the field <code>fieldValue</code>.</p>
	 *
	 * @param fieldValue a {@link java.lang.String} object.
	 */
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	/**
	 * <p>Getter for the field <code>operator</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperator() {
		return this.operator;
	}
	/**
	 * <p>Setter for the field <code>operator</code>.</p>
	 *
	 * @param operator a {@link java.lang.String} object.
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
