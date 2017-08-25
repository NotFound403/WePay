package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务商代商家确认完成
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenServicemarketOrderItemConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1862642835359749494L;

	/**
	 * 商品订单ID
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 商家订购服务选择的某一门店的ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * <p>Getter for the field <code>commodityOrderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommodityOrderId() {
		return this.commodityOrderId;
	}
	/**
	 * <p>Setter for the field <code>commodityOrderId</code>.</p>
	 *
	 * @param commodityOrderId a {@link java.lang.String} object.
	 */
	public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
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
