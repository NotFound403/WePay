package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 桌名桌号返回结果类，桌号，桌名为成员
 *
 * @author auto create
 * @version $Id: $Id
 */
public class TableListResult extends AlipayObject {

	private static final long serialVersionUID = 5837379331215997211L;

	/**
	 * 桌名
	 */
	@ApiField("table_name")
	private String tableName;

	/**
	 * 桌号
	 */
	@ApiField("table_num")
	private String tableNum;

	/**
	 * <p>Getter for the field <code>tableName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTableName() {
		return this.tableName;
	}
	/**
	 * <p>Setter for the field <code>tableName</code>.</p>
	 *
	 * @param tableName a {@link java.lang.String} object.
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * <p>Getter for the field <code>tableNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTableNum() {
		return this.tableNum;
	}
	/**
	 * <p>Setter for the field <code>tableNum</code>.</p>
	 *
	 * @param tableNum a {@link java.lang.String} object.
	 */
	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}

}
