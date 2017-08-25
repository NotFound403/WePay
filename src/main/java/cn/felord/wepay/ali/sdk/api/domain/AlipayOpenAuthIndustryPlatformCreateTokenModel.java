package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 行业平台获取授权码
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>isvAppid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvAppid() {
		return this.isvAppid;
	}
	/**
	 * <p>Setter for the field <code>isvAppid</code>.</p>
	 *
	 * @param isvAppid a {@link java.lang.String} object.
	 */
	public void setIsvAppid(String isvAppid) {
		this.isvAppid = isvAppid;
	}

	/**
	 * <p>Getter for the field <code>scope</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getScope() {
		return this.scope;
	}
	/**
	 * <p>Setter for the field <code>scope</code>.</p>
	 *
	 * @param scope a {@link java.lang.String} object.
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}

}
