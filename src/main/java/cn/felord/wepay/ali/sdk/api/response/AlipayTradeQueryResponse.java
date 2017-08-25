package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.TradeFundBill;
import cn.felord.wepay.ali.sdk.api.domain.VoucherDetail;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5819587161763399639L;

	/** 
	 * 支付宝店铺编号
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/** 
	 * 买家支付宝账号
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家实付金额，单位为元，两位小数。该金额代表该笔交易买家实际支付的金额，不包含商户折扣等金额
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

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
	 * 行业特殊信息（例如在医保卡支付业务中，向用户返回医疗信息）。
	 */
	@ApiField("industry_sepc_detail")
	private String industrySepcDetail;

	/** 
	 * 交易中用户支付的可开具发票的金额，单位为元，两位小数。该金额代表该笔交易中可以给用户开具发票的金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 买家支付宝用户号，该字段将废弃，不要使用
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 商家订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 积分支付的金额，单位为元，两位小数。该金额代表该笔交易中用户使用积分支付的金额，比如集分宝或者支付宝实时优惠等
	 */
	@ApiField("point_amount")
	private String pointAmount;

	/** 
	 * 实收金额，单位为元，两位小数。该金额为本笔交易，商户账户能够实际收到的金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 本次交易打款给卖家的时间
	 */
	@ApiField("send_pay_date")
	private Date sendPayDate;

	/** 
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/** 
	 * 请求交易支付中的商户店铺的名称
	 */
	@ApiField("store_name")
	private String storeName;

	/** 
	 * 商户机具终端编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/** 
	 * 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/** 
	 * 本交易支付时使用的所有优惠券信息
	 */
	@ApiListField("voucher_detail_list")
	@ApiField("voucher_detail")
	private List<VoucherDetail> voucherDetailList;

	/**
	 * <p>Setter for the field <code>alipayStoreId</code>.</p>
	 *
	 * @param alipayStoreId a {@link java.lang.String} object.
	 */
	public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}
	/**
	 * <p>Getter for the field <code>alipayStoreId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayStoreId( ) {
		return this.alipayStoreId;
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
	 * <p>Setter for the field <code>industrySepcDetail</code>.</p>
	 *
	 * @param industrySepcDetail a {@link java.lang.String} object.
	 */
	public void setIndustrySepcDetail(String industrySepcDetail) {
		this.industrySepcDetail = industrySepcDetail;
	}
	/**
	 * <p>Getter for the field <code>industrySepcDetail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIndustrySepcDetail( ) {
		return this.industrySepcDetail;
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
	 * <p>Setter for the field <code>sendPayDate</code>.</p>
	 *
	 * @param sendPayDate a {@link java.util.Date} object.
	 */
	public void setSendPayDate(Date sendPayDate) {
		this.sendPayDate = sendPayDate;
	}
	/**
	 * <p>Getter for the field <code>sendPayDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getSendPayDate( ) {
		return this.sendPayDate;
	}

	/**
	 * <p>Setter for the field <code>storeId</code>.</p>
	 *
	 * @param storeId a {@link java.lang.String} object.
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	/**
	 * <p>Getter for the field <code>storeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStoreId( ) {
		return this.storeId;
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
	 * <p>Setter for the field <code>terminalId</code>.</p>
	 *
	 * @param terminalId a {@link java.lang.String} object.
	 */
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	/**
	 * <p>Getter for the field <code>terminalId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTerminalId( ) {
		return this.terminalId;
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
	 * <p>Setter for the field <code>tradeStatus</code>.</p>
	 *
	 * @param tradeStatus a {@link java.lang.String} object.
	 */
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	/**
	 * <p>Getter for the field <code>tradeStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeStatus( ) {
		return this.tradeStatus;
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
