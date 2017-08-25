package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 用于在线下场景交易一次创建并支付掉
 *修改路由策略到R
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradePayModel extends AlipayObject {

	private static final long serialVersionUID = 1481791677918294894L;

	/**
	 * 代扣业务需要传入协议相关信息
	 */
	@ApiField("agreement_params")
	private AgreementParams agreementParams;

	/**
	 * 支付宝的店铺编号
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/**
	 * 支付授权码，25~30开头的长度为16~24位的数字，实际字符串长度以开发者获取的付款码长度为准
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 预授权号，预授权转交易请求中传入，适用于预授权转交易业务使用，目前只支持FUND_TRADE_FAST_PAY（资金订单即时到帐交易）、境外预授权产品（OVERSEAS_AUTH_PAY）两个产品。
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 订单描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 商户传入业务信息，具体值需要与支付宝约定
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 买家的支付宝用户id，如果为空，会从传入了码值信息中获取买家ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 禁用支付渠道,多个渠道以逗号分割，如同时禁用信用支付类型和积分，则disable_pay_channels="credit_group,point"
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
如果该值未传入，但传入了【订单总金额】和【不可打折金额】，则该值默认为【订单总金额】-【不可打折金额】
	 */
	@ApiField("discountable_amount")
	private String discountableAmount;

	/**
	 * 外部指定买家
	 */
	@ApiField("ext_user_info")
	private ExtUserInfo extUserInfo;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private ExtendParams extendParams;

	/**
	 * 订单包含的商品列表信息，Json格式，其它说明详见商品明细说明
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 商户的原始订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 商户操作员编号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 描述分账信息，Json格式，其它说明详见分账说明
	 */
	@ApiField("royalty_info")
	private RoyaltyInfo royaltyInfo;

	/**
	 * 支付场景
条码支付，取值：bar_code
声波支付，取值：wave_code
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 间连受理商户信息体，当前只对特殊银行机构特定场景下使用此字段
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
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
如果同时传入【可打折金额】和【不可打折金额】，该参数可以不用传入；
如果同时传入了【可打折金额】，【不可打折金额】，【订单总金额】三者，则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。如果该值未传入，但传入了【订单总金额】和【可打折金额】，则该值默认为【订单总金额】-【可打折金额】
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	/**
	 * <p>Getter for the field <code>agreementParams</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AgreementParams} object.
	 */
	public AgreementParams getAgreementParams() {
		return this.agreementParams;
	}
	/**
	 * <p>Setter for the field <code>agreementParams</code>.</p>
	 *
	 * @param agreementParams a {@link cn.felord.wepay.ali.sdk.api.domain.AgreementParams} object.
	 */
	public void setAgreementParams(AgreementParams agreementParams) {
		this.agreementParams = agreementParams;
	}

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
	 * <p>Getter for the field <code>authCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthCode() {
		return this.authCode;
	}
	/**
	 * <p>Setter for the field <code>authCode</code>.</p>
	 *
	 * @param authCode a {@link java.lang.String} object.
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	/**
	 * <p>Getter for the field <code>authNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthNo() {
		return this.authNo;
	}
	/**
	 * <p>Setter for the field <code>authNo</code>.</p>
	 *
	 * @param authNo a {@link java.lang.String} object.
	 */
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
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
	 * <p>Getter for the field <code>businessParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessParams() {
		return this.businessParams;
	}
	/**
	 * <p>Setter for the field <code>businessParams</code>.</p>
	 *
	 * @param businessParams a {@link java.lang.String} object.
	 */
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
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
	 * <p>Getter for the field <code>extUserInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ExtUserInfo} object.
	 */
	public ExtUserInfo getExtUserInfo() {
		return this.extUserInfo;
	}
	/**
	 * <p>Setter for the field <code>extUserInfo</code>.</p>
	 *
	 * @param extUserInfo a {@link cn.felord.wepay.ali.sdk.api.domain.ExtUserInfo} object.
	 */
	public void setExtUserInfo(ExtUserInfo extUserInfo) {
		this.extUserInfo = extUserInfo;
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
	 * <p>Getter for the field <code>productCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductCode() {
		return this.productCode;
	}
	/**
	 * <p>Setter for the field <code>productCode</code>.</p>
	 *
	 * @param productCode a {@link java.lang.String} object.
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
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
	 * <p>Getter for the field <code>scene</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getScene() {
		return this.scene;
	}
	/**
	 * <p>Setter for the field <code>scene</code>.</p>
	 *
	 * @param scene a {@link java.lang.String} object.
	 */
	public void setScene(String scene) {
		this.scene = scene;
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
