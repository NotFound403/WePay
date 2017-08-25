package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ExtShopItem;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.shopitem.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiRetailShopitemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4344559993234289878L;

	/** 
	 * 店铺商品集合
	 */
	@ApiListField("shopitemlist")
	@ApiField("ext_shop_item")
	private List<ExtShopItem> shopitemlist;

	/**
	 * <p>Setter for the field <code>shopitemlist</code>.</p>
	 *
	 * @param shopitemlist a {@link java.util.List} object.
	 */
	public void setShopitemlist(List<ExtShopItem> shopitemlist) {
		this.shopitemlist = shopitemlist;
	}
	/**
	 * <p>Getter for the field <code>shopitemlist</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ExtShopItem> getShopitemlist( ) {
		return this.shopitemlist;
	}

}
