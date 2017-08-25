package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 虚拟卡信息同步
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceTransportOfflinepayVirtualcardSendModel extends AlipayObject {

	private static final long serialVersionUID = 6859891447925467764L;

	/**
	 * 虚拟卡信息同步动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * 用户虚拟卡余额，单位元。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * hex格式表示的虚拟卡数据，卡数据将在虚拟卡二维码中透传。
	 */
	@ApiField("card_data")
	private String cardData;

	/**
	 * 用户虚拟卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 虚拟卡卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 表示虚拟卡是否可用
	 */
	@ApiField("disabled")
	private String disabled;

	/**
	 * 当虚拟卡不可用时，提示用户不可用原因。
	 */
	@ApiField("disabled_tips")
	private String disabledTips;

	/**
	 * json格式字符串，存放扩展信息。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 虚拟卡最后更新时间 使用标准java时间格式
	 */
	@ApiField("last_update_time")
	private String lastUpdateTime;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>action</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAction() {
		return this.action;
	}
	/**
	 * <p>Setter for the field <code>action</code>.</p>
	 *
	 * @param action a {@link java.lang.String} object.
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * <p>Getter for the field <code>balance</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBalance() {
		return this.balance;
	}
	/**
	 * <p>Setter for the field <code>balance</code>.</p>
	 *
	 * @param balance a {@link java.lang.String} object.
	 */
	public void setBalance(String balance) {
		this.balance = balance;
	}

	/**
	 * <p>Getter for the field <code>cardData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardData() {
		return this.cardData;
	}
	/**
	 * <p>Setter for the field <code>cardData</code>.</p>
	 *
	 * @param cardData a {@link java.lang.String} object.
	 */
	public void setCardData(String cardData) {
		this.cardData = cardData;
	}

	/**
	 * <p>Getter for the field <code>cardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardNo() {
		return this.cardNo;
	}
	/**
	 * <p>Setter for the field <code>cardNo</code>.</p>
	 *
	 * @param cardNo a {@link java.lang.String} object.
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * <p>Getter for the field <code>cardType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardType() {
		return this.cardType;
	}
	/**
	 * <p>Setter for the field <code>cardType</code>.</p>
	 *
	 * @param cardType a {@link java.lang.String} object.
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * <p>Getter for the field <code>disabled</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisabled() {
		return this.disabled;
	}
	/**
	 * <p>Setter for the field <code>disabled</code>.</p>
	 *
	 * @param disabled a {@link java.lang.String} object.
	 */
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	/**
	 * <p>Getter for the field <code>disabledTips</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisabledTips() {
		return this.disabledTips;
	}
	/**
	 * <p>Setter for the field <code>disabledTips</code>.</p>
	 *
	 * @param disabledTips a {@link java.lang.String} object.
	 */
	public void setDisabledTips(String disabledTips) {
		this.disabledTips = disabledTips;
	}

	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	/**
	 * <p>Getter for the field <code>lastUpdateTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLastUpdateTime() {
		return this.lastUpdateTime;
	}
	/**
	 * <p>Setter for the field <code>lastUpdateTime</code>.</p>
	 *
	 * @param lastUpdateTime a {@link java.lang.String} object.
	 */
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
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
