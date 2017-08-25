package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询余利宝行情信息（七日年化收益率、万份收益金额）
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankFinanceYulibaoPriceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6814135677636599915L;

	/**
	 * 查询行情的截止日期，必须是格式为yyyyMMdd的日期字符串且日期要大于等于start_date，时间最大跨度为30天，如start_date为20160808，则end_date最大值为20160906
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 基金代码，必填。目前默认填001529，代表余利宝。
	 */
	@ApiField("fund_code")
	private String fundCode;

	/**
	 * 查询行情的开始日期，必须是格式为yyyyMMdd的日期字符串，如20160808
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
