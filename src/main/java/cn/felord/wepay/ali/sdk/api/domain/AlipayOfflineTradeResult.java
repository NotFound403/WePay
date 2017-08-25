package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 脱机交易执行结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineTradeResult extends AlipayObject {

	private static final long serialVersionUID = 3529388552618215821L;

	/**
	 * 系统异常
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 脱机交易处理结果描述
	 */
	@ApiField("message")
	private String message;

	/**
	 * 表示是否需要重试
	 */
	@ApiField("need_retry")
	private Boolean needRetry;

	/**
	 * 交易需要重试时下一次重试时间
	 */
	@ApiField("next_try_time")
	private String nextTryTime;

	/**
	 * 支付宝外部交易号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 业务处理结果,SUCCESS：处理成功，FAIL：处理失败， UNKNOWN:结果未知。当结果非SUCCESS时，检查need_retry判断是否需要重试。
	 */
	@ApiField("result")
	private String result;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Getter for the field <code>errorCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorCode() {
		return this.errorCode;
	}
	/**
	 * <p>Setter for the field <code>errorCode</code>.</p>
	 *
	 * @param errorCode a {@link java.lang.String} object.
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * <p>Getter for the field <code>errorMessage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorMessage() {
		return this.errorMessage;
	}
	/**
	 * <p>Setter for the field <code>errorMessage</code>.</p>
	 *
	 * @param errorMessage a {@link java.lang.String} object.
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * <p>Getter for the field <code>message</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMessage() {
		return this.message;
	}
	/**
	 * <p>Setter for the field <code>message</code>.</p>
	 *
	 * @param message a {@link java.lang.String} object.
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * <p>Getter for the field <code>needRetry</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getNeedRetry() {
		return this.needRetry;
	}
	/**
	 * <p>Setter for the field <code>needRetry</code>.</p>
	 *
	 * @param needRetry a {@link java.lang.Boolean} object.
	 */
	public void setNeedRetry(Boolean needRetry) {
		this.needRetry = needRetry;
	}

	/**
	 * <p>Getter for the field <code>nextTryTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNextTryTime() {
		return this.nextTryTime;
	}
	/**
	 * <p>Setter for the field <code>nextTryTime</code>.</p>
	 *
	 * @param nextTryTime a {@link java.lang.String} object.
	 */
	public void setNextTryTime(String nextTryTime) {
		this.nextTryTime = nextTryTime;
	}

	/**
	 * <p>Getter for the field <code>outTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutTradeNo() {
		return this.outTradeNo;
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
	 * <p>Getter for the field <code>result</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResult() {
		return this.result;
	}
	/**
	 * <p>Setter for the field <code>result</code>.</p>
	 *
	 * @param result a {@link java.lang.String} object.
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * <p>Getter for the field <code>tradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeNo() {
		return this.tradeNo;
	}
	/**
	 * <p>Setter for the field <code>tradeNo</code>.</p>
	 *
	 * @param tradeNo a {@link java.lang.String} object.
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
