package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.DeliverAddress;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.userinfo.share response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserUserinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 7495743557597392534L;

	/** 
	 * 详细地址。
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 区域编码，暂时不返回值
	 */
	@ApiField("address_code")
	private String addressCode;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 区县名称。
	 */
	@ApiField("area")
	private String area;

	/** 
	 * 用户头像
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 【注意】当is_balance_frozen为“F”时，改字段不会返回.
CTU ---- CTU冻结，允许用户开启
ALIBABA ---- ALIBABA冻结，允许用户开启
SERVER ---- 后台冻结，允许用户开启
USER ----  用户冻结 
CTU_N---- CTU冻结，不允许用户开启
ALIBABA_N ---- ALIBABA冻结，不允许用户开启
SERVER_N ---- 后台冻结，不允许用户开启
UNKNOWN ---- 降级、或查询超时
	 */
	@ApiField("balance_freeze_type")
	private String balanceFreezeType;

	/** 
	 * 用户生日
	 */
	@ApiField("birthday")
	private String birthday;

	/** 
	 * 证件号码
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
10其它证件
	 */
	@ApiField("cert_type_value")
	private String certTypeValue;

	/** 
	 * 市名称。
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 是否默认收货地址，暂时不返回值
	 */
	@ApiField("default_deliver_address")
	private String defaultDeliverAddress;

	/** 
	 * 收货人地址列表
	 */
	@ApiListField("deliver_address_list")
	@ApiField("deliver_address")
	private List<DeliverAddress> deliverAddressList;

	/** 
	 * 收货人所在区县
	 */
	@ApiField("deliver_area")
	private String deliverArea;

	/** 
	 * 收货人所在城市
	 */
	@ApiField("deliver_city")
	private String deliverCity;

	/** 
	 * 收货人全称
	 */
	@ApiField("deliver_fullname")
	private String deliverFullname;

	/** 
	 * 收货地址的联系人移动电话。
	 */
	@ApiField("deliver_mobile")
	private String deliverMobile;

	/** 
	 * 收货地址的联系人固定电话。
	 */
	@ApiField("deliver_phone")
	private String deliverPhone;

	/** 
	 * 收货人所在省份
	 */
	@ApiField("deliver_province")
	private String deliverProvince;

	/** 
	 * 用户支付宝账号绑定的邮箱地址
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 姓氏，取的是realName中的首个字符，对非中文、中文复姓支持较差。
	 */
	@ApiField("family_name")
	private String familyName;

	/** 
	 * 公司名称（用户类型是公司类型时公司名称才有此字段）。
	 */
	@ApiField("firm_name")
	private String firmName;

	/** 
	 * 性别（F：女性；M：男性）
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * T--被冻结；F--未冻结
	 */
	@ApiField("is_balance_frozen")
	private String isBalanceFrozen;

	/** 
	 * T为是银行卡认证，F为非银行卡认证。
	 */
	@ApiField("is_bank_auth")
	private String isBankAuth;

	/** 
	 * 是否通过实名认证。T是通过 F是没有实名认证
	 */
	@ApiField("is_certified")
	private String isCertified;

	/** 
	 * T：表示A类实名认证；F：表示非A类实名认证
	 */
	@ApiField("is_certify_grade_a")
	private String isCertifyGradeA;

	/** 
	 * T为是身份证认证，F为非身份证认证。
	 */
	@ApiField("is_id_auth")
	private String isIdAuth;

	/** 
	 * T为通过营业执照认证，F为没有通过
	 */
	@ApiField("is_licence_auth")
	private String isLicenceAuth;

	/** 
	 * T为是手机认证，F为非手机认证。
	 */
	@ApiField("is_mobile_auth")
	private String isMobileAuth;

	/** 
	 * 是否是学生
	 */
	@ApiField("is_student_certified")
	private String isStudentCertified;

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
	 * 电话号码。
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 省份名称。
	 */
	@ApiField("province")
	private String province;

	/** 
	 * 用户的真实姓名。
	 */
	@ApiField("real_name")
	private String realName;

	/** 
	 * 生日的月和日，MMdd格式
	 */
	@ApiField("reduced_birthday")
	private String reducedBirthday;

	/** 
	 * 用户的userId
	 */
	@ApiField("user_id")
	private String userId;

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
	@ApiField("user_type_value")
	private String userTypeValue;

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
	 * <p>Setter for the field <code>addressCode</code>.</p>
	 *
	 * @param addressCode a {@link java.lang.String} object.
	 */
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}
	/**
	 * <p>Getter for the field <code>addressCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddressCode( ) {
		return this.addressCode;
	}

	/**
	 * <p>Setter for the field <code>alipayUserId</code>.</p>
	 *
	 * @param alipayUserId a {@link java.lang.String} object.
	 */
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	/**
	 * <p>Getter for the field <code>alipayUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayUserId( ) {
		return this.alipayUserId;
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
	 * <p>Setter for the field <code>balanceFreezeType</code>.</p>
	 *
	 * @param balanceFreezeType a {@link java.lang.String} object.
	 */
	public void setBalanceFreezeType(String balanceFreezeType) {
		this.balanceFreezeType = balanceFreezeType;
	}
	/**
	 * <p>Getter for the field <code>balanceFreezeType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBalanceFreezeType( ) {
		return this.balanceFreezeType;
	}

	/**
	 * <p>Setter for the field <code>birthday</code>.</p>
	 *
	 * @param birthday a {@link java.lang.String} object.
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * <p>Getter for the field <code>birthday</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBirthday( ) {
		return this.birthday;
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
	 * <p>Setter for the field <code>certTypeValue</code>.</p>
	 *
	 * @param certTypeValue a {@link java.lang.String} object.
	 */
	public void setCertTypeValue(String certTypeValue) {
		this.certTypeValue = certTypeValue;
	}
	/**
	 * <p>Getter for the field <code>certTypeValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertTypeValue( ) {
		return this.certTypeValue;
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
	 * <p>Setter for the field <code>defaultDeliverAddress</code>.</p>
	 *
	 * @param defaultDeliverAddress a {@link java.lang.String} object.
	 */
	public void setDefaultDeliverAddress(String defaultDeliverAddress) {
		this.defaultDeliverAddress = defaultDeliverAddress;
	}
	/**
	 * <p>Getter for the field <code>defaultDeliverAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDefaultDeliverAddress( ) {
		return this.defaultDeliverAddress;
	}

	/**
	 * <p>Setter for the field <code>deliverAddressList</code>.</p>
	 *
	 * @param deliverAddressList a {@link java.util.List} object.
	 */
	public void setDeliverAddressList(List<DeliverAddress> deliverAddressList) {
		this.deliverAddressList = deliverAddressList;
	}
	/**
	 * <p>Getter for the field <code>deliverAddressList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<DeliverAddress> getDeliverAddressList( ) {
		return this.deliverAddressList;
	}

	/**
	 * <p>Setter for the field <code>deliverArea</code>.</p>
	 *
	 * @param deliverArea a {@link java.lang.String} object.
	 */
	public void setDeliverArea(String deliverArea) {
		this.deliverArea = deliverArea;
	}
	/**
	 * <p>Getter for the field <code>deliverArea</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliverArea( ) {
		return this.deliverArea;
	}

	/**
	 * <p>Setter for the field <code>deliverCity</code>.</p>
	 *
	 * @param deliverCity a {@link java.lang.String} object.
	 */
	public void setDeliverCity(String deliverCity) {
		this.deliverCity = deliverCity;
	}
	/**
	 * <p>Getter for the field <code>deliverCity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliverCity( ) {
		return this.deliverCity;
	}

	/**
	 * <p>Setter for the field <code>deliverFullname</code>.</p>
	 *
	 * @param deliverFullname a {@link java.lang.String} object.
	 */
	public void setDeliverFullname(String deliverFullname) {
		this.deliverFullname = deliverFullname;
	}
	/**
	 * <p>Getter for the field <code>deliverFullname</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliverFullname( ) {
		return this.deliverFullname;
	}

	/**
	 * <p>Setter for the field <code>deliverMobile</code>.</p>
	 *
	 * @param deliverMobile a {@link java.lang.String} object.
	 */
	public void setDeliverMobile(String deliverMobile) {
		this.deliverMobile = deliverMobile;
	}
	/**
	 * <p>Getter for the field <code>deliverMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliverMobile( ) {
		return this.deliverMobile;
	}

	/**
	 * <p>Setter for the field <code>deliverPhone</code>.</p>
	 *
	 * @param deliverPhone a {@link java.lang.String} object.
	 */
	public void setDeliverPhone(String deliverPhone) {
		this.deliverPhone = deliverPhone;
	}
	/**
	 * <p>Getter for the field <code>deliverPhone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliverPhone( ) {
		return this.deliverPhone;
	}

	/**
	 * <p>Setter for the field <code>deliverProvince</code>.</p>
	 *
	 * @param deliverProvince a {@link java.lang.String} object.
	 */
	public void setDeliverProvince(String deliverProvince) {
		this.deliverProvince = deliverProvince;
	}
	/**
	 * <p>Getter for the field <code>deliverProvince</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliverProvince( ) {
		return this.deliverProvince;
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
	 * <p>Setter for the field <code>familyName</code>.</p>
	 *
	 * @param familyName a {@link java.lang.String} object.
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	/**
	 * <p>Getter for the field <code>familyName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFamilyName( ) {
		return this.familyName;
	}

	/**
	 * <p>Setter for the field <code>firmName</code>.</p>
	 *
	 * @param firmName a {@link java.lang.String} object.
	 */
	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	/**
	 * <p>Getter for the field <code>firmName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFirmName( ) {
		return this.firmName;
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
	 * <p>Setter for the field <code>isBankAuth</code>.</p>
	 *
	 * @param isBankAuth a {@link java.lang.String} object.
	 */
	public void setIsBankAuth(String isBankAuth) {
		this.isBankAuth = isBankAuth;
	}
	/**
	 * <p>Getter for the field <code>isBankAuth</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsBankAuth( ) {
		return this.isBankAuth;
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
	 * <p>Setter for the field <code>isCertifyGradeA</code>.</p>
	 *
	 * @param isCertifyGradeA a {@link java.lang.String} object.
	 */
	public void setIsCertifyGradeA(String isCertifyGradeA) {
		this.isCertifyGradeA = isCertifyGradeA;
	}
	/**
	 * <p>Getter for the field <code>isCertifyGradeA</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsCertifyGradeA( ) {
		return this.isCertifyGradeA;
	}

	/**
	 * <p>Setter for the field <code>isIdAuth</code>.</p>
	 *
	 * @param isIdAuth a {@link java.lang.String} object.
	 */
	public void setIsIdAuth(String isIdAuth) {
		this.isIdAuth = isIdAuth;
	}
	/**
	 * <p>Getter for the field <code>isIdAuth</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsIdAuth( ) {
		return this.isIdAuth;
	}

	/**
	 * <p>Setter for the field <code>isLicenceAuth</code>.</p>
	 *
	 * @param isLicenceAuth a {@link java.lang.String} object.
	 */
	public void setIsLicenceAuth(String isLicenceAuth) {
		this.isLicenceAuth = isLicenceAuth;
	}
	/**
	 * <p>Getter for the field <code>isLicenceAuth</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsLicenceAuth( ) {
		return this.isLicenceAuth;
	}

	/**
	 * <p>Setter for the field <code>isMobileAuth</code>.</p>
	 *
	 * @param isMobileAuth a {@link java.lang.String} object.
	 */
	public void setIsMobileAuth(String isMobileAuth) {
		this.isMobileAuth = isMobileAuth;
	}
	/**
	 * <p>Getter for the field <code>isMobileAuth</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsMobileAuth( ) {
		return this.isMobileAuth;
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
	 * <p>Setter for the field <code>realName</code>.</p>
	 *
	 * @param realName a {@link java.lang.String} object.
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 * <p>Getter for the field <code>realName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRealName( ) {
		return this.realName;
	}

	/**
	 * <p>Setter for the field <code>reducedBirthday</code>.</p>
	 *
	 * @param reducedBirthday a {@link java.lang.String} object.
	 */
	public void setReducedBirthday(String reducedBirthday) {
		this.reducedBirthday = reducedBirthday;
	}
	/**
	 * <p>Getter for the field <code>reducedBirthday</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReducedBirthday( ) {
		return this.reducedBirthday;
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
	 * <p>Setter for the field <code>userTypeValue</code>.</p>
	 *
	 * @param userTypeValue a {@link java.lang.String} object.
	 */
	public void setUserTypeValue(String userTypeValue) {
		this.userTypeValue = userTypeValue;
	}
	/**
	 * <p>Getter for the field <code>userTypeValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserTypeValue( ) {
		return this.userTypeValue;
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
