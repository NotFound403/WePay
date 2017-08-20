package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 行业平台获取授权码
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:15
 */
public class AlipayOpenAuthIndustryPlatformCreateTokenModel extends AlipayObject {

	private static final long serialVersionUID = 5351451285324235253L;

	/**
	 * isv的appid
	 */
	@ApiField("isv_appid")
	private String isvAppid;

	/**
	 * auth_mycar_violation
	 */
	@ApiField("scope")
	private String scope;

	public String getIsvAppid() {
		return this.isvAppid;
	}
	public void setIsvAppid(String isvAppid) {
		this.isvAppid = isvAppid;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

}
