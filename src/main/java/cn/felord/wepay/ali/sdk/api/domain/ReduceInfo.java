package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 订单优惠信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ReduceInfo extends AlipayObject {

	private static final long serialVersionUID = 1298749342748317332L;

	/**
	 * 门店品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 消费金额（单位分）
	 */
	@ApiField("consume_amt")
	private String consumeAmt;

	/**
	 * 消费门店名称
	 */
	@ApiField("consume_store_name")
	private String consumeStoreName;

	/**
	 * 消费时间
	 */
	@ApiField("payment_time")
	private String paymentTime;

	/**
	 * 优惠金额（单位分）
	 */
	@ApiField("promo_amt")
	private String promoAmt;

	/**
	 * 用户名（脱敏）
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * <p>Getter for the field <code>brandName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandName() {
		return this.brandName;
	}
	/**
	 * <p>Setter for the field <code>brandName</code>.</p>
	 *
	 * @param brandName a {@link java.lang.String} object.
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * <p>Getter for the field <code>consumeAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConsumeAmt() {
		return this.consumeAmt;
	}
	/**
	 * <p>Setter for the field <code>consumeAmt</code>.</p>
	 *
	 * @param consumeAmt a {@link java.lang.String} object.
	 */
	public void setConsumeAmt(String consumeAmt) {
		this.consumeAmt = consumeAmt;
	}

	/**
	 * <p>Getter for the field <code>consumeStoreName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConsumeStoreName() {
		return this.consumeStoreName;
	}
	/**
	 * <p>Setter for the field <code>consumeStoreName</code>.</p>
	 *
	 * @param consumeStoreName a {@link java.lang.String} object.
	 */
	public void setConsumeStoreName(String consumeStoreName) {
		this.consumeStoreName = consumeStoreName;
	}

	/**
	 * <p>Getter for the field <code>paymentTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentTime() {
		return this.paymentTime;
	}
	/**
	 * <p>Setter for the field <code>paymentTime</code>.</p>
	 *
	 * @param paymentTime a {@link java.lang.String} object.
	 */
	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}

	/**
	 * <p>Getter for the field <code>promoAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPromoAmt() {
		return this.promoAmt;
	}
	/**
	 * <p>Setter for the field <code>promoAmt</code>.</p>
	 *
	 * @param promoAmt a {@link java.lang.String} object.
	 */
	public void setPromoAmt(String promoAmt) {
		this.promoAmt = promoAmt;
	}

	/**
	 * <p>Getter for the field <code>userName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * <p>Setter for the field <code>userName</code>.</p>
	 *
	 * @param userName a {@link java.lang.String} object.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
