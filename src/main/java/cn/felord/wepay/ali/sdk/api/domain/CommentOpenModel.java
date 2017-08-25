package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 批量查询评价接口返回对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CommentOpenModel extends AlipayObject {

	private static final long serialVersionUID = 7489866645773616366L;

	/**
	 * 口碑评价id
	 */
	@ApiField("comment_id")
	private String commentId;

	/**
	 * 评价发表时间
	 */
	@ApiField("comment_publish_time")
	private Date commentPublishTime;

	/**
	 * 评价内容，不超过2000字，不区分中英文
	 */
	@ApiField("content")
	private String content;

	/**
	 * 评价关联的手艺人id
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	/**
	 * 评价上传图片，一条评价最多9张图片
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 评价回复
	 */
	@ApiField("reply")
	private CommentReplyOpenModel reply;

	/**
	 * 评分，1-5分，1分最低，5分最高，均为整数
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 评价对应的门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * <p>Getter for the field <code>commentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommentId() {
		return this.commentId;
	}
	/**
	 * <p>Setter for the field <code>commentId</code>.</p>
	 *
	 * @param commentId a {@link java.lang.String} object.
	 */
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	/**
	 * <p>Getter for the field <code>commentPublishTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getCommentPublishTime() {
		return this.commentPublishTime;
	}
	/**
	 * <p>Setter for the field <code>commentPublishTime</code>.</p>
	 *
	 * @param commentPublishTime a {@link java.util.Date} object.
	 */
	public void setCommentPublishTime(Date commentPublishTime) {
		this.commentPublishTime = commentPublishTime;
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
	 * <p>Getter for the field <code>craftsmanId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCraftsmanId() {
		return this.craftsmanId;
	}
	/**
	 * <p>Setter for the field <code>craftsmanId</code>.</p>
	 *
	 * @param craftsmanId a {@link java.lang.String} object.
	 */
	public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}

	/**
	 * <p>Getter for the field <code>images</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getImages() {
		return this.images;
	}
	/**
	 * <p>Setter for the field <code>images</code>.</p>
	 *
	 * @param images a {@link java.util.List} object.
	 */
	public void setImages(List<String> images) {
		this.images = images;
	}

	/**
	 * <p>Getter for the field <code>reply</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.CommentReplyOpenModel} object.
	 */
	public CommentReplyOpenModel getReply() {
		return this.reply;
	}
	/**
	 * <p>Setter for the field <code>reply</code>.</p>
	 *
	 * @param reply a {@link cn.felord.wepay.ali.sdk.api.domain.CommentReplyOpenModel} object.
	 */
	public void setReply(CommentReplyOpenModel reply) {
		this.reply = reply;
	}

	/**
	 * <p>Getter for the field <code>score</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getScore() {
		return this.score;
	}
	/**
	 * <p>Setter for the field <code>score</code>.</p>
	 *
	 * @param score a {@link java.lang.Long} object.
	 */
	public void setScore(Long score) {
		this.score = score;
	}

	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
