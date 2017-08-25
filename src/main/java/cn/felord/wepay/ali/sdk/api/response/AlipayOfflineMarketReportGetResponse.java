package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.report.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketReportGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1557877721518347719L;

	/** 
	 * 街道
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 近30日交易金额
	 */
	@ApiField("amount_in_30_days")
	private String amountIn30Days;

	/** 
	 * 近7日交易金额
	 */
	@ApiField("amount_in_7_days")
	private String amountIn7Days;

	/** 
	 * 人均消费金额(单位:分,下同)
	 */
	@ApiField("amount_per_capita")
	private String amountPerCapita;

	/** 
	 * 昨日交易金额
	 */
	@ApiField("amount_yesterday")
	private String amountYesterday;

	/** 
	 * 大区
	 */
	@ApiField("area")
	private String area;

	/** 
	 * WAITING_ASSIGN(待分配)、确认中(CONFIRMING)、已分配(ASSIGNED)
	 */
	@ApiField("assign_status")
	private String assignStatus;

	/** 
	 * 后台小二的UID
	 */
	@ApiField("bd_staff_uid")
	private String bdStaffUid;

	/** 
	 * 品牌
	 */
	@ApiField("brand_name")
	private String brandName;

	/** 
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 市代码
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 城市经理
	 */
	@ApiField("city_manager_name")
	private String cityManagerName;

	/** 
	 * 城市经理uid
	 */
	@ApiField("city_manager_uid")
	private String cityManagerUid;

	/** 
	 * 竞对最低折扣值
	 */
	@ApiField("competitor_lowest_discount")
	private String competitorLowestDiscount;

	/** 
	 * 1：全民开店的数据开店类型显示为全民开店；0：非全民开店的数据开店类型显示为非全民开店；
	 */
	@ApiField("create_channel")
	private String createChannel;

	/** 
	 * 三级行业
	 */
	@ApiField("detail_category")
	private String detailCategory;

	/** 
	 * 三级行业编号
	 */
	@ApiField("detail_category_code")
	private String detailCategoryCode;

	/** 
	 * 折扣id
	 */
	@ApiField("discount_id")
	private String discountId;

	/** 
	 * 区(县)
	 */
	@ApiField("district")
	private String district;

	/** 
	 * 区县代码
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 当面付审核状态
	 */
	@ApiField("f2f_audit_status")
	private String f2fAuditStatus;

	/** 
	 * 当面付生效时间
	 */
	@ApiField("f2f_online")
	private Date f2fOnline;

	/** 
	 * 当面付签约次数
	 */
	@ApiField("f2f_sign_count")
	private String f2fSignCount;

	/** 
	 * 当面付状态
	 */
	@ApiField("f2f_status")
	private String f2fStatus;

	/** 
	 * 当面付签约情况-版本
	 */
	@ApiField("f2f_version")
	private String f2fVersion;

	/** 
	 * 当面付审核状态
	 */
	@ApiField("ff_audit_status")
	private String ffAuditStatus;

	/** 
	 * 当面付生效时间
	 */
	@ApiField("ff_online")
	private Date ffOnline;

	/** 
	 * 当面付签约次数
	 */
	@ApiField("ff_sign_count")
	private String ffSignCount;

	/** 
	 * 当面付状态
	 */
	@ApiField("ff_status")
	private String ffStatus;

	/** 
	 * 当面付签约情况-版本
	 */
	@ApiField("ff_version")
	private String ffVersion;

	/** 
	 * 门店创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 门店修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 有无折扣
	 */
	@ApiField("has_discount")
	private String hasDiscount;

	/** 
	 * 是否享受立减(0:否；1:是)
	 */
	@ApiField("has_discount_privilege")
	private String hasDiscountPrivilege;

	/** 
	 * 是否有机具
	 */
	@ApiField("has_equipment")
	private String hasEquipment;

	/** 
	 * 有无双证
	 */
	@ApiField("has_shuangzheng")
	private String hasShuangzheng;

	/** 
	 * 是否有全民折扣(0:否；1:是)
	 */
	@ApiField("has_whole_people_discount")
	private String hasWholePeopleDiscount;

	/** 
	 * 流水号
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 是否在黑名单(0:否；1:是)
	 */
	@ApiField("in_blacklist")
	private String inBlacklist;

	/** 
	 * 有效期30天以上折扣是否核销
	 */
	@ApiField("item_consumed_30")
	private String itemConsumed30;

	/** 
	 * 有效期30天以上折扣数
	 */
	@ApiField("item_count_30")
	private String itemCount30;

	/** 
	 * 是否ka
	 */
	@ApiField("ka")
	private String ka;

	/** 
	 * leads商户名称
	 */
	@ApiField("leads_name")
	private String leadsName;

	/** 
	 * 城市经理或超级管理员确认门店分配的时间
	 */
	@ApiField("manual_confirm_assign_time")
	private Date manualConfirmAssignTime;

	/** 
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 电话
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 近30天大于2元订单量
	 */
	@ApiField("order_1")
	private String order1;

	/** 
	 * 近1天大于2元订单量
	 */
	@ApiField("order_in_1_day")
	private String orderIn1Day;

	/** 
	 * 近7天内大于2元订单量
	 */
	@ApiField("order_in_7_days")
	private String orderIn7Days;

	/** 
	 * 一级行业
	 */
	@ApiField("pri_category")
	private String priCategory;

	/** 
	 * 一级行业编号
	 */
	@ApiField("pri_category_code")
	private String priCategoryCode;

	/** 
	 * 省代码
	 */
	@ApiField("prov_code")
	private String provCode;

	/** 
	 * 服务商名称
	 */
	@ApiField("provider_name")
	private String providerName;

	/** 
	 * 服务商Pid
	 */
	@ApiField("provider_pid")
	private String providerPid;

	/** 
	 * 服务商小二
	 */
	@ApiField("provider_staff_name")
	private String providerStaffName;

	/** 
	 * 服务商小二uid
	 */
	@ApiField("provider_staff_uid")
	private String providerStaffUid;

	/** 
	 * 省
	 */
	@ApiField("province")
	private String province;

	/** 
	 * 全民开店类型的推荐人,体现为归属人
	 */
	@ApiField("recommender")
	private String recommender;

	/** 
	 * 推荐人类型
	 */
	@ApiField("recommender_type")
	private String recommenderType;

	/** 
	 * 门店审核状态(审核中|审核通过|审核失败)
	 */
	@ApiField("shop_audit_status")
	private String shopAuditStatus;

	/** 
	 * 门店编号
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 店铺运营等级，0：全国KA，1：城市重点，2：中小，3：长尾
	 */
	@ApiField("shop_level")
	private String shopLevel;

	/** 
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 门店首次上架时间
	 */
	@ApiField("shop_online")
	private Date shopOnline;

	/** 
	 * 开店来源。有服务商开店，商家自主开店，全民个人开店等
	 */
	@ApiField("shop_source")
	private String shopSource;

	/** 
	 * 门店标签,多个以逗号分隔
	 */
	@ApiField("shop_tag")
	private String shopTag;

	/** 
	 * 二级行业
	 */
	@ApiField("sub_category")
	private String subCategory;

	/** 
	 * 二级行业编号
	 */
	@ApiField("sub_category_code")
	private String subCategoryCode;

	/** 
	 * 电话
	 */
	@ApiField("telephone")
	private String telephone;

	/** 
	 * 近30天大于2元用户数
	 */
	@ApiField("user_1")
	private String user1;

	/** 
	 * user_in_1_day
	 */
	@ApiField("user_in_1_day")
	private String userIn1Day;

	/** 
	 * 近7天内大于2元的用户数
	 */
	@ApiField("user_in_7_days")
	private String userIn7Days;

	/** 
	 * 近1天核销笔数
	 */
	@ApiField("verification_in_1_day")
	private String verificationIn1Day;

	/** 
	 * 近30天内核销笔数
	 */
	@ApiField("verification_in_30_days")
	private String verificationIn30Days;

	/** 
	 * 近7天内核销笔数
	 */
	@ApiField("verification_in_7_days")
	private String verificationIn7Days;

	/** 
	 * 全民最低折扣值
	 */
	@ApiField("whole_people_lowest_discount")
	private String wholePeopleLowestDiscount;

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
	 * <p>Setter for the field <code>amountIn30Days</code>.</p>
	 *
	 * @param amountIn30Days a {@link java.lang.String} object.
	 */
	public void setAmountIn30Days(String amountIn30Days) {
		this.amountIn30Days = amountIn30Days;
	}
	/**
	 * <p>Getter for the field <code>amountIn30Days</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmountIn30Days( ) {
		return this.amountIn30Days;
	}

	/**
	 * <p>Setter for the field <code>amountIn7Days</code>.</p>
	 *
	 * @param amountIn7Days a {@link java.lang.String} object.
	 */
	public void setAmountIn7Days(String amountIn7Days) {
		this.amountIn7Days = amountIn7Days;
	}
	/**
	 * <p>Getter for the field <code>amountIn7Days</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmountIn7Days( ) {
		return this.amountIn7Days;
	}

	/**
	 * <p>Setter for the field <code>amountPerCapita</code>.</p>
	 *
	 * @param amountPerCapita a {@link java.lang.String} object.
	 */
	public void setAmountPerCapita(String amountPerCapita) {
		this.amountPerCapita = amountPerCapita;
	}
	/**
	 * <p>Getter for the field <code>amountPerCapita</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmountPerCapita( ) {
		return this.amountPerCapita;
	}

	/**
	 * <p>Setter for the field <code>amountYesterday</code>.</p>
	 *
	 * @param amountYesterday a {@link java.lang.String} object.
	 */
	public void setAmountYesterday(String amountYesterday) {
		this.amountYesterday = amountYesterday;
	}
	/**
	 * <p>Getter for the field <code>amountYesterday</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmountYesterday( ) {
		return this.amountYesterday;
	}

	/**
	 * <p>Setter for the field <code>area</code>.</p>
	 *
	 * @param area a {@link java.lang.String} object.
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * <p>Getter for the field <code>area</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArea( ) {
		return this.area;
	}

	/**
	 * <p>Setter for the field <code>assignStatus</code>.</p>
	 *
	 * @param assignStatus a {@link java.lang.String} object.
	 */
	public void setAssignStatus(String assignStatus) {
		this.assignStatus = assignStatus;
	}
	/**
	 * <p>Getter for the field <code>assignStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAssignStatus( ) {
		return this.assignStatus;
	}

	/**
	 * <p>Setter for the field <code>bdStaffUid</code>.</p>
	 *
	 * @param bdStaffUid a {@link java.lang.String} object.
	 */
	public void setBdStaffUid(String bdStaffUid) {
		this.bdStaffUid = bdStaffUid;
	}
	/**
	 * <p>Getter for the field <code>bdStaffUid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBdStaffUid( ) {
		return this.bdStaffUid;
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
	 * <p>Setter for the field <code>city</code>.</p>
	 *
	 * @param city a {@link java.lang.String} object.
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * <p>Getter for the field <code>city</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCity( ) {
		return this.city;
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
	 * <p>Setter for the field <code>cityManagerName</code>.</p>
	 *
	 * @param cityManagerName a {@link java.lang.String} object.
	 */
	public void setCityManagerName(String cityManagerName) {
		this.cityManagerName = cityManagerName;
	}
	/**
	 * <p>Getter for the field <code>cityManagerName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityManagerName( ) {
		return this.cityManagerName;
	}

	/**
	 * <p>Setter for the field <code>cityManagerUid</code>.</p>
	 *
	 * @param cityManagerUid a {@link java.lang.String} object.
	 */
	public void setCityManagerUid(String cityManagerUid) {
		this.cityManagerUid = cityManagerUid;
	}
	/**
	 * <p>Getter for the field <code>cityManagerUid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityManagerUid( ) {
		return this.cityManagerUid;
	}

	/**
	 * <p>Setter for the field <code>competitorLowestDiscount</code>.</p>
	 *
	 * @param competitorLowestDiscount a {@link java.lang.String} object.
	 */
	public void setCompetitorLowestDiscount(String competitorLowestDiscount) {
		this.competitorLowestDiscount = competitorLowestDiscount;
	}
	/**
	 * <p>Getter for the field <code>competitorLowestDiscount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompetitorLowestDiscount( ) {
		return this.competitorLowestDiscount;
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
	 * <p>Setter for the field <code>detailCategory</code>.</p>
	 *
	 * @param detailCategory a {@link java.lang.String} object.
	 */
	public void setDetailCategory(String detailCategory) {
		this.detailCategory = detailCategory;
	}
	/**
	 * <p>Getter for the field <code>detailCategory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDetailCategory( ) {
		return this.detailCategory;
	}

	/**
	 * <p>Setter for the field <code>detailCategoryCode</code>.</p>
	 *
	 * @param detailCategoryCode a {@link java.lang.String} object.
	 */
	public void setDetailCategoryCode(String detailCategoryCode) {
		this.detailCategoryCode = detailCategoryCode;
	}
	/**
	 * <p>Getter for the field <code>detailCategoryCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDetailCategoryCode( ) {
		return this.detailCategoryCode;
	}

	/**
	 * <p>Setter for the field <code>discountId</code>.</p>
	 *
	 * @param discountId a {@link java.lang.String} object.
	 */
	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}
	/**
	 * <p>Getter for the field <code>discountId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDiscountId( ) {
		return this.discountId;
	}

	/**
	 * <p>Setter for the field <code>district</code>.</p>
	 *
	 * @param district a {@link java.lang.String} object.
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * <p>Getter for the field <code>district</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDistrict( ) {
		return this.district;
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
	 * <p>Setter for the field <code>f2fAuditStatus</code>.</p>
	 *
	 * @param f2fAuditStatus a {@link java.lang.String} object.
	 */
	public void setF2fAuditStatus(String f2fAuditStatus) {
		this.f2fAuditStatus = f2fAuditStatus;
	}
	/**
	 * <p>Getter for the field <code>f2fAuditStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getF2fAuditStatus( ) {
		return this.f2fAuditStatus;
	}

	/**
	 * <p>Setter for the field <code>f2fOnline</code>.</p>
	 *
	 * @param f2fOnline a {@link java.util.Date} object.
	 */
	public void setF2fOnline(Date f2fOnline) {
		this.f2fOnline = f2fOnline;
	}
	/**
	 * <p>Getter for the field <code>f2fOnline</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getF2fOnline( ) {
		return this.f2fOnline;
	}

	/**
	 * <p>Setter for the field <code>f2fSignCount</code>.</p>
	 *
	 * @param f2fSignCount a {@link java.lang.String} object.
	 */
	public void setF2fSignCount(String f2fSignCount) {
		this.f2fSignCount = f2fSignCount;
	}
	/**
	 * <p>Getter for the field <code>f2fSignCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getF2fSignCount( ) {
		return this.f2fSignCount;
	}

	/**
	 * <p>Setter for the field <code>f2fStatus</code>.</p>
	 *
	 * @param f2fStatus a {@link java.lang.String} object.
	 */
	public void setF2fStatus(String f2fStatus) {
		this.f2fStatus = f2fStatus;
	}
	/**
	 * <p>Getter for the field <code>f2fStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getF2fStatus( ) {
		return this.f2fStatus;
	}

	/**
	 * <p>Setter for the field <code>f2fVersion</code>.</p>
	 *
	 * @param f2fVersion a {@link java.lang.String} object.
	 */
	public void setF2fVersion(String f2fVersion) {
		this.f2fVersion = f2fVersion;
	}
	/**
	 * <p>Getter for the field <code>f2fVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getF2fVersion( ) {
		return this.f2fVersion;
	}

	/**
	 * <p>Setter for the field <code>ffAuditStatus</code>.</p>
	 *
	 * @param ffAuditStatus a {@link java.lang.String} object.
	 */
	public void setFfAuditStatus(String ffAuditStatus) {
		this.ffAuditStatus = ffAuditStatus;
	}
	/**
	 * <p>Getter for the field <code>ffAuditStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFfAuditStatus( ) {
		return this.ffAuditStatus;
	}

	/**
	 * <p>Setter for the field <code>ffOnline</code>.</p>
	 *
	 * @param ffOnline a {@link java.util.Date} object.
	 */
	public void setFfOnline(Date ffOnline) {
		this.ffOnline = ffOnline;
	}
	/**
	 * <p>Getter for the field <code>ffOnline</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getFfOnline( ) {
		return this.ffOnline;
	}

	/**
	 * <p>Setter for the field <code>ffSignCount</code>.</p>
	 *
	 * @param ffSignCount a {@link java.lang.String} object.
	 */
	public void setFfSignCount(String ffSignCount) {
		this.ffSignCount = ffSignCount;
	}
	/**
	 * <p>Getter for the field <code>ffSignCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFfSignCount( ) {
		return this.ffSignCount;
	}

	/**
	 * <p>Setter for the field <code>ffStatus</code>.</p>
	 *
	 * @param ffStatus a {@link java.lang.String} object.
	 */
	public void setFfStatus(String ffStatus) {
		this.ffStatus = ffStatus;
	}
	/**
	 * <p>Getter for the field <code>ffStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFfStatus( ) {
		return this.ffStatus;
	}

	/**
	 * <p>Setter for the field <code>ffVersion</code>.</p>
	 *
	 * @param ffVersion a {@link java.lang.String} object.
	 */
	public void setFfVersion(String ffVersion) {
		this.ffVersion = ffVersion;
	}
	/**
	 * <p>Getter for the field <code>ffVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFfVersion( ) {
		return this.ffVersion;
	}

	/**
	 * <p>Setter for the field <code>gmtCreate</code>.</p>
	 *
	 * @param gmtCreate a {@link java.util.Date} object.
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	/**
	 * <p>Getter for the field <code>gmtCreate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	/**
	 * <p>Setter for the field <code>gmtModified</code>.</p>
	 *
	 * @param gmtModified a {@link java.util.Date} object.
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	/**
	 * <p>Getter for the field <code>gmtModified</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	/**
	 * <p>Setter for the field <code>hasDiscount</code>.</p>
	 *
	 * @param hasDiscount a {@link java.lang.String} object.
	 */
	public void setHasDiscount(String hasDiscount) {
		this.hasDiscount = hasDiscount;
	}
	/**
	 * <p>Getter for the field <code>hasDiscount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHasDiscount( ) {
		return this.hasDiscount;
	}

	/**
	 * <p>Setter for the field <code>hasDiscountPrivilege</code>.</p>
	 *
	 * @param hasDiscountPrivilege a {@link java.lang.String} object.
	 */
	public void setHasDiscountPrivilege(String hasDiscountPrivilege) {
		this.hasDiscountPrivilege = hasDiscountPrivilege;
	}
	/**
	 * <p>Getter for the field <code>hasDiscountPrivilege</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHasDiscountPrivilege( ) {
		return this.hasDiscountPrivilege;
	}

	/**
	 * <p>Setter for the field <code>hasEquipment</code>.</p>
	 *
	 * @param hasEquipment a {@link java.lang.String} object.
	 */
	public void setHasEquipment(String hasEquipment) {
		this.hasEquipment = hasEquipment;
	}
	/**
	 * <p>Getter for the field <code>hasEquipment</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHasEquipment( ) {
		return this.hasEquipment;
	}

	/**
	 * <p>Setter for the field <code>hasShuangzheng</code>.</p>
	 *
	 * @param hasShuangzheng a {@link java.lang.String} object.
	 */
	public void setHasShuangzheng(String hasShuangzheng) {
		this.hasShuangzheng = hasShuangzheng;
	}
	/**
	 * <p>Getter for the field <code>hasShuangzheng</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHasShuangzheng( ) {
		return this.hasShuangzheng;
	}

	/**
	 * <p>Setter for the field <code>hasWholePeopleDiscount</code>.</p>
	 *
	 * @param hasWholePeopleDiscount a {@link java.lang.String} object.
	 */
	public void setHasWholePeopleDiscount(String hasWholePeopleDiscount) {
		this.hasWholePeopleDiscount = hasWholePeopleDiscount;
	}
	/**
	 * <p>Getter for the field <code>hasWholePeopleDiscount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHasWholePeopleDiscount( ) {
		return this.hasWholePeopleDiscount;
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
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId( ) {
		return this.id;
	}

	/**
	 * <p>Setter for the field <code>inBlacklist</code>.</p>
	 *
	 * @param inBlacklist a {@link java.lang.String} object.
	 */
	public void setInBlacklist(String inBlacklist) {
		this.inBlacklist = inBlacklist;
	}
	/**
	 * <p>Getter for the field <code>inBlacklist</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInBlacklist( ) {
		return this.inBlacklist;
	}

	/**
	 * <p>Setter for the field <code>itemConsumed30</code>.</p>
	 *
	 * @param itemConsumed30 a {@link java.lang.String} object.
	 */
	public void setItemConsumed30(String itemConsumed30) {
		this.itemConsumed30 = itemConsumed30;
	}
	/**
	 * <p>Getter for the field <code>itemConsumed30</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemConsumed30( ) {
		return this.itemConsumed30;
	}

	/**
	 * <p>Setter for the field <code>itemCount30</code>.</p>
	 *
	 * @param itemCount30 a {@link java.lang.String} object.
	 */
	public void setItemCount30(String itemCount30) {
		this.itemCount30 = itemCount30;
	}
	/**
	 * <p>Getter for the field <code>itemCount30</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemCount30( ) {
		return this.itemCount30;
	}

	/**
	 * <p>Setter for the field <code>ka</code>.</p>
	 *
	 * @param ka a {@link java.lang.String} object.
	 */
	public void setKa(String ka) {
		this.ka = ka;
	}
	/**
	 * <p>Getter for the field <code>ka</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getKa( ) {
		return this.ka;
	}

	/**
	 * <p>Setter for the field <code>leadsName</code>.</p>
	 *
	 * @param leadsName a {@link java.lang.String} object.
	 */
	public void setLeadsName(String leadsName) {
		this.leadsName = leadsName;
	}
	/**
	 * <p>Getter for the field <code>leadsName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLeadsName( ) {
		return this.leadsName;
	}

	/**
	 * <p>Setter for the field <code>manualConfirmAssignTime</code>.</p>
	 *
	 * @param manualConfirmAssignTime a {@link java.util.Date} object.
	 */
	public void setManualConfirmAssignTime(Date manualConfirmAssignTime) {
		this.manualConfirmAssignTime = manualConfirmAssignTime;
	}
	/**
	 * <p>Getter for the field <code>manualConfirmAssignTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getManualConfirmAssignTime( ) {
		return this.manualConfirmAssignTime;
	}

	/**
	 * <p>Setter for the field <code>merchantName</code>.</p>
	 *
	 * @param merchantName a {@link java.lang.String} object.
	 */
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	/**
	 * <p>Getter for the field <code>merchantName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantName( ) {
		return this.merchantName;
	}

	/**
	 * <p>Setter for the field <code>merchantPid</code>.</p>
	 *
	 * @param merchantPid a {@link java.lang.String} object.
	 */
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	/**
	 * <p>Getter for the field <code>merchantPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	/**
	 * <p>Setter for the field <code>mobile</code>.</p>
	 *
	 * @param mobile a {@link java.lang.String} object.
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * <p>Getter for the field <code>mobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobile( ) {
		return this.mobile;
	}

	/**
	 * <p>Setter for the field <code>order1</code>.</p>
	 *
	 * @param order1 a {@link java.lang.String} object.
	 */
	public void setOrder1(String order1) {
		this.order1 = order1;
	}
	/**
	 * <p>Getter for the field <code>order1</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrder1( ) {
		return this.order1;
	}

	/**
	 * <p>Setter for the field <code>orderIn1Day</code>.</p>
	 *
	 * @param orderIn1Day a {@link java.lang.String} object.
	 */
	public void setOrderIn1Day(String orderIn1Day) {
		this.orderIn1Day = orderIn1Day;
	}
	/**
	 * <p>Getter for the field <code>orderIn1Day</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderIn1Day( ) {
		return this.orderIn1Day;
	}

	/**
	 * <p>Setter for the field <code>orderIn7Days</code>.</p>
	 *
	 * @param orderIn7Days a {@link java.lang.String} object.
	 */
	public void setOrderIn7Days(String orderIn7Days) {
		this.orderIn7Days = orderIn7Days;
	}
	/**
	 * <p>Getter for the field <code>orderIn7Days</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderIn7Days( ) {
		return this.orderIn7Days;
	}

	/**
	 * <p>Setter for the field <code>priCategory</code>.</p>
	 *
	 * @param priCategory a {@link java.lang.String} object.
	 */
	public void setPriCategory(String priCategory) {
		this.priCategory = priCategory;
	}
	/**
	 * <p>Getter for the field <code>priCategory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPriCategory( ) {
		return this.priCategory;
	}

	/**
	 * <p>Setter for the field <code>priCategoryCode</code>.</p>
	 *
	 * @param priCategoryCode a {@link java.lang.String} object.
	 */
	public void setPriCategoryCode(String priCategoryCode) {
		this.priCategoryCode = priCategoryCode;
	}
	/**
	 * <p>Getter for the field <code>priCategoryCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPriCategoryCode( ) {
		return this.priCategoryCode;
	}

	/**
	 * <p>Setter for the field <code>provCode</code>.</p>
	 *
	 * @param provCode a {@link java.lang.String} object.
	 */
	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}
	/**
	 * <p>Getter for the field <code>provCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProvCode( ) {
		return this.provCode;
	}

	/**
	 * <p>Setter for the field <code>providerName</code>.</p>
	 *
	 * @param providerName a {@link java.lang.String} object.
	 */
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	/**
	 * <p>Getter for the field <code>providerName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProviderName( ) {
		return this.providerName;
	}

	/**
	 * <p>Setter for the field <code>providerPid</code>.</p>
	 *
	 * @param providerPid a {@link java.lang.String} object.
	 */
	public void setProviderPid(String providerPid) {
		this.providerPid = providerPid;
	}
	/**
	 * <p>Getter for the field <code>providerPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProviderPid( ) {
		return this.providerPid;
	}

	/**
	 * <p>Setter for the field <code>providerStaffName</code>.</p>
	 *
	 * @param providerStaffName a {@link java.lang.String} object.
	 */
	public void setProviderStaffName(String providerStaffName) {
		this.providerStaffName = providerStaffName;
	}
	/**
	 * <p>Getter for the field <code>providerStaffName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProviderStaffName( ) {
		return this.providerStaffName;
	}

	/**
	 * <p>Setter for the field <code>providerStaffUid</code>.</p>
	 *
	 * @param providerStaffUid a {@link java.lang.String} object.
	 */
	public void setProviderStaffUid(String providerStaffUid) {
		this.providerStaffUid = providerStaffUid;
	}
	/**
	 * <p>Getter for the field <code>providerStaffUid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProviderStaffUid( ) {
		return this.providerStaffUid;
	}

	/**
	 * <p>Setter for the field <code>province</code>.</p>
	 *
	 * @param province a {@link java.lang.String} object.
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * <p>Getter for the field <code>province</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProvince( ) {
		return this.province;
	}

	/**
	 * <p>Setter for the field <code>recommender</code>.</p>
	 *
	 * @param recommender a {@link java.lang.String} object.
	 */
	public void setRecommender(String recommender) {
		this.recommender = recommender;
	}
	/**
	 * <p>Getter for the field <code>recommender</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRecommender( ) {
		return this.recommender;
	}

	/**
	 * <p>Setter for the field <code>recommenderType</code>.</p>
	 *
	 * @param recommenderType a {@link java.lang.String} object.
	 */
	public void setRecommenderType(String recommenderType) {
		this.recommenderType = recommenderType;
	}
	/**
	 * <p>Getter for the field <code>recommenderType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRecommenderType( ) {
		return this.recommenderType;
	}

	/**
	 * <p>Setter for the field <code>shopAuditStatus</code>.</p>
	 *
	 * @param shopAuditStatus a {@link java.lang.String} object.
	 */
	public void setShopAuditStatus(String shopAuditStatus) {
		this.shopAuditStatus = shopAuditStatus;
	}
	/**
	 * <p>Getter for the field <code>shopAuditStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopAuditStatus( ) {
		return this.shopAuditStatus;
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
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId( ) {
		return this.shopId;
	}

	/**
	 * <p>Setter for the field <code>shopLevel</code>.</p>
	 *
	 * @param shopLevel a {@link java.lang.String} object.
	 */
	public void setShopLevel(String shopLevel) {
		this.shopLevel = shopLevel;
	}
	/**
	 * <p>Getter for the field <code>shopLevel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopLevel( ) {
		return this.shopLevel;
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
	 * <p>Getter for the field <code>shopName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopName( ) {
		return this.shopName;
	}

	/**
	 * <p>Setter for the field <code>shopOnline</code>.</p>
	 *
	 * @param shopOnline a {@link java.util.Date} object.
	 */
	public void setShopOnline(Date shopOnline) {
		this.shopOnline = shopOnline;
	}
	/**
	 * <p>Getter for the field <code>shopOnline</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getShopOnline( ) {
		return this.shopOnline;
	}

	/**
	 * <p>Setter for the field <code>shopSource</code>.</p>
	 *
	 * @param shopSource a {@link java.lang.String} object.
	 */
	public void setShopSource(String shopSource) {
		this.shopSource = shopSource;
	}
	/**
	 * <p>Getter for the field <code>shopSource</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopSource( ) {
		return this.shopSource;
	}

	/**
	 * <p>Setter for the field <code>shopTag</code>.</p>
	 *
	 * @param shopTag a {@link java.lang.String} object.
	 */
	public void setShopTag(String shopTag) {
		this.shopTag = shopTag;
	}
	/**
	 * <p>Getter for the field <code>shopTag</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopTag( ) {
		return this.shopTag;
	}

	/**
	 * <p>Setter for the field <code>subCategory</code>.</p>
	 *
	 * @param subCategory a {@link java.lang.String} object.
	 */
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	/**
	 * <p>Getter for the field <code>subCategory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubCategory( ) {
		return this.subCategory;
	}

	/**
	 * <p>Setter for the field <code>subCategoryCode</code>.</p>
	 *
	 * @param subCategoryCode a {@link java.lang.String} object.
	 */
	public void setSubCategoryCode(String subCategoryCode) {
		this.subCategoryCode = subCategoryCode;
	}
	/**
	 * <p>Getter for the field <code>subCategoryCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubCategoryCode( ) {
		return this.subCategoryCode;
	}

	/**
	 * <p>Setter for the field <code>telephone</code>.</p>
	 *
	 * @param telephone a {@link java.lang.String} object.
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * <p>Getter for the field <code>telephone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTelephone( ) {
		return this.telephone;
	}

	/**
	 * <p>Setter for the field <code>user1</code>.</p>
	 *
	 * @param user1 a {@link java.lang.String} object.
	 */
	public void setUser1(String user1) {
		this.user1 = user1;
	}
	/**
	 * <p>Getter for the field <code>user1</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUser1( ) {
		return this.user1;
	}

	/**
	 * <p>Setter for the field <code>userIn1Day</code>.</p>
	 *
	 * @param userIn1Day a {@link java.lang.String} object.
	 */
	public void setUserIn1Day(String userIn1Day) {
		this.userIn1Day = userIn1Day;
	}
	/**
	 * <p>Getter for the field <code>userIn1Day</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserIn1Day( ) {
		return this.userIn1Day;
	}

	/**
	 * <p>Setter for the field <code>userIn7Days</code>.</p>
	 *
	 * @param userIn7Days a {@link java.lang.String} object.
	 */
	public void setUserIn7Days(String userIn7Days) {
		this.userIn7Days = userIn7Days;
	}
	/**
	 * <p>Getter for the field <code>userIn7Days</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserIn7Days( ) {
		return this.userIn7Days;
	}

	/**
	 * <p>Setter for the field <code>verificationIn1Day</code>.</p>
	 *
	 * @param verificationIn1Day a {@link java.lang.String} object.
	 */
	public void setVerificationIn1Day(String verificationIn1Day) {
		this.verificationIn1Day = verificationIn1Day;
	}
	/**
	 * <p>Getter for the field <code>verificationIn1Day</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVerificationIn1Day( ) {
		return this.verificationIn1Day;
	}

	/**
	 * <p>Setter for the field <code>verificationIn30Days</code>.</p>
	 *
	 * @param verificationIn30Days a {@link java.lang.String} object.
	 */
	public void setVerificationIn30Days(String verificationIn30Days) {
		this.verificationIn30Days = verificationIn30Days;
	}
	/**
	 * <p>Getter for the field <code>verificationIn30Days</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVerificationIn30Days( ) {
		return this.verificationIn30Days;
	}

	/**
	 * <p>Setter for the field <code>verificationIn7Days</code>.</p>
	 *
	 * @param verificationIn7Days a {@link java.lang.String} object.
	 */
	public void setVerificationIn7Days(String verificationIn7Days) {
		this.verificationIn7Days = verificationIn7Days;
	}
	/**
	 * <p>Getter for the field <code>verificationIn7Days</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVerificationIn7Days( ) {
		return this.verificationIn7Days;
	}

	/**
	 * <p>Setter for the field <code>wholePeopleLowestDiscount</code>.</p>
	 *
	 * @param wholePeopleLowestDiscount a {@link java.lang.String} object.
	 */
	public void setWholePeopleLowestDiscount(String wholePeopleLowestDiscount) {
		this.wholePeopleLowestDiscount = wholePeopleLowestDiscount;
	}
	/**
	 * <p>Getter for the field <code>wholePeopleLowestDiscount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getWholePeopleLowestDiscount( ) {
		return this.wholePeopleLowestDiscount;
	}

}
