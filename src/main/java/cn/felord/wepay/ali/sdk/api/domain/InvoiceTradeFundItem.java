package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝交易支付工具
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvoiceTradeFundItem extends AlipayObject {

	private static final long serialVersionUID = 2127985952672627554L;

	/**
	 * 当前支付工具支付的金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付宝支付工具描述
	 */
	@ApiField("payment_tool_name")
	private String paymentToolName;

	/**
	 * 支付宝支付工具类型
	 */
	@ApiField("payment_tool_type")
	private String paymentToolType;

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * <p>Getter for the field <code>paymentToolName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentToolName() {
		return this.paymentToolName;
	}
	/**
	 * <p>Setter for the field <code>paymentToolName</code>.</p>
	 *
	 * @param paymentToolName a {@link java.lang.String} object.
	 */
	public void setPaymentToolName(String paymentToolName) {
		this.paymentToolName = paymentToolName;
	}

	/**
	 * <p>Getter for the field <code>paymentToolType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentToolType() {
		return this.paymentToolType;
	}
	/**
	 * <p>Setter for the field <code>paymentToolType</code>.</p>
	 *
	 * @param paymentToolType a {@link java.lang.String} object.
	 */
	public void setPaymentToolType(String paymentToolType) {
		this.paymentToolType = paymentToolType;
	}

}
