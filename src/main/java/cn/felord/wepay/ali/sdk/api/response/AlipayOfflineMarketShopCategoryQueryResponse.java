package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ShopCategoryConfigInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.category.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5199423326233678164L;

	/** 
	 * 门店类目配置信息，包括能够开店的叶子节点类目信息，以及类目约束配置信息。
	 */
	@ApiListField("shop_category_config_infos")
	@ApiField("shop_category_config_info")
	private List<ShopCategoryConfigInfo> shopCategoryConfigInfos;

	/**
	 * <p>Setter for the field <code>shopCategoryConfigInfos</code>.</p>
	 *
	 * @param shopCategoryConfigInfos a {@link java.util.List} object.
	 */
	public void setShopCategoryConfigInfos(List<ShopCategoryConfigInfo> shopCategoryConfigInfos) {
		this.shopCategoryConfigInfos = shopCategoryConfigInfos;
	}
	/**
	 * <p>Getter for the field <code>shopCategoryConfigInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ShopCategoryConfigInfo> getShopCategoryConfigInfos( ) {
		return this.shopCategoryConfigInfos;
	}

}
