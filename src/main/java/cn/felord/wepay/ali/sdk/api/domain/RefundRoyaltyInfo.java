package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 退分润信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RefundRoyaltyInfo extends AlipayObject {

	private static final long serialVersionUID = 2743491519538476617L;

	/**
	 * 退分润备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 退分润金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 转入人支付宝账号对应用户ID[2088开头16位纯数字]；
trans_in和trans_in_email不能同时为空。
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 转入人支付宝账号[原付出分润金额的账户]
trans_in和trans_in_email不能同时为空。
	 */
	@ApiField("trans_in_email")
	private String transInEmail;

	/**
	 * 转出人支付宝账号对应用户ID[2088开头16位纯数字]；
trans_out和trans_out_email不能同时为空
	 */
	@ApiField("trans_out")
	private String transOut;

	/**
	 * 转出人支付宝账号[原收到分润金额的账户]；
trans_out和trans_out_email不能同时为空。
	 */
	@ApiField("trans_out_email")
	private String transOutEmail;

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>refundAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundAmount() {
		return this.refundAmount;
	}
	/**
	 * <p>Setter for the field <code>refundAmount</code>.</p>
	 *
	 * @param refundAmount a {@link java.lang.String} object.
	 */
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	/**
	 * <p>Getter for the field <code>transIn</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransIn() {
		return this.transIn;
	}
	/**
	 * <p>Setter for the field <code>transIn</code>.</p>
	 *
	 * @param transIn a {@link java.lang.String} object.
	 */
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	/**
	 * <p>Getter for the field <code>transInEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransInEmail() {
		return this.transInEmail;
	}
	/**
	 * <p>Setter for the field <code>transInEmail</code>.</p>
	 *
	 * @param transInEmail a {@link java.lang.String} object.
	 */
	public void setTransInEmail(String transInEmail) {
		this.transInEmail = transInEmail;
	}

	/**
	 * <p>Getter for the field <code>transOut</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransOut() {
		return this.transOut;
	}
	/**
	 * <p>Setter for the field <code>transOut</code>.</p>
	 *
	 * @param transOut a {@link java.lang.String} object.
	 */
	public void setTransOut(String transOut) {
		this.transOut = transOut;
	}

	/**
	 * <p>Getter for the field <code>transOutEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransOutEmail() {
		return this.transOutEmail;
	}
	/**
	 * <p>Setter for the field <code>transOutEmail</code>.</p>
	 *
	 * @param transOutEmail a {@link java.lang.String} object.
	 */
	public void setTransOutEmail(String transOutEmail) {
		this.transOutEmail = transOutEmail;
	}

}
