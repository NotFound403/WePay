package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 扫一扫查询桌码信息
 *
 * @author auto create
 * @since 1.0, 2017-06-15 23:44:52
 */
public class KoubeiCateringTablecodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3523255496218558326L;

	/**
	 * 用户在isv界面通过扫一扫传入的url文本
	 */
	@ApiField("url_context")
	private String urlContext;

	public String getUrlContext() {
		return this.urlContext;
	}
	public void setUrlContext(String urlContext) {
		this.urlContext = urlContext;
	}

}
