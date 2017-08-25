package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 招商活动信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RecruitShopInfo extends AlipayObject {

	private static final long serialVersionUID = 7295859444519956387L;

	/**
	 * 已确认还是未确认
	 */
	@ApiField("confirm_status")
	private String confirmStatus;

	/**
	 * 一级和二级类目名称
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * <p>Getter for the field <code>confirmStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConfirmStatus() {
		return this.confirmStatus;
	}
	/**
	 * <p>Setter for the field <code>confirmStatus</code>.</p>
	 *
	 * @param confirmStatus a {@link java.lang.String} object.
	 */
	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

	/**
	 * <p>Getter for the field <code>shopCategory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopCategory() {
		return this.shopCategory;
	}
	/**
	 * <p>Setter for the field <code>shopCategory</code>.</p>
	 *
	 * @param shopCategory a {@link java.lang.String} object.
	 */
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
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
	 * <p>Getter for the field <code>shopName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * <p>Setter for the field <code>shopName</code>.</p>
	 *
	 * @param shopName a {@link java.lang.String} object.
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
