package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 手艺人门店关系
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CraftsmanShopRelationOpenModel extends AlipayObject {

	private static final long serialVersionUID = 8188817622887447381L;

	/**
	 * 推荐权重。整数。小于等于0表示不在口碑店铺页展示 大于0表示在口碑店铺页展示， 值越大，排序越靠前。
	 */
	@ApiField("recommend_weight")
	private Long recommendWeight;

	/**
	 * 口碑门店ID，可通过门店摘要信息批量查询接口 alipay.offline.market.shop.summary.batchquery获取。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * <p>Getter for the field <code>recommendWeight</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRecommendWeight() {
		return this.recommendWeight;
	}
	/**
	 * <p>Setter for the field <code>recommendWeight</code>.</p>
	 *
	 * @param recommendWeight a {@link java.lang.Long} object.
	 */
	public void setRecommendWeight(Long recommendWeight) {
		this.recommendWeight = recommendWeight;
	}

	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
