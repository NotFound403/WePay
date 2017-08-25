package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.activity.offline.trigger response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignActivityOfflineTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 6386251666174389978L;

	/** 
	 * 外部奖品ID
	 */
	@ApiField("out_prize_id")
	private String outPrizeId;

	/**
	 * <p>Setter for the field <code>outPrizeId</code>.</p>
	 *
	 * @param outPrizeId a {@link java.lang.String} object.
	 */
	public void setOutPrizeId(String outPrizeId) {
		this.outPrizeId = outPrizeId;
	}
	/**
	 * <p>Getter for the field <code>outPrizeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutPrizeId( ) {
		return this.outPrizeId;
	}

}
