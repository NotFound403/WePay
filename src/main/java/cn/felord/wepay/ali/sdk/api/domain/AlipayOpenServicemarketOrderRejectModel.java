package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务商拒绝接单
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenServicemarketOrderRejectModel extends AlipayObject {

	private static final long serialVersionUID = 1724725613243982584L;

	/**
	 * 订购服务商品订单ID
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 拒绝接单原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

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
	 * <p>Getter for the field <code>rejectReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRejectReason() {
		return this.rejectReason;
	}
	/**
	 * <p>Setter for the field <code>rejectReason</code>.</p>
	 *
	 * @param rejectReason a {@link java.lang.String} object.
	 */
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

}
