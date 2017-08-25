package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 退款明细信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RefundDetail extends AlipayObject {

	private static final long serialVersionUID = 7154511637292911849L;

	/**
	 * 交易退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款备注
	 */
	@ApiField("refund_memo")
	private String refundMemo;

	/**
	 * 退分润列表
	 */
	@ApiListField("refund_royaltys")
	@ApiField("refund_royalty_info")
	private List<RefundRoyaltyInfo> refundRoyaltys;

	/**
	 * 退补差金额
	 */
	@ApiField("refund_suppl_amount")
	private String refundSupplAmount;

	/**
	 * 退补差备注
	 */
	@ApiField("refund_suppl_memo")
	private String refundSupplMemo;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

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
	 * <p>Getter for the field <code>refundMemo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundMemo() {
		return this.refundMemo;
	}
	/**
	 * <p>Setter for the field <code>refundMemo</code>.</p>
	 *
	 * @param refundMemo a {@link java.lang.String} object.
	 */
	public void setRefundMemo(String refundMemo) {
		this.refundMemo = refundMemo;
	}

	/**
	 * <p>Getter for the field <code>refundRoyaltys</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<RefundRoyaltyInfo> getRefundRoyaltys() {
		return this.refundRoyaltys;
	}
	/**
	 * <p>Setter for the field <code>refundRoyaltys</code>.</p>
	 *
	 * @param refundRoyaltys a {@link java.util.List} object.
	 */
	public void setRefundRoyaltys(List<RefundRoyaltyInfo> refundRoyaltys) {
		this.refundRoyaltys = refundRoyaltys;
	}

	/**
	 * <p>Getter for the field <code>refundSupplAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundSupplAmount() {
		return this.refundSupplAmount;
	}
	/**
	 * <p>Setter for the field <code>refundSupplAmount</code>.</p>
	 *
	 * @param refundSupplAmount a {@link java.lang.String} object.
	 */
	public void setRefundSupplAmount(String refundSupplAmount) {
		this.refundSupplAmount = refundSupplAmount;
	}

	/**
	 * <p>Getter for the field <code>refundSupplMemo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundSupplMemo() {
		return this.refundSupplMemo;
	}
	/**
	 * <p>Setter for the field <code>refundSupplMemo</code>.</p>
	 *
	 * @param refundSupplMemo a {@link java.lang.String} object.
	 */
	public void setRefundSupplMemo(String refundSupplMemo) {
		this.refundSupplMemo = refundSupplMemo;
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
