package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 发送支付宝手机充值超时提醒与补偿
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppRechargeNotifySendModel extends AlipayObject {

	private static final long serialVersionUID = 1897957587292911212L;

	/**
	 * 充值面额或者优惠面额
	 */
	@ApiField("face_price")
	private String facePrice;

	/**
	 * 充值时间或者话费券有效时间
	 */
	@ApiField("gmt_charge")
	private String gmtCharge;

	/**
	 * 充值的手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 阿里通信通知类型
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 外部用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 充值交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>facePrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFacePrice() {
		return this.facePrice;
	}
	/**
	 * <p>Setter for the field <code>facePrice</code>.</p>
	 *
	 * @param facePrice a {@link java.lang.String} object.
	 */
	public void setFacePrice(String facePrice) {
		this.facePrice = facePrice;
	}

	/**
	 * <p>Getter for the field <code>gmtCharge</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtCharge() {
		return this.gmtCharge;
	}
	/**
	 * <p>Setter for the field <code>gmtCharge</code>.</p>
	 *
	 * @param gmtCharge a {@link java.lang.String} object.
	 */
	public void setGmtCharge(String gmtCharge) {
		this.gmtCharge = gmtCharge;
	}

	/**
	 * <p>Getter for the field <code>mobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobile() {
		return this.mobile;
	}
	/**
	 * <p>Setter for the field <code>mobile</code>.</p>
	 *
	 * @param mobile a {@link java.lang.String} object.
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * <p>Getter for the field <code>notifyType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNotifyType() {
		return this.notifyType;
	}
	/**
	 * <p>Setter for the field <code>notifyType</code>.</p>
	 *
	 * @param notifyType a {@link java.lang.String} object.
	 */
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	/**
	 * <p>Getter for the field <code>outUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutUserId() {
		return this.outUserId;
	}
	/**
	 * <p>Setter for the field <code>outUserId</code>.</p>
	 *
	 * @param outUserId a {@link java.lang.String} object.
	 */
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
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

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
