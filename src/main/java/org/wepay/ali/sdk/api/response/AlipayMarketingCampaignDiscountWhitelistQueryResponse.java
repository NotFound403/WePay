package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.whitelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-03 16:48:04
 */
public class AlipayMarketingCampaignDiscountWhitelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1584266695245319621L;

	/** 
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 活动id.白名单,","隔开，最多100个
	 */
	@ApiField("user_white_list")
	private String userWhiteList;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

	public void setUserWhiteList(String userWhiteList) {
		this.userWhiteList = userWhiteList;
	}
	public String getUserWhiteList( ) {
		return this.userWhiteList;
	}

}
