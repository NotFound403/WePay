package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 余额宝负债端预测数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayYebLqdDataResult extends AlipayObject {

	private static final long serialVersionUID = 8536844586762893546L;

	/**
	 * 申购预测，单位:元
	 */
	@ApiField("predict_purchase_amt")
	private String predictPurchaseAmt;

	/**
	 * 赎回预测,单位:元
	 */
	@ApiField("predict_redeem_amt")
	private String predictRedeemAmt;

	/**
	 * 预测日期，格式为yyyymmdd
	 */
	@ApiField("target_date")
	private String targetDate;

	/**
	 * <p>Getter for the field <code>predictPurchaseAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPredictPurchaseAmt() {
		return this.predictPurchaseAmt;
	}
	/**
	 * <p>Setter for the field <code>predictPurchaseAmt</code>.</p>
	 *
	 * @param predictPurchaseAmt a {@link java.lang.String} object.
	 */
	public void setPredictPurchaseAmt(String predictPurchaseAmt) {
		this.predictPurchaseAmt = predictPurchaseAmt;
	}

	/**
	 * <p>Getter for the field <code>predictRedeemAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPredictRedeemAmt() {
		return this.predictRedeemAmt;
	}
	/**
	 * <p>Setter for the field <code>predictRedeemAmt</code>.</p>
	 *
	 * @param predictRedeemAmt a {@link java.lang.String} object.
	 */
	public void setPredictRedeemAmt(String predictRedeemAmt) {
		this.predictRedeemAmt = predictRedeemAmt;
	}

	/**
	 * <p>Getter for the field <code>targetDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTargetDate() {
		return this.targetDate;
	}
	/**
	 * <p>Setter for the field <code>targetDate</code>.</p>
	 *
	 * @param targetDate a {@link java.lang.String} object.
	 */
	public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
	}

}
