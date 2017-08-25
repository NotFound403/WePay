package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 链接信息数据结构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class NewsfeedMediaLinkInfo extends AlipayObject {

	private static final long serialVersionUID = 3194256698331589386L;

	/**
	 * 资源ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 资源的来源
	 */
	@ApiField("content_source")
	private String contentSource;

	/**
	 * 资源类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 链接的缩略图
	 */
	@ApiField("thumb")
	private String thumb;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * linkurl
	 */
	@ApiField("url")
	private String url;

	/**
	 * <p>Getter for the field <code>contentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContentId() {
		return this.contentId;
	}
	/**
	 * <p>Setter for the field <code>contentId</code>.</p>
	 *
	 * @param contentId a {@link java.lang.String} object.
	 */
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	/**
	 * <p>Getter for the field <code>contentSource</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContentSource() {
		return this.contentSource;
	}
	/**
	 * <p>Setter for the field <code>contentSource</code>.</p>
	 *
	 * @param contentSource a {@link java.lang.String} object.
	 */
	public void setContentSource(String contentSource) {
		this.contentSource = contentSource;
	}

	/**
	 * <p>Getter for the field <code>contentType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContentType() {
		return this.contentType;
	}
	/**
	 * <p>Setter for the field <code>contentType</code>.</p>
	 *
	 * @param contentType a {@link java.lang.String} object.
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
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
	 * <p>Getter for the field <code>thumb</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getThumb() {
		return this.thumb;
	}
	/**
	 * <p>Setter for the field <code>thumb</code>.</p>
	 *
	 * @param thumb a {@link java.lang.String} object.
	 */
	public void setThumb(String thumb) {
		this.thumb = thumb;
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
