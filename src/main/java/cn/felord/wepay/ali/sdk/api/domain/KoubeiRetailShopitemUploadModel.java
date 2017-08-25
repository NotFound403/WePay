package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * isv 回传的门店商品信息上传接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiRetailShopitemUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3143737625855158787L;

	/**
	 * 上传的商品集合
	 */
	@ApiListField("shop_items")
	@ApiField("request_ext_shop_item")
	private List<RequestExtShopItem> shopItems;

	/**
	 * <p>Getter for the field <code>shopItems</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<RequestExtShopItem> getShopItems() {
		return this.shopItems;
	}
	/**
	 * <p>Setter for the field <code>shopItems</code>.</p>
	 *
	 * @param shopItems a {@link java.util.List} object.
	 */
	public void setShopItems(List<RequestExtShopItem> shopItems) {
		this.shopItems = shopItems;
	}

}
