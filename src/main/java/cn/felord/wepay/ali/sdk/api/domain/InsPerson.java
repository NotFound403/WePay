package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险干系人
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsPerson extends AlipayObject {

	private static final long serialVersionUID = 3479377964968816885L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 生日
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * 投保参数;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 证件上名称;如果渠道账号字段没填则必填
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码;如果渠道账号字段没填则必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型;如果渠道账号字段没填则必填 
100:居民身份证;102:护照;103:军官证;104:士兵证;105:港澳居民往来内地通行证;106:台湾同胞往来大陆通行证;109:警官证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 渠道账号对应的uid;如果证件类型字段没填则必填
	 */
	@ApiField("channel_user_id")
	private String channelUserId;

	/**
	 * 渠道账号来源;1:支付宝账号 2:淘宝账号;如果证件类型字段没填则必填
	 */
	@ApiField("channel_user_source")
	private String channelUserSource;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 性别;M:男 F:女
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 国籍
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * 电话号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 张三
	 */
	@ApiField("pronounce_name")
	private String pronounceName;

	/**
	 * 支付宝会员ID;如果是投保人则必填
	 */
	@ApiField("user_id")
	private String userId;

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
	 * <p>Getter for the field <code>birthday</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getBirthday() {
		return this.birthday;
	}
	/**
	 * <p>Setter for the field <code>birthday</code>.</p>
	 *
	 * @param birthday a {@link java.util.Date} object.
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * <p>Getter for the field <code>bizData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizData() {
		return this.bizData;
	}
	/**
	 * <p>Setter for the field <code>bizData</code>.</p>
	 *
	 * @param bizData a {@link java.lang.String} object.
	 */
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	/**
	 * <p>Getter for the field <code>certName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertName() {
		return this.certName;
	}
	/**
	 * <p>Setter for the field <code>certName</code>.</p>
	 *
	 * @param certName a {@link java.lang.String} object.
	 */
	public void setCertName(String certName) {
		this.certName = certName;
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
	 * <p>Getter for the field <code>channelUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelUserId() {
		return this.channelUserId;
	}
	/**
	 * <p>Setter for the field <code>channelUserId</code>.</p>
	 *
	 * @param channelUserId a {@link java.lang.String} object.
	 */
	public void setChannelUserId(String channelUserId) {
		this.channelUserId = channelUserId;
	}

	/**
	 * <p>Getter for the field <code>channelUserSource</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelUserSource() {
		return this.channelUserSource;
	}
	/**
	 * <p>Setter for the field <code>channelUserSource</code>.</p>
	 *
	 * @param channelUserSource a {@link java.lang.String} object.
	 */
	public void setChannelUserSource(String channelUserSource) {
		this.channelUserSource = channelUserSource;
	}

	/**
	 * <p>Getter for the field <code>email</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEmail() {
		return this.email;
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
	 * <p>Getter for the field <code>gender</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGender() {
		return this.gender;
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
	 * <p>Getter for the field <code>nationality</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNationality() {
		return this.nationality;
	}
	/**
	 * <p>Setter for the field <code>nationality</code>.</p>
	 *
	 * @param nationality a {@link java.lang.String} object.
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * <p>Getter for the field <code>phone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPhone() {
		return this.phone;
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
	 * <p>Getter for the field <code>pronounceName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPronounceName() {
		return this.pronounceName;
	}
	/**
	 * <p>Setter for the field <code>pronounceName</code>.</p>
	 *
	 * @param pronounceName a {@link java.lang.String} object.
	 */
	public void setPronounceName(String pronounceName) {
		this.pronounceName = pronounceName;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
