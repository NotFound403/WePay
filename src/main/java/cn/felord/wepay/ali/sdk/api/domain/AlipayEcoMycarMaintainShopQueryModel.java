package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 洗车保养门店查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMaintainShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3131725526967653239L;

	/**
	 * 外部门店编号（与shop_id二选一，不能都为空）
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 车主平台门店编号（与out_shop_id二选一，不能都为空）
	 */
	@ApiField("shop_id")
	private Long shopId;

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
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.Long} object.
	 */
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

}
