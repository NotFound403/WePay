package org.wepay.ali.sdk.api.domain;

import java.util.List;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * isv 回传的门店商品信息查询接口
 *
 * @author auto create
 * @since 1.0, 2017-04-14 18:19:47
 */
public class KoubeiRetailShopitemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3533378483196186947L;

	/**
	 * 查询店铺商品查询入参
	 */
	@ApiListField("shop_items")
	@ApiField("request_ext_shop_item_query")
	private List<RequestExtShopItemQuery> shopItems;

	public List<RequestExtShopItemQuery> getShopItems() {
		return this.shopItems;
	}
	public void setShopItems(List<RequestExtShopItemQuery> shopItems) {
		this.shopItems = shopItems;
	}

}
