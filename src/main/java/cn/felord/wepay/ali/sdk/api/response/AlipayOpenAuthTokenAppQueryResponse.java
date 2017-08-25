package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.token.app.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAuthTokenAppQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5237311825588942184L;

	/** 
	 * 授权商户的appid
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/** 
	 * 授权失效时间
	 */
	@ApiField("auth_end")
	private Date authEnd;

	/** 
	 * 当前app_auth_token的授权接口列表
	 */
	@ApiListField("auth_methods")
	@ApiField("string")
	private List<String> authMethods;

	/** 
	 * 授权生效时间
	 */
	@ApiField("auth_start")
	private Date authStart;

	/** 
	 * 应用授权令牌失效时间，单位到秒
	 */
	@ApiField("expires_in")
	private Long expiresIn;

	/** 
	 * valid：有效状态；invalid：无效状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 授权商户的user_id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Setter for the field <code>authAppId</code>.</p>
	 *
	 * @param authAppId a {@link java.lang.String} object.
	 */
	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}
	/**
	 * <p>Getter for the field <code>authAppId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthAppId( ) {
		return this.authAppId;
	}

	/**
	 * <p>Setter for the field <code>authEnd</code>.</p>
	 *
	 * @param authEnd a {@link java.util.Date} object.
	 */
	public void setAuthEnd(Date authEnd) {
		this.authEnd = authEnd;
	}
	/**
	 * <p>Getter for the field <code>authEnd</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getAuthEnd( ) {
		return this.authEnd;
	}

	/**
	 * <p>Setter for the field <code>authMethods</code>.</p>
	 *
	 * @param authMethods a {@link java.util.List} object.
	 */
	public void setAuthMethods(List<String> authMethods) {
		this.authMethods = authMethods;
	}
	/**
	 * <p>Getter for the field <code>authMethods</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getAuthMethods( ) {
		return this.authMethods;
	}

	/**
	 * <p>Setter for the field <code>authStart</code>.</p>
	 *
	 * @param authStart a {@link java.util.Date} object.
	 */
	public void setAuthStart(Date authStart) {
		this.authStart = authStart;
	}
	/**
	 * <p>Getter for the field <code>authStart</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getAuthStart( ) {
		return this.authStart;
	}

	/**
	 * <p>Setter for the field <code>expiresIn</code>.</p>
	 *
	 * @param expiresIn a {@link java.lang.Long} object.
	 */
	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}
	/**
	 * <p>Getter for the field <code>expiresIn</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getExpiresIn( ) {
		return this.expiresIn;
	}

	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus( ) {
		return this.status;
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
