package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 系统商通过该接口可以查询单个门店的详细信息，包括门店基础信息，门店状态等信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopQuerydetailModel extends AlipayObject {

	private static final long serialVersionUID = 4582359322531519832L;

	/**
	 * 服务商及商户调用情况下务必传递。操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER；ISV: 不需要填写
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 支付宝门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * <p>Getter for the field <code>opRole</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpRole() {
		return this.opRole;
	}
	/**
	 * <p>Setter for the field <code>opRole</code>.</p>
	 *
	 * @param opRole a {@link java.lang.String} object.
	 */
	public void setOpRole(String opRole) {
		this.opRole = opRole;
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
