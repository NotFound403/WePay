package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 批量退款明细结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BatchRefundDetailResult extends AlipayObject {

	private static final long serialVersionUID = 2533294828194465146L;

	/**
	 * 商户请求批量退款时传递的批次号。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 充退状态：S成功，F失败，P处理中。
	 */
	@ApiField("dback_status")
	private String dbackStatus;

	/**
	 * 预估银行响应时间
	 */
	@ApiField("est_bank_ack_time")
	private String estBankAckTime;

	/**
	 * 预估银行入账时间
	 */
	@ApiField("est_bank_receipt_time")
	private String estBankReceiptTime;

	/**
	 * 是否有充退
	 */
	@ApiField("has_deposit_back")
	private Boolean hasDepositBack;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退分润信息列表
	 */
	@ApiListField("refund_royaltys")
	@ApiField("refund_royalty_result")
	private List<RefundRoyaltyResult> refundRoyaltys;

	/**
	 * 退补差金额
	 */
	@ApiField("refund_suppl_amount")
	private String refundSupplAmount;

	/**
	 * 退补差结果码
	 */
	@ApiField("refund_suppl_result_code")
	private String refundSupplResultCode;

	/**
	 * 剩余补差金额
	 */
	@ApiField("rest_suppl_amount")
	private String restSupplAmount;

	/**
	 * 交易退款结果码。如果成功为SUCCESS，如果处理中为PROCESSING，其它情况为错误码。
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 退款解冻信息
	 */
	@ApiField("unfreeze_details")
	private RefundUnfreezeResult unfreezeDetails;

	/**
	 * <p>Getter for the field <code>batchNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchNo() {
		return this.batchNo;
	}
	/**
	 * <p>Setter for the field <code>batchNo</code>.</p>
	 *
	 * @param batchNo a {@link java.lang.String} object.
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	/**
	 * <p>Getter for the field <code>dbackStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDbackStatus() {
		return this.dbackStatus;
	}
	/**
	 * <p>Setter for the field <code>dbackStatus</code>.</p>
	 *
	 * @param dbackStatus a {@link java.lang.String} object.
	 */
	public void setDbackStatus(String dbackStatus) {
		this.dbackStatus = dbackStatus;
	}

	/**
	 * <p>Getter for the field <code>estBankAckTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEstBankAckTime() {
		return this.estBankAckTime;
	}
	/**
	 * <p>Setter for the field <code>estBankAckTime</code>.</p>
	 *
	 * @param estBankAckTime a {@link java.lang.String} object.
	 */
	public void setEstBankAckTime(String estBankAckTime) {
		this.estBankAckTime = estBankAckTime;
	}

	/**
	 * <p>Getter for the field <code>estBankReceiptTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEstBankReceiptTime() {
		return this.estBankReceiptTime;
	}
	/**
	 * <p>Setter for the field <code>estBankReceiptTime</code>.</p>
	 *
	 * @param estBankReceiptTime a {@link java.lang.String} object.
	 */
	public void setEstBankReceiptTime(String estBankReceiptTime) {
		this.estBankReceiptTime = estBankReceiptTime;
	}

	/**
	 * <p>Getter for the field <code>hasDepositBack</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getHasDepositBack() {
		return this.hasDepositBack;
	}
	/**
	 * <p>Setter for the field <code>hasDepositBack</code>.</p>
	 *
	 * @param hasDepositBack a {@link java.lang.Boolean} object.
	 */
	public void setHasDepositBack(Boolean hasDepositBack) {
		this.hasDepositBack = hasDepositBack;
	}

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
	 * <p>Getter for the field <code>refundRoyaltys</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<RefundRoyaltyResult> getRefundRoyaltys() {
		return this.refundRoyaltys;
	}
	/**
	 * <p>Setter for the field <code>refundRoyaltys</code>.</p>
	 *
	 * @param refundRoyaltys a {@link java.util.List} object.
	 */
	public void setRefundRoyaltys(List<RefundRoyaltyResult> refundRoyaltys) {
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
	 * <p>Getter for the field <code>refundSupplResultCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundSupplResultCode() {
		return this.refundSupplResultCode;
	}
	/**
	 * <p>Setter for the field <code>refundSupplResultCode</code>.</p>
	 *
	 * @param refundSupplResultCode a {@link java.lang.String} object.
	 */
	public void setRefundSupplResultCode(String refundSupplResultCode) {
		this.refundSupplResultCode = refundSupplResultCode;
	}

	/**
	 * <p>Getter for the field <code>restSupplAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRestSupplAmount() {
		return this.restSupplAmount;
	}
	/**
	 * <p>Setter for the field <code>restSupplAmount</code>.</p>
	 *
	 * @param restSupplAmount a {@link java.lang.String} object.
	 */
	public void setRestSupplAmount(String restSupplAmount) {
		this.restSupplAmount = restSupplAmount;
	}

	/**
	 * <p>Getter for the field <code>resultCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResultCode() {
		return this.resultCode;
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

	/**
	 * <p>Getter for the field <code>unfreezeDetails</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.RefundUnfreezeResult} object.
	 */
	public RefundUnfreezeResult getUnfreezeDetails() {
		return this.unfreezeDetails;
	}
	/**
	 * <p>Setter for the field <code>unfreezeDetails</code>.</p>
	 *
	 * @param unfreezeDetails a {@link cn.felord.wepay.ali.sdk.api.domain.RefundUnfreezeResult} object.
	 */
	public void setUnfreezeDetails(RefundUnfreezeResult unfreezeDetails) {
		this.unfreezeDetails = unfreezeDetails;
	}

}
