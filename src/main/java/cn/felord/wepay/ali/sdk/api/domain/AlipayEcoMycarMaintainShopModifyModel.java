package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 洗车保养门店修改
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMaintainShopModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8311227835222695922L;

	/**
	 * 门店详细地址，地址字符长度在4-50个字符，注：不含省市区。门店详细地址按规范格式填写地址，以免影响门店搜索及活动报名：例1：道路+门牌号，“人民东路18号”；例2：道路+门牌号+标志性建筑+楼层，“四川北路1552号欢乐广场1楼”
	 */
	@ApiField("address")
	private String address;

	/**
	 * 支付宝帐号
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 门店支持的车型品牌，支付宝车型库品牌编号（系统唯一），品牌编号可以通过调用【查询车型信息接口】alipay.eco.mycar.carmodel.query 获取。（空对象不变更/空集合清空/有数据覆盖）
	 */
	@ApiListField("brand_ids")
	@ApiField("string")
	private List<String> brandIds;

	/**
	 * 城市编号（国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>）
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 门店营业结束时间（HH:mm）
	 */
	@ApiField("close_time")
	private String closeTime;

	/**
	 * 门店店长邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 门店店长移动电话号码； 不在客户端展示
	 */
	@ApiField("contact_mobile_phone")
	private String contactMobilePhone;

	/**
	 * 门店店长姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 区编号（国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>）
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 扩展参数，json格式，可以存放营销信息，以及主营描述等扩展信息
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 行业应用类目编号
15：洗车
16：保养
17：停车
20：4S
（空对象不变更/空集合清空/有数据覆盖）
	 */
	@ApiListField("industry_app_category_id")
	@ApiField("number")
	private List<Long> industryAppCategoryId;

	/**
	 * 行业类目编号（空对象不变更/空集合清空/有数据覆盖，<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=205&articleId=104497&docType=1">点此查看</a> 非口碑类目 – 爱车）
	 */
	@ApiListField("industry_category_id")
	@ApiField("number")
	private List<Long> industryCategoryId;

	/**
	 * 高德地图纬度（经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数准确）
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 高德地图经度（经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数准确）
	 */
	@ApiField("lon")
	private String lon;

	/**
	 * 车主平台接口上传主图片地址，通过alipay.eco.mycar.image.upload接口上传。
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 分支机构编号，商户在车主平台自己创建的分支机构编码
	 */
	@ApiField("merchant_branch_id")
	private Long merchantBranchId;

	/**
	 * 门店营业开始时间（HH:mm）
	 */
	@ApiField("open_time")
	private String openTime;

	/**
	 * 车主平台接口上传副图片地址，通过alipay.eco.mycar.image.upload接口上传。
	 */
	@ApiListField("other_images")
	@ApiField("string")
	private List<String> otherImages;

	/**
	 * 外部门店编号（与shop_id二选一，不能都为空）
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 省编号（国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>）
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 分店名称，比如：万塘路店，与主门店名合并在客户端显示为：爱特堡(益乐路店)
	 */
	@ApiField("shop_branch_name")
	private String shopBranchName;

	/**
	 * 车主平台门店编号（与out_shop_id二选一，不能都为空）
	 */
	@ApiField("shop_id")
	private Long shopId;

	/**
	 * 主门店名，比如：爱特堡；主店名里不要包含分店名，如“益乐路店”。主店名长度不能超过20个字符
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店电话号码；支持座机和手机，只支持数字和+-号，在客户端对用户展现
	 */
	@ApiField("shop_tel")
	private String shopTel;

	/**
	 * 门店类型：（shop_type_beauty：美容店，shop_type_repair：快修店，shop_type_maintenance：维修厂，shop_type_parkinglot：停车场，shop_type_gasstation：加油站，shop_type_4s：4s店）
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 门店状态（0：下线；1：上线）
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
	 * <p>Getter for the field <code>alipayAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	/**
	 * <p>Setter for the field <code>alipayAccount</code>.</p>
	 *
	 * @param alipayAccount a {@link java.lang.String} object.
	 */
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	/**
	 * <p>Getter for the field <code>brandIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getBrandIds() {
		return this.brandIds;
	}
	/**
	 * <p>Setter for the field <code>brandIds</code>.</p>
	 *
	 * @param brandIds a {@link java.util.List} object.
	 */
	public void setBrandIds(List<String> brandIds) {
		this.brandIds = brandIds;
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
	 * <p>Getter for the field <code>closeTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCloseTime() {
		return this.closeTime;
	}
	/**
	 * <p>Setter for the field <code>closeTime</code>.</p>
	 *
	 * @param closeTime a {@link java.lang.String} object.
	 */
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	/**
	 * <p>Getter for the field <code>contactEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactEmail() {
		return this.contactEmail;
	}
	/**
	 * <p>Setter for the field <code>contactEmail</code>.</p>
	 *
	 * @param contactEmail a {@link java.lang.String} object.
	 */
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	/**
	 * <p>Getter for the field <code>contactMobilePhone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactMobilePhone() {
		return this.contactMobilePhone;
	}
	/**
	 * <p>Setter for the field <code>contactMobilePhone</code>.</p>
	 *
	 * @param contactMobilePhone a {@link java.lang.String} object.
	 */
	public void setContactMobilePhone(String contactMobilePhone) {
		this.contactMobilePhone = contactMobilePhone;
	}

	/**
	 * <p>Getter for the field <code>contactName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactName() {
		return this.contactName;
	}
	/**
	 * <p>Setter for the field <code>contactName</code>.</p>
	 *
	 * @param contactName a {@link java.lang.String} object.
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
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
	 * <p>Getter for the field <code>extParam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtParam() {
		return this.extParam;
	}
	/**
	 * <p>Setter for the field <code>extParam</code>.</p>
	 *
	 * @param extParam a {@link java.lang.String} object.
	 */
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	/**
	 * <p>Getter for the field <code>industryAppCategoryId</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Long> getIndustryAppCategoryId() {
		return this.industryAppCategoryId;
	}
	/**
	 * <p>Setter for the field <code>industryAppCategoryId</code>.</p>
	 *
	 * @param industryAppCategoryId a {@link java.util.List} object.
	 */
	public void setIndustryAppCategoryId(List<Long> industryAppCategoryId) {
		this.industryAppCategoryId = industryAppCategoryId;
	}

	/**
	 * <p>Getter for the field <code>industryCategoryId</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Long> getIndustryCategoryId() {
		return this.industryCategoryId;
	}
	/**
	 * <p>Setter for the field <code>industryCategoryId</code>.</p>
	 *
	 * @param industryCategoryId a {@link java.util.List} object.
	 */
	public void setIndustryCategoryId(List<Long> industryCategoryId) {
		this.industryCategoryId = industryCategoryId;
	}

	/**
	 * <p>Getter for the field <code>lat</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLat() {
		return this.lat;
	}
	/**
	 * <p>Setter for the field <code>lat</code>.</p>
	 *
	 * @param lat a {@link java.lang.String} object.
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}

	/**
	 * <p>Getter for the field <code>lon</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLon() {
		return this.lon;
	}
	/**
	 * <p>Setter for the field <code>lon</code>.</p>
	 *
	 * @param lon a {@link java.lang.String} object.
	 */
	public void setLon(String lon) {
		this.lon = lon;
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
	 * <p>Getter for the field <code>merchantBranchId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getMerchantBranchId() {
		return this.merchantBranchId;
	}
	/**
	 * <p>Setter for the field <code>merchantBranchId</code>.</p>
	 *
	 * @param merchantBranchId a {@link java.lang.Long} object.
	 */
	public void setMerchantBranchId(Long merchantBranchId) {
		this.merchantBranchId = merchantBranchId;
	}

	/**
	 * <p>Getter for the field <code>openTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpenTime() {
		return this.openTime;
	}
	/**
	 * <p>Setter for the field <code>openTime</code>.</p>
	 *
	 * @param openTime a {@link java.lang.String} object.
	 */
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	/**
	 * <p>Getter for the field <code>otherImages</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getOtherImages() {
		return this.otherImages;
	}
	/**
	 * <p>Setter for the field <code>otherImages</code>.</p>
	 *
	 * @param otherImages a {@link java.util.List} object.
	 */
	public void setOtherImages(List<String> otherImages) {
		this.otherImages = otherImages;
	}

	/**
	 * <p>Getter for the field <code>outShopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutShopId() {
		return this.outShopId;
	}
	/**
	 * <p>Setter for the field <code>outShopId</code>.</p>
	 *
	 * @param outShopId a {@link java.lang.String} object.
	 */
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
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
	 * <p>Getter for the field <code>shopBranchName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopBranchName() {
		return this.shopBranchName;
	}
	/**
	 * <p>Setter for the field <code>shopBranchName</code>.</p>
	 *
	 * @param shopBranchName a {@link java.lang.String} object.
	 */
	public void setShopBranchName(String shopBranchName) {
		this.shopBranchName = shopBranchName;
	}

	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.Long} object.
	 */
	public void setShopId(Long shopId) {
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

	/**
	 * <p>Getter for the field <code>shopTel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopTel() {
		return this.shopTel;
	}
	/**
	 * <p>Setter for the field <code>shopTel</code>.</p>
	 *
	 * @param shopTel a {@link java.lang.String} object.
	 */
	public void setShopTel(String shopTel) {
		this.shopTel = shopTel;
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
