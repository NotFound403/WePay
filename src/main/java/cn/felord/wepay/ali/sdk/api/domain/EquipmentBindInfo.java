package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 机具绑定信息，包括机具ID和是否绑定门店
 *
 * @author auto create
 * @version $Id: $Id
 */
public class EquipmentBindInfo extends AlipayObject {

	private static final long serialVersionUID = 8838348755887484719L;

	/**
	 * 机具ID
	 */
	@ApiField("equipment_id")
	private String equipmentId;

	/**
	 * 是否绑定门店，T绑定，F不绑定
	 */
	@ApiField("is_bind_shop")
	private String isBindShop;

	/**
	 * <p>Getter for the field <code>equipmentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEquipmentId() {
		return this.equipmentId;
	}
	/**
	 * <p>Setter for the field <code>equipmentId</code>.</p>
	 *
	 * @param equipmentId a {@link java.lang.String} object.
	 */
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	/**
	 * <p>Getter for the field <code>isBindShop</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsBindShop() {
		return this.isBindShop;
	}
	/**
	 * <p>Setter for the field <code>isBindShop</code>.</p>
	 *
	 * @param isBindShop a {@link java.lang.String} object.
	 */
	public void setIsBindShop(String isBindShop) {
		this.isBindShop = isBindShop;
	}

}
