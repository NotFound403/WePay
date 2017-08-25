package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 创建或更新服务者信息接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDaoweiSpModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6698465814993428183L;

	/**
	 * 服务者的可用时间表。其中Duration和Unit配合使用，例如duration=30，unit=MIN表示将一天分为以30分钟一小段的时间片段。Unit：目前支持MIN（分钟）。Date：YYYY-MM-DD格式。Bitmap：根据定义的间隔长度跟单位，将date的时间切分，例如将2016-11-29整天按30分钟为一段切分为48段： 111111111111111111111111111111111110000011111111 ， 其中0表示不可用，1表示可用，如果工作日全天可用则每个分段都为1
	 */
	@ApiField("calendar_schedule")
	private CalendarScheduleInfo calendarSchedule;

	/**
	 * 服务者的身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 服务者的证件类型（目前只支持身份证号：IDENTITY_CARD）
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 服务者的描述，会进行安全审核，请勿传包含敏感信息的昵称，如果审核传含有敏感信息，需修改后重新同步服务者的描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 服务者服务列表信息：包括服务者可提供的类目服务和证书信息等，其中license_id是商家服务者证照的唯一标识，用于确定商家的某个服务者的某个证照，仅支持数字、字母和下划线
	 */
	@ApiListField("license_list")
	@ApiField("license_info")
	private List<LicenseInfo> licenseList;

	/**
	 * 服务者的支付宝登录账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 服务者的手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 第三方服务者的姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务者昵称，会进行安全审核，请勿传包含敏感信息的昵称，如果审核传含有敏感信息，需修改后重新同步服务者信息
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 商家服务者id，由商家维护的该商家下某个服务者的唯一标识，仅支持数字、字母和下划线的组合
	 */
	@ApiField("out_sp_id")
	private String outSpId;

	/**
	 * 服务者的头像url，只支持https，图片大小限制60K以下。请勿发布涉及黄赌毒以及其他违反国家法律法规的图片，如果有安全问题，将会通知商家修改后重新同步服务者头像
	 */
	@ApiField("photo_url")
	private String photoUrl;

	/**
	 * 服务状态，支持以下状态：
ON（上架）
OFF（下架）
DELETE（删除）
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>calendarSchedule</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.CalendarScheduleInfo} object.
	 */
	public CalendarScheduleInfo getCalendarSchedule() {
		return this.calendarSchedule;
	}
	/**
	 * <p>Setter for the field <code>calendarSchedule</code>.</p>
	 *
	 * @param calendarSchedule a {@link cn.felord.wepay.ali.sdk.api.domain.CalendarScheduleInfo} object.
	 */
	public void setCalendarSchedule(CalendarScheduleInfo calendarSchedule) {
		this.calendarSchedule = calendarSchedule;
	}

	/**
	 * <p>Getter for the field <code>certNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertNo() {
		return this.certNo;
	}
	/**
	 * <p>Setter for the field <code>certNo</code>.</p>
	 *
	 * @param certNo a {@link java.lang.String} object.
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	/**
	 * <p>Getter for the field <code>certType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertType() {
		return this.certType;
	}
	/**
	 * <p>Setter for the field <code>certType</code>.</p>
	 *
	 * @param certType a {@link java.lang.String} object.
	 */
	public void setCertType(String certType) {
		this.certType = certType;
	}

	/**
	 * <p>Getter for the field <code>desc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDesc() {
		return this.desc;
	}
	/**
	 * <p>Setter for the field <code>desc</code>.</p>
	 *
	 * @param desc a {@link java.lang.String} object.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * <p>Getter for the field <code>licenseList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<LicenseInfo> getLicenseList() {
		return this.licenseList;
	}
	/**
	 * <p>Setter for the field <code>licenseList</code>.</p>
	 *
	 * @param licenseList a {@link java.util.List} object.
	 */
	public void setLicenseList(List<LicenseInfo> licenseList) {
		this.licenseList = licenseList;
	}

	/**
	 * <p>Getter for the field <code>logonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogonId() {
		return this.logonId;
	}
	/**
	 * <p>Setter for the field <code>logonId</code>.</p>
	 *
	 * @param logonId a {@link java.lang.String} object.
	 */
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	/**
	 * <p>Getter for the field <code>mobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobile() {
		return this.mobile;
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
	 * <p>Getter for the field <code>nickName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNickName() {
		return this.nickName;
	}
	/**
	 * <p>Setter for the field <code>nickName</code>.</p>
	 *
	 * @param nickName a {@link java.lang.String} object.
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * <p>Getter for the field <code>outSpId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutSpId() {
		return this.outSpId;
	}
	/**
	 * <p>Setter for the field <code>outSpId</code>.</p>
	 *
	 * @param outSpId a {@link java.lang.String} object.
	 */
	public void setOutSpId(String outSpId) {
		this.outSpId = outSpId;
	}

	/**
	 * <p>Getter for the field <code>photoUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPhotoUrl() {
		return this.photoUrl;
	}
	/**
	 * <p>Setter for the field <code>photoUrl</code>.</p>
	 *
	 * @param photoUrl a {@link java.lang.String} object.
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
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
