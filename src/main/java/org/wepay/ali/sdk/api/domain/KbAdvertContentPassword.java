package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统口令红包内容
 *
 * @author auto create
 * @since 1.0, 2017-02-15 13:57:59
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

	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getSharePageUrl() {
		return this.sharePageUrl;
	}
	public void setSharePageUrl(String sharePageUrl) {
		this.sharePageUrl = sharePageUrl;
	}

}
