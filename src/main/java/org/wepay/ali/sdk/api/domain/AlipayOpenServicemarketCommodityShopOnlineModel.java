package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 门店上架处理
 *
 * @author auto create
 * @since 1.0, 2016-08-25 11:12:07
 */
public class AlipayOpenServicemarketCommodityShopOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 4226318152961571388L;

	/**
	 * 服务插件ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
