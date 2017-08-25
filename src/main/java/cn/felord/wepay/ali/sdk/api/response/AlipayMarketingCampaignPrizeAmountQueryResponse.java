package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.prize.amount.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignPrizeAmountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4341946533363291394L;

	/** 
	 * 奖品剩余数量，数值
	 */
	@ApiField("remain_amount")
	private String remainAmount;

	/**
	 * <p>Setter for the field <code>remainAmount</code>.</p>
	 *
	 * @param remainAmount a {@link java.lang.String} object.
	 */
	public void setRemainAmount(String remainAmount) {
		this.remainAmount = remainAmount;
	}
	/**
	 * <p>Getter for the field <code>remainAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRemainAmount( ) {
		return this.remainAmount;
	}

}
