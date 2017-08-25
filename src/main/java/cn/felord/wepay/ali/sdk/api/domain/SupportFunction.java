package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 支持的功能
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SupportFunction extends AlipayObject {

	private static final long serialVersionUID = 6669629632477488879L;

	/**
	 * 卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 卡类型编码，为智能卡系统的内部编码规则
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 功能，支持开卡(issue)，圈存(load)，充值转账(recharge)
	 */
	@ApiListField("function_type")
	@ApiField("string")
	private List<String> functionType;

	/**
	 * 智能卡的跳转地址
	 */
	@ApiField("goto_url")
	private String gotoUrl;

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
	 * <p>Getter for the field <code>functionType</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getFunctionType() {
		return this.functionType;
	}
	/**
	 * <p>Setter for the field <code>functionType</code>.</p>
	 *
	 * @param functionType a {@link java.util.List} object.
	 */
	public void setFunctionType(List<String> functionType) {
		this.functionType = functionType;
	}

	/**
	 * <p>Getter for the field <code>gotoUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGotoUrl() {
		return this.gotoUrl;
	}
	/**
	 * <p>Setter for the field <code>gotoUrl</code>.</p>
	 *
	 * @param gotoUrl a {@link java.lang.String} object.
	 */
	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

}
