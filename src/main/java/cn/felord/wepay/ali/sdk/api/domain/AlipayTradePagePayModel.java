package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 统一收单下单并支付页面接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradePagePayModel extends AlipayObject {

	private static final long serialVersionUID = 8795415881381493245L;

	/**
	 * 签约参数，支付后签约场景使用
	 */
	@ApiField("agreement_sign_params")
	private AgreementSignParams agreementSignParams;

	/**
	 * 订单描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 禁用渠道,用户不可用指定渠道支付
注，与enable_pay_channels互斥
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

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
	 * 订单包含的商品列表信息，Json格式，其它说明详见商品明细说明
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 商品主类型 :0-虚拟类商品,1-实物类商品
注：虚拟类商品不支持使用花呗渠道
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 请求后页面的集成方式。
取值范围：
1. ALIAPP：支付宝钱包内
2. PCWEB：PC端访问
默认值为PCWEB。
	 */
	@ApiField("integration_type")
	private String integrationType;

	/**
	 * 开票信息
	 */
	@ApiField("invoice_info")
	private InvoiceInfo invoiceInfo;

	/**
	 * 商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝只会在同步返回（包括跳转回商户网站）和异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 销售产品码，与支付宝签约的产品码名称。
注：目前仅支持FAST_INSTANT_TRADE_PAY
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
	 * PC扫码支付的方式，支持前置模式和

跳转模式。
前置模式是将二维码前置到商户
的订单确认页的模式。需要商户在
自己的页面中以 iframe 方式请求
支付宝页面。具体分为以下几种：
0：订单码-简约前置模式，对应 iframe 宽度不能小于600px，高度不能小于300px；
1：订单码-前置模式，对应iframe 宽度不能小于 300px，高度不能小于600px；
3：订单码-迷你前置模式，对应 iframe 宽度不能小于 75px，高度不能小于75px；
4：订单码-可定义宽度的嵌入式二维码，商户可根据需要设定二维码的大小。

跳转模式下，用户的扫码界面是由支付宝生成的，不在商户的域名下。
2：订单码-跳转模式
	 */
	@ApiField("qr_pay_mode")
	private String qrPayMode;

	/**
	 * 商户自定义二维码宽度
注：qr_pay_mode=4时该参数生效
	 */
	@ApiField("qrcode_width")
	private Long qrcodeWidth;

	/**
	 * 请求来源地址。如果使用ALIAPP的集成方式，用户中途取消支付会返回该地址。
	 */
	@ApiField("request_from_url")
	private String requestFromUrl;

	/**
	 * 描述分账信息，Json格式，详见分账参数说明
	 */
	@ApiField("royalty_info")
	private RoyaltyInfo royaltyInfo;

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
	 * 绝对超时时间，格式为yyyy-MM-dd HH:mm
	 */
	@ApiField("time_expire")
	private String timeExpire;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * <p>Getter for the field <code>agreementSignParams</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AgreementSignParams} object.
	 */
	public AgreementSignParams getAgreementSignParams() {
		return this.agreementSignParams;
	}
	/**
	 * <p>Setter for the field <code>agreementSignParams</code>.</p>
	 *
	 * @param agreementSignParams a {@link cn.felord.wepay.ali.sdk.api.domain.AgreementSignParams} object.
	 */
	public void setAgreementSignParams(AgreementSignParams agreementSignParams) {
		this.agreementSignParams = agreementSignParams;
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
	 * <p>Getter for the field <code>integrationType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIntegrationType() {
		return this.integrationType;
	}
	/**
	 * <p>Setter for the field <code>integrationType</code>.</p>
	 *
	 * @param integrationType a {@link java.lang.String} object.
	 */
	public void setIntegrationType(String integrationType) {
		this.integrationType = integrationType;
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
	 * <p>Getter for the field <code>qrPayMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrPayMode() {
		return this.qrPayMode;
	}
	/**
	 * <p>Setter for the field <code>qrPayMode</code>.</p>
	 *
	 * @param qrPayMode a {@link java.lang.String} object.
	 */
	public void setQrPayMode(String qrPayMode) {
		this.qrPayMode = qrPayMode;
	}

	/**
	 * <p>Getter for the field <code>qrcodeWidth</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getQrcodeWidth() {
		return this.qrcodeWidth;
	}
	/**
	 * <p>Setter for the field <code>qrcodeWidth</code>.</p>
	 *
	 * @param qrcodeWidth a {@link java.lang.Long} object.
	 */
	public void setQrcodeWidth(Long qrcodeWidth) {
		this.qrcodeWidth = qrcodeWidth;
	}

	/**
	 * <p>Getter for the field <code>requestFromUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestFromUrl() {
		return this.requestFromUrl;
	}
	/**
	 * <p>Setter for the field <code>requestFromUrl</code>.</p>
	 *
	 * @param requestFromUrl a {@link java.lang.String} object.
	 */
	public void setRequestFromUrl(String requestFromUrl) {
		this.requestFromUrl = requestFromUrl;
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
