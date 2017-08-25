package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 内容咨询类推荐文章列表
 *
 * @author auto create
 * @version $Id: $Id
 */
public class LifeRecommendArticles extends AlipayObject {

	private static final long serialVersionUID = 8487182517564558582L;

	/**
	 * 文章id
	 */
	@ApiField("article_id")
	private String articleId;

	/**
	 * 文章封面图片
	 */
	@ApiField("article_image")
	private String articleImage;

	/**
	 * 支付宝钱包的文章详情地址
	 */
	@ApiField("article_link")
	private String articleLink;

	/**
	 * 文章阅读数
	 */
	@ApiField("article_read_cnt")
	private String articleReadCnt;

	/**
	 * 文章来源
	 */
	@ApiField("article_source")
	private String articleSource;

	/**
	 * 文章的标题
	 */
	@ApiField("article_title")
	private String articleTitle;

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
	 * <p>Getter for the field <code>articleImage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArticleImage() {
		return this.articleImage;
	}
	/**
	 * <p>Setter for the field <code>articleImage</code>.</p>
	 *
	 * @param articleImage a {@link java.lang.String} object.
	 */
	public void setArticleImage(String articleImage) {
		this.articleImage = articleImage;
	}

	/**
	 * <p>Getter for the field <code>articleLink</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArticleLink() {
		return this.articleLink;
	}
	/**
	 * <p>Setter for the field <code>articleLink</code>.</p>
	 *
	 * @param articleLink a {@link java.lang.String} object.
	 */
	public void setArticleLink(String articleLink) {
		this.articleLink = articleLink;
	}

	/**
	 * <p>Getter for the field <code>articleReadCnt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArticleReadCnt() {
		return this.articleReadCnt;
	}
	/**
	 * <p>Setter for the field <code>articleReadCnt</code>.</p>
	 *
	 * @param articleReadCnt a {@link java.lang.String} object.
	 */
	public void setArticleReadCnt(String articleReadCnt) {
		this.articleReadCnt = articleReadCnt;
	}

	/**
	 * <p>Getter for the field <code>articleSource</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArticleSource() {
		return this.articleSource;
	}
	/**
	 * <p>Setter for the field <code>articleSource</code>.</p>
	 *
	 * @param articleSource a {@link java.lang.String} object.
	 */
	public void setArticleSource(String articleSource) {
		this.articleSource = articleSource;
	}

	/**
	 * <p>Getter for the field <code>articleTitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArticleTitle() {
		return this.articleTitle;
	}
	/**
	 * <p>Setter for the field <code>articleTitle</code>.</p>
	 *
	 * @param articleTitle a {@link java.lang.String} object.
	 */
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

}
