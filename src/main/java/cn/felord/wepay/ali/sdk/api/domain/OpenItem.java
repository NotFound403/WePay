package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 云验收单品
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OpenItem extends AlipayObject {

	private static final long serialVersionUID = 5134335756722489317L;

	/**
	 * 单品编号
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 单品检测状态
0，未检测
1，未通过
2，已通过
	 */
	@ApiField("item_status")
	private String itemStatus;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * <p>Getter for the field <code>itemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemId() {
		return this.itemId;
	}
	/**
	 * <p>Setter for the field <code>itemId</code>.</p>
	 *
	 * @param itemId a {@link java.lang.String} object.
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * <p>Getter for the field <code>itemStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemStatus() {
		return this.itemStatus;
	}
	/**
	 * <p>Setter for the field <code>itemStatus</code>.</p>
	 *
	 * @param itemStatus a {@link java.lang.String} object.
	 */
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	/**
	 * <p>Getter for the field <code>storeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStoreId() {
		return this.storeId;
	}
	/**
	 * <p>Setter for the field <code>storeId</code>.</p>
	 *
	 * @param storeId a {@link java.lang.String} object.
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
