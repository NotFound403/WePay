package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 待圈存的明细
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RechargeBill extends AlipayObject {

	private static final long serialVersionUID = 1393171956613119627L;

	/**
	 * 用户充值金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 充值时间：YYYY-MM-DD hh:mm:ss
	 */
	@ApiField("deposit_time")
	private String depositTime;

	/**
	 * Transfer：待圈存
Success：圈存成功
Fail：圈存失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

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
	 * <p>Getter for the field <code>depositTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDepositTime() {
		return this.depositTime;
	}
	/**
	 * <p>Setter for the field <code>depositTime</code>.</p>
	 *
	 * @param depositTime a {@link java.lang.String} object.
	 */
	public void setDepositTime(String depositTime) {
		this.depositTime = depositTime;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
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

}
