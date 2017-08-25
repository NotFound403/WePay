package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.mcomment.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketMcommentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4126689699768343672L;

	/** 
	 * 本次交易号对应的评价在支付宝的唯一标识.评价id
【注意】当仅评论信息状态为：已评论【comment_status='HASCOMMENT'】，才会返回该值
	 */
	@ApiField("comment_id")
	private String commentId;

	/** 
	 * 注意：该字段描述评论状态。目前该字段区分2种类型状态
当comment_status='NOCOMMENT' 标识该笔交易未发生过评论。
当comment_status='HASCOMMENT' 标识该笔交易已经评论。评论状态正常
当comment_status='DELETED'标识该笔交易曾经评论过，当前时间点，该评论已经删除
	 */
	@ApiField("comment_status")
	private String commentStatus;

	/** 
	 * 评价时间
【注意】当仅评论信息状态为：已评论【comment_status='HASCOMMENT'】，才会返回该值
	 */
	@ApiField("comment_time")
	private Date commentTime;

	/** 
	 * 评价星级
【注意】当仅评论信息状态为：已评论【comment_status='HASCOMMENT'】，才会返回该值
	 */
	@ApiField("score")
	private Long score;

	/**
	 * <p>Setter for the field <code>commentId</code>.</p>
	 *
	 * @param commentId a {@link java.lang.String} object.
	 */
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	/**
	 * <p>Getter for the field <code>commentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommentId( ) {
		return this.commentId;
	}

	/**
	 * <p>Setter for the field <code>commentStatus</code>.</p>
	 *
	 * @param commentStatus a {@link java.lang.String} object.
	 */
	public void setCommentStatus(String commentStatus) {
		this.commentStatus = commentStatus;
	}
	/**
	 * <p>Getter for the field <code>commentStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommentStatus( ) {
		return this.commentStatus;
	}

	/**
	 * <p>Setter for the field <code>commentTime</code>.</p>
	 *
	 * @param commentTime a {@link java.util.Date} object.
	 */
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	/**
	 * <p>Getter for the field <code>commentTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getCommentTime( ) {
		return this.commentTime;
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
	 * <p>Getter for the field <code>score</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getScore( ) {
		return this.score;
	}

}
