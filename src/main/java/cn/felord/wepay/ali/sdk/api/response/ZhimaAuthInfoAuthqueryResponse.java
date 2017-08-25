package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.auth.info.authquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaAuthInfoAuthqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6295945468425484618L;

	/** 
	 * 是否已经授权,已授权:true,未授权:false
	 */
	@ApiField("authorized")
	private Boolean authorized;

	/**
	 * <p>Setter for the field <code>authorized</code>.</p>
	 *
	 * @param authorized a {@link java.lang.Boolean} object.
	 */
	public void setAuthorized(Boolean authorized) {
		this.authorized = authorized;
	}
	/**
	 * <p>Getter for the field <code>authorized</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getAuthorized( ) {
		return this.authorized;
	}

}
