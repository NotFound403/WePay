package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 门店id查桌码信息列表
 *
 * @author auto create
 * @since 1.0, 2017-06-26 14:14:11
 */
public class KoubeiCateringTablelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5647874735449236542L;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
