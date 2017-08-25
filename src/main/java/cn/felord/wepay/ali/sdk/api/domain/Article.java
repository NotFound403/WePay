package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 图文消息子消息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Article extends AlipayObject {

	private static final long serialVersionUID = 8212473615121134237L;

	/**
	 * 链接文字
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 图文消息内容
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图片链接，对于多条图文消息的第一条消息，该字段不能为空; 请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 图文消息标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 点击图文消息跳转的链接
	 */
	@ApiField("url")
	private String url;

	/**
	 * <p>Getter for the field <code>actionName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionName() {
		return this.actionName;
	}
	/**
	 * <p>Setter for the field <code>actionName</code>.</p>
	 *
	 * @param actionName a {@link java.lang.String} object.
	 */
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	/**
	 * <p>Getter for the field <code>desc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDesc() {
		return this.desc;
	}
	/**
	 * <p>Setter for the field <code>desc</code>.</p>
	 *
	 * @param desc a {@link java.lang.String} object.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * <p>Getter for the field <code>imageUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImageUrl() {
		return this.imageUrl;
	}
	/**
	 * <p>Setter for the field <code>imageUrl</code>.</p>
	 *
	 * @param imageUrl a {@link java.lang.String} object.
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
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
