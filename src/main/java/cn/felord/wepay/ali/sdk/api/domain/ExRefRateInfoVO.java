package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 测试
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ExRefRateInfoVO extends AlipayObject {

	private static final long serialVersionUID = 8383292641252215376L;

	/**
	 * 货币对
	 */
	@ApiField("currency_pair")
	private String currencyPair;

	/**
	 * 基础币种
	 */
	@ApiField("datum_currency")
	private String datumCurrency;

	/**
	 * 牌价类型，表示站在用户角度，对目标币种的交易方向，01表示买入，02表示卖出
	 */
	@ApiField("price_type")
	private String priceType;

	/**
	 * 报价日期，格式为YYYYMMDD
	 */
	@ApiField("pub_date")
	private String pubDate;

	/**
	 * 报价时间
	 */
	@ApiField("pub_time")
	private Date pubTime;

	/**
	 * 汇率，表示一单位基准币种等于多少目标币种，小数点后最多精确到8位
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 目标币种
	 */
	@ApiField("target_currency")
	private String targetCurrency;

	/**
	 * <p>Getter for the field <code>currencyPair</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrencyPair() {
		return this.currencyPair;
	}
	/**
	 * <p>Setter for the field <code>currencyPair</code>.</p>
	 *
	 * @param currencyPair a {@link java.lang.String} object.
	 */
	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

	/**
	 * <p>Getter for the field <code>datumCurrency</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDatumCurrency() {
		return this.datumCurrency;
	}
	/**
	 * <p>Setter for the field <code>datumCurrency</code>.</p>
	 *
	 * @param datumCurrency a {@link java.lang.String} object.
	 */
	public void setDatumCurrency(String datumCurrency) {
		this.datumCurrency = datumCurrency;
	}

	/**
	 * <p>Getter for the field <code>priceType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPriceType() {
		return this.priceType;
	}
	/**
	 * <p>Setter for the field <code>priceType</code>.</p>
	 *
	 * @param priceType a {@link java.lang.String} object.
	 */
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	/**
	 * <p>Getter for the field <code>pubDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPubDate() {
		return this.pubDate;
	}
	/**
	 * <p>Setter for the field <code>pubDate</code>.</p>
	 *
	 * @param pubDate a {@link java.lang.String} object.
	 */
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	/**
	 * <p>Getter for the field <code>pubTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getPubTime() {
		return this.pubTime;
	}
	/**
	 * <p>Setter for the field <code>pubTime</code>.</p>
	 *
	 * @param pubTime a {@link java.util.Date} object.
	 */
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	/**
	 * <p>Getter for the field <code>rate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRate() {
		return this.rate;
	}
	/**
	 * <p>Setter for the field <code>rate</code>.</p>
	 *
	 * @param rate a {@link java.lang.String} object.
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}

	/**
	 * <p>Getter for the field <code>targetCurrency</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTargetCurrency() {
		return this.targetCurrency;
	}
	/**
	 * <p>Setter for the field <code>targetCurrency</code>.</p>
	 *
	 * @param targetCurrency a {@link java.lang.String} object.
	 */
	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

}
