package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 通过该接口可以查询商户录入的所有商品编号
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketProductBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8537126573172885483L;

	/**
	 * 操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER。支付宝内部使用，外部商户不需填写此字段。
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 页码，留空标示第一页，默认100个结果为一页
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 门店ID。支付宝内部使用，外部商户不需填写此字段。
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
	 * <p>Getter for the field <code>pageNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageNo() {
		return this.pageNo;
	}
	/**
	 * <p>Setter for the field <code>pageNo</code>.</p>
	 *
	 * @param pageNo a {@link java.lang.String} object.
	 */
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
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
