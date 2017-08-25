package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口令送信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CodeCouponInfo extends AlipayObject {

	private static final long serialVersionUID = 7634196621318322792L;

	/**
	 * 领取时间
	 */
	@ApiField("taken_time")
	private String takenTime;

	/**
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 面额（单位分）
	 */
	@ApiField("voucher_amt")
	private String voucherAmt;

	/**
	 * <p>Getter for the field <code>takenTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTakenTime() {
		return this.takenTime;
	}
	/**
	 * <p>Setter for the field <code>takenTime</code>.</p>
	 *
	 * @param takenTime a {@link java.lang.String} object.
	 */
	public void setTakenTime(String takenTime) {
		this.takenTime = takenTime;
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

	/**
	 * <p>Getter for the field <code>voucherAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherAmt() {
		return this.voucherAmt;
	}
	/**
	 * <p>Setter for the field <code>voucherAmt</code>.</p>
	 *
	 * @param voucherAmt a {@link java.lang.String} object.
	 */
	public void setVoucherAmt(String voucherAmt) {
		this.voucherAmt = voucherAmt;
	}

}
