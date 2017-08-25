package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.RecruitShopInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.recruit.shop.query response.
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>planId</code>.</p>
	 *
	 * @param planId a {@link java.lang.String} object.
	 */
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	/**
	 * <p>Getter for the field <code>planId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPlanId( ) {
		return this.planId;
	}

	/**
	 * <p>Setter for the field <code>shopCount</code>.</p>
	 *
	 * @param shopCount a {@link java.lang.String} object.
	 */
	public void setShopCount(String shopCount) {
		this.shopCount = shopCount;
	}
	/**
	 * <p>Getter for the field <code>shopCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopCount( ) {
		return this.shopCount;
	}

	/**
	 * <p>Setter for the field <code>shopInfo</code>.</p>
	 *
	 * @param shopInfo a {@link java.util.List} object.
	 */
	public void setShopInfo(List<RecruitShopInfo> shopInfo) {
		this.shopInfo = shopInfo;
	}
	/**
	 * <p>Getter for the field <code>shopInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<RecruitShopInfo> getShopInfo( ) {
		return this.shopInfo;
	}

}
