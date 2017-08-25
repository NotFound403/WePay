package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 手机网站支付接口2.0
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradeWapPayModel extends AlipayObject {

	private static final long serialVersionUID = 4121182324472153476L;

	/**
	 * 针对用户授权接口，获取用户相关数据时，用于标识用户授权关系
	 */
	@ApiField("auth_token")
	private String authToken;

	/**
	 * Iphone6 16G
	 */
	@ApiField("body")
	private String body;

	/**
	 * 禁用渠道，用户不可用指定渠道支付
当有多个渠道时用“,”分隔
注，与enable_pay_channels互斥
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 可用渠道，用户只能在指定渠道范围内支付
当有多个渠道时用“,”分隔
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
	 * 商品主类型 :0-虚拟类商品,1-实物类商品
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 开票信息
	 */
	@ApiField("invoice_info")
	private InvoiceInfo invoiceInfo;

	/**
	 * 商户网站唯一订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝只会在同步返回（包括跳转回商户网站）和异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 销售产品码，商家和支付宝签约的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 优惠参数
注：仅与支付宝协商后可用
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * 用户付款中途退出返回商户网站的地址
	 */
	@ApiField("quit_url")
	private String quitUrl;

	/**
	 * 描述分账信息，Json格式，详见分账参数说明
	 */
	@ApiField("royalty_info")
	private RoyaltyInfo royaltyInfo;

	/**
	 * 收款支付宝用户ID。 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 指定渠道，目前仅支持传入pcredit
若由于用户原因渠道不可用，用户可选择是否用其他渠道支付。
注：该参数不可与花呗分期参数同时传入
	 */
	@ApiField("specified_channel")
	private String specifiedChannel;

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
	 * 商品的标题/交易标题/订单标题/订单关键字等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 绝对超时时间，格式为yyyy-MM-dd HH:mm。
	 */
	@ApiField("time_expire")
	private String timeExpire;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * <p>Getter for the field <code>authToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthToken() {
		return this.authToken;
	}
	/**
	 * <p>Setter for the field <code>authToken</code>.</p>
	 *
	 * @param authToken a {@link java.lang.String} object.
	 */
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
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
	 * <p>Getter for the field <code>goodsType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGoodsType() {
		return this.goodsType;
	}
	/**
	 * <p>Setter for the field <code>goodsType</code>.</p>
	 *
	 * @param goodsType a {@link java.lang.String} object.
	 */
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	/**
	 * <p>Getter for the field <code>invoiceInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InvoiceInfo} object.
	 */
	public InvoiceInfo getInvoiceInfo() {
		return this.invoiceInfo;
	}
	/**
	 * <p>Setter for the field <code>invoiceInfo</code>.</p>
	 *
	 * @param invoiceInfo a {@link cn.felord.wepay.ali.sdk.api.domain.InvoiceInfo} object.
	 */
	public void setInvoiceInfo(InvoiceInfo invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
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
	 * <p>Getter for the field <code>passbackParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPassbackParams() {
		return this.passbackParams;
	}
	/**
	 * <p>Setter for the field <code>passbackParams</code>.</p>
	 *
	 * @param passbackParams a {@link java.lang.String} object.
	 */
	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
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
	 * <p>Getter for the field <code>promoParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPromoParams() {
		return this.promoParams;
	}
	/**
	 * <p>Setter for the field <code>promoParams</code>.</p>
	 *
	 * @param promoParams a {@link java.lang.String} object.
	 */
	public void setPromoParams(String promoParams) {
		this.promoParams = promoParams;
	}

	/**
	 * <p>Getter for the field <code>quitUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQuitUrl() {
		return this.quitUrl;
	}
	/**
	 * <p>Setter for the field <code>quitUrl</code>.</p>
	 *
	 * @param quitUrl a {@link java.lang.String} object.
	 */
	public void setQuitUrl(String quitUrl) {
		this.quitUrl = quitUrl;
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
	 * <p>Getter for the field <code>specifiedChannel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpecifiedChannel() {
		return this.specifiedChannel;
	}
	/**
	 * <p>Setter for the field <code>specifiedChannel</code>.</p>
	 *
	 * @param specifiedChannel a {@link java.lang.String} object.
	 */
	public void setSpecifiedChannel(String specifiedChannel) {
		this.specifiedChannel = specifiedChannel;
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
	 * <p>Getter for the field <code>timeExpire</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTimeExpire() {
		return this.timeExpire;
	}
	/**
	 * <p>Setter for the field <code>timeExpire</code>.</p>
	 *
	 * @param timeExpire a {@link java.lang.String} object.
	 */
	public void setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
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

}
