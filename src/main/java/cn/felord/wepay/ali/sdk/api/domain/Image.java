package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 图片信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Image extends AlipayObject {

	private static final long serialVersionUID = 4498493417345727156L;

	/**
	 * 图片url，请先调用alipay.offline.material.image.upload 图片上传接口获得图片url
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
