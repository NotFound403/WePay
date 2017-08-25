package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 数据资产平台 Get Customer Tags 对云数据实验室提供的结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CustomerTag extends AlipayObject {

	private static final long serialVersionUID = 6599318997357882839L;

	/**
	 * 字段名称
	 */
	@ApiField("col_name")
	private String colName;

	/**
	 * column_type字段类型
	 */
	@ApiField("column_type")
	private String columnType;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 标签名
	 */
	@ApiField("name")
	private String name;

	/**
	 * <p>Getter for the field <code>colName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getColName() {
		return this.colName;
	}
	/**
	 * <p>Setter for the field <code>colName</code>.</p>
	 *
	 * @param colName a {@link java.lang.String} object.
	 */
	public void setColName(String colName) {
		this.colName = colName;
	}

	/**
	 * <p>Getter for the field <code>columnType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getColumnType() {
		return this.columnType;
	}
	/**
	 * <p>Setter for the field <code>columnType</code>.</p>
	 *
	 * @param columnType a {@link java.lang.String} object.
	 */
	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
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
