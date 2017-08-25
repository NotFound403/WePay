package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.smartactivity.forecast response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataSmartactivityForecastResponse extends AlipayResponse {

	private static final long serialVersionUID = 6584453832151164562L;

	/** 
	 * 领取数量 上限值
	 */
	@ApiField("apply_cnt_max")
	private String applyCntMax;

	/** 
	 * 领取数量 下限值
	 */
	@ApiField("apply_cnt_min")
	private String applyCntMin;

	/** 
	 * 新增曝光数量 上限值
	 */
	@ApiField("increased_exposure_max")
	private String increasedExposureMax;

	/** 
	 * 新增曝光数量 下限值
	 */
	@ApiField("increased_exposure_min")
	private String increasedExposureMin;

	/** 
	 * 提升复购率区间上限
	 */
	@ApiField("repay_rate_range_max")
	private String repayRateRangeMax;

	/** 
	 * 提升复购率区间下限
	 */
	@ApiField("repay_rate_range_min")
	private String repayRateRangeMin;

	/** 
	 * 活动收益金额(分)区间上限值
	 */
	@ApiField("trade_amt_range_max")
	private String tradeAmtRangeMax;

	/** 
	 * 活动收益金额(分)区间下限值
	 */
	@ApiField("trade_amt_range_min")
	private String tradeAmtRangeMin;

	/** 
	 * 核销数量区间上限
	 */
	@ApiField("verify_count_range_max")
	private String verifyCountRangeMax;

	/** 
	 * 核销数量区间下限
	 */
	@ApiField("verify_count_range_min")
	private String verifyCountRangeMin;

	/**
	 * <p>Setter for the field <code>applyCntMax</code>.</p>
	 *
	 * @param applyCntMax a {@link java.lang.String} object.
	 */
	public void setApplyCntMax(String applyCntMax) {
		this.applyCntMax = applyCntMax;
	}
	/**
	 * <p>Getter for the field <code>applyCntMax</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyCntMax( ) {
		return this.applyCntMax;
	}

	/**
	 * <p>Setter for the field <code>applyCntMin</code>.</p>
	 *
	 * @param applyCntMin a {@link java.lang.String} object.
	 */
	public void setApplyCntMin(String applyCntMin) {
		this.applyCntMin = applyCntMin;
	}
	/**
	 * <p>Getter for the field <code>applyCntMin</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyCntMin( ) {
		return this.applyCntMin;
	}

	/**
	 * <p>Setter for the field <code>increasedExposureMax</code>.</p>
	 *
	 * @param increasedExposureMax a {@link java.lang.String} object.
	 */
	public void setIncreasedExposureMax(String increasedExposureMax) {
		this.increasedExposureMax = increasedExposureMax;
	}
	/**
	 * <p>Getter for the field <code>increasedExposureMax</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIncreasedExposureMax( ) {
		return this.increasedExposureMax;
	}

	/**
	 * <p>Setter for the field <code>increasedExposureMin</code>.</p>
	 *
	 * @param increasedExposureMin a {@link java.lang.String} object.
	 */
	public void setIncreasedExposureMin(String increasedExposureMin) {
		this.increasedExposureMin = increasedExposureMin;
	}
	/**
	 * <p>Getter for the field <code>increasedExposureMin</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIncreasedExposureMin( ) {
		return this.increasedExposureMin;
	}

	/**
	 * <p>Setter for the field <code>repayRateRangeMax</code>.</p>
	 *
	 * @param repayRateRangeMax a {@link java.lang.String} object.
	 */
	public void setRepayRateRangeMax(String repayRateRangeMax) {
		this.repayRateRangeMax = repayRateRangeMax;
	}
	/**
	 * <p>Getter for the field <code>repayRateRangeMax</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepayRateRangeMax( ) {
		return this.repayRateRangeMax;
	}

	/**
	 * <p>Setter for the field <code>repayRateRangeMin</code>.</p>
	 *
	 * @param repayRateRangeMin a {@link java.lang.String} object.
	 */
	public void setRepayRateRangeMin(String repayRateRangeMin) {
		this.repayRateRangeMin = repayRateRangeMin;
	}
	/**
	 * <p>Getter for the field <code>repayRateRangeMin</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepayRateRangeMin( ) {
		return this.repayRateRangeMin;
	}

	/**
	 * <p>Setter for the field <code>tradeAmtRangeMax</code>.</p>
	 *
	 * @param tradeAmtRangeMax a {@link java.lang.String} object.
	 */
	public void setTradeAmtRangeMax(String tradeAmtRangeMax) {
		this.tradeAmtRangeMax = tradeAmtRangeMax;
	}
	/**
	 * <p>Getter for the field <code>tradeAmtRangeMax</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeAmtRangeMax( ) {
		return this.tradeAmtRangeMax;
	}

	/**
	 * <p>Setter for the field <code>tradeAmtRangeMin</code>.</p>
	 *
	 * @param tradeAmtRangeMin a {@link java.lang.String} object.
	 */
	public void setTradeAmtRangeMin(String tradeAmtRangeMin) {
		this.tradeAmtRangeMin = tradeAmtRangeMin;
	}
	/**
	 * <p>Getter for the field <code>tradeAmtRangeMin</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeAmtRangeMin( ) {
		return this.tradeAmtRangeMin;
	}

	/**
	 * <p>Setter for the field <code>verifyCountRangeMax</code>.</p>
	 *
	 * @param verifyCountRangeMax a {@link java.lang.String} object.
	 */
	public void setVerifyCountRangeMax(String verifyCountRangeMax) {
		this.verifyCountRangeMax = verifyCountRangeMax;
	}
	/**
	 * <p>Getter for the field <code>verifyCountRangeMax</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVerifyCountRangeMax( ) {
		return this.verifyCountRangeMax;
	}

	/**
	 * <p>Setter for the field <code>verifyCountRangeMin</code>.</p>
	 *
	 * @param verifyCountRangeMin a {@link java.lang.String} object.
	 */
	public void setVerifyCountRangeMin(String verifyCountRangeMin) {
		this.verifyCountRangeMin = verifyCountRangeMin;
	}
	/**
	 * <p>Getter for the field <code>verifyCountRangeMin</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVerifyCountRangeMin( ) {
		return this.verifyCountRangeMin;
	}

}
