package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.TradeFundBill;
import cn.felord.wepay.ali.sdk.api.domain.VoucherDetail;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.pay response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 1875165765435935336L;

	/** 
	 * 异步支付模式，先享后付业务会返回该参数，目前有三种值：
ASYNC_DELAY_PAY(异步延时付款);
ASYNC_REALTIME_PAY(异步准实时付款);
SYNC_DIRECT_PAY(同步直接扣款);
	 */
	@ApiField("async_payment_mode")
	private String asyncPaymentMode;

	/** 
	 * 买家支付宝账号
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家付款的金额
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 支付宝卡余额
	 */
	@ApiField("card_balance")
	private String cardBalance;

	/** 
	 * 本次交易支付所使用的单品券优惠的商品优惠信息
	 */
	@ApiField("discount_goods_detail")
	private String discountGoodsDetail;

	/** 
	 * 交易支付使用的资金渠道
	 */
	@ApiListField("fund_bill_list")
	@ApiField("trade_fund_bill")
	private List<TradeFundBill> fundBillList;

	/** 
	 * 交易支付时间
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 交易中可给用户开具发票的金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 买家支付宝用户号,该参数已废弃，请不要使用
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 使用积分宝付款的金额
	 */
	@ApiField("point_amount")
	private String pointAmount;

	/** 
	 * 实收金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 发生支付交易的商户门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/** 
	 * 交易金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 本交易支付时使用的所有优惠券信息
	 */
	@ApiListField("voucher_detail_list")
	@ApiField("voucher_detail")
	private List<VoucherDetail> voucherDetailList;

	/**
	 * <p>Setter for the field <code>asyncPaymentMode</code>.</p>
	 *
	 * @param asyncPaymentMode a {@link java.lang.String} object.
	 */
	public void setAsyncPaymentMode(String asyncPaymentMode) {
		this.asyncPaymentMode = asyncPaymentMode;
	}
	/**
	 * <p>Getter for the field <code>asyncPaymentMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAsyncPaymentMode( ) {
		return this.asyncPaymentMode;
	}

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
	 * <p>Setter for the field <code>buyerPayAmount</code>.</p>
	 *
	 * @param buyerPayAmount a {@link java.lang.String} object.
	 */
	public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}
	/**
	 * <p>Getter for the field <code>buyerPayAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerPayAmount( ) {
		return this.buyerPayAmount;
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
	 * <p>Setter for the field <code>cardBalance</code>.</p>
	 *
	 * @param cardBalance a {@link java.lang.String} object.
	 */
	public void setCardBalance(String cardBalance) {
		this.cardBalance = cardBalance;
	}
	/**
	 * <p>Getter for the field <code>cardBalance</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardBalance( ) {
		return this.cardBalance;
	}

	/**
	 * <p>Setter for the field <code>discountGoodsDetail</code>.</p>
	 *
	 * @param discountGoodsDetail a {@link java.lang.String} object.
	 */
	public void setDiscountGoodsDetail(String discountGoodsDetail) {
		this.discountGoodsDetail = discountGoodsDetail;
	}
	/**
	 * <p>Getter for the field <code>discountGoodsDetail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDiscountGoodsDetail( ) {
		return this.discountGoodsDetail;
	}

	/**
	 * <p>Setter for the field <code>fundBillList</code>.</p>
	 *
	 * @param fundBillList a {@link java.util.List} object.
	 */
	public void setFundBillList(List<TradeFundBill> fundBillList) {
		this.fundBillList = fundBillList;
	}
	/**
	 * <p>Getter for the field <code>fundBillList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<TradeFundBill> getFundBillList( ) {
		return this.fundBillList;
	}

	/**
	 * <p>Setter for the field <code>gmtPayment</code>.</p>
	 *
	 * @param gmtPayment a {@link java.util.Date} object.
	 */
	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	/**
	 * <p>Getter for the field <code>gmtPayment</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

	/**
	 * <p>Setter for the field <code>invoiceAmount</code>.</p>
	 *
	 * @param invoiceAmount a {@link java.lang.String} object.
	 */
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	/**
	 * <p>Getter for the field <code>invoiceAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceAmount( ) {
		return this.invoiceAmount;
	}

	/**
	 * <p>Setter for the field <code>openId</code>.</p>
	 *
	 * @param openId a {@link java.lang.String} object.
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	/**
	 * <p>Getter for the field <code>openId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpenId( ) {
		return this.openId;
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
	 * <p>Setter for the field <code>pointAmount</code>.</p>
	 *
	 * @param pointAmount a {@link java.lang.String} object.
	 */
	public void setPointAmount(String pointAmount) {
		this.pointAmount = pointAmount;
	}
	/**
	 * <p>Getter for the field <code>pointAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPointAmount( ) {
		return this.pointAmount;
	}

	/**
	 * <p>Setter for the field <code>receiptAmount</code>.</p>
	 *
	 * @param receiptAmount a {@link java.lang.String} object.
	 */
	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	/**
	 * <p>Getter for the field <code>receiptAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiptAmount( ) {
		return this.receiptAmount;
	}

	/**
	 * <p>Setter for the field <code>storeName</code>.</p>
	 *
	 * @param storeName a {@link java.lang.String} object.
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	/**
	 * <p>Getter for the field <code>storeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStoreName( ) {
		return this.storeName;
	}

	/**
	 * <p>Setter for the field <code>totalAmount</code>.</p>
	 *
	 * @param totalAmount a {@link java.lang.String} object.
	 */
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * <p>Getter for the field <code>totalAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalAmount( ) {
		return this.totalAmount;
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
	 * <p>Setter for the field <code>voucherDetailList</code>.</p>
	 *
	 * @param voucherDetailList a {@link java.util.List} object.
	 */
	public void setVoucherDetailList(List<VoucherDetail> voucherDetailList) {
		this.voucherDetailList = voucherDetailList;
	}
	/**
	 * <p>Getter for the field <code>voucherDetailList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<VoucherDetail> getVoucherDetailList( ) {
		return this.voucherDetailList;
	}

}
