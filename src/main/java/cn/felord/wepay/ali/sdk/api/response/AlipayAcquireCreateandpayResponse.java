package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.acquire.createandpay response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAcquireCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 8487242988858384635L;

	/** 
	 * 买家支付宝账号，可以为email或者手机号。对部分信息进行了隐藏。
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数字。
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 对返回响应码进行原因说明，请参见“10.2 业务错误码”。
当result_code响应码为ORDER_SUCCESS_PAY_SUCCESS时，不返回该参数。
	 */
	@ApiField("detail_error_code")
	private String detailErrorCode;

	/** 
	 * 对详细错误码进行文字说明。
当result_code响应码为ORDER_SUCCESS_PAY_SUCCESS时，不返回该参数。
	 */
	@ApiField("detail_error_des")
	private String detailErrorDes;

	/** 
	 * 支付后返回的其他信息，如预付卡金额，key值mcard_fee，以Json格式返回。
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/** 
	 * 7085502131376415
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 下单并支付处理结果响应码，请参见“10.1 业务响应码”。
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 该交易在支付宝系统中的交易流水号。
最短16位，最长64位。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Setter for the field <code>buyerLogonId</code>.</p>
	 *
	 * @param buyerLogonId a {@link java.lang.String} object.
	 */
	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}
	/**
	 * <p>Getter for the field <code>buyerLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerLogonId( ) {
		return this.buyerLogonId;
	}

	/**
	 * <p>Setter for the field <code>buyerUserId</code>.</p>
	 *
	 * @param buyerUserId a {@link java.lang.String} object.
	 */
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	/**
	 * <p>Getter for the field <code>buyerUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

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
	 * <p>Setter for the field <code>extendInfo</code>.</p>
	 *
	 * @param extendInfo a {@link java.lang.String} object.
	 */
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	/**
	 * <p>Getter for the field <code>extendInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendInfo( ) {
		return this.extendInfo;
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
