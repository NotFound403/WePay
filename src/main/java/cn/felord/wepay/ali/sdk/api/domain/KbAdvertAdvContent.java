package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统推广内容
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertAdvContent extends AlipayObject {

	private static final long serialVersionUID = 3481742442514512811L;

	/**
	 * 二维码
	 */
	@ApiField("codec")
	private String codec;

	/**
	 * 访问地址
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * <p>Getter for the field <code>codec</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodec() {
		return this.codec;
	}
	/**
	 * <p>Setter for the field <code>codec</code>.</p>
	 *
	 * @param codec a {@link java.lang.String} object.
	 */
	public void setCodec(String codec) {
		this.codec = codec;
	}

	/**
	 * <p>Getter for the field <code>linkUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLinkUrl() {
		return this.linkUrl;
	}
	/**
	 * <p>Setter for the field <code>linkUrl</code>.</p>
	 *
	 * @param linkUrl a {@link java.lang.String} object.
	 */
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

}
