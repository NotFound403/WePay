package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 错误上报的特征字段
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ReportErrorFeature extends AlipayObject {

	private static final long serialVersionUID = 3429693652778231781L;

	/**
	 * 桌号
	 */
	@ApiField("table_num")
	private String tableNum;

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
