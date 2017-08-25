package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务商接单操作
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenServicemarketOrderAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 2155624714532621827L;

	/**
	 * 服务商品订单ID
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

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

}
