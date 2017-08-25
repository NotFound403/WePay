package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统二维码内容详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertContentCodec extends AlipayObject {

	private static final long serialVersionUID = 1615151962292834259L;

	/**
	 * 二维码广告内容
	 */
	@ApiField("url")
	private String url;

	/**
	 * <p>Getter for the field <code>url</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUrl() {
		return this.url;
	}
	/**
	 * <p>Setter for the field <code>url</code>.</p>
	 *
	 * @param url a {@link java.lang.String} object.
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
