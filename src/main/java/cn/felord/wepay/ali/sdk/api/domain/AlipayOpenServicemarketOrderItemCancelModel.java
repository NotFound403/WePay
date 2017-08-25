package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务订单明细实施项单项取消
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>cancelReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCancelReason() {
		return this.cancelReason;
	}
	/**
	 * <p>Setter for the field <code>cancelReason</code>.</p>
	 *
	 * @param cancelReason a {@link java.lang.String} object.
	 */
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

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
