package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 申请流水撤销
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopApplyorderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6181419973955654491L;

	/**
	 * 撤销申请流水的原因
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作人ID，开店请求时候的操作人ID
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 要撤销的订单ID，当店铺创建、修改接口迁移至2.0时，同步返回的apply_id可以用作此接口的入参。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>opId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpId() {
		return this.opId;
	}
	/**
	 * <p>Setter for the field <code>opId</code>.</p>
	 *
	 * @param opId a {@link java.lang.String} object.
	 */
	public void setOpId(String opId) {
		this.opId = opId;
	}

	/**
	 * <p>Getter for the field <code>orderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderId() {
		return this.orderId;
	}
	/**
	 * <p>Setter for the field <code>orderId</code>.</p>
	 *
	 * @param orderId a {@link java.lang.String} object.
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
