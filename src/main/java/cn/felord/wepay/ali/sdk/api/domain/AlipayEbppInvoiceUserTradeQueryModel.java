package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询用户的支付宝交易信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppInvoiceUserTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5665757434349727893L;

	/**
	 * 发票管家交易id，来源于用户支付后开票申请跳转开票方的链接中带入参数einv_trade_id
	 */
	@ApiField("einv_trade_id")
	private String einvTradeId;

	/**
	 * 随机数，从支付宝钱包链接跳转到开票方外部链接中带入的一项参数，调用该方法需将此参数透传回来，参数名：random
	 */
	@ApiField("random")
	private String random;

	/**
	 * 时间戳，从支付宝钱包链接跳转到开票方外部链接中带入的一项参数，调用该方法需将此参数透传回来，参数名：timestamp
	 */
	@ApiField("timestamp")
	private String timestamp;

	/**
	 * 令牌，从支付宝钱包链接跳转到开票方外部链接中带入的一项参数，调用该方法需将此参数透传回来,传入时请进行URLEncode,采用utf-编码格式，参数名：token
	 */
	@ApiField("token")
	private String token;

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
	 * <p>Getter for the field <code>random</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRandom() {
		return this.random;
	}
	/**
	 * <p>Setter for the field <code>random</code>.</p>
	 *
	 * @param random a {@link java.lang.String} object.
	 */
	public void setRandom(String random) {
		this.random = random;
	}

	/**
	 * <p>Getter for the field <code>timestamp</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTimestamp() {
		return this.timestamp;
	}
	/**
	 * <p>Setter for the field <code>timestamp</code>.</p>
	 *
	 * @param timestamp a {@link java.lang.String} object.
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * <p>Getter for the field <code>token</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getToken() {
		return this.token;
	}
	/**
	 * <p>Setter for the field <code>token</code>.</p>
	 *
	 * @param token a {@link java.lang.String} object.
	 */
	public void setToken(String token) {
		this.token = token;
	}

}
