package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户门店信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ShopQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 8677213472332824151L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 是否包含同mid下的其他pid的店铺
	 */
	@ApiField("is_include_cognate")
	private Boolean isIncludeCognate;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 门店名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 内部门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 外部门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * <p>Getter for the field <code>address</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * <p>Setter for the field <code>address</code>.</p>
	 *
	 * @param address a {@link java.lang.String} object.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * <p>Getter for the field <code>isIncludeCognate</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIsIncludeCognate() {
		return this.isIncludeCognate;
	}
	/**
	 * <p>Setter for the field <code>isIncludeCognate</code>.</p>
	 *
	 * @param isIncludeCognate a {@link java.lang.Boolean} object.
	 */
	public void setIsIncludeCognate(Boolean isIncludeCognate) {
		this.isIncludeCognate = isIncludeCognate;
	}

	/**
	 * <p>Getter for the field <code>latitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLatitude() {
		return this.latitude;
	}
	/**
	 * <p>Setter for the field <code>latitude</code>.</p>
	 *
	 * @param latitude a {@link java.lang.String} object.
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * <p>Getter for the field <code>longitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLongitude() {
		return this.longitude;
	}
	/**
	 * <p>Setter for the field <code>longitude</code>.</p>
	 *
	 * @param longitude a {@link java.lang.String} object.
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>pid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPid() {
		return this.pid;
	}
	/**
	 * <p>Setter for the field <code>pid</code>.</p>
	 *
	 * @param pid a {@link java.lang.String} object.
	 */
	public void setPid(String pid) {
		this.pid = pid;
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
	 * <p>Getter for the field <code>shopType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopType() {
		return this.shopType;
	}
	/**
	 * <p>Setter for the field <code>shopType</code>.</p>
	 *
	 * @param shopType a {@link java.lang.String} object.
	 */
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	/**
	 * <p>Getter for the field <code>storeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStoreId() {
		return this.storeId;
	}
	/**
	 * <p>Setter for the field <code>storeId</code>.</p>
	 *
	 * @param storeId a {@link java.lang.String} object.
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
