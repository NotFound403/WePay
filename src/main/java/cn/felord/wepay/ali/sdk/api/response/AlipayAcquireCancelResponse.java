package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.acquire.cancel response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAcquireCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4527771548118512381L;

	/** 
	 * 对返回响应码进行原因说明，当result_code响应码为SUCCESS时，不返回该参数
	 */
	@ApiField("detail_error_code")
	private String detailErrorCode;

	/** 
	 * 对详细错误码进行文字说明。
当result_code响应码为SUCCESS时，不返回该参数
	 */
	@ApiField("detail_error_des")
	private String detailErrorDes;

	/** 
	 * 对应商户网站的订单系统中的唯一订单号，非支付宝交易号。
需保证在商户网站中的唯一性。是请求时对应的参数，原样返回。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 撤销处理结果响应码。
SUCCESS：撤销成功
FAIL：撤销失败
UNKNOWN：结果未知
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 对撤销失败的情况下，是否可以继续发起撤销请求的建议。
Y：可继续发起撤销请求；
N：不可继续发起撤销请求，即后续的撤销请求也不会成功。
	 */
	@ApiField("retry_flag")
	private String retryFlag;

	/** 
	 * 该交易在支付宝系统中的交易流水号。
最短16位，最长64位。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Setter for the field <code>detailErrorCode</code>.</p>
	 *
	 * @param detailErrorCode a {@link java.lang.String} object.
	 */
	public void setDetailErrorCode(String detailErrorCode) {
		this.detailErrorCode = detailErrorCode;
	}
	/**
	 * <p>Getter for the field <code>detailErrorCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDetailErrorCode( ) {
		return this.detailErrorCode;
	}

	/**
	 * <p>Setter for the field <code>detailErrorDes</code>.</p>
	 *
	 * @param detailErrorDes a {@link java.lang.String} object.
	 */
	public void setDetailErrorDes(String detailErrorDes) {
		this.detailErrorDes = detailErrorDes;
	}
	/**
	 * <p>Getter for the field <code>detailErrorDes</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDetailErrorDes( ) {
		return this.detailErrorDes;
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
	 * <p>Setter for the field <code>resultCode</code>.</p>
	 *
	 * @param resultCode a {@link java.lang.String} object.
	 */
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	/**
	 * <p>Getter for the field <code>resultCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResultCode( ) {
		return this.resultCode;
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
