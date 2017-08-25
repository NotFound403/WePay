package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 余利宝收益详情数据结构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class YLBProfitDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 1165821729524517186L;

	/**
	 * 近1日收益，单位为元
	 */
	@ApiField("day_profit")
	private String dayProfit;

	/**
	 * 近1月收益，单位为元
	 */
	@ApiField("month_profit")
	private String monthProfit;

	/**
	 * 历史累计收益，单位为元
	 */
	@ApiField("total_profit")
	private String totalProfit;

	/**
	 * 近1周收益，单位为元
	 */
	@ApiField("week_profit")
	private String weekProfit;

	/**
	 * <p>Getter for the field <code>dayProfit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDayProfit() {
		return this.dayProfit;
	}
	/**
	 * <p>Setter for the field <code>dayProfit</code>.</p>
	 *
	 * @param dayProfit a {@link java.lang.String} object.
	 */
	public void setDayProfit(String dayProfit) {
		this.dayProfit = dayProfit;
	}

	/**
	 * <p>Getter for the field <code>monthProfit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMonthProfit() {
		return this.monthProfit;
	}
	/**
	 * <p>Setter for the field <code>monthProfit</code>.</p>
	 *
	 * @param monthProfit a {@link java.lang.String} object.
	 */
	public void setMonthProfit(String monthProfit) {
		this.monthProfit = monthProfit;
	}

	/**
	 * <p>Getter for the field <code>totalProfit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalProfit() {
		return this.totalProfit;
	}
	/**
	 * <p>Setter for the field <code>totalProfit</code>.</p>
	 *
	 * @param totalProfit a {@link java.lang.String} object.
	 */
	public void setTotalProfit(String totalProfit) {
		this.totalProfit = totalProfit;
	}

	/**
	 * <p>Getter for the field <code>weekProfit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getWeekProfit() {
		return this.weekProfit;
	}
	/**
	 * <p>Setter for the field <code>weekProfit</code>.</p>
	 *
	 * @param weekProfit a {@link java.lang.String} object.
	 */
	public void setWeekProfit(String weekProfit) {
		this.weekProfit = weekProfit;
	}

}
