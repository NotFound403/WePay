package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.product.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketProductBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3181639516189815483L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_pageno")
	private Long currentPageno;

	/** 
	 * 商品列表ID，逗号分隔
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/** 
	 * 总页码数
	 */
	@ApiField("total_pageno")
	private Long totalPageno;

	/**
	 * <p>Setter for the field <code>currentPageno</code>.</p>
	 *
	 * @param currentPageno a {@link java.lang.Long} object.
	 */
	public void setCurrentPageno(Long currentPageno) {
		this.currentPageno = currentPageno;
	}
	/**
	 * <p>Getter for the field <code>currentPageno</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCurrentPageno( ) {
		return this.currentPageno;
	}

	/**
	 * <p>Setter for the field <code>itemIds</code>.</p>
	 *
	 * @param itemIds a {@link java.util.List} object.
	 */
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}
	/**
	 * <p>Getter for the field <code>itemIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getItemIds( ) {
		return this.itemIds;
	}

	/**
	 * <p>Setter for the field <code>totalPageno</code>.</p>
	 *
	 * @param totalPageno a {@link java.lang.Long} object.
	 */
	public void setTotalPageno(Long totalPageno) {
		this.totalPageno = totalPageno;
	}
	/**
	 * <p>Getter for the field <code>totalPageno</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalPageno( ) {
		return this.totalPageno;
	}

}
