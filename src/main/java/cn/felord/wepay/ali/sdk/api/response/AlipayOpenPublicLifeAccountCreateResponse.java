package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.account.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLifeAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6438555177658774949L;

	/** 
	 * 过期时间，在过期时间之前需要拿refresh_token重新换取新的token使用
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * 生活号id，用于表示此生活号唯一性
	 */
	@ApiField("public_id")
	private String publicId;

	/** 
	 * 刷新令牌，当返回值中过期时间快到了，可以通过此令牌来重新刷新令牌，时间自动延长一年
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/** 
	 * 授权token，通过授权token可以代替已生成的生活号id进行代理操作，例如发送广播等
	 */
	@ApiField("token")
	private String token;

	/**
	 * <p>Setter for the field <code>expireTime</code>.</p>
	 *
	 * @param expireTime a {@link java.util.Date} object.
	 */
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	/**
	 * <p>Getter for the field <code>expireTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	/**
	 * <p>Setter for the field <code>publicId</code>.</p>
	 *
	 * @param publicId a {@link java.lang.String} object.
	 */
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	/**
	 * <p>Getter for the field <code>publicId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicId( ) {
		return this.publicId;
	}

	/**
	 * <p>Setter for the field <code>refreshToken</code>.</p>
	 *
	 * @param refreshToken a {@link java.lang.String} object.
	 */
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	/**
	 * <p>Getter for the field <code>refreshToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefreshToken( ) {
		return this.refreshToken;
	}

	/**
	 * <p>Setter for the field <code>token</code>.</p>
	 *
	 * @param token a {@link java.lang.String} object.
	 */
	public void setToken(String token) {
		this.token = token;
	}
	/**
	 * <p>Getter for the field <code>token</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getToken( ) {
		return this.token;
	}

}
