package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 蚂蚁通行证注册
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserAntpaasTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1723821233922446461L;

	/**
	 * 账户绑定手机号
	 */
	@ApiField("bind_mobile")
	private String bindMobile;

	/**
	 * 当前用户国家/地区，两位国家代码 国家代码以ISO 3166-1 标准为准
	 */
	@ApiField("country")
	private String country;

	/**
	 * 蚂蚁通行证登录密码，原始密码使用RSA加密后传输,示例：a11111:JuZeA/DR9NJU8aJPONdq9ZMbXI2zNHyoq3MwOxmjjY17ItpsbyuaPrfKsOzVBX9IFKyfr1Whrhlbl4WbYu9q2Xai6mWCNTKbYwvCDuY+pjel6dkka+/kK5ZwWjsN2W6eWAf5TNdy2pqheI08ZMvv1gD6t5zIQBbLGh/rv19NTd2gMwSTO++5Onek9saJi8iG+W32AOPPBWcaMv6yNJJCyA0QloBY5qFQdTOoW8DAg3dyfmFEDWNrdUxBZdL5+ZUS7HdK4i+k+vATH7tX0isEA8F40wSNzrrgTX8Dq+NcGzrAlGpSAqxgUDcxog2hrhDXBl4puYfLHskHBNKhwv0BIw==
	 */
	@ApiField("login_password")
	private String loginPassword;

	/**
	 * 蚂蚁通行证注册登录号，用于账户登录，邮箱、手机号等
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 用户是否需要补全安全密码，true：需要补全，false：不需要补全。
默认为false，不需要补全。
	 */
	@ApiField("need_supply")
	private Boolean needSupply;

	/**
	 * 蚂蚁通行证安全密码，通过RSA加密传输,示例：b111111:Dsz+toTsBnIwyG7IWuzshgwXxkHImAACx8yUb9PhP4+zyEV/xAPM/N9AdAFh0Di9xLG6syACSTn4KYMYs5GoSyaI2TJ0e2TcC8Gm5VJK0uinJVRhgWPnfsyiSl9amhObbPXtQgVO7szmYI8duChphFz0I2MKMOQVvWWF7Z9sSXZCfUGLPtL6ZS+xb3W9scczasR49IO8V49ll5NGzwFTvvc9yGPTxj3AIPbUPBG4byktfPWKoiRpTstGQORmAGPZT+gumEJxxpcATMcsnJMnHYfdrhEW8/VFleC5m5aaoCl2mdmEgh4X6NSt8MpgnUxhXwW090+dx3UQwU5pqGRvkw==
	 */
	@ApiField("security_password")
	private String securityPassword;

	/**
	 * 注册来源场景，shangshu_register--上树对接蚂蚁通行证，该场景登录号、登录密码、用户类型为必传参数
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用户类型，1 -- 企业用户， 2 -- 个人用户
	 */
	@ApiField("user_type")
	private String userType;

	/**
	 * <p>Getter for the field <code>bindMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBindMobile() {
		return this.bindMobile;
	}
	/**
	 * <p>Setter for the field <code>bindMobile</code>.</p>
	 *
	 * @param bindMobile a {@link java.lang.String} object.
	 */
	public void setBindMobile(String bindMobile) {
		this.bindMobile = bindMobile;
	}

	/**
	 * <p>Getter for the field <code>country</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCountry() {
		return this.country;
	}
	/**
	 * <p>Setter for the field <code>country</code>.</p>
	 *
	 * @param country a {@link java.lang.String} object.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * <p>Getter for the field <code>loginPassword</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoginPassword() {
		return this.loginPassword;
	}
	/**
	 * <p>Setter for the field <code>loginPassword</code>.</p>
	 *
	 * @param loginPassword a {@link java.lang.String} object.
	 */
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
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
	 * <p>Getter for the field <code>needSupply</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getNeedSupply() {
		return this.needSupply;
	}
	/**
	 * <p>Setter for the field <code>needSupply</code>.</p>
	 *
	 * @param needSupply a {@link java.lang.Boolean} object.
	 */
	public void setNeedSupply(Boolean needSupply) {
		this.needSupply = needSupply;
	}

	/**
	 * <p>Getter for the field <code>securityPassword</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSecurityPassword() {
		return this.securityPassword;
	}
	/**
	 * <p>Setter for the field <code>securityPassword</code>.</p>
	 *
	 * @param securityPassword a {@link java.lang.String} object.
	 */
	public void setSecurityPassword(String securityPassword) {
		this.securityPassword = securityPassword;
	}

	/**
	 * <p>Getter for the field <code>source</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSource() {
		return this.source;
	}
	/**
	 * <p>Setter for the field <code>source</code>.</p>
	 *
	 * @param source a {@link java.lang.String} object.
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * <p>Getter for the field <code>userType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserType() {
		return this.userType;
	}
	/**
	 * <p>Setter for the field <code>userType</code>.</p>
	 *
	 * @param userType a {@link java.lang.String} object.
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
