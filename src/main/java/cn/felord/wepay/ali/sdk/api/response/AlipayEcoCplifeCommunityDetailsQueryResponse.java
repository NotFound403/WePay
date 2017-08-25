package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CPCommServices;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.community.details.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeCommunityDetailsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7316795294554222255L;

	/** 
	 * 开发者关联的高德地图中住宅、住宿或地名地址等小区相关类型的POI（地图兴趣点）ID列表和POI名称，中间用"|"分隔。
	 */
	@ApiListField("associated_pois")
	@ApiField("string")
	private List<String> associatedPois;

	/** 
	 * 小区审核状态，小区审核状态关联小区主服务的审核状态：
AUDITING：审核中；
AUDIT_FAILED：审核驳回；
AUDIT_SUCCESS：审核通过。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 地级市编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 小区主要详细地址，不需要包含省市区名称。
	 */
	@ApiField("community_address")
	private String communityAddress;

	/** 
	 * 小区所在的经纬度列表（注：需要是高德坐标系），每对经纬度用"|"分隔，经度在前，纬度在后。

注：若新建的小区覆盖多个片区，最多包含5组经纬度，其中第一组作为主经纬度。
	 */
	@ApiListField("community_locations")
	@ApiField("string")
	private List<String> communityLocations;

	/** 
	 * 小区名称。
	 */
	@ApiField("community_name")
	private String communityName;

	/** 
	 * 小区已初始化的服务列表
	 */
	@ApiListField("community_services")
	@ApiField("c_p_comm_services")
	private List<CPCommServices> communityServices;

	/** 
	 * 小区当前状态，状态值：
PENDING_ONLINE 待上线
ONLINE - 上线
MAINTAIN - 维护中
OFFLINE - 下线

新创建的小区为PENDING_ONLINE待上线状态，需要尽快初始化基础服务，完成开发和验证，并提交服务上线申请。由支付宝小二审核通过后完成服务和小区上线。
	 */
	@ApiField("community_status")
	private String communityStatus;

	/** 
	 * 区县编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 小区创建时间
	 */
	@ApiField("gmt_created")
	private Date gmtCreated;

	/** 
	 * 小区最近修改时间（包括状态变更）。
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 物业服务热线或联系电话，便于用户在需要时联系物业。
	 */
	@ApiField("hotline")
	private String hotline;

	/** 
	 * 若开发者和支付宝签署了相关协议，会返回开发者的PID（Partner ID）。
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/** 
	 * 小区关联的物业公司名称
	 */
	@ApiField("merchant_firm_name")
	private String merchantFirmName;

	/** 
	 * 小区对应的物业公司支付宝账号PID（合作伙伴partner id）。
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 若从小区当前状态到下一状态需要完成下一步条件代码，则返回该字段，否则不返回。

操作主体有：
INVOKER - 接口调用方
MERCHANT - 物业公司
AUDITOR - 平台审核方

条件代码包括但不限于：
WAIT_SERVICE_PROVISION - 等待基础服务初始化
WAIT_PROD_VERIFICATION - 等待在生产环境通过自测
WAIT_ONLINE_APPLICATION - 等待提起上线申请
WAIT_OFFLINE_APPLICATION - 等待提起下线申请
WAIT_CONFIRMATION - 等待相关方确认
WAIT_AUDITING - 等待审核
	 */
	@ApiField("next_action")
	private String nextAction;

	/** 
	 * 小区在物业系统中的唯一编号，若开发者传入过，则返回。
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/** 
	 * 省份编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 若小区上线后，返回小区主页推广二维码图片链接
	 */
	@ApiField("qr_code_image")
	private String qrCodeImage;

	/**
	 * <p>Setter for the field <code>associatedPois</code>.</p>
	 *
	 * @param associatedPois a {@link java.util.List} object.
	 */
	public void setAssociatedPois(List<String> associatedPois) {
		this.associatedPois = associatedPois;
	}
	/**
	 * <p>Getter for the field <code>associatedPois</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getAssociatedPois( ) {
		return this.associatedPois;
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
	 * <p>Setter for the field <code>communityAddress</code>.</p>
	 *
	 * @param communityAddress a {@link java.lang.String} object.
	 */
	public void setCommunityAddress(String communityAddress) {
		this.communityAddress = communityAddress;
	}
	/**
	 * <p>Getter for the field <code>communityAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommunityAddress( ) {
		return this.communityAddress;
	}

	/**
	 * <p>Setter for the field <code>communityLocations</code>.</p>
	 *
	 * @param communityLocations a {@link java.util.List} object.
	 */
	public void setCommunityLocations(List<String> communityLocations) {
		this.communityLocations = communityLocations;
	}
	/**
	 * <p>Getter for the field <code>communityLocations</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getCommunityLocations( ) {
		return this.communityLocations;
	}

	/**
	 * <p>Setter for the field <code>communityName</code>.</p>
	 *
	 * @param communityName a {@link java.lang.String} object.
	 */
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	/**
	 * <p>Getter for the field <code>communityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommunityName( ) {
		return this.communityName;
	}

	/**
	 * <p>Setter for the field <code>communityServices</code>.</p>
	 *
	 * @param communityServices a {@link java.util.List} object.
	 */
	public void setCommunityServices(List<CPCommServices> communityServices) {
		this.communityServices = communityServices;
	}
	/**
	 * <p>Getter for the field <code>communityServices</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CPCommServices> getCommunityServices( ) {
		return this.communityServices;
	}

	/**
	 * <p>Setter for the field <code>communityStatus</code>.</p>
	 *
	 * @param communityStatus a {@link java.lang.String} object.
	 */
	public void setCommunityStatus(String communityStatus) {
		this.communityStatus = communityStatus;
	}
	/**
	 * <p>Getter for the field <code>communityStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommunityStatus( ) {
		return this.communityStatus;
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
	 * <p>Setter for the field <code>gmtCreated</code>.</p>
	 *
	 * @param gmtCreated a {@link java.util.Date} object.
	 */
	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}
	/**
	 * <p>Getter for the field <code>gmtCreated</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtCreated( ) {
		return this.gmtCreated;
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
	 * <p>Setter for the field <code>hotline</code>.</p>
	 *
	 * @param hotline a {@link java.lang.String} object.
	 */
	public void setHotline(String hotline) {
		this.hotline = hotline;
	}
	/**
	 * <p>Getter for the field <code>hotline</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHotline( ) {
		return this.hotline;
	}

	/**
	 * <p>Setter for the field <code>isvPid</code>.</p>
	 *
	 * @param isvPid a {@link java.lang.String} object.
	 */
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}
	/**
	 * <p>Getter for the field <code>isvPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvPid( ) {
		return this.isvPid;
	}

	/**
	 * <p>Setter for the field <code>merchantFirmName</code>.</p>
	 *
	 * @param merchantFirmName a {@link java.lang.String} object.
	 */
	public void setMerchantFirmName(String merchantFirmName) {
		this.merchantFirmName = merchantFirmName;
	}
	/**
	 * <p>Getter for the field <code>merchantFirmName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantFirmName( ) {
		return this.merchantFirmName;
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
	 * <p>Setter for the field <code>nextAction</code>.</p>
	 *
	 * @param nextAction a {@link java.lang.String} object.
	 */
	public void setNextAction(String nextAction) {
		this.nextAction = nextAction;
	}
	/**
	 * <p>Getter for the field <code>nextAction</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNextAction( ) {
		return this.nextAction;
	}

	/**
	 * <p>Setter for the field <code>outCommunityId</code>.</p>
	 *
	 * @param outCommunityId a {@link java.lang.String} object.
	 */
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}
	/**
	 * <p>Getter for the field <code>outCommunityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutCommunityId( ) {
		return this.outCommunityId;
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
	 * <p>Setter for the field <code>qrCodeImage</code>.</p>
	 *
	 * @param qrCodeImage a {@link java.lang.String} object.
	 */
	public void setQrCodeImage(String qrCodeImage) {
		this.qrCodeImage = qrCodeImage;
	}
	/**
	 * <p>Getter for the field <code>qrCodeImage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrCodeImage( ) {
		return this.qrCodeImage;
	}

}
