package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * isv 回传的门店商品信息查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiRetailShopitemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3533378483196186947L;

	/**
	 * 查询店铺商品查询入参
	 */
	@ApiListField("shop_items")
	@ApiField("request_ext_shop_item_query")
	private List<RequestExtShopItemQuery> shopItems;

	/**
	 * <p>Getter for the field <code>shopItems</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<RequestExtShopItemQuery> getShopItems() {
		return this.shopItems;
	}
	/**
	 * <p>Setter for the field <code>shopItems</code>.</p>
	 *
	 * @param shopItems a {@link java.util.List} object.
	 */
	public void setShopItems(List<RequestExtShopItemQuery> shopItems) {
		this.shopItems = shopItems;
	}

}
