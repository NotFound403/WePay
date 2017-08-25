package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 加油站门店信息查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarFuellingShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6467396192928939544L;

	/**
	 * 外部门店编号系统唯一，该值添加后不可修改，与字段shop_id不能同时为空
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 车主平台内部门店编号，系统唯一,与字段out_shop_id不能同时为空
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * <p>Getter for the field <code>outShopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutShopId() {
		return this.outShopId;
	}
	/**
	 * <p>Setter for the field <code>outShopId</code>.</p>
	 *
	 * @param outShopId a {@link java.lang.String} object.
	 */
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
