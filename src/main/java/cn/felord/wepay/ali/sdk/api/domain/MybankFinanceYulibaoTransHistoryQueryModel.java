package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 余利宝历史交易查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankFinanceYulibaoTransHistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1674584957712173825L;

	/**
	 * 查询交易的结束时间，必须是格式为yyyyMMdd的日期字符串，且日期要大于等于start_date，时间最大跨度为30天，如start_date为20160808，则end_date最大值为20160906。
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 基金代码，必填。目前默认填001529，代表余利宝。
	 */
	@ApiField("fund_code")
	private String fundCode;

	/**
	 * 页码，历史交易记录分页展示的页码。必须为正整数，最大值为99。
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 每页条数，历史交易记录查询时每页的最大条数。必须为正整数，最大值为50。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询交易的开始时间，必须是格式为yyyyMMdd的日期字符串，如20160808。
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * <p>Getter for the field <code>endDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEndDate() {
		return this.endDate;
	}
	/**
	 * <p>Setter for the field <code>endDate</code>.</p>
	 *
	 * @param endDate a {@link java.lang.String} object.
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * <p>Getter for the field <code>fundCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	/**
	 * <p>Setter for the field <code>fundCode</code>.</p>
	 *
	 * @param fundCode a {@link java.lang.String} object.
	 */
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	/**
	 * <p>Getter for the field <code>page</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPage() {
		return this.page;
	}
	/**
	 * <p>Setter for the field <code>page</code>.</p>
	 *
	 * @param page a {@link java.lang.Long} object.
	 */
	public void setPage(Long page) {
		this.page = page;
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
	 * <p>Getter for the field <code>startDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStartDate() {
		return this.startDate;
	}
	/**
	 * <p>Setter for the field <code>startDate</code>.</p>
	 *
	 * @param startDate a {@link java.lang.String} object.
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
