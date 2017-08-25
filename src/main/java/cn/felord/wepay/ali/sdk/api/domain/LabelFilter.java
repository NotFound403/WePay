package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 标签组发过滤单个条件
 *
 * @author auto create
 * @version $Id: $Id
 */
public class LabelFilter extends AlipayObject {

	private static final long serialVersionUID = 2817335338519954812L;

	/**
	 * 标签组名，商户自定义的标签固定为label_id_list，支付宝开放的标签详见<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/FirstPartOfTagsFromAlipay.xlsx">支付宝开放标签</a>
	 */
	@ApiField("column_name")
	private String columnName;

	/**
	 * 操作符，支持=、!=、in三个操作符；其中in表示是某几个标签中的一个
	 */
	@ApiField("op")
	private String op;

	/**
	 * 标签数组，用于组装最后的表达式
	 */
	@ApiListField("values")
	@ApiField("string")
	private List<String> values;

	/**
	 * <p>Getter for the field <code>columnName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getColumnName() {
		return this.columnName;
	}
	/**
	 * <p>Setter for the field <code>columnName</code>.</p>
	 *
	 * @param columnName a {@link java.lang.String} object.
	 */
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	/**
	 * <p>Getter for the field <code>op</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOp() {
		return this.op;
	}
	/**
	 * <p>Setter for the field <code>op</code>.</p>
	 *
	 * @param op a {@link java.lang.String} object.
	 */
	public void setOp(String op) {
		this.op = op;
	}

	/**
	 * <p>Getter for the field <code>values</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getValues() {
		return this.values;
	}
	/**
	 * <p>Setter for the field <code>values</code>.</p>
	 *
	 * @param values a {@link java.util.List} object.
	 */
	public void setValues(List<String> values) {
		this.values = values;
	}

}
