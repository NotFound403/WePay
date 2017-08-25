package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 站点信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SiteInfo extends AlipayObject {

	private static final long serialVersionUID = 3245688293453158228L;

	/**
	 * 测试账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 测试密码
	 */
	@ApiField("password")
	private String password;

	/**
	 * 站点名称
	 */
	@ApiField("site_name")
	private String siteName;

	/**
	 * 网站：01
APP  : 02
服务窗:03
公众号:04
其他:05
	 */
	@ApiField("site_type")
	private String siteType;

	/**
	 * 站点地址
	 */
	@ApiField("site_url")
	private String siteUrl;

	/**
	 * <p>Getter for the field <code>account</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccount() {
		return this.account;
	}
	/**
	 * <p>Setter for the field <code>account</code>.</p>
	 *
	 * @param account a {@link java.lang.String} object.
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * <p>Getter for the field <code>password</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPassword() {
		return this.password;
	}
	/**
	 * <p>Setter for the field <code>password</code>.</p>
	 *
	 * @param password a {@link java.lang.String} object.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * <p>Getter for the field <code>siteName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSiteName() {
		return this.siteName;
	}
	/**
	 * <p>Setter for the field <code>siteName</code>.</p>
	 *
	 * @param siteName a {@link java.lang.String} object.
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	/**
	 * <p>Getter for the field <code>siteType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSiteType() {
		return this.siteType;
	}
	/**
	 * <p>Setter for the field <code>siteType</code>.</p>
	 *
	 * @param siteType a {@link java.lang.String} object.
	 */
	public void setSiteType(String siteType) {
		this.siteType = siteType;
	}

	/**
	 * <p>Getter for the field <code>siteUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSiteUrl() {
		return this.siteUrl;
	}
	/**
	 * <p>Setter for the field <code>siteUrl</code>.</p>
	 *
	 * @param siteUrl a {@link java.lang.String} object.
	 */
	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

}
