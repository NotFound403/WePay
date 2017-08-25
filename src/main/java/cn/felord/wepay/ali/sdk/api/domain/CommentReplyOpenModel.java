package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 评价回复模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CommentReplyOpenModel extends AlipayObject {

	private static final long serialVersionUID = 4269355664916994497L;

	/**
	 * 回复内容，最多500字，不区分中英文
	 */
	@ApiField("content")
	private String content;

	/**
	 * 发表回复的操作员id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 回复发表时间
	 */
	@ApiField("reply_publish_time")
	private Date replyPublishTime;

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
	 * <p>Getter for the field <code>operatorId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	/**
	 * <p>Setter for the field <code>operatorId</code>.</p>
	 *
	 * @param operatorId a {@link java.lang.String} object.
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * <p>Getter for the field <code>replyPublishTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getReplyPublishTime() {
		return this.replyPublishTime;
	}
	/**
	 * <p>Setter for the field <code>replyPublishTime</code>.</p>
	 *
	 * @param replyPublishTime a {@link java.util.Date} object.
	 */
	public void setReplyPublishTime(Date replyPublishTime) {
		this.replyPublishTime = replyPublishTime;
	}

}
