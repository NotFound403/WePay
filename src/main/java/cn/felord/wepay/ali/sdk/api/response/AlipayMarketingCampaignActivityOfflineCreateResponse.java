package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.activity.offline.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignActivityOfflineCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4752515664229649568L;

	/** 
	 * 创建成功的活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 创建成功的券模版id
	 */
	@ApiField("prize_id")
	private String prizeId;

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
	 * <p>Setter for the field <code>prizeId</code>.</p>
	 *
	 * @param prizeId a {@link java.lang.String} object.
	 */
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}
	/**
	 * <p>Getter for the field <code>prizeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeId( ) {
		return this.prizeId;
	}

}
