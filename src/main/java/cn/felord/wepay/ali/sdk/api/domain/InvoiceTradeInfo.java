package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 发票管家交易信息模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvoiceTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 8525342656181238497L;

	/**
	 * 支付宝交易号（字段于2017-02-21废弃，请勿使用）
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 交易创建时间 yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("create_trade_date")
	private String createTradeDate;

	/**
	 * 交易号（发票管家指定）
	 */
	@ApiField("einv_trade_id")
	private String einvTradeId;

	/**
	 * 交易商品总称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 品牌全称，由商户在发票管家配置
	 */
	@ApiField("m_name")
	private String mName;

	/**
	 * 交易商户品牌简称
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 交易所属的商户id，即卖家主体标志，可以为支付宝的门店id
也可以为支付宝的签约pid，也可以为支付宝的收款账户seller_user_id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户交易订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 交易支付时间 yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("payment_trade_date")
	private String paymentTradeDate;

	/**
	 * 实际付款金额，不包含商户优惠金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 商户门店全称，由商户在发票管家配置
	 */
	@ApiField("sub_m_name")
	private String subMName;

	/**
	 * 商户交易门店简称，一般由m_short_name+sub_m_short_name确定唯一的商户，这两项配置需要商户提前在支付宝配置
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	/**
	 * 交易总金额，精确到小数点两位，以元为单位
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易资金明细列表
	 */
	@ApiListField("trade_fund_list")
	@ApiField("invoice_trade_fund_item")
	private List<InvoiceTradeFundItem> tradeFundList;

	/**
	 * 交易商品明细列表
	 */
	@ApiListField("trade_goods_list")
	@ApiField("invoice_trade_goods_item")
	private List<InvoiceTradeGoodsItem> tradeGoodsList;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易的买家支付宝账户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>alipayTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	/**
	 * <p>Setter for the field <code>alipayTradeNo</code>.</p>
	 *
	 * @param alipayTradeNo a {@link java.lang.String} object.
	 */
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	/**
	 * <p>Getter for the field <code>createTradeDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreateTradeDate() {
		return this.createTradeDate;
	}
	/**
	 * <p>Setter for the field <code>createTradeDate</code>.</p>
	 *
	 * @param createTradeDate a {@link java.lang.String} object.
	 */
	public void setCreateTradeDate(String createTradeDate) {
		this.createTradeDate = createTradeDate;
	}

	/**
	 * <p>Getter for the field <code>einvTradeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEinvTradeId() {
		return this.einvTradeId;
	}
	/**
	 * <p>Setter for the field <code>einvTradeId</code>.</p>
	 *
	 * @param einvTradeId a {@link java.lang.String} object.
	 */
	public void setEinvTradeId(String einvTradeId) {
		this.einvTradeId = einvTradeId;
	}

	/**
	 * <p>Getter for the field <code>goodsName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGoodsName() {
		return this.goodsName;
	}
	/**
	 * <p>Setter for the field <code>goodsName</code>.</p>
	 *
	 * @param goodsName a {@link java.lang.String} object.
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * <p>Getter for the field <code>mName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getmName() {
		return this.mName;
	}
	/**
	 * <p>Setter for the field <code>mName</code>.</p>
	 *
	 * @param mName a {@link java.lang.String} object.
	 */
	public void setmName(String mName) {
		this.mName = mName;
	}

	/**
	 * <p>Getter for the field <code>mShortName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getmShortName() {
		return this.mShortName;
	}
	/**
	 * <p>Setter for the field <code>mShortName</code>.</p>
	 *
	 * @param mShortName a {@link java.lang.String} object.
	 */
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	/**
	 * <p>Getter for the field <code>merchantId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantId() {
		return this.merchantId;
	}
	/**
	 * <p>Setter for the field <code>merchantId</code>.</p>
	 *
	 * @param merchantId a {@link java.lang.String} object.
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * <p>Getter for the field <code>paymentTradeDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentTradeDate() {
		return this.paymentTradeDate;
	}
	/**
	 * <p>Setter for the field <code>paymentTradeDate</code>.</p>
	 *
	 * @param paymentTradeDate a {@link java.lang.String} object.
	 */
	public void setPaymentTradeDate(String paymentTradeDate) {
		this.paymentTradeDate = paymentTradeDate;
	}

	/**
	 * <p>Getter for the field <code>realAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRealAmount() {
		return this.realAmount;
	}
	/**
	 * <p>Setter for the field <code>realAmount</code>.</p>
	 *
	 * @param realAmount a {@link java.lang.String} object.
	 */
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	/**
	 * <p>Getter for the field <code>subMName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubMName() {
		return this.subMName;
	}
	/**
	 * <p>Setter for the field <code>subMName</code>.</p>
	 *
	 * @param subMName a {@link java.lang.String} object.
	 */
	public void setSubMName(String subMName) {
		this.subMName = subMName;
	}

	/**
	 * <p>Getter for the field <code>subMShortName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubMShortName() {
		return this.subMShortName;
	}
	/**
	 * <p>Setter for the field <code>subMShortName</code>.</p>
	 *
	 * @param subMShortName a {@link java.lang.String} object.
	 */
	public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

	/**
	 * <p>Getter for the field <code>tradeAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeAmount() {
		return this.tradeAmount;
	}
	/**
	 * <p>Setter for the field <code>tradeAmount</code>.</p>
	 *
	 * @param tradeAmount a {@link java.lang.String} object.
	 */
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	/**
	 * <p>Getter for the field <code>tradeFundList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InvoiceTradeFundItem> getTradeFundList() {
		return this.tradeFundList;
	}
	/**
	 * <p>Setter for the field <code>tradeFundList</code>.</p>
	 *
	 * @param tradeFundList a {@link java.util.List} object.
	 */
	public void setTradeFundList(List<InvoiceTradeFundItem> tradeFundList) {
		this.tradeFundList = tradeFundList;
	}

	/**
	 * <p>Getter for the field <code>tradeGoodsList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InvoiceTradeGoodsItem> getTradeGoodsList() {
		return this.tradeGoodsList;
	}
	/**
	 * <p>Setter for the field <code>tradeGoodsList</code>.</p>
	 *
	 * @param tradeGoodsList a {@link java.util.List} object.
	 */
	public void setTradeGoodsList(List<InvoiceTradeGoodsItem> tradeGoodsList) {
		this.tradeGoodsList = tradeGoodsList;
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
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
