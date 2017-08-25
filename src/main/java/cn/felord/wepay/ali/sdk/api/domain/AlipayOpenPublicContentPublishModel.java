package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 生活号素材内容落库接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicContentPublishModel extends AlipayObject {

	private static final long serialVersionUID = 4428345787445152777L;

	/**
	 * action_url 文章地址url，用于文章列表显示，用户点击后的跳转地址。
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * article_id 为调用方的文章id，用于生活号对输入的文章进行去重检测
	 */
	@ApiField("article_id")
	private String articleId;

	/**
	 * content 为写文章完整的正文文本内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * cover_img 用于内容在文章列表中展示时的配图
	 */
	@ApiField("cover_img")
	private String coverImg;

	/**
	 * desc 用于描述文章简介
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * endTime 用于描述文章内容有效截止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * source 用于描述调用接口的业务方
	 */
	@ApiField("source")
	private String source;

	/**
	 * title 用于描述文章标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * <p>Getter for the field <code>actionUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionUrl() {
		return this.actionUrl;
	}
	/**
	 * <p>Setter for the field <code>actionUrl</code>.</p>
	 *
	 * @param actionUrl a {@link java.lang.String} object.
	 */
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	/**
	 * <p>Getter for the field <code>articleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArticleId() {
		return this.articleId;
	}
	/**
	 * <p>Setter for the field <code>articleId</code>.</p>
	 *
	 * @param articleId a {@link java.lang.String} object.
	 */
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	/**
	 * <p>Getter for the field <code>content</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * <p>Setter for the field <code>content</code>.</p>
	 *
	 * @param content a {@link java.lang.String} object.
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * <p>Getter for the field <code>coverImg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCoverImg() {
		return this.coverImg;
	}
	/**
	 * <p>Setter for the field <code>coverImg</code>.</p>
	 *
	 * @param coverImg a {@link java.lang.String} object.
	 */
	public void setCoverImg(String coverImg) {
		this.coverImg = coverImg;
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
	 * <p>Getter for the field <code>endTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEndTime() {
		return this.endTime;
	}
	/**
	 * <p>Setter for the field <code>endTime</code>.</p>
	 *
	 * @param endTime a {@link java.util.Date} object.
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * <p>Getter for the field <code>source</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSource() {
		return this.source;
	}
	/**
	 * <p>Setter for the field <code>source</code>.</p>
	 *
	 * @param source a {@link java.lang.String} object.
	 */
	public void setSource(String source) {
		this.source = source;
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

}
