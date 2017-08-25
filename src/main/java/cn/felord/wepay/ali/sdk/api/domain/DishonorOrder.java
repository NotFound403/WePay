package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 退票订单
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DishonorOrder extends AlipayObject {

	private static final long serialVersionUID = 6497956714116636135L;

	/**
	 * 退票金额：单位：元。
只支持2位小数，小数点前最大支持13位，金额必须大于0。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 退票时间：格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("dishonor_date")
	private String dishonorDate;

	/**
	 * 退票原因：银行返回的退票原因。
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 支付宝转账单据号。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户转账唯一订单号:发起转账来源方定义的转账单据号。该参数的赋值均以查询结果中的out_biz_no为准。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付时间:格式为yyyy-MM-dd HH:mm:ss。转账失败不返回。
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 付款方账户:付款方支付宝唯一标识（2088开头16位数字字符串）或支付宝会员登录号（邮箱或手机号）
	 */
	@ApiField("payer_account")
	private String payerAccount;

	/**
	 * 提现流水号。
	 */
	@ApiField("payment_no")
	private String paymentNo;

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
	 * <p>Getter for the field <code>dishonorDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDishonorDate() {
		return this.dishonorDate;
	}
	/**
	 * <p>Setter for the field <code>dishonorDate</code>.</p>
	 *
	 * @param dishonorDate a {@link java.lang.String} object.
	 */
	public void setDishonorDate(String dishonorDate) {
		this.dishonorDate = dishonorDate;
	}

	/**
	 * <p>Getter for the field <code>failReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFailReason() {
		return this.failReason;
	}
	/**
	 * <p>Setter for the field <code>failReason</code>.</p>
	 *
	 * @param failReason a {@link java.lang.String} object.
	 */
	public void setFailReason(String failReason) {
		this.failReason = failReason;
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

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * <p>Getter for the field <code>payDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayDate() {
		return this.payDate;
	}
	/**
	 * <p>Setter for the field <code>payDate</code>.</p>
	 *
	 * @param payDate a {@link java.lang.String} object.
	 */
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	/**
	 * <p>Getter for the field <code>payerAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayerAccount() {
		return this.payerAccount;
	}
	/**
	 * <p>Setter for the field <code>payerAccount</code>.</p>
	 *
	 * @param payerAccount a {@link java.lang.String} object.
	 */
	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}

	/**
	 * <p>Getter for the field <code>paymentNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentNo() {
		return this.paymentNo;
	}
	/**
	 * <p>Setter for the field <code>paymentNo</code>.</p>
	 *
	 * @param paymentNo a {@link java.lang.String} object.
	 */
	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}

}
