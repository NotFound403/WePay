package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 缴费账单详情
 *
 * @author auto create
 * @since 1.0, 2017-05-18 15:14:17
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

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

}
