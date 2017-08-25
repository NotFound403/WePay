package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.cancel response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradeCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6575558355149338752L;

	/** 
	 * 本次撤销触发的交易动作
close：关闭交易，无退款
refund：产生了退款
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 是否需要重试
	 */
	@ApiField("retry_flag")
	private String retryFlag;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Setter for the field <code>action</code>.</p>
	 *
	 * @param action a {@link java.lang.String} object.
	 */
	public void setAction(String action) {
		this.action = action;
	}
	/**
	 * <p>Getter for the field <code>action</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAction( ) {
		return this.action;
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
	 * <p>Setter for the field <code>retryFlag</code>.</p>
	 *
	 * @param retryFlag a {@link java.lang.String} object.
	 */
	public void setRetryFlag(String retryFlag) {
		this.retryFlag = retryFlag;
	}
	/**
	 * <p>Getter for the field <code>retryFlag</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRetryFlag( ) {
		return this.retryFlag;
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
