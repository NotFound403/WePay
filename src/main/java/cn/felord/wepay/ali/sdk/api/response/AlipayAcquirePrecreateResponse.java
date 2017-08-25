package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.acquire.precreate response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAcquirePrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5665923641819477985L;

	/** 
	 * 详细错误码。对返回响应码进行原因说明
当result_code响应码为SUCCESS时，不返回该参数。
	 */
	@ApiField("detail_error_code")
	private String detailErrorCode;

	/** 
	 * 对详细错误码进行文字说明
当result_code响应码为SUCCESS时，不返回该参数
	 */
	@ApiField("detail_error_des")
	private String detailErrorDes;

	/** 
	 * 错误代码。
请求成功时，不存在本参数；
请求失败时，本参数为错误代码
	 */
	@ApiField("error")
	private String error;

	/** 
	 * 请求是否成功。请求成功不代表业务处理成功
T代表成功
F代表失败
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 对应商户网站的订单系统中的唯一订单号，非支付宝交易号。
需保证在商户网站中的唯一性。是请求时对应的参数，原样返回
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 二维码图片的URL地址
	 */
	@ApiField("pic_url")
	private String picUrl;

	/** 
	 * 二维码码串的内容
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 预下单处理结果响应码。
SUCCESS：预下单成功
FAIL：预下单失败
UNKNOWN：结果未知
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 支付宝交易号。该交易在支付宝系统中的交易流水号。
最短16位，最长64位
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 凭证类型，目前仅支持qrcode（二维码）
	 */
	@ApiField("voucher_type")
	private String voucherType;

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
	 * <p>Setter for the field <code>error</code>.</p>
	 *
	 * @param error a {@link java.lang.String} object.
	 */
	public void setError(String error) {
		this.error = error;
	}
	/**
	 * <p>Getter for the field <code>error</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getError( ) {
		return this.error;
	}

	/**
	 * <p>Setter for the field <code>isSuccess</code>.</p>
	 *
	 * @param isSuccess a {@link java.lang.String} object.
	 */
	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	/**
	 * <p>Getter for the field <code>isSuccess</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsSuccess( ) {
		return this.isSuccess;
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
	 * <p>Setter for the field <code>picUrl</code>.</p>
	 *
	 * @param picUrl a {@link java.lang.String} object.
	 */
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	/**
	 * <p>Getter for the field <code>picUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPicUrl( ) {
		return this.picUrl;
	}

	/**
	 * <p>Setter for the field <code>qrCode</code>.</p>
	 *
	 * @param qrCode a {@link java.lang.String} object.
	 */
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	/**
	 * <p>Getter for the field <code>qrCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrCode( ) {
		return this.qrCode;
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

	/**
	 * <p>Setter for the field <code>voucherType</code>.</p>
	 *
	 * @param voucherType a {@link java.lang.String} object.
	 */
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	/**
	 * <p>Getter for the field <code>voucherType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherType( ) {
		return this.voucherType;
	}

}
