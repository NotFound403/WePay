package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统二维码内容详情
 *
 * @author auto create
 * @since 1.0, 2017-02-15 13:57:59
 */
public class KbAdvertContentCodec extends AlipayObject {

	private static final long serialVersionUID = 1615151962292834259L;

	/**
	 * 二维码广告内容
	 */
	@ApiField("url")
	private String url;

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}