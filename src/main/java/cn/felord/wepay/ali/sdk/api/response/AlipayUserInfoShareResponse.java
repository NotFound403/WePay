package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.AlipayUserDeliverAddress;
import cn.felord.wepay.ali.sdk.api.domain.AlipayUserPicture;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.info.share response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserInfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 1189134917632439399L;

	/** 
	 * 详细地址。
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 区县名称。
	 */
	@ApiField("area")
	private String area;

	/** 
	 * 用户头像地址
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 经营/业务范围（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("business_scope")
	private String businessScope;

	/** 
	 * 证件号码，结合证件类型使用.
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 0:身份证
1:护照
2:军官证
3:士兵证
4:回乡证
5:临时身份证
6:户口簿
7:警官证
8:台胞证
9:营业执照
10:其它证件
11:港澳居民来往内地通行证
12:台湾居民来往大陆通行证
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 市名称。
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 国家码
	 */
	@ApiField("country_code")
	private String countryCode;

	/** 
	 * 收货地址列表
	 */
	@ApiListField("deliver_addresses")
	@ApiField("alipay_user_deliver_address")
	private List<AlipayUserDeliverAddress> deliverAddresses;

	/** 
	 * 用户支付宝邮箱登录名
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 企业代理人证件有效期（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_agent_person_cert_expiry_date")
	private String firmAgentPersonCertExpiryDate;

	/** 
	 * 企业代理人证件号码（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_agent_person_cert_no")
	private String firmAgentPersonCertNo;

	/** 
	 * 企业代理人证件类型, 返回值参考cert_type字段（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_agent_person_cert_type")
	private String firmAgentPersonCertType;

	/** 
	 * 企业代理人姓名（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_agent_person_name")
	private String firmAgentPersonName;

	/** 
	 * 企业法人证件有效期（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_legal_person_cert_expiry_date")
	private String firmLegalPersonCertExpiryDate;

	/** 
	 * 法人证件号码（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_legal_person_cert_no")
	private String firmLegalPersonCertNo;

	/** 
	 * 企业法人证件类型, 返回值参考cert_type字段（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_legal_person_cert_type")
	private String firmLegalPersonCertType;

	/** 
	 * 企业法人名称（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_legal_person_name")
	private String firmLegalPersonName;

	/** 
	 * 企业法人证件图片（用户类型是公司类型时才有此字段）。
	 */
	@ApiListField("firm_legal_person_pictures")
	@ApiField("alipay_user_picture")
	private List<AlipayUserPicture> firmLegalPersonPictures;

	/** 
	 * 企业相关证件图片，包含图片地址（目前需要调用alipay.user.certify.image.fetch转换一下）及类型（用户类型是公司类型时才有此字段）。
	 */
	@ApiListField("firm_pictures")
	@ApiField("alipay_user_picture")
	private List<AlipayUserPicture> firmPictures;

	/** 
	 * 公司类型，包括（用户类型是公司类型时才有此字段）：
CO(公司)
INST(事业单位),
COMM(社会团体),
NGO(民办非企业组织),
STATEORGAN(党政国家机关)
	 */
	@ApiField("firm_type")
	private String firmType;

	/** 
	 * 性别（F：女性；M：男性）。
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * 余额账户是否被冻结。
T--被冻结；F--未冻结
	 */
	@ApiField("is_balance_frozen")
	private String isBalanceFrozen;

	/** 
	 * 是否通过实名认证。T是通过 F是没有实名认证。
	 */
	@ApiField("is_certified")
	private String isCertified;

	/** 
	 * 是否是学生
	 */
	@ApiField("is_student_certified")
	private String isStudentCertified;

	/** 
	 * 营业执照有效期，yyyyMMdd或长期，（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("license_expiry_date")
	private String licenseExpiryDate;

	/** 
	 * 企业执照号码（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("license_no")
	private String licenseNo;

	/** 
	 * 支付宝会员等级
	 */
	@ApiField("member_grade")
	private String memberGrade;

	/** 
	 * 手机号码。
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 用户昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/** 
	 * 组织机构代码（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("organization_code")
	private String organizationCode;

	/** 
	 * 个人用户生日。
	 */
	@ApiField("person_birthday")
	private String personBirthday;

	/** 
	 * 证件有效期（用户类型是个人的时候才有此字段）。
	 */
	@ApiField("person_cert_expiry_date")
	private String personCertExpiryDate;

	/** 
	 * 个人证件图片（用户类型是个人的时候才有此字段）。
	 */
	@ApiListField("person_pictures")
	@ApiField("alipay_user_picture")
	private List<AlipayUserPicture> personPictures;

	/** 
	 * 电话号码。
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 职业
	 */
	@ApiField("profession")
	private String profession;

	/** 
	 * 省份名称
	 */
	@ApiField("province")
	private String province;

	/** 
	 * 淘宝id
	 */
	@ApiField("taobao_id")
	private String taobaoId;

	/** 
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 若用户是个人用户，则是用户的真实姓名；若是企业用户，则是企业名称。
	 */
	@ApiField("user_name")
	private String userName;

	/** 
	 * 用户状态（Q/T/B/W）。
Q代表快速注册用户
T代表已认证用户
B代表被冻结账户
W代表已注册，未激活的账户
	 */
	@ApiField("user_status")
	private String userStatus;

	/** 
	 * 用户类型（1/2）
1代表公司账户2代表个人账户
	 */
	@ApiField("user_type")
	private String userType;

	/** 
	 * 邮政编码。
	 */
	@ApiField("zip")
	private String zip;

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
	 * <p>Setter for the field <code>avatar</code>.</p>
	 *
	 * @param avatar a {@link java.lang.String} object.
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	/**
	 * <p>Getter for the field <code>avatar</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAvatar( ) {
		return this.avatar;
	}

	/**
	 * <p>Setter for the field <code>businessScope</code>.</p>
	 *
	 * @param businessScope a {@link java.lang.String} object.
	 */
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	/**
	 * <p>Getter for the field <code>businessScope</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessScope( ) {
		return this.businessScope;
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
	 * <p>Getter for the field <code>certNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertNo( ) {
		return this.certNo;
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
	 * <p>Getter for the field <code>certType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertType( ) {
		return this.certType;
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
	 * <p>Setter for the field <code>countryCode</code>.</p>
	 *
	 * @param countryCode a {@link java.lang.String} object.
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * <p>Getter for the field <code>countryCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCountryCode( ) {
		return this.countryCode;
	}

	/**
	 * <p>Setter for the field <code>deliverAddresses</code>.</p>
	 *
	 * @param deliverAddresses a {@link java.util.List} object.
	 */
	public void setDeliverAddresses(List<AlipayUserDeliverAddress> deliverAddresses) {
		this.deliverAddresses = deliverAddresses;
	}
	/**
	 * <p>Getter for the field <code>deliverAddresses</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlipayUserDeliverAddress> getDeliverAddresses( ) {
		return this.deliverAddresses;
	}

	/**
	 * <p>Setter for the field <code>email</code>.</p>
	 *
	 * @param email a {@link java.lang.String} object.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * <p>Getter for the field <code>email</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEmail( ) {
		return this.email;
	}

	/**
	 * <p>Setter for the field <code>firmAgentPersonCertExpiryDate</code>.</p>
	 *
	 * @param firmAgentPersonCertExpiryDate a {@link java.lang.String} object.
	 */
	public void setFirmAgentPersonCertExpiryDate(String firmAgentPersonCertExpiryDate) {
		this.firmAgentPersonCertExpiryDate = firmAgentPersonCertExpiryDate;
	}
	/**
	 * <p>Getter for the field <code>firmAgentPersonCertExpiryDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFirmAgentPersonCertExpiryDate( ) {
		return this.firmAgentPersonCertExpiryDate;
	}

	/**
	 * <p>Setter for the field <code>firmAgentPersonCertNo</code>.</p>
	 *
	 * @param firmAgentPersonCertNo a {@link java.lang.String} object.
	 */
	public void setFirmAgentPersonCertNo(String firmAgentPersonCertNo) {
		this.firmAgentPersonCertNo = firmAgentPersonCertNo;
	}
	/**
	 * <p>Getter for the field <code>firmAgentPersonCertNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFirmAgentPersonCertNo( ) {
		return this.firmAgentPersonCertNo;
	}

	/**
	 * <p>Setter for the field <code>firmAgentPersonCertType</code>.</p>
	 *
	 * @param firmAgentPersonCertType a {@link java.lang.String} object.
	 */
	public void setFirmAgentPersonCertType(String firmAgentPersonCertType) {
		this.firmAgentPersonCertType = firmAgentPersonCertType;
	}
	/**
	 * <p>Getter for the field <code>firmAgentPersonCertType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFirmAgentPersonCertType( ) {
		return this.firmAgentPersonCertType;
	}

	/**
	 * <p>Setter for the field <code>firmAgentPersonName</code>.</p>
	 *
	 * @param firmAgentPersonName a {@link java.lang.String} object.
	 */
	public void setFirmAgentPersonName(String firmAgentPersonName) {
		this.firmAgentPersonName = firmAgentPersonName;
	}
	/**
	 * <p>Getter for the field <code>firmAgentPersonName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFirmAgentPersonName( ) {
		return this.firmAgentPersonName;
	}

	/**
	 * <p>Setter for the field <code>firmLegalPersonCertExpiryDate</code>.</p>
	 *
	 * @param firmLegalPersonCertExpiryDate a {@link java.lang.String} object.
	 */
	public void setFirmLegalPersonCertExpiryDate(String firmLegalPersonCertExpiryDate) {
		this.firmLegalPersonCertExpiryDate = firmLegalPersonCertExpiryDate;
	}
	/**
	 * <p>Getter for the field <code>firmLegalPersonCertExpiryDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFirmLegalPersonCertExpiryDate( ) {
		return this.firmLegalPersonCertExpiryDate;
	}

	/**
	 * <p>Setter for the field <code>firmLegalPersonCertNo</code>.</p>
	 *
	 * @param firmLegalPersonCertNo a {@link java.lang.String} object.
	 */
	public void setFirmLegalPersonCertNo(String firmLegalPersonCertNo) {
		this.firmLegalPersonCertNo = firmLegalPersonCertNo;
	}
	/**
	 * <p>Getter for the field <code>firmLegalPersonCertNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFirmLegalPersonCertNo( ) {
		return this.firmLegalPersonCertNo;
	}

	/**
	 * <p>Setter for the field <code>firmLegalPersonCertType</code>.</p>
	 *
	 * @param firmLegalPersonCertType a {@link java.lang.String} object.
	 */
	public void setFirmLegalPersonCertType(String firmLegalPersonCertType) {
		this.firmLegalPersonCertType = firmLegalPersonCertType;
	}
	/**
	 * <p>Getter for the field <code>firmLegalPersonCertType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFirmLegalPersonCertType( ) {
		return this.firmLegalPersonCertType;
	}

	/**
	 * <p>Setter for the field <code>firmLegalPersonName</code>.</p>
	 *
	 * @param firmLegalPersonName a {@link java.lang.String} object.
	 */
	public void setFirmLegalPersonName(String firmLegalPersonName) {
		this.firmLegalPersonName = firmLegalPersonName;
	}
	/**
	 * <p>Getter for the field <code>firmLegalPersonName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFirmLegalPersonName( ) {
		return this.firmLegalPersonName;
	}

	/**
	 * <p>Setter for the field <code>firmLegalPersonPictures</code>.</p>
	 *
	 * @param firmLegalPersonPictures a {@link java.util.List} object.
	 */
	public void setFirmLegalPersonPictures(List<AlipayUserPicture> firmLegalPersonPictures) {
		this.firmLegalPersonPictures = firmLegalPersonPictures;
	}
	/**
	 * <p>Getter for the field <code>firmLegalPersonPictures</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlipayUserPicture> getFirmLegalPersonPictures( ) {
		return this.firmLegalPersonPictures;
	}

	/**
	 * <p>Setter for the field <code>firmPictures</code>.</p>
	 *
	 * @param firmPictures a {@link java.util.List} object.
	 */
	public void setFirmPictures(List<AlipayUserPicture> firmPictures) {
		this.firmPictures = firmPictures;
	}
	/**
	 * <p>Getter for the field <code>firmPictures</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlipayUserPicture> getFirmPictures( ) {
		return this.firmPictures;
	}

	/**
	 * <p>Setter for the field <code>firmType</code>.</p>
	 *
	 * @param firmType a {@link java.lang.String} object.
	 */
	public void setFirmType(String firmType) {
		this.firmType = firmType;
	}
	/**
	 * <p>Getter for the field <code>firmType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFirmType( ) {
		return this.firmType;
	}

	/**
	 * <p>Setter for the field <code>gender</code>.</p>
	 *
	 * @param gender a {@link java.lang.String} object.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * <p>Getter for the field <code>gender</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGender( ) {
		return this.gender;
	}

	/**
	 * <p>Setter for the field <code>isBalanceFrozen</code>.</p>
	 *
	 * @param isBalanceFrozen a {@link java.lang.String} object.
	 */
	public void setIsBalanceFrozen(String isBalanceFrozen) {
		this.isBalanceFrozen = isBalanceFrozen;
	}
	/**
	 * <p>Getter for the field <code>isBalanceFrozen</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsBalanceFrozen( ) {
		return this.isBalanceFrozen;
	}

	/**
	 * <p>Setter for the field <code>isCertified</code>.</p>
	 *
	 * @param isCertified a {@link java.lang.String} object.
	 */
	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}
	/**
	 * <p>Getter for the field <code>isCertified</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsCertified( ) {
		return this.isCertified;
	}

	/**
	 * <p>Setter for the field <code>isStudentCertified</code>.</p>
	 *
	 * @param isStudentCertified a {@link java.lang.String} object.
	 */
	public void setIsStudentCertified(String isStudentCertified) {
		this.isStudentCertified = isStudentCertified;
	}
	/**
	 * <p>Getter for the field <code>isStudentCertified</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsStudentCertified( ) {
		return this.isStudentCertified;
	}

	/**
	 * <p>Setter for the field <code>licenseExpiryDate</code>.</p>
	 *
	 * @param licenseExpiryDate a {@link java.lang.String} object.
	 */
	public void setLicenseExpiryDate(String licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}
	/**
	 * <p>Getter for the field <code>licenseExpiryDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicenseExpiryDate( ) {
		return this.licenseExpiryDate;
	}

	/**
	 * <p>Setter for the field <code>licenseNo</code>.</p>
	 *
	 * @param licenseNo a {@link java.lang.String} object.
	 */
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	/**
	 * <p>Getter for the field <code>licenseNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicenseNo( ) {
		return this.licenseNo;
	}

	/**
	 * <p>Setter for the field <code>memberGrade</code>.</p>
	 *
	 * @param memberGrade a {@link java.lang.String} object.
	 */
	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}
	/**
	 * <p>Getter for the field <code>memberGrade</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemberGrade( ) {
		return this.memberGrade;
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
	 * <p>Setter for the field <code>nickName</code>.</p>
	 *
	 * @param nickName a {@link java.lang.String} object.
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * <p>Getter for the field <code>nickName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNickName( ) {
		return this.nickName;
	}

	/**
	 * <p>Setter for the field <code>organizationCode</code>.</p>
	 *
	 * @param organizationCode a {@link java.lang.String} object.
	 */
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}
	/**
	 * <p>Getter for the field <code>organizationCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrganizationCode( ) {
		return this.organizationCode;
	}

	/**
	 * <p>Setter for the field <code>personBirthday</code>.</p>
	 *
	 * @param personBirthday a {@link java.lang.String} object.
	 */
	public void setPersonBirthday(String personBirthday) {
		this.personBirthday = personBirthday;
	}
	/**
	 * <p>Getter for the field <code>personBirthday</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPersonBirthday( ) {
		return this.personBirthday;
	}

	/**
	 * <p>Setter for the field <code>personCertExpiryDate</code>.</p>
	 *
	 * @param personCertExpiryDate a {@link java.lang.String} object.
	 */
	public void setPersonCertExpiryDate(String personCertExpiryDate) {
		this.personCertExpiryDate = personCertExpiryDate;
	}
	/**
	 * <p>Getter for the field <code>personCertExpiryDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPersonCertExpiryDate( ) {
		return this.personCertExpiryDate;
	}

	/**
	 * <p>Setter for the field <code>personPictures</code>.</p>
	 *
	 * @param personPictures a {@link java.util.List} object.
	 */
	public void setPersonPictures(List<AlipayUserPicture> personPictures) {
		this.personPictures = personPictures;
	}
	/**
	 * <p>Getter for the field <code>personPictures</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlipayUserPicture> getPersonPictures( ) {
		return this.personPictures;
	}

	/**
	 * <p>Setter for the field <code>phone</code>.</p>
	 *
	 * @param phone a {@link java.lang.String} object.
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * <p>Getter for the field <code>phone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPhone( ) {
		return this.phone;
	}

	/**
	 * <p>Setter for the field <code>profession</code>.</p>
	 *
	 * @param profession a {@link java.lang.String} object.
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}
	/**
	 * <p>Getter for the field <code>profession</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProfession( ) {
		return this.profession;
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
	 * <p>Setter for the field <code>taobaoId</code>.</p>
	 *
	 * @param taobaoId a {@link java.lang.String} object.
	 */
	public void setTaobaoId(String taobaoId) {
		this.taobaoId = taobaoId;
	}
	/**
	 * <p>Getter for the field <code>taobaoId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTaobaoId( ) {
		return this.taobaoId;
	}

	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId( ) {
		return this.userId;
	}

	/**
	 * <p>Setter for the field <code>userName</code>.</p>
	 *
	 * @param userName a {@link java.lang.String} object.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * <p>Getter for the field <code>userName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserName( ) {
		return this.userName;
	}

	/**
	 * <p>Setter for the field <code>userStatus</code>.</p>
	 *
	 * @param userStatus a {@link java.lang.String} object.
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	/**
	 * <p>Getter for the field <code>userStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserStatus( ) {
		return this.userStatus;
	}

	/**
	 * <p>Setter for the field <code>userType</code>.</p>
	 *
	 * @param userType a {@link java.lang.String} object.
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}
	/**
	 * <p>Getter for the field <code>userType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserType( ) {
		return this.userType;
	}

	/**
	 * <p>Setter for the field <code>zip</code>.</p>
	 *
	 * @param zip a {@link java.lang.String} object.
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * <p>Getter for the field <code>zip</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getZip( ) {
		return this.zip;
	}

}
