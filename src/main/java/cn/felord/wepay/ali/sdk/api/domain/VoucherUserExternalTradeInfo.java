package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 券使用外部交易信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class VoucherUserExternalTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 5851791727698484959L;

	/**
	 * 核销金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 核销时间
	 */
	@ApiField("consume_date")
	private String consumeDate;

	/**
	 * 券核销的门店id
	 */
	@ApiField("consume_shop_id")
	private String consumeShopId;

	/**
	 * 外部交易号
	 */
	@ApiField("external_trade_no")
	private String externalTradeNo;

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * <p>Getter for the field <code>consumeDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConsumeDate() {
		return this.consumeDate;
	}
	/**
	 * <p>Setter for the field <code>consumeDate</code>.</p>
	 *
	 * @param consumeDate a {@link java.lang.String} object.
	 */
	public void setConsumeDate(String consumeDate) {
		this.consumeDate = consumeDate;
	}

	/**
	 * <p>Getter for the field <code>consumeShopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConsumeShopId() {
		return this.consumeShopId;
	}
	/**
	 * <p>Setter for the field <code>consumeShopId</code>.</p>
	 *
	 * @param consumeShopId a {@link java.lang.String} object.
	 */
	public void setConsumeShopId(String consumeShopId) {
		this.consumeShopId = consumeShopId;
	}

	/**
	 * <p>Getter for the field <code>externalTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalTradeNo() {
		return this.externalTradeNo;
	}
	/**
	 * <p>Setter for the field <code>externalTradeNo</code>.</p>
	 *
	 * @param externalTradeNo a {@link java.lang.String} object.
	 */
	public void setExternalTradeNo(String externalTradeNo) {
		this.externalTradeNo = externalTradeNo;
	}

}
