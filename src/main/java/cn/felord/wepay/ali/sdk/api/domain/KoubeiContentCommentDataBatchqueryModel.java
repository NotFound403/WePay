package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 交易评价批量查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiContentCommentDataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3219232339357566243L;

	/**
	 * 口碑评价id，如果传入评价id则会忽略其他参数。 （口碑评价id、口碑门店id、口碑手艺人id不能同时为空）
	 */
	@ApiField("comment_id")
	private String commentId;

	/**
	 * 口碑手艺人id，可通过 koubei.craftsman.data.provider.batchquery 批量查询手艺人信息接口查询。（口碑评价id、口碑门店id、口碑手艺人id不能同时为空）
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	/**
	 * 前次查询的最后一条评价id，用于做分页查询的游标。查询时，需要指定从哪一条评价开始往后取，如果上一次该值传空，则从第一页从头取。
	 */
	@ApiField("last_comment_id")
	private String lastCommentId;

	/**
	 * 每页的条数，最大20条，不传会报错
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 口碑门店id，如果传入口碑门店id则会忽略手艺人id。（口碑评价id、口碑门店id、口碑手艺人id不能同时为空）
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
	 * <p>Getter for the field <code>lastCommentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLastCommentId() {
		return this.lastCommentId;
	}
	/**
	 * <p>Setter for the field <code>lastCommentId</code>.</p>
	 *
	 * @param lastCommentId a {@link java.lang.String} object.
	 */
	public void setLastCommentId(String lastCommentId) {
		this.lastCommentId = lastCommentId;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.Long} object.
	 */
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
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
