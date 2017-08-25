package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.whitelist.query response.
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>campId</code>.</p>
	 *
	 * @param campId a {@link java.lang.String} object.
	 */
	public void setCampId(String campId) {
		this.campId = campId;
	}
	/**
	 * <p>Getter for the field <code>campId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampId( ) {
		return this.campId;
	}

	/**
	 * <p>Setter for the field <code>userWhiteList</code>.</p>
	 *
	 * @param userWhiteList a {@link java.lang.String} object.
	 */
	public void setUserWhiteList(String userWhiteList) {
		this.userWhiteList = userWhiteList;
	}
	/**
	 * <p>Getter for the field <code>userWhiteList</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserWhiteList( ) {
		return this.userWhiteList;
	}

}
