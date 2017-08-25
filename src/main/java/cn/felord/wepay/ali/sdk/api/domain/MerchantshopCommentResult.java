package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 洗车保养评论
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MerchantshopCommentResult extends AlipayObject {

	private static final long serialVersionUID = 8156484113593359612L;

	/**
	 * 评论内容
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 评论时间格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("comment_time")
	private String commentTime;

	/**
	 * 评论用户的头像url，记录用户评价时头像完整路径
	 */
	@ApiField("face")
	private String face;

	/**
	 * 评论晒图，多个逗号分隔。使用车主平台接口上传图片地址。
	 */
	@ApiField("imgs")
	private String imgs;

	/**
	 * 评论用户的昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 车主平台订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 回复内容
	 */
	@ApiField("reply")
	private String reply;

	/**
	 * 回复时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("reply_time")
	private String replyTime;

	/**
	 * 评分， 两位小数
	 */
	@ApiField("score")
	private String score;

	/**
	 * 车主平台门店编码
	 */
	@ApiField("shop_id")
	private Long shopId;

	/**
	 * 评论用户支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 评论的用户名称，敏感数据脱敏处理。
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * <p>Getter for the field <code>comment</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getComment() {
		return this.comment;
	}
	/**
	 * <p>Setter for the field <code>comment</code>.</p>
	 *
	 * @param comment a {@link java.lang.String} object.
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * <p>Getter for the field <code>commentTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommentTime() {
		return this.commentTime;
	}
	/**
	 * <p>Setter for the field <code>commentTime</code>.</p>
	 *
	 * @param commentTime a {@link java.lang.String} object.
	 */
	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}

	/**
	 * <p>Getter for the field <code>face</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFace() {
		return this.face;
	}
	/**
	 * <p>Setter for the field <code>face</code>.</p>
	 *
	 * @param face a {@link java.lang.String} object.
	 */
	public void setFace(String face) {
		this.face = face;
	}

	/**
	 * <p>Getter for the field <code>imgs</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImgs() {
		return this.imgs;
	}
	/**
	 * <p>Setter for the field <code>imgs</code>.</p>
	 *
	 * @param imgs a {@link java.lang.String} object.
	 */
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}

	/**
	 * <p>Getter for the field <code>nickName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNickName() {
		return this.nickName;
	}
	/**
	 * <p>Setter for the field <code>nickName</code>.</p>
	 *
	 * @param nickName a {@link java.lang.String} object.
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo() {
		return this.orderNo;
	}
	/**
	 * <p>Setter for the field <code>orderNo</code>.</p>
	 *
	 * @param orderNo a {@link java.lang.String} object.
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * <p>Getter for the field <code>reply</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReply() {
		return this.reply;
	}
	/**
	 * <p>Setter for the field <code>reply</code>.</p>
	 *
	 * @param reply a {@link java.lang.String} object.
	 */
	public void setReply(String reply) {
		this.reply = reply;
	}

	/**
	 * <p>Getter for the field <code>replyTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReplyTime() {
		return this.replyTime;
	}
	/**
	 * <p>Setter for the field <code>replyTime</code>.</p>
	 *
	 * @param replyTime a {@link java.lang.String} object.
	 */
	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}

	/**
	 * <p>Getter for the field <code>score</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getScore() {
		return this.score;
	}
	/**
	 * <p>Setter for the field <code>score</code>.</p>
	 *
	 * @param score a {@link java.lang.String} object.
	 */
	public void setScore(String score) {
		this.score = score;
	}

	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.Long} object.
	 */
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * <p>Getter for the field <code>userName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * <p>Setter for the field <code>userName</code>.</p>
	 *
	 * @param userName a {@link java.lang.String} object.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
