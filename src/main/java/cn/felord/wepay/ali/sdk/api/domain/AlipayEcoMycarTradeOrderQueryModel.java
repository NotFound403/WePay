package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 交易订单查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarTradeOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3798371463985842857L;

	/**
	 * 车主平台交易号，与车主业务平台订单号相同。和trade_no，out_biz_trade_no不能同时为空。
	 */
	@ApiField("biz_trade_no")
	private String bizTradeNo;

	/**
	 * 外部订单号，和biz_trade_no，trade_no不能同时为空
	 */
	@ApiField("out_biz_trade_no")
	private String outBizTradeNo;

	/**
	 * 支付宝交易号。该笔车主平台对应的支付宝交易编号，使用该交易号也可以直接调用支付宝开放平台的交易查询接口查询交易信息。 和biz_trade_no，out_biz_trade_no不能同时为空。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Getter for the field <code>bizTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizTradeNo() {
		return this.bizTradeNo;
	}
	/**
	 * <p>Setter for the field <code>bizTradeNo</code>.</p>
	 *
	 * @param bizTradeNo a {@link java.lang.String} object.
	 */
	public void setBizTradeNo(String bizTradeNo) {
		this.bizTradeNo = bizTradeNo;
	}

	/**
	 * <p>Getter for the field <code>outBizTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizTradeNo() {
		return this.outBizTradeNo;
	}
	/**
	 * <p>Setter for the field <code>outBizTradeNo</code>.</p>
	 *
	 * @param outBizTradeNo a {@link java.lang.String} object.
	 */
	public void setOutBizTradeNo(String outBizTradeNo) {
		this.outBizTradeNo = outBizTradeNo;
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
