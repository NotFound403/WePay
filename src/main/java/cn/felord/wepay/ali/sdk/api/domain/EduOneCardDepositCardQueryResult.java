package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 校园一卡通历史充值卡信息查询结果对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class EduOneCardDepositCardQueryResult extends AlipayObject {

	private static final long serialVersionUID = 4724415194138489265L;

	/**
	 * 校园一卡通机构代码
	 */
	@ApiField("agent_code")
	private String agentCode;

	/**
	 * 校园一卡通机构姓名
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 校园一卡通余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 校园一卡通姓名
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 校园一卡通卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 余额最后更新时间
	 */
	@ApiField("last_update_time")
	private Date lastUpdateTime;

	/**
	 * 校园一卡通待领金额
	 */
	@ApiField("pound_amount")
	private String poundAmount;

	/**
	 * <p>Getter for the field <code>agentCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgentCode() {
		return this.agentCode;
	}
	/**
	 * <p>Setter for the field <code>agentCode</code>.</p>
	 *
	 * @param agentCode a {@link java.lang.String} object.
	 */
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	/**
	 * <p>Getter for the field <code>agentName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgentName() {
		return this.agentName;
	}
	/**
	 * <p>Setter for the field <code>agentName</code>.</p>
	 *
	 * @param agentName a {@link java.lang.String} object.
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
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
	 * <p>Getter for the field <code>cardName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardName() {
		return this.cardName;
	}
	/**
	 * <p>Setter for the field <code>cardName</code>.</p>
	 *
	 * @param cardName a {@link java.lang.String} object.
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
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
	 * <p>Getter for the field <code>lastUpdateTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}
	/**
	 * <p>Setter for the field <code>lastUpdateTime</code>.</p>
	 *
	 * @param lastUpdateTime a {@link java.util.Date} object.
	 */
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 * <p>Getter for the field <code>poundAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPoundAmount() {
		return this.poundAmount;
	}
	/**
	 * <p>Setter for the field <code>poundAmount</code>.</p>
	 *
	 * @param poundAmount a {@link java.lang.String} object.
	 */
	public void setPoundAmount(String poundAmount) {
		this.poundAmount = poundAmount;
	}

}
