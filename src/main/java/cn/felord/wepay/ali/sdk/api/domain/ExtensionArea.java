package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 扩展区
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ExtensionArea extends AlipayObject {

	private static final long serialVersionUID = 2469543192748223568L;

	/**
	 * 跳转链接，当content_type为"image"时必传，必须是https或alipays开头的url链接
	 */
	@ApiField("goto_url")
	private String gotoUrl;

	/**
	 * 扩展区高度，当content_type值为"h5"时必填，取值范围为200-500的整数
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 扩展区名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 扩展区类型，支持两个值，h5：h5类型，image：图片类型。
	 */
	@ApiField("type")
	private String type;

	/**
	 * 扩展区url，传入图片url或者h5页面url，必须是https开头的链接，如果要传入图片链接，请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url
	 */
	@ApiField("url")
	private String url;

	/**
	 * <p>Getter for the field <code>gotoUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGotoUrl() {
		return this.gotoUrl;
	}
	/**
	 * <p>Setter for the field <code>gotoUrl</code>.</p>
	 *
	 * @param gotoUrl a {@link java.lang.String} object.
	 */
	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

	/**
	 * <p>Getter for the field <code>height</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getHeight() {
		return this.height;
	}
	/**
	 * <p>Setter for the field <code>height</code>.</p>
	 *
	 * @param height a {@link java.lang.Long} object.
	 */
	public void setHeight(Long height) {
		this.height = height;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

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
