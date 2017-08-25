package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.customs.declare response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradeCustomsDeclareResponse extends AlipayResponse {

	private static final long serialVersionUID = 4287557618282797583L;

	/** 
	 * 支付宝报关流水号。
	 */
	@ApiField("alipay_declare_no")
	private String alipayDeclareNo;

	/** 
	 * 订购人身份信息和支付人的身份信息验证结果。T表示商户传入的订购人姓名和身份证号和支付人的姓名和身份证号一致。F代表商户传入的订购人姓名和身份证号和支付人的姓名和身份证号不一致。对于同一笔报关单支付宝只会校验一次，如果多次重推不会返回此参数。
	 */
	@ApiField("identity_check")
	private String identityCheck;

	/** 
	 * 支付宝推送到海关的支付单据号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Setter for the field <code>alipayDeclareNo</code>.</p>
	 *
	 * @param alipayDeclareNo a {@link java.lang.String} object.
	 */
	public void setAlipayDeclareNo(String alipayDeclareNo) {
		this.alipayDeclareNo = alipayDeclareNo;
	}
	/**
	 * <p>Getter for the field <code>alipayDeclareNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayDeclareNo( ) {
		return this.alipayDeclareNo;
	}

	/**
	 * <p>Setter for the field <code>identityCheck</code>.</p>
	 *
	 * @param identityCheck a {@link java.lang.String} object.
	 */
	public void setIdentityCheck(String identityCheck) {
		this.identityCheck = identityCheck;
	}
	/**
	 * <p>Getter for the field <code>identityCheck</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdentityCheck( ) {
		return this.identityCheck;
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
