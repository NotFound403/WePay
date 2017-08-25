package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 操作的店铺对象信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OuterShopDO extends AlipayObject {

	private static final long serialVersionUID = 5468978946357612215L;

	/**
	 * 合作商户ID
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 支付宝店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 合作商户类型 （mike、_2dFire）
iSV自己定义自己的类型，推荐使用自己的域名
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>outerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOuterId() {
		return this.outerId;
	}
	/**
	 * <p>Setter for the field <code>outerId</code>.</p>
	 *
	 * @param outerId a {@link java.lang.String} object.
	 */
	public void setOuterId(String outerId) {
		this.outerId = outerId;
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

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
