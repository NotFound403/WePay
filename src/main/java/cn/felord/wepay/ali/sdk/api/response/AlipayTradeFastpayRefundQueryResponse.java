package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.fastpay.refund.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradeFastpayRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7568517338952549336L;

	/** 
	 * 本笔退款对应的退款请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 创建交易传入的商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 本次退款请求，对应的退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 发起退款时，传入的退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/** 
	 * 该笔退款所对应的交易的订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Setter for the field <code>outRequestNo</code>.</p>
	 *
	 * @param outRequestNo a {@link java.lang.String} object.
	 */
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	/**
	 * <p>Getter for the field <code>outRequestNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	/**
	 * <p>Setter for the field <code>outTradeNo</code>.</p>
	 *
	 * @param outTradeNo a {@link java.lang.String} object.
	 */
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	/**
	 * <p>Getter for the field <code>outTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutTradeNo( ) {
		return this.outTradeNo;
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
	 * <p>Getter for the field <code>refundAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	/**
	 * <p>Setter for the field <code>refundReason</code>.</p>
	 *
	 * @param refundReason a {@link java.lang.String} object.
	 */
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	/**
	 * <p>Getter for the field <code>refundReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundReason( ) {
		return this.refundReason;
	}

	/**
	 * <p>Setter for the field <code>totalAmount</code>.</p>
	 *
	 * @param totalAmount a {@link java.lang.String} object.
	 */
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * <p>Getter for the field <code>totalAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	/**
	 * <p>Setter for the field <code>tradeNo</code>.</p>
	 *
	 * @param tradeNo a {@link java.lang.String} object.
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	/**
	 * <p>Getter for the field <code>tradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
