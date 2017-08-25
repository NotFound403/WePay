package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 评价回复接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiContentCommentReplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3853351666294442927L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为接口koubei.member.data.oauth.query（口碑业务授权令牌查询）中的auth_code，默认有效期24小时；isv自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 口碑评价id 可通过koubei.content.comment.data.batchquery接口查询
	 */
	@ApiField("comment_id")
	private String commentId;

	/**
	 * 评价回复内容，回复的内容不超过500字，不区分中英文
	 */
	@ApiField("content")
	private String content;

	/**
	 * <p>Getter for the field <code>authCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthCode() {
		return this.authCode;
	}
	/**
	 * <p>Setter for the field <code>authCode</code>.</p>
	 *
	 * @param authCode a {@link java.lang.String} object.
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

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

}
