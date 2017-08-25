package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 卡类型对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CardTypeVO extends AlipayObject {

	private static final long serialVersionUID = 6473972825278651895L;

	/**
	 * 卡类型标识符，取值范围如下：
DC("借记卡")
CC("贷记卡")
SCC("准贷记卡")
DCC("存贷合一卡")
PC("预付卡")
STPB("标准存折")
STFA("标准对公账户")
NSTFA("非标准对公账户")
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 卡类型描述，参考cardType的描述字段中括号里的值。
	 */
	@ApiField("description")
	private String description;

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
	 * <p>Getter for the field <code>description</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * <p>Setter for the field <code>description</code>.</p>
	 *
	 * @param description a {@link java.lang.String} object.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
