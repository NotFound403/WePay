package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务订单明细实施项单项取消
 *
 * @author auto create
 * @since 1.0, 2016-08-25 11:11:54
 */
public class AlipayOpenServicemarketOrderItemCancelModel extends AlipayObject {

	private static final long serialVersionUID = 7757152543691633128L;

	/**
	 * 当前门店区域不支持实施
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 订购服务订单ID
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 订购服务门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getCommodityOrderId() {
		return this.commodityOrderId;
	}
	public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
