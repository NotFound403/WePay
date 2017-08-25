package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLifeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2522211885339457639L;

	/** 
	 * 过期时间，在过期时间之前需要拿refresh_token重新换取新的token使用
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * 生活号id，用于表示此生活号唯一性
	 */
	@ApiField("public_id")
	private String publicId;

	/** 
	 * 生活号长链接
	 */
	@ApiField("public_long_link")
	private String publicLongLink;

	/** 
	 * 生活号短链接
	 */
	@ApiField("public_short_link")
	private String publicShortLink;

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
	 * @param expireTime a {@link java.lang.String} object.
	 */
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	/**
	 * <p>Getter for the field <code>expireTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpireTime( ) {
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
	 * <p>Setter for the field <code>publicLongLink</code>.</p>
	 *
	 * @param publicLongLink a {@link java.lang.String} object.
	 */
	public void setPublicLongLink(String publicLongLink) {
		this.publicLongLink = publicLongLink;
	}
	/**
	 * <p>Getter for the field <code>publicLongLink</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicLongLink( ) {
		return this.publicLongLink;
	}

	/**
	 * <p>Setter for the field <code>publicShortLink</code>.</p>
	 *
	 * @param publicShortLink a {@link java.lang.String} object.
	 */
	public void setPublicShortLink(String publicShortLink) {
		this.publicShortLink = publicShortLink;
	}
	/**
	 * <p>Getter for the field <code>publicShortLink</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicShortLink( ) {
		return this.publicShortLink;
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
