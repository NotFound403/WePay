package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.count response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignCrowdCountResponse extends AlipayResponse {

	private static final long serialVersionUID = 8221986281741454527L;

	/** 
	 * 各个细分维度的值，label为标签code，value为该标签各个标签值对应的统计信息，本示例表示pam_gender这个标签的男有100人，女有1000人满足入参指定的圈人条件
	 */
	@ApiField("dimension_values")
	private String dimensionValues;

	/** 
	 * 人群组的汇总统计值total是人数，sum是交易金额
	 */
	@ApiField("summary_values")
	private String summaryValues;

	/**
	 * <p>Setter for the field <code>dimensionValues</code>.</p>
	 *
	 * @param dimensionValues a {@link java.lang.String} object.
	 */
	public void setDimensionValues(String dimensionValues) {
		this.dimensionValues = dimensionValues;
	}
	/**
	 * <p>Getter for the field <code>dimensionValues</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDimensionValues( ) {
		return this.dimensionValues;
	}

	/**
	 * <p>Setter for the field <code>summaryValues</code>.</p>
	 *
	 * @param summaryValues a {@link java.lang.String} object.
	 */
	public void setSummaryValues(String summaryValues) {
		this.summaryValues = summaryValues;
	}
	/**
	 * <p>Getter for the field <code>summaryValues</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSummaryValues( ) {
		return this.summaryValues;
	}

}
