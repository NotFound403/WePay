package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ShopSummaryQueryResponse;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.summary.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopSummaryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6468549388812923218L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private String currentPageNo;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 支付宝门店摘要信息列表
	 */
	@ApiListField("shop_summary_infos")
	@ApiField("shop_summary_query_response")
	private List<ShopSummaryQueryResponse> shopSummaryInfos;

	/** 
	 * 总记录数
	 */
	@ApiField("total_items")
	private String totalItems;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private String totalPageNo;

	/**
	 * <p>Setter for the field <code>currentPageNo</code>.</p>
	 *
	 * @param currentPageNo a {@link java.lang.String} object.
	 */
	public void setCurrentPageNo(String currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	/**
	 * <p>Getter for the field <code>currentPageNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrentPageNo( ) {
		return this.currentPageNo;
	}

	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.String} object.
	 */
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageSize( ) {
		return this.pageSize;
	}

	/**
	 * <p>Setter for the field <code>shopSummaryInfos</code>.</p>
	 *
	 * @param shopSummaryInfos a {@link java.util.List} object.
	 */
	public void setShopSummaryInfos(List<ShopSummaryQueryResponse> shopSummaryInfos) {
		this.shopSummaryInfos = shopSummaryInfos;
	}
	/**
	 * <p>Getter for the field <code>shopSummaryInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ShopSummaryQueryResponse> getShopSummaryInfos( ) {
		return this.shopSummaryInfos;
	}

	/**
	 * <p>Setter for the field <code>totalItems</code>.</p>
	 *
	 * @param totalItems a {@link java.lang.String} object.
	 */
	public void setTotalItems(String totalItems) {
		this.totalItems = totalItems;
	}
	/**
	 * <p>Getter for the field <code>totalItems</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalItems( ) {
		return this.totalItems;
	}

	/**
	 * <p>Setter for the field <code>totalPageNo</code>.</p>
	 *
	 * @param totalPageNo a {@link java.lang.String} object.
	 */
	public void setTotalPageNo(String totalPageNo) {
		this.totalPageNo = totalPageNo;
	}
	/**
	 * <p>Getter for the field <code>totalPageNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalPageNo( ) {
		return this.totalPageNo;
	}

}
