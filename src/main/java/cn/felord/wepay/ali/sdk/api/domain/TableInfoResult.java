package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 返回给isv结果，成员为列表类型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class TableInfoResult extends AlipayObject {

	private static final long serialVersionUID = 6414315812199175427L;

	/**
	 * 返回TableListResult集合
	 */
	@ApiListField("table_info_list")
	@ApiField("table_list_result")
	private List<TableListResult> tableInfoList;

	/**
	 * <p>Getter for the field <code>tableInfoList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<TableListResult> getTableInfoList() {
		return this.tableInfoList;
	}
	/**
	 * <p>Setter for the field <code>tableInfoList</code>.</p>
	 *
	 * @param tableInfoList a {@link java.util.List} object.
	 */
	public void setTableInfoList(List<TableListResult> tableInfoList) {
		this.tableInfoList = tableInfoList;
	}

}
