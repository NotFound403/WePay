package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统口令红包内容
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertContentPassword extends AlipayObject {

	private static final long serialVersionUID = 4414472553511844136L;

	/**
	 * 红包口令
	 */
	@ApiField("password")
	private String password;

	/**
	 * 红包口令分享地址
	 */
	@ApiField("share_page_url")
	private String sharePageUrl;

	/**
	 * <p>Getter for the field <code>password</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPassword() {
		return this.password;
	}
	/**
	 * <p>Setter for the field <code>password</code>.</p>
	 *
	 * @param password a {@link java.lang.String} object.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * <p>Getter for the field <code>sharePageUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSharePageUrl() {
		return this.sharePageUrl;
	}
	/**
	 * <p>Setter for the field <code>sharePageUrl</code>.</p>
	 *
	 * @param sharePageUrl a {@link java.lang.String} object.
	 */
	public void setSharePageUrl(String sharePageUrl) {
		this.sharePageUrl = sharePageUrl;
	}

}
