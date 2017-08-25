package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 根据条件查询推荐菜
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataDishdiagnoseBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4736998425464966495L;

	/**
	 * 查询菜品类型：001是明星菜品，002是潜力菜品，003是其他菜品（除明星菜品和潜力菜品之外的其他一律作为其他菜品 编号为003）。
2-	如果要查询所有的则传入999。具体的值可以通过koubei.marketing.data.dishdiagnosetype.batchquery来查询，同时会返回类型与说明
	 */
	@ApiField("item_diagnose_type")
	private String itemDiagnoseType;

	/**
	 * 从第一页开始，默认值1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小，默认值50，同时page_size*page_no最多条数是300条，查询请注意。超过后不会再返回数据。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询数据时间,最新数据是昨天的。T-1的数据，最大保留30天,格式：YYYYMMDD。比如20170103
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * <p>Getter for the field <code>itemDiagnoseType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemDiagnoseType() {
		return this.itemDiagnoseType;
	}
	/**
	 * <p>Setter for the field <code>itemDiagnoseType</code>.</p>
	 *
	 * @param itemDiagnoseType a {@link java.lang.String} object.
	 */
	public void setItemDiagnoseType(String itemDiagnoseType) {
		this.itemDiagnoseType = itemDiagnoseType;
	}

	/**
	 * <p>Getter for the field <code>pageNo</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageNo() {
		return this.pageNo;
	}
	/**
	 * <p>Setter for the field <code>pageNo</code>.</p>
	 *
	 * @param pageNo a {@link java.lang.Long} object.
	 */
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.Long} object.
	 */
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * <p>Getter for the field <code>reportDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReportDate() {
		return this.reportDate;
	}
	/**
	 * <p>Setter for the field <code>reportDate</code>.</p>
	 *
	 * @param reportDate a {@link java.lang.String} object.
	 */
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
