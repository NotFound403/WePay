package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 余利宝行情信息数据结构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class YLBPriceDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 8673166686955946184L;

	/**
	 * 余利宝行情日期，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("price_date")
	private Date priceDate;

	/**
	 * 七日年化收益率（%），精确到小数点后4位
	 */
	@ApiField("sevendays_yeild_rate")
	private String sevendaysYeildRate;

	/**
	 * 万份收益金额，单位为元
	 */
	@ApiField("tenthousand_income")
	private String tenthousandIncome;

	/**
	 * <p>Getter for the field <code>priceDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getPriceDate() {
		return this.priceDate;
	}
	/**
	 * <p>Setter for the field <code>priceDate</code>.</p>
	 *
	 * @param priceDate a {@link java.util.Date} object.
	 */
	public void setPriceDate(Date priceDate) {
		this.priceDate = priceDate;
	}

	/**
	 * <p>Getter for the field <code>sevendaysYeildRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSevendaysYeildRate() {
		return this.sevendaysYeildRate;
	}
	/**
	 * <p>Setter for the field <code>sevendaysYeildRate</code>.</p>
	 *
	 * @param sevendaysYeildRate a {@link java.lang.String} object.
	 */
	public void setSevendaysYeildRate(String sevendaysYeildRate) {
		this.sevendaysYeildRate = sevendaysYeildRate;
	}

	/**
	 * <p>Getter for the field <code>tenthousandIncome</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTenthousandIncome() {
		return this.tenthousandIncome;
	}
	/**
	 * <p>Setter for the field <code>tenthousandIncome</code>.</p>
	 *
	 * @param tenthousandIncome a {@link java.lang.String} object.
	 */
	public void setTenthousandIncome(String tenthousandIncome) {
		this.tenthousandIncome = tenthousandIncome;
	}

}
