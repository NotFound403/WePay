package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.CampDetail;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.activity.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2384598677775282512L;

	/** 
	 * 活动详情
	 */
	@ApiField("camp_detail")
	private CampDetail campDetail;

	/**
	 * <p>Setter for the field <code>campDetail</code>.</p>
	 *
	 * @param campDetail a {@link cn.felord.wepay.ali.sdk.api.domain.CampDetail} object.
	 */
	public void setCampDetail(CampDetail campDetail) {
		this.campDetail = campDetail;
	}
	/**
	 * <p>Getter for the field <code>campDetail</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.CampDetail} object.
	 */
	public CampDetail getCampDetail( ) {
		return this.campDetail;
	}

}
