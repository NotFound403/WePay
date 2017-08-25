package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 汽车超人退款节接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarTradeRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2395981158934966698L;

	/**
	 * 渠道平台
	 */
	@ApiField("isv")
	private String isv;

	/**
	 * 退款金额(分)
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款交易编号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Getter for the field <code>isv</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsv() {
		return this.isv;
	}
	/**
	 * <p>Setter for the field <code>isv</code>.</p>
	 *
	 * @param isv a {@link java.lang.String} object.
	 */
	public void setIsv(String isv) {
		this.isv = isv;
	}

	/**
	 * <p>Getter for the field <code>refundFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundFee() {
		return this.refundFee;
	}
	/**
	 * <p>Setter for the field <code>refundFee</code>.</p>
	 *
	 * @param refundFee a {@link java.lang.String} object.
	 */
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	/**
	 * <p>Getter for the field <code>refundReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundReason() {
		return this.refundReason;
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
