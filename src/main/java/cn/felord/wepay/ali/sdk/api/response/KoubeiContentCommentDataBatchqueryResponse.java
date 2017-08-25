package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CommentOpenModel;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.comment.data.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiContentCommentDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2612511954193647153L;

	/** 
	 * 评价结果列表
	 */
	@ApiListField("comments")
	@ApiField("comment_open_model")
	private List<CommentOpenModel> comments;

	/** 
	 * 当前查询条件下评价总数
	 */
	@ApiField("count")
	private Long count;

	/**
	 * <p>Setter for the field <code>comments</code>.</p>
	 *
	 * @param comments a {@link java.util.List} object.
	 */
	public void setComments(List<CommentOpenModel> comments) {
		this.comments = comments;
	}
	/**
	 * <p>Getter for the field <code>comments</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CommentOpenModel> getComments( ) {
		return this.comments;
	}

	/**
	 * <p>Setter for the field <code>count</code>.</p>
	 *
	 * @param count a {@link java.lang.Long} object.
	 */
	public void setCount(Long count) {
		this.count = count;
	}
	/**
	 * <p>Getter for the field <code>count</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCount( ) {
		return this.count;
	}

}
