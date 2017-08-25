package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 签约返点比率查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntProdpaasArrangementRebateRateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8561328235957359192L;

	/**
	 * 数据项名称
	 */
	@ApiField("data_item_name")
	private String dataItemName;

	/**
	 * 一级类目ID
	 */
	@ApiField("first_category_id")
	private String firstCategoryId;

	/**
	 * 查询时间
	 */
	@ApiField("gmt_query")
	private String gmtQuery;

	/**
	 * <p>Getter for the field <code>dataItemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDataItemName() {
		return this.dataItemName;
	}
	/**
	 * <p>Setter for the field <code>dataItemName</code>.</p>
	 *
	 * @param dataItemName a {@link java.lang.String} object.
	 */
	public void setDataItemName(String dataItemName) {
		this.dataItemName = dataItemName;
	}

	/**
	 * <p>Getter for the field <code>firstCategoryId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFirstCategoryId() {
		return this.firstCategoryId;
	}
	/**
	 * <p>Setter for the field <code>firstCategoryId</code>.</p>
	 *
	 * @param firstCategoryId a {@link java.lang.String} object.
	 */
	public void setFirstCategoryId(String firstCategoryId) {
		this.firstCategoryId = firstCategoryId;
	}

	/**
	 * <p>Getter for the field <code>gmtQuery</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtQuery() {
		return this.gmtQuery;
	}
	/**
	 * <p>Setter for the field <code>gmtQuery</code>.</p>
	 *
	 * @param gmtQuery a {@link java.lang.String} object.
	 */
	public void setGmtQuery(String gmtQuery) {
		this.gmtQuery = gmtQuery;
	}

}
