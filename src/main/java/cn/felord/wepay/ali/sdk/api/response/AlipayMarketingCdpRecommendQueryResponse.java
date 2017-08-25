package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cdp.recommend.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCdpRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2542493983227687597L;

	/** 
	 * 当前推荐的唯一标识,用于不同方案的效果跟踪
	 */
	@ApiField("recommend_id")
	private String recommendId;

	/** 
	 * 商家信息列表，最多返回20条，返回json数组，包含shopTitle=店名；cuisine=菜系；address=具体位置；bizCircle=所属商圈；discount=优惠；orderCount=已领/已享人数；avgPrice=人均价格；starLevel=评分；distance=距离（单位米）。以上属性可以为空或不存在
	 */
	@ApiField("shop_info")
	private String shopInfo;

	/**
	 * <p>Setter for the field <code>recommendId</code>.</p>
	 *
	 * @param recommendId a {@link java.lang.String} object.
	 */
	public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}
	/**
	 * <p>Getter for the field <code>recommendId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRecommendId( ) {
		return this.recommendId;
	}

	/**
	 * <p>Setter for the field <code>shopInfo</code>.</p>
	 *
	 * @param shopInfo a {@link java.lang.String} object.
	 */
	public void setShopInfo(String shopInfo) {
		this.shopInfo = shopInfo;
	}
	/**
	 * <p>Getter for the field <code>shopInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopInfo( ) {
		return this.shopInfo;
	}

}
