package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignCrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5152532228582249748L;

	/** 
	 * 返回的人群组的唯一标识
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/**
	 * <p>Setter for the field <code>crowdGroupId</code>.</p>
	 *
	 * @param crowdGroupId a {@link java.lang.String} object.
	 */
	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}
	/**
	 * <p>Getter for the field <code>crowdGroupId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCrowdGroupId( ) {
		return this.crowdGroupId;
	}

}
