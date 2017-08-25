package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 商圈店铺营销信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ShopPromoInfo extends AlipayObject {

	private static final long serialVersionUID = 2479877588713489196L;

	/**
	 * 店铺跳转链接
	 */
	@ApiField("action_param")
	private String actionParam;

	/**
	 * 店铺地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 城市id
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 菜系
	 */
	@ApiField("cuisine")
	private String cuisine;

	/**
	 * 预留扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否有优惠
	 */
	@ApiField("has_hui")
	private String hasHui;

	/**
	 * 店铺名称
	 */
	@ApiField("head_shop_name")
	private String headShopName;

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
	 * 人气分
	 */
	@ApiField("popularity")
	private String popularity;

	/**
	 * 人气等级
	 */
	@ApiField("popularity_level")
	private String popularityLevel;

	/**
	 * 人均消费
	 */
	@ApiField("price_average")
	private String priceAverage;

	/**
	 * 前台一级类目列表
	 */
	@ApiField("root_display_category_info")
	private String rootDisplayCategoryInfo;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺logo图
	 */
	@ApiField("shop_logo_url")
	private String shopLogoUrl;

	/**
	 * 店铺详细名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 推荐语
	 */
	@ApiField("shop_recommend_one_tag_compose")
	private String shopRecommendOneTagCompose;

	/**
	 * 店铺券信息
	 */
	@ApiListField("voucher_info_list")
	@ApiField("promo_voucher_info")
	private List<PromoVoucherInfo> voucherInfoList;

	/**
	 * <p>Getter for the field <code>actionParam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionParam() {
		return this.actionParam;
	}
	/**
	 * <p>Setter for the field <code>actionParam</code>.</p>
	 *
	 * @param actionParam a {@link java.lang.String} object.
	 */
	public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
	}

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
	 * <p>Getter for the field <code>brandName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandName() {
		return this.brandName;
	}
	/**
	 * <p>Setter for the field <code>brandName</code>.</p>
	 *
	 * @param brandName a {@link java.lang.String} object.
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * <p>Getter for the field <code>cityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityId() {
		return this.cityId;
	}
	/**
	 * <p>Setter for the field <code>cityId</code>.</p>
	 *
	 * @param cityId a {@link java.lang.String} object.
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	/**
	 * <p>Getter for the field <code>cuisine</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCuisine() {
		return this.cuisine;
	}
	/**
	 * <p>Setter for the field <code>cuisine</code>.</p>
	 *
	 * @param cuisine a {@link java.lang.String} object.
	 */
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	/**
	 * <p>Getter for the field <code>hasHui</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHasHui() {
		return this.hasHui;
	}
	/**
	 * <p>Setter for the field <code>hasHui</code>.</p>
	 *
	 * @param hasHui a {@link java.lang.String} object.
	 */
	public void setHasHui(String hasHui) {
		this.hasHui = hasHui;
	}

	/**
	 * <p>Getter for the field <code>headShopName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHeadShopName() {
		return this.headShopName;
	}
	/**
	 * <p>Setter for the field <code>headShopName</code>.</p>
	 *
	 * @param headShopName a {@link java.lang.String} object.
	 */
	public void setHeadShopName(String headShopName) {
		this.headShopName = headShopName;
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
	 * <p>Getter for the field <code>popularity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPopularity() {
		return this.popularity;
	}
	/**
	 * <p>Setter for the field <code>popularity</code>.</p>
	 *
	 * @param popularity a {@link java.lang.String} object.
	 */
	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}

	/**
	 * <p>Getter for the field <code>popularityLevel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPopularityLevel() {
		return this.popularityLevel;
	}
	/**
	 * <p>Setter for the field <code>popularityLevel</code>.</p>
	 *
	 * @param popularityLevel a {@link java.lang.String} object.
	 */
	public void setPopularityLevel(String popularityLevel) {
		this.popularityLevel = popularityLevel;
	}

	/**
	 * <p>Getter for the field <code>priceAverage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPriceAverage() {
		return this.priceAverage;
	}
	/**
	 * <p>Setter for the field <code>priceAverage</code>.</p>
	 *
	 * @param priceAverage a {@link java.lang.String} object.
	 */
	public void setPriceAverage(String priceAverage) {
		this.priceAverage = priceAverage;
	}

	/**
	 * <p>Getter for the field <code>rootDisplayCategoryInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRootDisplayCategoryInfo() {
		return this.rootDisplayCategoryInfo;
	}
	/**
	 * <p>Setter for the field <code>rootDisplayCategoryInfo</code>.</p>
	 *
	 * @param rootDisplayCategoryInfo a {@link java.lang.String} object.
	 */
	public void setRootDisplayCategoryInfo(String rootDisplayCategoryInfo) {
		this.rootDisplayCategoryInfo = rootDisplayCategoryInfo;
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
	 * <p>Getter for the field <code>shopLogoUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopLogoUrl() {
		return this.shopLogoUrl;
	}
	/**
	 * <p>Setter for the field <code>shopLogoUrl</code>.</p>
	 *
	 * @param shopLogoUrl a {@link java.lang.String} object.
	 */
	public void setShopLogoUrl(String shopLogoUrl) {
		this.shopLogoUrl = shopLogoUrl;
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

	/**
	 * <p>Getter for the field <code>shopRecommendOneTagCompose</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopRecommendOneTagCompose() {
		return this.shopRecommendOneTagCompose;
	}
	/**
	 * <p>Setter for the field <code>shopRecommendOneTagCompose</code>.</p>
	 *
	 * @param shopRecommendOneTagCompose a {@link java.lang.String} object.
	 */
	public void setShopRecommendOneTagCompose(String shopRecommendOneTagCompose) {
		this.shopRecommendOneTagCompose = shopRecommendOneTagCompose;
	}

	/**
	 * <p>Getter for the field <code>voucherInfoList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<PromoVoucherInfo> getVoucherInfoList() {
		return this.voucherInfoList;
	}
	/**
	 * <p>Setter for the field <code>voucherInfoList</code>.</p>
	 *
	 * @param voucherInfoList a {@link java.util.List} object.
	 */
	public void setVoucherInfoList(List<PromoVoucherInfo> voucherInfoList) {
		this.voucherInfoList = voucherInfoList;
	}

}
