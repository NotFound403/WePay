package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 缴费账单详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ChargeItems extends AlipayObject {

	private static final long serialVersionUID = 8341396641819621222L;

	/**
	 * 缴费项名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 缴费项金额
	 */
	@ApiField("item_price")
	private String itemPrice;

	/**
	 * <p>Getter for the field <code>itemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemName() {
		return this.itemName;
	}
	/**
	 * <p>Setter for the field <code>itemName</code>.</p>
	 *
	 * @param itemName a {@link java.lang.String} object.
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * <p>Getter for the field <code>itemPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemPrice() {
		return this.itemPrice;
	}
	/**
	 * <p>Setter for the field <code>itemPrice</code>.</p>
	 *
	 * @param itemPrice a {@link java.lang.String} object.
	 */
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

}
