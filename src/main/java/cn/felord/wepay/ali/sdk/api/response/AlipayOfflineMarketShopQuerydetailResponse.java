package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.querydetail response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopQuerydetailResponse extends AlipayResponse {

	private static final long serialVersionUID = 1374442269637152618L;

	/** 
	 * 门店详细地址，注：不含省市区
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 门店审核状态描述，如果审核驳回则有相关的驳回理由
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 门店审核时需要的图片; 至少包含一张门头照片，两张内景照片，必须反映真实的门店情况，审核才能够通过， 多个以英文逗号分隔
	 */
	@ApiField("audit_images")
	private String auditImages;

	/** 
	 * 门店审核状态，对于系统商而言，只有三个状态，AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过。第一次审核通过会触发门店上架。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 授权函图片
	 */
	@ApiField("auth_letter")
	private String authLetter;

	/** 
	 * 人均消费价格，最少1元，最大不超过99999元，请按实际情况填写；单位元；
	 */
	@ApiField("avg_price")
	private String avgPrice;

	/** 
	 * 门店是否有包厢，T表示有，F表示没有，不传在客户端不作展示
	 */
	@ApiField("box")
	private String box;

	/** 
	 * 分店名称，比如：万塘路店，与主门店名合并在客户端显示为：肯德基(万塘路店)
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/** 
	 * 品牌LOGO; 图片ID，不填写则默认为门店首图main_image
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/** 
	 * 品牌名称；不填写则默认为“其它品牌”
	 */
	@ApiField("brand_name")
	private String brandName;

	/** 
	 * 经营许可证，只有餐饮类目需要
	 */
	@ApiField("business_certificate")
	private String businessCertificate;

	/** 
	 * 经营许可证有效期，格式：2020-03-20，只有餐饮类目需要
	 */
	@ApiField("business_certificate_expires")
	private String businessCertificateExpires;

	/** 
	 * 营业时间;支持分段营业时间，以英文逗号分隔
	 */
	@ApiField("business_time")
	private String businessTime;

	/** 
	 * 类目ID，类目初始数据由口碑提供
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 城市编码，国标码，详见国家统计局数据
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 门店电话号码；支持座机和手机，在客户端对用户展现，支持多个电话，以英文逗号分隔
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/** 
	 * 门店创建来源；如：开放平台、支付宝客户端、口碑商家app、商家自主开店、服务商开店、全民开店-支付宝客户端、全民开店-商户app、其它
	 */
	@ApiField("create_channel")
	private String createChannel;

	/** 
	 * 区县编码，国标码，详见国家统计局数据
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 门店创建时间
	 */
	@ApiField("gmt_shop_create")
	private String gmtShopCreate;

	/** 
	 * 门店修改时间
	 */
	@ApiField("gmt_shop_modified")
	private String gmtShopModified;

	/** 
	 * 店铺使用的机具编号，多个以英文逗号分隔
	 */
	@ApiField("implement_id")
	private String implementId;

	/** 
	 * 门店是否上架，T表示上架,F表示未上架，第一次门店审核通过后会触发上架
	 */
	@ApiField("is_online")
	private String isOnline;

	/** 
	 * 是否在其他平台开店，T表示有开店，F表示未开店，用于证明其开店资质
	 */
	@ApiField("is_operating_online")
	private String isOperatingOnline;

	/** 
	 * 门店是否在客户端显示，T表示显示，F表示隐藏
	 */
	@ApiField("is_show")
	private String isShow;

	/** 
	 * 开发者返佣ID，重要：如果有口碑签订了返佣协议，则该字段作为返佣数据提取的依据，需要与签约协议的PID保持一致， 该字段只能在创建接口中传入，不能在修改接口中被修改
	 */
	@ApiField("isv_uid")
	private String isvUid;

	/** 
	 * 纬度，最长15位字符（包括小数点）， 注：高德坐标系
	 */
	@ApiField("latitude")
	private String latitude;

	/** 
	 * 门店营业执照图片
	 */
	@ApiField("licence")
	private String licence;

	/** 
	 * 门店营业执照编号
	 */
	@ApiField("licence_code")
	private String licenceCode;

	/** 
	 * 营业执照过期时间
	 */
	@ApiField("licence_expires")
	private String licenceExpires;

	/** 
	 * 门店营业执照名称
	 */
	@ApiField("licence_name")
	private String licenceName;

	/** 
	 * 经度，最长15位字符（包括小数点）， 注：高德坐标系
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * 门店首图；非常重要，推荐尺寸2000*1500
	 */
	@ApiField("main_image")
	private String mainImage;

	/** 
	 * 主店名；比如：肯德基
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/** 
	 * 是否有无烟区，T表示有无烟区，F表示没有无烟区，不传在客户端不展示
	 */
	@ApiField("no_smoking")
	private String noSmoking;

	/** 
	 * 门店店长电话号码；用于接收门店状态变更通知，收款成功通知等通知消息，不在客户端展示；多个以引文逗号分隔
	 */
	@ApiField("notify_mobile")
	private String notifyMobile;

	/** 
	 * 在其他平台的开店图片，支持多张，逗号分隔
	 */
	@ApiField("online_image")
	private String onlineImage;

	/** 
	 * 通知发送url;当商户的门店审核状态发生变化时，会向该地址推送消息
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/** 
	 * 其它资质证明图片集；支持多张，逗号分隔
	 */
	@ApiField("other_auth_images")
	private String otherAuthImages;

	/** 
	 * 门店是否支持停车，T表示支持，F表示不支持，不传在客户端不作展示
	 */
	@ApiField("parking")
	private String parking;

	/** 
	 * 门店的签约ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 默认付款类型；如：付款码、扫码付、声波支付、在线买单、其它
	 */
	@ApiField("pay_type")
	private String payType;

	/** 
	 * 门店收款账户，门店收款账户只能被查询，不能通过接口修改。如果为空，则表示门店收款账户为商户签约账户
	 */
	@ApiField("payment_account")
	private String paymentAccount;

	/** 
	 * 图片集，是map转化成的json串，key是图片id,value是图片url
	 */
	@ApiField("pic_coll")
	private String picColl;

	/** 
	 * 经过加工后的门店收款二维码
	 */
	@ApiField("processed_qr_code")
	private String processedQrCode;

	/** 
	 * 门店运营归属人uid
	 */
	@ApiField("provider_xiaoer_uid")
	private String providerXiaoerUid;

	/** 
	 * 省份编码，国标码，详见国家统计局数据
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 门店收款二维码裸码
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 门店标签；JSON格式。包括：keyMerchant-是否重点商户（T/F）；isHallMeal-堂食（T/F）；注：若标签 key 不存在，则门店无对应的标签
	 */
	@ApiField("shop_tags")
	private String shopTags;

	/** 
	 * 外部门店编号；最长54位字符，该编号将作为收单接口的入参， 请开发者自行确保其唯一性
	 */
	@ApiField("store_id")
	private String storeId;

	/** 
	 * 门店其他的服务，门店与用户线下兑现
	 */
	@ApiField("value_added")
	private String valueAdded;

	/** 
	 * 门店是否支持WIFI，T表示支持，F表示不支持，不传在客户端不作展示
	 */
	@ApiField("wifi")
	private String wifi;

	/**
	 * <p>Setter for the field <code>address</code>.</p>
	 *
	 * @param address a {@link java.lang.String} object.
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * <p>Getter for the field <code>address</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddress( ) {
		return this.address;
	}

	/**
	 * <p>Setter for the field <code>auditDesc</code>.</p>
	 *
	 * @param auditDesc a {@link java.lang.String} object.
	 */
	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	/**
	 * <p>Getter for the field <code>auditDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditDesc( ) {
		return this.auditDesc;
	}

	/**
	 * <p>Setter for the field <code>auditImages</code>.</p>
	 *
	 * @param auditImages a {@link java.lang.String} object.
	 */
	public void setAuditImages(String auditImages) {
		this.auditImages = auditImages;
	}
	/**
	 * <p>Getter for the field <code>auditImages</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditImages( ) {
		return this.auditImages;
	}

	/**
	 * <p>Setter for the field <code>auditStatus</code>.</p>
	 *
	 * @param auditStatus a {@link java.lang.String} object.
	 */
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	/**
	 * <p>Getter for the field <code>auditStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	/**
	 * <p>Setter for the field <code>authLetter</code>.</p>
	 *
	 * @param authLetter a {@link java.lang.String} object.
	 */
	public void setAuthLetter(String authLetter) {
		this.authLetter = authLetter;
	}
	/**
	 * <p>Getter for the field <code>authLetter</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthLetter( ) {
		return this.authLetter;
	}

	/**
	 * <p>Setter for the field <code>avgPrice</code>.</p>
	 *
	 * @param avgPrice a {@link java.lang.String} object.
	 */
	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}
	/**
	 * <p>Getter for the field <code>avgPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAvgPrice( ) {
		return this.avgPrice;
	}

	/**
	 * <p>Setter for the field <code>box</code>.</p>
	 *
	 * @param box a {@link java.lang.String} object.
	 */
	public void setBox(String box) {
		this.box = box;
	}
	/**
	 * <p>Getter for the field <code>box</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBox( ) {
		return this.box;
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
	 * <p>Getter for the field <code>branchShopName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBranchShopName( ) {
		return this.branchShopName;
	}

	/**
	 * <p>Setter for the field <code>brandLogo</code>.</p>
	 *
	 * @param brandLogo a {@link java.lang.String} object.
	 */
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}
	/**
	 * <p>Getter for the field <code>brandLogo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandLogo( ) {
		return this.brandLogo;
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
	 * <p>Getter for the field <code>brandName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandName( ) {
		return this.brandName;
	}

	/**
	 * <p>Setter for the field <code>businessCertificate</code>.</p>
	 *
	 * @param businessCertificate a {@link java.lang.String} object.
	 */
	public void setBusinessCertificate(String businessCertificate) {
		this.businessCertificate = businessCertificate;
	}
	/**
	 * <p>Getter for the field <code>businessCertificate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessCertificate( ) {
		return this.businessCertificate;
	}

	/**
	 * <p>Setter for the field <code>businessCertificateExpires</code>.</p>
	 *
	 * @param businessCertificateExpires a {@link java.lang.String} object.
	 */
	public void setBusinessCertificateExpires(String businessCertificateExpires) {
		this.businessCertificateExpires = businessCertificateExpires;
	}
	/**
	 * <p>Getter for the field <code>businessCertificateExpires</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessCertificateExpires( ) {
		return this.businessCertificateExpires;
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
	 * <p>Getter for the field <code>businessTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessTime( ) {
		return this.businessTime;
	}

	/**
	 * <p>Setter for the field <code>categoryId</code>.</p>
	 *
	 * @param categoryId a {@link java.lang.String} object.
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * <p>Getter for the field <code>categoryId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryId( ) {
		return this.categoryId;
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
	 * <p>Getter for the field <code>cityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityCode( ) {
		return this.cityCode;
	}

	/**
	 * <p>Setter for the field <code>contactNumber</code>.</p>
	 *
	 * @param contactNumber a {@link java.lang.String} object.
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	/**
	 * <p>Getter for the field <code>contactNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactNumber( ) {
		return this.contactNumber;
	}

	/**
	 * <p>Setter for the field <code>createChannel</code>.</p>
	 *
	 * @param createChannel a {@link java.lang.String} object.
	 */
	public void setCreateChannel(String createChannel) {
		this.createChannel = createChannel;
	}
	/**
	 * <p>Getter for the field <code>createChannel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreateChannel( ) {
		return this.createChannel;
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
	 * <p>Getter for the field <code>districtCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDistrictCode( ) {
		return this.districtCode;
	}

	/**
	 * <p>Setter for the field <code>gmtShopCreate</code>.</p>
	 *
	 * @param gmtShopCreate a {@link java.lang.String} object.
	 */
	public void setGmtShopCreate(String gmtShopCreate) {
		this.gmtShopCreate = gmtShopCreate;
	}
	/**
	 * <p>Getter for the field <code>gmtShopCreate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtShopCreate( ) {
		return this.gmtShopCreate;
	}

	/**
	 * <p>Setter for the field <code>gmtShopModified</code>.</p>
	 *
	 * @param gmtShopModified a {@link java.lang.String} object.
	 */
	public void setGmtShopModified(String gmtShopModified) {
		this.gmtShopModified = gmtShopModified;
	}
	/**
	 * <p>Getter for the field <code>gmtShopModified</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtShopModified( ) {
		return this.gmtShopModified;
	}

	/**
	 * <p>Setter for the field <code>implementId</code>.</p>
	 *
	 * @param implementId a {@link java.lang.String} object.
	 */
	public void setImplementId(String implementId) {
		this.implementId = implementId;
	}
	/**
	 * <p>Getter for the field <code>implementId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImplementId( ) {
		return this.implementId;
	}

	/**
	 * <p>Setter for the field <code>isOnline</code>.</p>
	 *
	 * @param isOnline a {@link java.lang.String} object.
	 */
	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
	/**
	 * <p>Getter for the field <code>isOnline</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsOnline( ) {
		return this.isOnline;
	}

	/**
	 * <p>Setter for the field <code>isOperatingOnline</code>.</p>
	 *
	 * @param isOperatingOnline a {@link java.lang.String} object.
	 */
	public void setIsOperatingOnline(String isOperatingOnline) {
		this.isOperatingOnline = isOperatingOnline;
	}
	/**
	 * <p>Getter for the field <code>isOperatingOnline</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsOperatingOnline( ) {
		return this.isOperatingOnline;
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
	 * <p>Getter for the field <code>isShow</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsShow( ) {
		return this.isShow;
	}

	/**
	 * <p>Setter for the field <code>isvUid</code>.</p>
	 *
	 * @param isvUid a {@link java.lang.String} object.
	 */
	public void setIsvUid(String isvUid) {
		this.isvUid = isvUid;
	}
	/**
	 * <p>Getter for the field <code>isvUid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvUid( ) {
		return this.isvUid;
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
	 * <p>Getter for the field <code>latitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLatitude( ) {
		return this.latitude;
	}

	/**
	 * <p>Setter for the field <code>licence</code>.</p>
	 *
	 * @param licence a {@link java.lang.String} object.
	 */
	public void setLicence(String licence) {
		this.licence = licence;
	}
	/**
	 * <p>Getter for the field <code>licence</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicence( ) {
		return this.licence;
	}

	/**
	 * <p>Setter for the field <code>licenceCode</code>.</p>
	 *
	 * @param licenceCode a {@link java.lang.String} object.
	 */
	public void setLicenceCode(String licenceCode) {
		this.licenceCode = licenceCode;
	}
	/**
	 * <p>Getter for the field <code>licenceCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicenceCode( ) {
		return this.licenceCode;
	}

	/**
	 * <p>Setter for the field <code>licenceExpires</code>.</p>
	 *
	 * @param licenceExpires a {@link java.lang.String} object.
	 */
	public void setLicenceExpires(String licenceExpires) {
		this.licenceExpires = licenceExpires;
	}
	/**
	 * <p>Getter for the field <code>licenceExpires</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicenceExpires( ) {
		return this.licenceExpires;
	}

	/**
	 * <p>Setter for the field <code>licenceName</code>.</p>
	 *
	 * @param licenceName a {@link java.lang.String} object.
	 */
	public void setLicenceName(String licenceName) {
		this.licenceName = licenceName;
	}
	/**
	 * <p>Getter for the field <code>licenceName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicenceName( ) {
		return this.licenceName;
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
	 * <p>Getter for the field <code>longitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLongitude( ) {
		return this.longitude;
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
	 * <p>Getter for the field <code>mainImage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMainImage( ) {
		return this.mainImage;
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
	 * <p>Getter for the field <code>mainShopName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMainShopName( ) {
		return this.mainShopName;
	}

	/**
	 * <p>Setter for the field <code>noSmoking</code>.</p>
	 *
	 * @param noSmoking a {@link java.lang.String} object.
	 */
	public void setNoSmoking(String noSmoking) {
		this.noSmoking = noSmoking;
	}
	/**
	 * <p>Getter for the field <code>noSmoking</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNoSmoking( ) {
		return this.noSmoking;
	}

	/**
	 * <p>Setter for the field <code>notifyMobile</code>.</p>
	 *
	 * @param notifyMobile a {@link java.lang.String} object.
	 */
	public void setNotifyMobile(String notifyMobile) {
		this.notifyMobile = notifyMobile;
	}
	/**
	 * <p>Getter for the field <code>notifyMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNotifyMobile( ) {
		return this.notifyMobile;
	}

	/**
	 * <p>Setter for the field <code>onlineImage</code>.</p>
	 *
	 * @param onlineImage a {@link java.lang.String} object.
	 */
	public void setOnlineImage(String onlineImage) {
		this.onlineImage = onlineImage;
	}
	/**
	 * <p>Getter for the field <code>onlineImage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOnlineImage( ) {
		return this.onlineImage;
	}

	/**
	 * <p>Setter for the field <code>operateNotifyUrl</code>.</p>
	 *
	 * @param operateNotifyUrl a {@link java.lang.String} object.
	 */
	public void setOperateNotifyUrl(String operateNotifyUrl) {
		this.operateNotifyUrl = operateNotifyUrl;
	}
	/**
	 * <p>Getter for the field <code>operateNotifyUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateNotifyUrl( ) {
		return this.operateNotifyUrl;
	}

	/**
	 * <p>Setter for the field <code>otherAuthImages</code>.</p>
	 *
	 * @param otherAuthImages a {@link java.lang.String} object.
	 */
	public void setOtherAuthImages(String otherAuthImages) {
		this.otherAuthImages = otherAuthImages;
	}
	/**
	 * <p>Getter for the field <code>otherAuthImages</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOtherAuthImages( ) {
		return this.otherAuthImages;
	}

	/**
	 * <p>Setter for the field <code>parking</code>.</p>
	 *
	 * @param parking a {@link java.lang.String} object.
	 */
	public void setParking(String parking) {
		this.parking = parking;
	}
	/**
	 * <p>Getter for the field <code>parking</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParking( ) {
		return this.parking;
	}

	/**
	 * <p>Setter for the field <code>partnerId</code>.</p>
	 *
	 * @param partnerId a {@link java.lang.String} object.
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	/**
	 * <p>Getter for the field <code>partnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerId( ) {
		return this.partnerId;
	}

	/**
	 * <p>Setter for the field <code>payType</code>.</p>
	 *
	 * @param payType a {@link java.lang.String} object.
	 */
	public void setPayType(String payType) {
		this.payType = payType;
	}
	/**
	 * <p>Getter for the field <code>payType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayType( ) {
		return this.payType;
	}

	/**
	 * <p>Setter for the field <code>paymentAccount</code>.</p>
	 *
	 * @param paymentAccount a {@link java.lang.String} object.
	 */
	public void setPaymentAccount(String paymentAccount) {
		this.paymentAccount = paymentAccount;
	}
	/**
	 * <p>Getter for the field <code>paymentAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentAccount( ) {
		return this.paymentAccount;
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
	 * <p>Getter for the field <code>picColl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPicColl( ) {
		return this.picColl;
	}

	/**
	 * <p>Setter for the field <code>processedQrCode</code>.</p>
	 *
	 * @param processedQrCode a {@link java.lang.String} object.
	 */
	public void setProcessedQrCode(String processedQrCode) {
		this.processedQrCode = processedQrCode;
	}
	/**
	 * <p>Getter for the field <code>processedQrCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProcessedQrCode( ) {
		return this.processedQrCode;
	}

	/**
	 * <p>Setter for the field <code>providerXiaoerUid</code>.</p>
	 *
	 * @param providerXiaoerUid a {@link java.lang.String} object.
	 */
	public void setProviderXiaoerUid(String providerXiaoerUid) {
		this.providerXiaoerUid = providerXiaoerUid;
	}
	/**
	 * <p>Getter for the field <code>providerXiaoerUid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProviderXiaoerUid( ) {
		return this.providerXiaoerUid;
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
	 * <p>Getter for the field <code>provinceCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	/**
	 * <p>Setter for the field <code>qrCode</code>.</p>
	 *
	 * @param qrCode a {@link java.lang.String} object.
	 */
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	/**
	 * <p>Getter for the field <code>qrCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrCode( ) {
		return this.qrCode;
	}

	/**
	 * <p>Setter for the field <code>shopTags</code>.</p>
	 *
	 * @param shopTags a {@link java.lang.String} object.
	 */
	public void setShopTags(String shopTags) {
		this.shopTags = shopTags;
	}
	/**
	 * <p>Getter for the field <code>shopTags</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopTags( ) {
		return this.shopTags;
	}

	/**
	 * <p>Setter for the field <code>storeId</code>.</p>
	 *
	 * @param storeId a {@link java.lang.String} object.
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	/**
	 * <p>Getter for the field <code>storeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStoreId( ) {
		return this.storeId;
	}

	/**
	 * <p>Setter for the field <code>valueAdded</code>.</p>
	 *
	 * @param valueAdded a {@link java.lang.String} object.
	 */
	public void setValueAdded(String valueAdded) {
		this.valueAdded = valueAdded;
	}
	/**
	 * <p>Getter for the field <code>valueAdded</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValueAdded( ) {
		return this.valueAdded;
	}

	/**
	 * <p>Setter for the field <code>wifi</code>.</p>
	 *
	 * @param wifi a {@link java.lang.String} object.
	 */
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	/**
	 * <p>Getter for the field <code>wifi</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getWifi( ) {
		return this.wifi;
	}

}
