package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ShopDiscountInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.discount.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-11 15:21:56
 */
public class AlipayOfflineMarketShopDiscountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2519598122193893614L;

	/** 
	 * 优惠信息列表，最大20条，按生效时间排序
	 */
	@ApiListField("discount_list")
	@ApiField("shop_discount_info")
	private List<ShopDiscountInfo> discountList;

	/** 
	 * 商品列表，最大20条，按申领数量排序
	 */
	@ApiListField("item_list")
	@ApiField("shop_discount_info")
	private List<ShopDiscountInfo> itemList;

	public void setDiscountList(List<ShopDiscountInfo> discountList) {
		this.discountList = discountList;
	}
	public List<ShopDiscountInfo> getDiscountList( ) {
		return this.discountList;
	}

	public void setItemList(List<ShopDiscountInfo> itemList) {
		this.itemList = itemList;
	}
	public List<ShopDiscountInfo> getItemList( ) {
		return this.itemList;
	}

}