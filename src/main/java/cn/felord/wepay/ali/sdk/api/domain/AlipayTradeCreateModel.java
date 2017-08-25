package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 商户通过该接口进行交易的创建下单
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4684285566227496931L;

	/**
	 * 支付宝的店铺编号
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/**
	 * 对交易或商品的描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 买家的支付宝唯一用户号（2088开头的16位纯数字）,和buyer_logon_id不能同时为空
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝账号，和buyer_id不能同时为空
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/**
	 * 禁用渠道,用户不可用指定渠道支付
注，与enable_pay_channels互斥
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 可打折金额.
参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
如果该值未传入，但传入了【订单总金额】，【不可打折金额】则该值默认为【订单总金额】-【不可打折金额】
	 */
	@ApiField("discountable_amount")
	private String discountableAmount;

	/**
	 * 可用渠道,用户只能在指定渠道范围内支付
注，与disable_pay_channels互斥
	 */
	@ApiField("enable_pay_channels")
	private String enablePayChannels;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private ExtendParams extendParams;

	/**
	 * 订单包含的商品列表信息.Json格式.
其它说明详见：“商品明细说明”
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 商户原始订单号，最大长度限制32位
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 商户操作员编号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 描述分账信息，json格式。
	 */
	@ApiField("royalty_info")
	private RoyaltyInfo royaltyInfo;

	/**
	 * 卖家支付宝用户ID。
如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 二级商户信息,当前只对特殊银行机构特定场景下使用此字段
	 */
	@ApiField("sub_merchant")
	private SubMerchant subMerchant;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 商户机具终端编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
如果同时传入了【打折金额】，【不可打折金额】，【订单总金额】三者，则必须满足如下条件：【订单总金额】=【打折金额】+【不可打折金额】
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不可打折金额.
不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
如果该值未传入，但传入了【订单总金额】,【打折金额】，则该值默认为【订单总金额】-【打折金额】
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	/**
	 * <p>Getter for the field <code>alipayStoreId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayStoreId() {
		return this.alipayStoreId;
	}
	/**
	 * <p>Setter for the field <code>alipayStoreId</code>.</p>
	 *
	 * @param alipayStoreId a {@link java.lang.String} object.
	 */
	public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}

	/**
	 * <p>Getter for the field <code>body</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBody() {
		return this.body;
	}
	/**
	 * <p>Setter for the field <code>body</code>.</p>
	 *
	 * @param body a {@link java.lang.String} object.
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * <p>Getter for the field <code>buyerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerId() {
		return this.buyerId;
	}
	/**
	 * <p>Setter for the field <code>buyerId</code>.</p>
	 *
	 * @param buyerId a {@link java.lang.String} object.
	 */
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	/**
	 * <p>Getter for the field <code>buyerLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerLogonId() {
		return this.buyerLogonId;
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
	 * <p>Getter for the field <code>disablePayChannels</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisablePayChannels() {
		return this.disablePayChannels;
	}
	/**
	 * <p>Setter for the field <code>disablePayChannels</code>.</p>
	 *
	 * @param disablePayChannels a {@link java.lang.String} object.
	 */
	public void setDisablePayChannels(String disablePayChannels) {
		this.disablePayChannels = disablePayChannels;
	}

	/**
	 * <p>Getter for the field <code>discountableAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDiscountableAmount() {
		return this.discountableAmount;
	}
	/**
	 * <p>Setter for the field <code>discountableAmount</code>.</p>
	 *
	 * @param discountableAmount a {@link java.lang.String} object.
	 */
	public void setDiscountableAmount(String discountableAmount) {
		this.discountableAmount = discountableAmount;
	}

	/**
	 * <p>Getter for the field <code>enablePayChannels</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnablePayChannels() {
		return this.enablePayChannels;
	}
	/**
	 * <p>Setter for the field <code>enablePayChannels</code>.</p>
	 *
	 * @param enablePayChannels a {@link java.lang.String} object.
	 */
	public void setEnablePayChannels(String enablePayChannels) {
		this.enablePayChannels = enablePayChannels;
	}

	/**
	 * <p>Getter for the field <code>extendParams</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ExtendParams} object.
	 */
	public ExtendParams getExtendParams() {
		return this.extendParams;
	}
	/**
	 * <p>Setter for the field <code>extendParams</code>.</p>
	 *
	 * @param extendParams a {@link cn.felord.wepay.ali.sdk.api.domain.ExtendParams} object.
	 */
	public void setExtendParams(ExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	/**
	 * <p>Getter for the field <code>goodsDetail</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<GoodsDetail> getGoodsDetail() {
		return this.goodsDetail;
	}
	/**
	 * <p>Setter for the field <code>goodsDetail</code>.</p>
	 *
	 * @param goodsDetail a {@link java.util.List} object.
	 */
	public void setGoodsDetail(List<GoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	/**
	 * <p>Getter for the field <code>merchantOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	/**
	 * <p>Setter for the field <code>merchantOrderNo</code>.</p>
	 *
	 * @param merchantOrderNo a {@link java.lang.String} object.
	 */
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	/**
	 * <p>Getter for the field <code>operatorId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	/**
	 * <p>Setter for the field <code>operatorId</code>.</p>
	 *
	 * @param operatorId a {@link java.lang.String} object.
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * <p>Getter for the field <code>outTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutTradeNo() {
		return this.outTradeNo;
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
	 * <p>Getter for the field <code>royaltyInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.RoyaltyInfo} object.
	 */
	public RoyaltyInfo getRoyaltyInfo() {
		return this.royaltyInfo;
	}
	/**
	 * <p>Setter for the field <code>royaltyInfo</code>.</p>
	 *
	 * @param royaltyInfo a {@link cn.felord.wepay.ali.sdk.api.domain.RoyaltyInfo} object.
	 */
	public void setRoyaltyInfo(RoyaltyInfo royaltyInfo) {
		this.royaltyInfo = royaltyInfo;
	}

	/**
	 * <p>Getter for the field <code>sellerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerId() {
		return this.sellerId;
	}
	/**
	 * <p>Setter for the field <code>sellerId</code>.</p>
	 *
	 * @param sellerId a {@link java.lang.String} object.
	 */
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	/**
	 * <p>Getter for the field <code>storeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStoreId() {
		return this.storeId;
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
	 * <p>Getter for the field <code>subMerchant</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.SubMerchant} object.
	 */
	public SubMerchant getSubMerchant() {
		return this.subMerchant;
	}
	/**
	 * <p>Setter for the field <code>subMerchant</code>.</p>
	 *
	 * @param subMerchant a {@link cn.felord.wepay.ali.sdk.api.domain.SubMerchant} object.
	 */
	public void setSubMerchant(SubMerchant subMerchant) {
		this.subMerchant = subMerchant;
	}

	/**
	 * <p>Getter for the field <code>subject</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubject() {
		return this.subject;
	}
	/**
	 * <p>Setter for the field <code>subject</code>.</p>
	 *
	 * @param subject a {@link java.lang.String} object.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * <p>Getter for the field <code>terminalId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTerminalId() {
		return this.terminalId;
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
	 * <p>Getter for the field <code>timeoutExpress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	/**
	 * <p>Setter for the field <code>timeoutExpress</code>.</p>
	 *
	 * @param timeoutExpress a {@link java.lang.String} object.
	 */
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

	/**
	 * <p>Getter for the field <code>totalAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalAmount() {
		return this.totalAmount;
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
	 * <p>Getter for the field <code>undiscountableAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}
	/**
	 * <p>Setter for the field <code>undiscountableAmount</code>.</p>
	 *
	 * @param undiscountableAmount a {@link java.lang.String} object.
	 */
	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

}
