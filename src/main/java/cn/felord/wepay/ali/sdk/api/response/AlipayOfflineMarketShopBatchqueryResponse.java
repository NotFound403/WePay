package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5668169881621728465L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_pageno")
	private String currentPageno;

	/** 
	 * 门店列表ID，逗号分隔
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_pageno")
	private String totalPageno;

	/**
	 * <p>Setter for the field <code>currentPageno</code>.</p>
	 *
	 * @param currentPageno a {@link java.lang.String} object.
	 */
	public void setCurrentPageno(String currentPageno) {
		this.currentPageno = currentPageno;
	}
	/**
	 * <p>Getter for the field <code>currentPageno</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrentPageno( ) {
		return this.currentPageno;
	}

	/**
	 * <p>Setter for the field <code>shopIds</code>.</p>
	 *
	 * @param shopIds a {@link java.util.List} object.
	 */
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}
	/**
	 * <p>Getter for the field <code>shopIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getShopIds( ) {
		return this.shopIds;
	}

	/**
	 * <p>Setter for the field <code>totalPageno</code>.</p>
	 *
	 * @param totalPageno a {@link java.lang.String} object.
	 */
	public void setTotalPageno(String totalPageno) {
		this.totalPageno = totalPageno;
	}
	/**
	 * <p>Getter for the field <code>totalPageno</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalPageno( ) {
		return this.totalPageno;
	}

}
