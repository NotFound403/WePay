package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.RecruitShopInfo;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.recruit.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-19 14:48:59
 */
public class KoubeiMarketingCampaignRecruitShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2131723726353952374L;

	/** 
	 * 招商活动id
	 */
	@ApiField("plan_id")
	private String planId;

	/** 
	 * 总量
	 */
	@ApiField("shop_count")
	private String shopCount;

	/** 
	 * 招商门店确认详情
	 */
	@ApiListField("shop_info")
	@ApiField("recruit_shop_info")
	private List<RecruitShopInfo> shopInfo;

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanId( ) {
		return this.planId;
	}

	public void setShopCount(String shopCount) {
		this.shopCount = shopCount;
	}
	public String getShopCount( ) {
		return this.shopCount;
	}

	public void setShopInfo(List<RecruitShopInfo> shopInfo) {
		this.shopInfo = shopInfo;
	}
	public List<RecruitShopInfo> getShopInfo( ) {
		return this.shopInfo;
	}

}
