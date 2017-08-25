package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付能力回传结果信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PaymentAbilityPostbackResponse extends AlipayObject {

	private static final long serialVersionUID = 7169324797248665237L;

	/**
	 * 错误的订单信息
	 */
	@ApiField("error_order")
	private String errorOrder;

	/**
	 * 成功的订单列表,逗号分隔
	 */
	@ApiField("order_ids")
	private String orderIds;

	/**
	 * <p>Getter for the field <code>errorOrder</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorOrder() {
		return this.errorOrder;
	}
	/**
	 * <p>Setter for the field <code>errorOrder</code>.</p>
	 *
	 * @param errorOrder a {@link java.lang.String} object.
	 */
	public void setErrorOrder(String errorOrder) {
		this.errorOrder = errorOrder;
	}

	/**
	 * <p>Getter for the field <code>orderIds</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderIds() {
		return this.orderIds;
	}
	/**
	 * <p>Setter for the field <code>orderIds</code>.</p>
	 *
	 * @param orderIds a {@link java.lang.String} object.
	 */
	public void setOrderIds(String orderIds) {
		this.orderIds = orderIds;
	}

}
