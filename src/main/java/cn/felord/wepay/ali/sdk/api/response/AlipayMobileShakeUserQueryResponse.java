package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.shake.user.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobileShakeUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3541145328265791966L;

	/** 
	 * 对应的业务信息
	 */
	@ApiField("bizdata")
	private String bizdata;

	/** 
	 * 支付宝用户登录账户，可能是email或者手机号码
	 */
	@ApiField("logon_id")
	private String logonId;

	/** 
	 * 对应的核销数据
	 */
	@ApiField("pass_id")
	private String passId;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Setter for the field <code>bizdata</code>.</p>
	 *
	 * @param bizdata a {@link java.lang.String} object.
	 */
	public void setBizdata(String bizdata) {
		this.bizdata = bizdata;
	}
	/**
	 * <p>Getter for the field <code>bizdata</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizdata( ) {
		return this.bizdata;
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
	 * <p>Getter for the field <code>logonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogonId( ) {
		return this.logonId;
	}

	/**
	 * <p>Setter for the field <code>passId</code>.</p>
	 *
	 * @param passId a {@link java.lang.String} object.
	 */
	public void setPassId(String passId) {
		this.passId = passId;
	}
	/**
	 * <p>Getter for the field <code>passId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPassId( ) {
		return this.passId;
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

}
