package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝会员信息详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserDetail extends AlipayObject {

	private static final long serialVersionUID = 6891397564958225377L;

	/**
	 * 支付宝用户userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 是否通过实名认证
	 */
	@ApiField("certified")
	private Boolean certified;

	/**
	 * 支付宝登录号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 性别。可选值:m(男),f(女)
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 用户状态。可选:normal(正常), supervise (监管),delete(注销)
	 */
	@ApiField("user_status")
	private String userStatus;

	/**
	 * 用户类型。可选：personal（个人），company（公司）
	 */
	@ApiField("user_type")
	private String userType;

	/**
	 * <p>Getter for the field <code>alipayUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayUserId() {
		return this.alipayUserId;
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
	 * <p>Getter for the field <code>certified</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getCertified() {
		return this.certified;
	}
	/**
	 * <p>Setter for the field <code>certified</code>.</p>
	 *
	 * @param certified a {@link java.lang.Boolean} object.
	 */
	public void setCertified(Boolean certified) {
		this.certified = certified;
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
	 * <p>Getter for the field <code>realName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRealName() {
		return this.realName;
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
	 * <p>Getter for the field <code>sex</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSex() {
		return this.sex;
	}
	/**
	 * <p>Setter for the field <code>sex</code>.</p>
	 *
	 * @param sex a {@link java.lang.String} object.
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * <p>Getter for the field <code>userStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserStatus() {
		return this.userStatus;
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
