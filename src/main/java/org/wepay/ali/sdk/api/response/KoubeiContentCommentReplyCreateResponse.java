package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.comment.reply.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-14 22:26:53
 */
public class KoubeiContentCommentReplyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2321773849616255557L;

	/** 
	 * 口碑评价id，即入参中的comment_id，后续可用于回复内容的增删改查
	 */
	@ApiField("comment_id")
	private String commentId;

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getCommentId( ) {
		return this.commentId;
	}

}
