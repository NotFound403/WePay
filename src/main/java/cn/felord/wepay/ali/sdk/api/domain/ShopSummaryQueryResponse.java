package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 门店查询摘要信息接口模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ShopSummaryQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 6762164541581887975L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 分店名
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/**
	 * 品牌名，不填写则默认为其它品牌
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 经营时间
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 门店类目列表
	 */
	@ApiListField("category_infos")
	@ApiField("shop_category_info")
	private List<ShopCategoryInfo> categoryInfos;

	/**
	 * 城市编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区县编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 门店是否在客户端显示，T表示显示，F表示隐藏
	 */
	@ApiField("is_show")
	private String isShow;

	/**
	 * 纬度，只有在query_type=KB_PROMOTER非空
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，只有在query_type=KB_PROMOTER非空
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 门店首图
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 主门店名
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/**
	 * 图片集，是map转化成的json串，key是图片id,value是图片url
	 */
	@ApiField("pic_coll")
	private String picColl;

	/**
	 * 省份编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门店评论信息
	 */
	@ApiField("shop_comment_info")
	private ShopCommentInfo shopCommentInfo;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * COMMON（普通门店）、MALL（商圈）
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 门店状态，OPEN：营业中、PAUSE：暂停营业、FREEZE：已冻结、CLOSE:门店已关闭
	 */
	@ApiField("status")
	private String status;

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
	 * <p>Getter for the field <code>branchShopName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBranchShopName() {
		return this.branchShopName;
	}
	/**
	 * <p>Setter for the field <code>branchShopName</code>.</p>
	 *
	 * @param branchShopName a {@link java.lang.String} object.
	 */
	public void setBranchShopName(String branchShopName) {
		this.branchShopName = branchShopName;
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
	 * <p>Getter for the field <code>businessTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessTime() {
		return this.businessTime;
	}
	/**
	 * <p>Setter for the field <code>businessTime</code>.</p>
	 *
	 * @param businessTime a {@link java.lang.String} object.
	 */
	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

	/**
	 * <p>Getter for the field <code>categoryInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ShopCategoryInfo> getCategoryInfos() {
		return this.categoryInfos;
	}
	/**
	 * <p>Setter for the field <code>categoryInfos</code>.</p>
	 *
	 * @param categoryInfos a {@link java.util.List} object.
	 */
	public void setCategoryInfos(List<ShopCategoryInfo> categoryInfos) {
		this.categoryInfos = categoryInfos;
	}

	/**
	 * <p>Getter for the field <code>cityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityCode() {
		return this.cityCode;
	}
	/**
	 * <p>Setter for the field <code>cityCode</code>.</p>
	 *
	 * @param cityCode a {@link java.lang.String} object.
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	/**
	 * <p>Getter for the field <code>districtCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDistrictCode() {
		return this.districtCode;
	}
	/**
	 * <p>Setter for the field <code>districtCode</code>.</p>
	 *
	 * @param districtCode a {@link java.lang.String} object.
	 */
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	/**
	 * <p>Getter for the field <code>gmtCreate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtCreate() {
		return this.gmtCreate;
	}
	/**
	 * <p>Setter for the field <code>gmtCreate</code>.</p>
	 *
	 * @param gmtCreate a {@link java.lang.String} object.
	 */
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/**
	 * <p>Getter for the field <code>isShow</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsShow() {
		return this.isShow;
	}
	/**
	 * <p>Setter for the field <code>isShow</code>.</p>
	 *
	 * @param isShow a {@link java.lang.String} object.
	 */
	public void setIsShow(String isShow) {
		this.isShow = isShow;
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
	 * <p>Getter for the field <code>mainImage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMainImage() {
		return this.mainImage;
	}
	/**
	 * <p>Setter for the field <code>mainImage</code>.</p>
	 *
	 * @param mainImage a {@link java.lang.String} object.
	 */
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	/**
	 * <p>Getter for the field <code>mainShopName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMainShopName() {
		return this.mainShopName;
	}
	/**
	 * <p>Setter for the field <code>mainShopName</code>.</p>
	 *
	 * @param mainShopName a {@link java.lang.String} object.
	 */
	public void setMainShopName(String mainShopName) {
		this.mainShopName = mainShopName;
	}

	/**
	 * <p>Getter for the field <code>picColl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPicColl() {
		return this.picColl;
	}
	/**
	 * <p>Setter for the field <code>picColl</code>.</p>
	 *
	 * @param picColl a {@link java.lang.String} object.
	 */
	public void setPicColl(String picColl) {
		this.picColl = picColl;
	}

	/**
	 * <p>Getter for the field <code>provinceCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProvinceCode() {
		return this.provinceCode;
	}
	/**
	 * <p>Setter for the field <code>provinceCode</code>.</p>
	 *
	 * @param provinceCode a {@link java.lang.String} object.
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	/**
	 * <p>Getter for the field <code>shopCommentInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ShopCommentInfo} object.
	 */
	public ShopCommentInfo getShopCommentInfo() {
		return this.shopCommentInfo;
	}
	/**
	 * <p>Setter for the field <code>shopCommentInfo</code>.</p>
	 *
	 * @param shopCommentInfo a {@link cn.felord.wepay.ali.sdk.api.domain.ShopCommentInfo} object.
	 */
	public void setShopCommentInfo(ShopCommentInfo shopCommentInfo) {
		this.shopCommentInfo = shopCommentInfo;
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
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
