package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 洗车保养评论统计信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MerchantshopCommentStatistic extends AlipayObject {

	private static final long serialVersionUID = 5275941599295144152L;

	/**
	 * 评论总数
	 */
	@ApiField("comment_count")
	private Long commentCount;

	/**
	 * 评分（平均分），两位小数
	 */
	@ApiField("score")
	private Long score;

	/**
	 * <p>Getter for the field <code>commentCount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCommentCount() {
		return this.commentCount;
	}
	/**
	 * <p>Setter for the field <code>commentCount</code>.</p>
	 *
	 * @param commentCount a {@link java.lang.Long} object.
	 */
	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
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

}
