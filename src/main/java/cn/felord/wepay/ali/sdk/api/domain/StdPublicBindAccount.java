package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 全面开放下公众平台的绑定账户
 *
 * @author auto create
 * @version $Id: $Id
 */
public class StdPublicBindAccount extends AlipayObject {

	private static final long serialVersionUID = 8447574174395779644L;

	/**
	 * 协议号是商户会员在支付宝公众账号中的唯一标识。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 公众账号ID
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 绑定的商户会员号
	 */
	@ApiField("bind_account_no")
	private String bindAccountNo;

	/**
	 * 公众账号期望支付宝用户在公众账号首页看到的关于该用户的显示信息，最长10个汉字。
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 绑定的商户会员对应的支付宝用户号，以2088 开头的16位数字。
	 */
	@ApiField("from_user_id")
	private String fromUserId;

	/**
	 * 绑定的商户会员的真实姓名，最长10个汉字。
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * <p>Getter for the field <code>agreementId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgreementId() {
		return this.agreementId;
	}
	/**
	 * <p>Setter for the field <code>agreementId</code>.</p>
	 *
	 * @param agreementId a {@link java.lang.String} object.
	 */
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	/**
	 * <p>Getter for the field <code>appId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppId() {
		return this.appId;
	}
	/**
	 * <p>Setter for the field <code>appId</code>.</p>
	 *
	 * @param appId a {@link java.lang.String} object.
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * <p>Getter for the field <code>bindAccountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBindAccountNo() {
		return this.bindAccountNo;
	}
	/**
	 * <p>Setter for the field <code>bindAccountNo</code>.</p>
	 *
	 * @param bindAccountNo a {@link java.lang.String} object.
	 */
	public void setBindAccountNo(String bindAccountNo) {
		this.bindAccountNo = bindAccountNo;
	}

	/**
	 * <p>Getter for the field <code>displayName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisplayName() {
		return this.displayName;
	}
	/**
	 * <p>Setter for the field <code>displayName</code>.</p>
	 *
	 * @param displayName a {@link java.lang.String} object.
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * <p>Getter for the field <code>fromUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFromUserId() {
		return this.fromUserId;
	}
	/**
	 * <p>Setter for the field <code>fromUserId</code>.</p>
	 *
	 * @param fromUserId a {@link java.lang.String} object.
	 */
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
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

}
