package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 返回给商户的子订单明细
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OrderDetailResult extends AlipayObject {

	private static final long serialVersionUID = 3457376279695835677L;

	/**
	 * 应用唯一标识
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 卖家支付宝用户ID。
	 */
	@ApiField("seller_id")
	private String sellerId;

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
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易状态，有以下几种取值：
1. TRADE_SUCCESS：付款成功
2. TRADE_FINISHED：交易完成
3. WAIT_BUYER_PAY：等待支付
4. TRADE_CLOSED：交易关闭
	 */
	@ApiField("trade_status")
	private String tradeStatus;

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
	 * <p>Getter for the field <code>tradeStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeStatus() {
		return this.tradeStatus;
	}
	/**
	 * <p>Setter for the field <code>tradeStatus</code>.</p>
	 *
	 * @param tradeStatus a {@link java.lang.String} object.
	 */
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

}
