package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 退分润结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RefundRoyaltyResult extends AlipayObject {

	private static final long serialVersionUID = 1859254599738824195L;

	/**
	 * 退分润金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退分润结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 转入人支付宝账号对应用户ID
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 转入人支付宝账号
	 */
	@ApiField("trans_in_email")
	private String transInEmail;

	/**
	 * 转出人支付宝账号对应用户ID
	 */
	@ApiField("trans_out")
	private String transOut;

	/**
	 * 转出人支付宝账号
	 */
	@ApiField("trans_out_email")
	private String transOutEmail;

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
	 * <p>Getter for the field <code>resultCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResultCode() {
		return this.resultCode;
	}
	/**
	 * <p>Setter for the field <code>resultCode</code>.</p>
	 *
	 * @param resultCode a {@link java.lang.String} object.
	 */
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
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
