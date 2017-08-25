package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.alipay.security.prod.test response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdAlipaySecurityProdTestResponse extends AlipayResponse {

	private static final long serialVersionUID = 7315921147164684481L;

	/** 
	 * ddd
	 */
	@ApiField("admin")
	private String admin;

	/**
	 * <p>Setter for the field <code>admin</code>.</p>
	 *
	 * @param admin a {@link java.lang.String} object.
	 */
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	/**
	 * <p>Getter for the field <code>admin</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdmin( ) {
		return this.admin;
	}

}
