package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cdp.advertise.report.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCdpAdvertiseReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4499424418788948925L;

	/** 
	 * 日点击量
	 */
	@ApiField("click_pv_dd")
	private String clickPvDd;

	/** 
	 * 历史累积点击量
	 */
	@ApiField("click_pv_history")
	private String clickPvHistory;

	/** 
	 * 日点击用户数
	 */
	@ApiField("click_uv_dd")
	private String clickUvDd;

	/** 
	 * 历史累积点击用户数
	 */
	@ApiField("click_uv_history")
	private String clickUvHistory;

	/** 
	 * 效果分析日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/** 
	 * 日曝光量
	 */
	@ApiField("show_pv_dd")
	private String showPvDd;

	/** 
	 * 历史累积曝光量
	 */
	@ApiField("show_pv_history")
	private String showPvHistory;

	/** 
	 * 日曝光用户数
	 */
	@ApiField("show_uv_dd")
	private String showUvDd;

	/** 
	 * 历史累积曝光用户数
	 */
	@ApiField("show_uv_history")
	private String showUvHistory;

	/**
	 * <p>Setter for the field <code>clickPvDd</code>.</p>
	 *
	 * @param clickPvDd a {@link java.lang.String} object.
	 */
	public void setClickPvDd(String clickPvDd) {
		this.clickPvDd = clickPvDd;
	}
	/**
	 * <p>Getter for the field <code>clickPvDd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClickPvDd( ) {
		return this.clickPvDd;
	}

	/**
	 * <p>Setter for the field <code>clickPvHistory</code>.</p>
	 *
	 * @param clickPvHistory a {@link java.lang.String} object.
	 */
	public void setClickPvHistory(String clickPvHistory) {
		this.clickPvHistory = clickPvHistory;
	}
	/**
	 * <p>Getter for the field <code>clickPvHistory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClickPvHistory( ) {
		return this.clickPvHistory;
	}

	/**
	 * <p>Setter for the field <code>clickUvDd</code>.</p>
	 *
	 * @param clickUvDd a {@link java.lang.String} object.
	 */
	public void setClickUvDd(String clickUvDd) {
		this.clickUvDd = clickUvDd;
	}
	/**
	 * <p>Getter for the field <code>clickUvDd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClickUvDd( ) {
		return this.clickUvDd;
	}

	/**
	 * <p>Setter for the field <code>clickUvHistory</code>.</p>
	 *
	 * @param clickUvHistory a {@link java.lang.String} object.
	 */
	public void setClickUvHistory(String clickUvHistory) {
		this.clickUvHistory = clickUvHistory;
	}
	/**
	 * <p>Getter for the field <code>clickUvHistory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClickUvHistory( ) {
		return this.clickUvHistory;
	}

	/**
	 * <p>Setter for the field <code>reportDate</code>.</p>
	 *
	 * @param reportDate a {@link java.lang.String} object.
	 */
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	/**
	 * <p>Getter for the field <code>reportDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReportDate( ) {
		return this.reportDate;
	}

	/**
	 * <p>Setter for the field <code>showPvDd</code>.</p>
	 *
	 * @param showPvDd a {@link java.lang.String} object.
	 */
	public void setShowPvDd(String showPvDd) {
		this.showPvDd = showPvDd;
	}
	/**
	 * <p>Getter for the field <code>showPvDd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShowPvDd( ) {
		return this.showPvDd;
	}

	/**
	 * <p>Setter for the field <code>showPvHistory</code>.</p>
	 *
	 * @param showPvHistory a {@link java.lang.String} object.
	 */
	public void setShowPvHistory(String showPvHistory) {
		this.showPvHistory = showPvHistory;
	}
	/**
	 * <p>Getter for the field <code>showPvHistory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShowPvHistory( ) {
		return this.showPvHistory;
	}

	/**
	 * <p>Setter for the field <code>showUvDd</code>.</p>
	 *
	 * @param showUvDd a {@link java.lang.String} object.
	 */
	public void setShowUvDd(String showUvDd) {
		this.showUvDd = showUvDd;
	}
	/**
	 * <p>Getter for the field <code>showUvDd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShowUvDd( ) {
		return this.showUvDd;
	}

	/**
	 * <p>Setter for the field <code>showUvHistory</code>.</p>
	 *
	 * @param showUvHistory a {@link java.lang.String} object.
	 */
	public void setShowUvHistory(String showUvHistory) {
		this.showUvHistory = showUvHistory;
	}
	/**
	 * <p>Getter for the field <code>showUvHistory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShowUvHistory( ) {
		return this.showUvHistory;
	}

}
