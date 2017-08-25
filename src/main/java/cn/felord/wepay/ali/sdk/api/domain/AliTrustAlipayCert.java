package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 芝麻信用对外提供的支付宝实名认证账户数据结构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AliTrustAlipayCert extends AlipayObject {

	private static final long serialVersionUID = 3639637888814931912L;

	/**
	 * 用户出生日期
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * 点击支付宝实名认证图标之后的跳转链接
	 */
	@ApiField("forward_url")
	private String forwardUrl;

	/**
	 * 用户性别(M/F)
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 支付宝实名认证图标的链接地址
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 当账户为支付宝实名认证时,取值为"T";否则为"F".
	 */
	@ApiField("is_certified")
	private String isCertified;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

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
	 * <p>Getter for the field <code>forwardUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getForwardUrl() {
		return this.forwardUrl;
	}
	/**
	 * <p>Setter for the field <code>forwardUrl</code>.</p>
	 *
	 * @param forwardUrl a {@link java.lang.String} object.
	 */
	public void setForwardUrl(String forwardUrl) {
		this.forwardUrl = forwardUrl;
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
	 * <p>Getter for the field <code>iconUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIconUrl() {
		return this.iconUrl;
	}
	/**
	 * <p>Setter for the field <code>iconUrl</code>.</p>
	 *
	 * @param iconUrl a {@link java.lang.String} object.
	 */
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	/**
	 * <p>Getter for the field <code>isCertified</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsCertified() {
		return this.isCertified;
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

}
