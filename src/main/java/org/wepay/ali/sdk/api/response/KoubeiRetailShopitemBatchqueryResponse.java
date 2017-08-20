package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.ExtShopItem;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.shopitem.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 18:19:47
 */
public class KoubeiRetailShopitemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4344559993234289878L;

	/** 
	 * 店铺商品集合
	 */
	@ApiListField("shopitemlist")
	@ApiField("ext_shop_item")
	private List<ExtShopItem> shopitemlist;

	public void setShopitemlist(List<ExtShopItem> shopitemlist) {
		this.shopitemlist = shopitemlist;
	}
	public List<ExtShopItem> getShopitemlist( ) {
		return this.shopitemlist;
	}

}
