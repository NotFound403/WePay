package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 退款解冻信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RefundUnfreezeResult extends AlipayObject {

	private static final long serialVersionUID = 8653682286578299252L;

	/**
	 * 冻结单号
	 */
	@ApiField("freeze_no")
	private String freezeNo;

	/**
	 * 解冻结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 解冻状态。S成功，F失败。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 解冻金额
	 */
	@ApiField("unfreeze_amount")
	private String unfreezeAmount;

	/**
	 * 解冻单号
	 */
	@ApiField("unfreeze_no")
	private String unfreezeNo;

	/**
	 * 解冻时间
	 */
	@ApiField("unfreeze_time")
	private String unfreezeTime;

	/**
	 * <p>Getter for the field <code>freezeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFreezeNo() {
		return this.freezeNo;
	}
	/**
	 * <p>Setter for the field <code>freezeNo</code>.</p>
	 *
	 * @param freezeNo a {@link java.lang.String} object.
	 */
	public void setFreezeNo(String freezeNo) {
		this.freezeNo = freezeNo;
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
	 * <p>Getter for the field <code>unfreezeAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUnfreezeAmount() {
		return this.unfreezeAmount;
	}
	/**
	 * <p>Setter for the field <code>unfreezeAmount</code>.</p>
	 *
	 * @param unfreezeAmount a {@link java.lang.String} object.
	 */
	public void setUnfreezeAmount(String unfreezeAmount) {
		this.unfreezeAmount = unfreezeAmount;
	}

	/**
	 * <p>Getter for the field <code>unfreezeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUnfreezeNo() {
		return this.unfreezeNo;
	}
	/**
	 * <p>Setter for the field <code>unfreezeNo</code>.</p>
	 *
	 * @param unfreezeNo a {@link java.lang.String} object.
	 */
	public void setUnfreezeNo(String unfreezeNo) {
		this.unfreezeNo = unfreezeNo;
	}

	/**
	 * <p>Getter for the field <code>unfreezeTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUnfreezeTime() {
		return this.unfreezeTime;
	}
	/**
	 * <p>Setter for the field <code>unfreezeTime</code>.</p>
	 *
	 * @param unfreezeTime a {@link java.lang.String} object.
	 */
	public void setUnfreezeTime(String unfreezeTime) {
		this.unfreezeTime = unfreezeTime;
	}

}
