package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 分页查询评论信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMerchantshopCommentBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2747766123975254188L;

	/**
	 * 当前页号（从1开始）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页数量，每页不超过100条。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private Long shopId;

	/**
	 * <p>Getter for the field <code>pageNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageNum() {
		return this.pageNum;
	}
	/**
	 * <p>Setter for the field <code>pageNum</code>.</p>
	 *
	 * @param pageNum a {@link java.lang.Long} object.
	 */
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
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

}
