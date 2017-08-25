package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 店铺商品模型结构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ExtShopItem extends AlipayObject {

	private static final long serialVersionUID = 5561483694276659643L;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 品类编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 入数，必须为整数
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 产地
	 */
	@ApiField("country")
	private String country;

	/**
	 * 产品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品扩展信息
	 */
	@ApiField("ext_goods_info")
	private String extGoodsInfo;

	/**
	 * 商品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品条码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 口碑门店id
	 */
	@ApiField("kb_shop_id")
	private String kbShopId;

	/**
	 * 商品图片url
	 */
	@ApiField("picture")
	private String picture;

	/**
	 * 参考价格
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 商品规格
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * ISV系统提供商
	 */
	@ApiField("system_provider_id")
	private String systemProviderId;

	/**
	 * 商品名称
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
	 * <p>Getter for the field <code>count</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCount() {
		return this.count;
	}
	/**
	 * <p>Setter for the field <code>count</code>.</p>
	 *
	 * @param count a {@link java.lang.Long} object.
	 */
	public void setCount(Long count) {
		this.count = count;
	}

	/**
	 * <p>Getter for the field <code>country</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCountry() {
		return this.country;
	}
	/**
	 * <p>Setter for the field <code>country</code>.</p>
	 *
	 * @param country a {@link java.lang.String} object.
	 */
	public void setCountry(String country) {
		this.country = country;
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
	 * <p>Getter for the field <code>extGoodsInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtGoodsInfo() {
		return this.extGoodsInfo;
	}
	/**
	 * <p>Setter for the field <code>extGoodsInfo</code>.</p>
	 *
	 * @param extGoodsInfo a {@link java.lang.String} object.
	 */
	public void setExtGoodsInfo(String extGoodsInfo) {
		this.extGoodsInfo = extGoodsInfo;
	}

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
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
	 * <p>Getter for the field <code>picture</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPicture() {
		return this.picture;
	}
	/**
	 * <p>Setter for the field <code>picture</code>.</p>
	 *
	 * @param picture a {@link java.lang.String} object.
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * <p>Getter for the field <code>price</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPrice() {
		return this.price;
	}
	/**
	 * <p>Setter for the field <code>price</code>.</p>
	 *
	 * @param price a {@link java.lang.Long} object.
	 */
	public void setPrice(Long price) {
		this.price = price;
	}

	/**
	 * <p>Getter for the field <code>specification</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpecification() {
		return this.specification;
	}
	/**
	 * <p>Setter for the field <code>specification</code>.</p>
	 *
	 * @param specification a {@link java.lang.String} object.
	 */
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	/**
	 * <p>Getter for the field <code>systemProviderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSystemProviderId() {
		return this.systemProviderId;
	}
	/**
	 * <p>Setter for the field <code>systemProviderId</code>.</p>
	 *
	 * @param systemProviderId a {@link java.lang.String} object.
	 */
	public void setSystemProviderId(String systemProviderId) {
		this.systemProviderId = systemProviderId;
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
