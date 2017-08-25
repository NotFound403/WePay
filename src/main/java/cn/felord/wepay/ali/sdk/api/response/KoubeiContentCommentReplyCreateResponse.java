package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.comment.reply.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiContentCommentReplyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2321773849616255557L;

	/** 
	 * 口碑评价id，即入参中的comment_id，后续可用于回复内容的增删改查
	 */
	@ApiField("comment_id")
	private String commentId;

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

}
