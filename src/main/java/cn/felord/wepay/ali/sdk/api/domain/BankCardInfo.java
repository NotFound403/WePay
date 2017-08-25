package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 银行卡信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BankCardInfo extends AlipayObject {

	private static final long serialVersionUID = 3888688616135855912L;

	/**
	 * 银行卡持卡人姓名
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 银行卡号
	 */
	@ApiField("card_no")
	private String cardNo;

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

}
