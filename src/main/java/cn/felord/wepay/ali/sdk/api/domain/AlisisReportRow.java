package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 报表行对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlisisReportRow extends AlipayObject {

	private static final long serialVersionUID = 7766242659846349278L;

	/**
	 * 报表行信息，每个对象是一列的数据
	 */
	@ApiListField("row_data")
	@ApiField("alisis_report_column")
	private List<AlisisReportColumn> rowData;

	/**
	 * <p>Getter for the field <code>rowData</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlisisReportColumn> getRowData() {
		return this.rowData;
	}
	/**
	 * <p>Setter for the field <code>rowData</code>.</p>
	 *
	 * @param rowData a {@link java.util.List} object.
	 */
	public void setRowData(List<AlisisReportColumn> rowData) {
		this.rowData = rowData;
	}

}
