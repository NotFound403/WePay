package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 行业代理收单接口使用的交易相关参数
 *
 * @author auto create
 * @version $Id: $Id
 */
public class TradeApplyParams extends AlipayObject {

	private static final long serialVersionUID = 1326396631671627363L;

	/**
	 * 系统商编号，该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
	 */
	@ApiField("broker_id")
	private String brokerId;

	/**
	 * 买家姓名
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 货币符号
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 设置未付款支付宝订单的超时时间，一旦超时，该笔订单就会自动失效。当商户调用接口时开始计时。取值精确至秒，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 第三方唯一序列号， 64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 优惠参数,用于传递营销信息。传递参数时，请所在行业的业务人员确认。
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * 交易标题/订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * <p>Getter for the field <code>brokerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrokerId() {
		return this.brokerId;
	}
	/**
	 * <p>Setter for the field <code>brokerId</code>.</p>
	 *
	 * @param brokerId a {@link java.lang.String} object.
	 */
	public void setBrokerId(String brokerId) {
		this.brokerId = brokerId;
	}

	/**
	 * <p>Getter for the field <code>buyerName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerName() {
		return this.buyerName;
	}
	/**
	 * <p>Setter for the field <code>buyerName</code>.</p>
	 *
	 * @param buyerName a {@link java.lang.String} object.
	 */
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	/**
	 * <p>Getter for the field <code>currency</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrency() {
		return this.currency;
	}
	/**
	 * <p>Setter for the field <code>currency</code>.</p>
	 *
	 * @param currency a {@link java.lang.String} object.
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * <p>Getter for the field <code>expireTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpireTime() {
		return this.expireTime;
	}
	/**
	 * <p>Setter for the field <code>expireTime</code>.</p>
	 *
	 * @param expireTime a {@link java.lang.String} object.
	 */
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
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
