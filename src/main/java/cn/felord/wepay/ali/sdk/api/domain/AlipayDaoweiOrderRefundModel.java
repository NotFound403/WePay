package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 订单退款接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDaoweiOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2351515345276593235L;

	/**
	 * 退款操作备注信息，用于详述退款单原因（使用该接口，必须要详细说明退款的原因），必填，长度不超过2000字符
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 到位业务订单号，全局唯一，由32位数字组成，用户在到位下单时系统生成并消息同步给商家，商户只能查自己同步到的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部商户的退款id，用于控制退款操作的幂等，不同退款请求保证不同，最大长度不超过64字符
	 */
	@ApiField("out_refund_id")
	private String outRefundId;

	/**
	 * 退款金额，单位是元，商户可以全额退款也可以部分，退款金额不大于订单实际支付金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 订单退款的详细信息：可能包含多个服务订单的退款，内部包含每一个服务的订单号和单个的退款金额
	 */
	@ApiListField("refund_details")
	@ApiField("order_refund_info")
	private List<OrderRefundInfo> refundDetails;

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
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo() {
		return this.orderNo;
	}
	/**
	 * <p>Setter for the field <code>orderNo</code>.</p>
	 *
	 * @param orderNo a {@link java.lang.String} object.
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * <p>Getter for the field <code>outRefundId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRefundId() {
		return this.outRefundId;
	}
	/**
	 * <p>Setter for the field <code>outRefundId</code>.</p>
	 *
	 * @param outRefundId a {@link java.lang.String} object.
	 */
	public void setOutRefundId(String outRefundId) {
		this.outRefundId = outRefundId;
	}

	/**
	 * <p>Getter for the field <code>refundAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundAmount() {
		return this.refundAmount;
	}
	/**
	 * <p>Setter for the field <code>refundAmount</code>.</p>
	 *
	 * @param refundAmount a {@link java.lang.String} object.
	 */
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	/**
	 * <p>Getter for the field <code>refundDetails</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<OrderRefundInfo> getRefundDetails() {
		return this.refundDetails;
	}
	/**
	 * <p>Setter for the field <code>refundDetails</code>.</p>
	 *
	 * @param refundDetails a {@link java.util.List} object.
	 */
	public void setRefundDetails(List<OrderRefundInfo> refundDetails) {
		this.refundDetails = refundDetails;
	}

}
