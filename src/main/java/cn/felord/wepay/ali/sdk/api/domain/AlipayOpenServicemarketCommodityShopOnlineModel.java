package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 门店上架处理
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>commodityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommodityId() {
		return this.commodityId;
	}
	/**
	 * <p>Setter for the field <code>commodityId</code>.</p>
	 *
	 * @param commodityId a {@link java.lang.String} object.
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
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
