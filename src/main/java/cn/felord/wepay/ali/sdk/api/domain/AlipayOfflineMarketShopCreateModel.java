package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 系统商需要通过该接口在口碑平台帮助商户创建门店信息。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1229938796699296626L;

	/**
	 * 门店详细地址，地址字符长度在4-50个字符，注：不含省市区。门店详细地址按规范格式填写地址，以免影响门店搜索及活动报名：例1：道路+门牌号，“人民东路18号”；例2：道路+门牌号+标志性建筑+楼层，“四川北路1552号欢乐广场1楼”。
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店审核时需要的图片；至少包含一张门头照片，两张内景照片，必须反映真实的门店情况，审核才能够通过；多个图片之间以英文逗号分隔。
	 */
	@ApiField("audit_images")
	private String auditImages;

	/**
	 * 门店授权函,营业执照与签约账号主体不一致时需要。
	 */
	@ApiField("auth_letter")
	private String authLetter;

	/**
	 * 人均消费价格，最少1元，最大不超过99999元，请按实际情况填写；单位元，不需填写单位。
	 */
	@ApiField("avg_price")
	private String avgPrice;

	/**
	 * 店铺接口业务版本号，新接入的ISV，请统一传入2.0。
	 */
	@ApiField("biz_version")
	private String bizVersion;

	/**
	 * 门店是否有包厢，T表示有，F表示没有，不传在客户端不作展示。
	 */
	@ApiField("box")
	private String box;

	/**
	 * 分店名称，比如：万塘路店，与主门店名合并在客户端显示为：肯德基(万塘路店)。
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/**
	 * 品牌LOGO; 图片ID，不填写则默认为门店首图main_image。
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 品牌名，不填写则默认为“其它品牌”。
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 许可证，各行业所需的证照资质参见<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=205&articleId=104497&docType=1">商户入驻要求</a>；该字段只能上传一张许可证，一张以外的许可证、除营业执照和许可证之外其他证照请放在其他资质字段上传。
	 */
	@ApiField("business_certificate")
	private String businessCertificate;

	/**
	 * 许可证有效期，格式：2020-03-20或长期。严格按照格式填写。
	 */
	@ApiField("business_certificate_expires")
	private String businessCertificateExpires;

	/**
	 * 请严格按"周一-周五 09:00-20:00,周六-周日 10:00-22:00"的格式进行填写，时间段不能重复，最多支持两个时间段，24小时营业请填写"00:00-23:59"
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 类目id，请参考<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=205&articleId=104497&docType=1">商户入驻要求</a>。
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 城市编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 门店电话号码；支持座机和手机，只支持数字和+-号，在客户端对用户展现， 支持多个电话， 以英文逗号分隔。
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * （支付宝内部参数）小二的支付宝账号。
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 区县编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * （支付宝内部参数）企业支付宝账号。
	 */
	@ApiField("enterprise_logon_id")
	private String enterpriseLogonId;

	/**
	 * （支付宝内部参数）企业支付宝账户名称。
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 机具号，多个之间以英文逗号分隔。
	 */
	@ApiField("implement_id")
	private String implementId;

	/**
	 * 是否在其他平台开店，T表示有开店，F表示未开店。
	 */
	@ApiField("is_operating_online")
	private String isOperatingOnline;

	/**
	 * ISV返佣id，门店创建、或者门店交易的返佣将通过此账号反给ISV，如果有口碑签订了返佣协议，则该字段作为返佣数据提取的依据。此字段必须是个合法uid，2088开头的16位支付宝会员账号，如果传入错误将无法创建门店。
	 */
	@ApiField("isv_uid")
	private String isvUid;

	/**
	 * 纬度；最长15位字符（包括小数点）， 注：高德坐标系。经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * （支付宝内部参数）leads的编号。
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 门店营业执照图片，各行业所需的证照资质参见<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=205&articleId=104497&docType=1">商户入驻要求</a>。
	 */
	@ApiField("licence")
	private String licence;

	/**
	 * 门店营业执照编号，只支持输入中文，英文和数字，营业执照信息与is_operating_online至少填一项。
	 */
	@ApiField("licence_code")
	private String licenceCode;

	/**
	 * 营业执照过期时间。格式：2020-10-20或长期。严格按照格式填写。
	 */
	@ApiField("licence_expires")
	private String licenceExpires;

	/**
	 * 门店营业执照名称。
	 */
	@ApiField("licence_name")
	private String licenceName;

	/**
	 * 经度；最长15位字符（包括小数点）， 注：高德坐标系。经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("longitude")
	private Long longitude;

	/**
	 * 门店首图，非常重要，推荐尺寸2000*1500。
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 主门店名  比如：肯德基；主店名里不要包含分店名，如“万塘路店”。主店名长度不能超过20个字符。
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/**
	 * 是否有无烟区，T表示有无烟区，F表示没有无烟区，不传在客户端不展示。
	 */
	@ApiField("no_smoking")
	private String noSmoking;

	/**
	 * 门店店长电话号码；用于接收门店状态变更通知，收款成功通知等通知消息， 不在客户端展示。
	 */
	@ApiField("notify_mobile")
	private String notifyMobile;

	/**
	 * 废弃字段，请使用online_url字段替代。
	 */
	@ApiField("online_image")
	private String onlineImage;

	/**
	 * 其他平台开店的店铺链接url，多个url使用英文逗号隔开,isv迁移到新接口使用此字段，与is_operating_online=T配套使用。
	 */
	@ApiField("online_url")
	private String onlineUrl;

	/**
	 * 表示以系统集成商的身份开店，开放平台现在统一传入ISV。
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 当商户的门店审核状态发生变化时，会向该地址推送消息。
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/**
	 * 其他资质。用于上传营业证照、许可证照外的其他资质，除已上传许可证外的其他许可证也可以在该字段上传。
	 */
	@ApiField("other_authorization")
	private String otherAuthorization;

	/**
	 * 门店是否支持停车，T表示支持，F表示不支持，不传在客户端不作展示。
	 */
	@ApiField("parking")
	private String parking;

	/**
	 * （支付宝内部参数）服务商要操作的商户PID。
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * （支付宝内部参数）付款方式：code_scanned_pay：付款码 
online_pay：在线买单。ISV不可以指定此字段，ISV泛行业开店默认为在线买单，云纵开店可以指定支付方式。
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 省份编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * （支付宝内部参数）leads开店重试支付宝流水ID。
	 */
	@ApiField("ref_apply_id")
	private String refApplyId;

	/**
	 * 支持英文字母和数字，由开发者自行定义（不允许重复），在门店notify消息中也会带有该参数，以此标明本次notify消息是对哪个请求的回应。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 外部门店编号；最长32位字符，该编号将作为收单接口的入参， 请开发者自行确保其唯一性。
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店其他的服务，门店与用户线下兑现。
	 */
	@ApiField("value_added")
	private String valueAdded;

	/**
	 * 废弃字段，使用biz_version字段替代。
	 */
	@ApiField("version")
	private String version;

	/**
	 * 门店是否支持WIFI，T表示支持，F表示不支持，不传在客户端不作展示。
	 */
	@ApiField("wifi")
	private String wifi;

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
	 * <p>Getter for the field <code>auditImages</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditImages() {
		return this.auditImages;
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
	 * <p>Getter for the field <code>authLetter</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthLetter() {
		return this.authLetter;
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
	 * <p>Getter for the field <code>avgPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAvgPrice() {
		return this.avgPrice;
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
	 * <p>Getter for the field <code>bizVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizVersion() {
		return this.bizVersion;
	}
	/**
	 * <p>Setter for the field <code>bizVersion</code>.</p>
	 *
	 * @param bizVersion a {@link java.lang.String} object.
	 */
	public void setBizVersion(String bizVersion) {
		this.bizVersion = bizVersion;
	}

	/**
	 * <p>Getter for the field <code>box</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBox() {
		return this.box;
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
	 * <p>Getter for the field <code>brandLogo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandLogo() {
		return this.brandLogo;
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
	 * <p>Getter for the field <code>businessCertificate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessCertificate() {
		return this.businessCertificate;
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
	 * <p>Getter for the field <code>businessCertificateExpires</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessCertificateExpires() {
		return this.businessCertificateExpires;
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
	 * <p>Getter for the field <code>categoryId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryId() {
		return this.categoryId;
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
	 * <p>Getter for the field <code>contactNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactNumber() {
		return this.contactNumber;
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
	 * <p>Getter for the field <code>creator</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreator() {
		return this.creator;
	}
	/**
	 * <p>Setter for the field <code>creator</code>.</p>
	 *
	 * @param creator a {@link java.lang.String} object.
	 */
	public void setCreator(String creator) {
		this.creator = creator;
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
	 * <p>Getter for the field <code>enterpriseLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnterpriseLogonId() {
		return this.enterpriseLogonId;
	}
	/**
	 * <p>Setter for the field <code>enterpriseLogonId</code>.</p>
	 *
	 * @param enterpriseLogonId a {@link java.lang.String} object.
	 */
	public void setEnterpriseLogonId(String enterpriseLogonId) {
		this.enterpriseLogonId = enterpriseLogonId;
	}

	/**
	 * <p>Getter for the field <code>enterpriseName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	/**
	 * <p>Setter for the field <code>enterpriseName</code>.</p>
	 *
	 * @param enterpriseName a {@link java.lang.String} object.
	 */
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	/**
	 * <p>Getter for the field <code>implementId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImplementId() {
		return this.implementId;
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
	 * <p>Getter for the field <code>isOperatingOnline</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsOperatingOnline() {
		return this.isOperatingOnline;
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
	 * <p>Getter for the field <code>isvUid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvUid() {
		return this.isvUid;
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
	 * <p>Getter for the field <code>leadsId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLeadsId() {
		return this.leadsId;
	}
	/**
	 * <p>Setter for the field <code>leadsId</code>.</p>
	 *
	 * @param leadsId a {@link java.lang.String} object.
	 */
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	/**
	 * <p>Getter for the field <code>licence</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicence() {
		return this.licence;
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
	 * <p>Getter for the field <code>licenceCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicenceCode() {
		return this.licenceCode;
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
	 * <p>Getter for the field <code>licenceExpires</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicenceExpires() {
		return this.licenceExpires;
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
	 * <p>Getter for the field <code>licenceName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicenceName() {
		return this.licenceName;
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
	 * <p>Getter for the field <code>longitude</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getLongitude() {
		return this.longitude;
	}
	/**
	 * <p>Setter for the field <code>longitude</code>.</p>
	 *
	 * @param longitude a {@link java.lang.Long} object.
	 */
	public void setLongitude(Long longitude) {
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
	 * <p>Getter for the field <code>noSmoking</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNoSmoking() {
		return this.noSmoking;
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
	 * <p>Getter for the field <code>notifyMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNotifyMobile() {
		return this.notifyMobile;
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
	 * <p>Getter for the field <code>onlineImage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOnlineImage() {
		return this.onlineImage;
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
	 * <p>Getter for the field <code>onlineUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOnlineUrl() {
		return this.onlineUrl;
	}
	/**
	 * <p>Setter for the field <code>onlineUrl</code>.</p>
	 *
	 * @param onlineUrl a {@link java.lang.String} object.
	 */
	public void setOnlineUrl(String onlineUrl) {
		this.onlineUrl = onlineUrl;
	}

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
	 * <p>Getter for the field <code>operateNotifyUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateNotifyUrl() {
		return this.operateNotifyUrl;
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
	 * <p>Getter for the field <code>otherAuthorization</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOtherAuthorization() {
		return this.otherAuthorization;
	}
	/**
	 * <p>Setter for the field <code>otherAuthorization</code>.</p>
	 *
	 * @param otherAuthorization a {@link java.lang.String} object.
	 */
	public void setOtherAuthorization(String otherAuthorization) {
		this.otherAuthorization = otherAuthorization;
	}

	/**
	 * <p>Getter for the field <code>parking</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParking() {
		return this.parking;
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
	 * <p>Getter for the field <code>partnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerId() {
		return this.partnerId;
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
	 * <p>Getter for the field <code>payType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayType() {
		return this.payType;
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
	 * <p>Getter for the field <code>refApplyId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefApplyId() {
		return this.refApplyId;
	}
	/**
	 * <p>Setter for the field <code>refApplyId</code>.</p>
	 *
	 * @param refApplyId a {@link java.lang.String} object.
	 */
	public void setRefApplyId(String refApplyId) {
		this.refApplyId = refApplyId;
	}

	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId() {
		return this.requestId;
	}
	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	/**
	 * <p>Getter for the field <code>valueAdded</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValueAdded() {
		return this.valueAdded;
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
	 * <p>Getter for the field <code>version</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVersion() {
		return this.version;
	}
	/**
	 * <p>Setter for the field <code>version</code>.</p>
	 *
	 * @param version a {@link java.lang.String} object.
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * <p>Getter for the field <code>wifi</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getWifi() {
		return this.wifi;
	}
	/**
	 * <p>Setter for the field <code>wifi</code>.</p>
	 *
	 * @param wifi a {@link java.lang.String} object.
	 */
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

}
