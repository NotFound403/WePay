package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cash.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignCashCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5733214868141855942L;

	/** 
	 * 生成的现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/** 
	 * 原始活动号,商户排查问题时提供的活动依据
	 */
	@ApiField("origin_crowd_no")
	private String originCrowdNo;

	/** 
	 * 活动创建后的付款链接，返回的是urlencode编码后的字符串。需要先进行urldecode解码，然后在浏览器中进行访问，会先进行支付宝登录引导，然后商户进行付款。
	 */
	@ApiField("pay_url")
	private String payUrl;

	/**
	 * <p>Setter for the field <code>crowdNo</code>.</p>
	 *
	 * @param crowdNo a {@link java.lang.String} object.
	 */
	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}
	/**
	 * <p>Getter for the field <code>crowdNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCrowdNo( ) {
		return this.crowdNo;
	}

	/**
	 * <p>Setter for the field <code>originCrowdNo</code>.</p>
	 *
	 * @param originCrowdNo a {@link java.lang.String} object.
	 */
	public void setOriginCrowdNo(String originCrowdNo) {
		this.originCrowdNo = originCrowdNo;
	}
	/**
	 * <p>Getter for the field <code>originCrowdNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginCrowdNo( ) {
		return this.originCrowdNo;
	}

	/**
	 * <p>Setter for the field <code>payUrl</code>.</p>
	 *
	 * @param payUrl a {@link java.lang.String} object.
	 */
	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	/**
	 * <p>Getter for the field <code>payUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayUrl( ) {
		return this.payUrl;
	}

}
