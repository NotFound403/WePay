package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.shortlink.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicShortlinkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7852338315682467628L;

	/** 
	 * 生成的带参推广短链接
	 */
	@ApiField("shortlink")
	private String shortlink;

	/**
	 * <p>Setter for the field <code>shortlink</code>.</p>
	 *
	 * @param shortlink a {@link java.lang.String} object.
	 */
	public void setShortlink(String shortlink) {
		this.shortlink = shortlink;
	}
	/**
	 * <p>Getter for the field <code>shortlink</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShortlink( ) {
		return this.shortlink;
	}

}
