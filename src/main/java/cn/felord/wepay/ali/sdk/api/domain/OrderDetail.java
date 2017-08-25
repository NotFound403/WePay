package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 子订单明细
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OrderDetail extends AlipayObject {

	private static final long serialVersionUID = 5592223689567975758L;

	/**
	 * 订单明细的应用唯一标识（16位纯数字），指商家的app_id。
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 对交易或商品的描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 订单包含的商品列表信息.Json格式.
其它说明详见：“商品明细说明”
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝只会在同步返回（包括跳转回商户网站）和异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 销售产品码，与支付宝签约的产品码名称
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 卖家支付宝用户ID。
如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 支持手机和Email格式,如果同时使用参数seller_logon_id和seller_id,以seller_id为准
	 */
	@ApiField("seller_logon_id")
	private String sellerLogonId;

	/**
	 * 商品的展示地址
	 */
	@ApiField("show_url")
	private String showUrl;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * <p>Getter for the field <code>appId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppId() {
		return this.appId;
	}
	/**
	 * <p>Setter for the field <code>appId</code>.</p>
	 *
	 * @param appId a {@link java.lang.String} object.
	 */
	public void setAppId(String appId) {
		this.appId = appId;
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
	 * <p>Getter for the field <code>sellerLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerLogonId() {
		return this.sellerLogonId;
	}
	/**
	 * <p>Setter for the field <code>sellerLogonId</code>.</p>
	 *
	 * @param sellerLogonId a {@link java.lang.String} object.
	 */
	public void setSellerLogonId(String sellerLogonId) {
		this.sellerLogonId = sellerLogonId;
	}

	/**
	 * <p>Getter for the field <code>showUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShowUrl() {
		return this.showUrl;
	}
	/**
	 * <p>Setter for the field <code>showUrl</code>.</p>
	 *
	 * @param showUrl a {@link java.lang.String} object.
	 */
	public void setShowUrl(String showUrl) {
		this.showUrl = showUrl;
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
