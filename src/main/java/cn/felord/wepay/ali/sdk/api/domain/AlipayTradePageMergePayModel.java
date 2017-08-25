package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 统一收单合并支付页面接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradePageMergePayModel extends AlipayObject {

	private static final long serialVersionUID = 6255411196365566195L;

	/**
	 * 子订单详情
	 */
	@ApiListField("order_details")
	@ApiField("order_detail")
	private List<OrderDetail> orderDetails;

	/**
	 * 如果已经和支付宝约定要求子订单明细必须同时支付成功或者同时支付失败则必须传入此参数，且该参数必须在商户端唯一，否则可以不需要填。
	 */
	@ApiField("out_merge_no")
	private String outMergeNo;

	/**
	 * 请求合并的所有订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * <p>Getter for the field <code>orderDetails</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}
	/**
	 * <p>Setter for the field <code>orderDetails</code>.</p>
	 *
	 * @param orderDetails a {@link java.util.List} object.
	 */
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	/**
	 * <p>Getter for the field <code>outMergeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutMergeNo() {
		return this.outMergeNo;
	}
	/**
	 * <p>Setter for the field <code>outMergeNo</code>.</p>
	 *
	 * @param outMergeNo a {@link java.lang.String} object.
	 */
	public void setOutMergeNo(String outMergeNo) {
		this.outMergeNo = outMergeNo;
	}

	/**
	 * <p>Getter for the field <code>timeoutExpress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	/**
	 * <p>Setter for the field <code>timeoutExpress</code>.</p>
	 *
	 * @param timeoutExpress a {@link java.lang.String} object.
	 */
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}
