package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 批量查询店铺商品信息入参
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RequestExtShopItemQuery extends AlipayObject {

	private static final long serialVersionUID = 8473423568627545595L;

	/**
	 * 店铺商品的品牌名称
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 店铺商品的商品类别
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 店铺商品SKU
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 口碑门店id
	 */
	@ApiField("kb_shop_id")
	private String kbShopId;

	/**
	 * 商品参考价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 店铺商品的名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * <p>Getter for the field <code>brandCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandCode() {
		return this.brandCode;
	}
	/**
	 * <p>Setter for the field <code>brandCode</code>.</p>
	 *
	 * @param brandCode a {@link java.lang.String} object.
	 */
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	/**
	 * <p>Getter for the field <code>categoryCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryCode() {
		return this.categoryCode;
	}
	/**
	 * <p>Setter for the field <code>categoryCode</code>.</p>
	 *
	 * @param categoryCode a {@link java.lang.String} object.
	 */
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	/**
	 * <p>Getter for the field <code>description</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * <p>Setter for the field <code>description</code>.</p>
	 *
	 * @param description a {@link java.lang.String} object.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * <p>Getter for the field <code>itemCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemCode() {
		return this.itemCode;
	}
	/**
	 * <p>Setter for the field <code>itemCode</code>.</p>
	 *
	 * @param itemCode a {@link java.lang.String} object.
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	/**
	 * <p>Getter for the field <code>kbShopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getKbShopId() {
		return this.kbShopId;
	}
	/**
	 * <p>Setter for the field <code>kbShopId</code>.</p>
	 *
	 * @param kbShopId a {@link java.lang.String} object.
	 */
	public void setKbShopId(String kbShopId) {
		this.kbShopId = kbShopId;
	}

	/**
	 * <p>Getter for the field <code>price</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrice() {
		return this.price;
	}
	/**
	 * <p>Setter for the field <code>price</code>.</p>
	 *
	 * @param price a {@link java.lang.String} object.
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
