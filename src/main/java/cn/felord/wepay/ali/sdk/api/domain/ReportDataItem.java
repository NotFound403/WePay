package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 报表数据信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ReportDataItem extends AlipayObject {

	private static final long serialVersionUID = 3417572276942233847L;

	/**
	 * 表示一行数据，每个对象是一列的数据
	 */
	@ApiField("row_data")
	private String rowData;

	/**
	 * <p>Getter for the field <code>rowData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRowData() {
		return this.rowData;
	}
	/**
	 * <p>Setter for the field <code>rowData</code>.</p>
	 *
	 * @param rowData a {@link java.lang.String} object.
	 */
	public void setRowData(String rowData) {
		this.rowData = rowData;
	}

}
