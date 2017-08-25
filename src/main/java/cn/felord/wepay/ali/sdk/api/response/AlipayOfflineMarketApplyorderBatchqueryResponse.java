package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.BizOrderQueryResponse;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.applyorder.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketApplyorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3275813785156395785L;

	/** 
	 * 支付宝操作流水信息列表
	 */
	@ApiListField("biz_order_infos")
	@ApiField("biz_order_query_response")
	private List<BizOrderQueryResponse> bizOrderInfos;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private Long currentPageNo;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private Long totalPageNo;

	/**
	 * <p>Setter for the field <code>bizOrderInfos</code>.</p>
	 *
	 * @param bizOrderInfos a {@link java.util.List} object.
	 */
	public void setBizOrderInfos(List<BizOrderQueryResponse> bizOrderInfos) {
		this.bizOrderInfos = bizOrderInfos;
	}
	/**
	 * <p>Getter for the field <code>bizOrderInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<BizOrderQueryResponse> getBizOrderInfos( ) {
		return this.bizOrderInfos;
	}

	/**
	 * <p>Setter for the field <code>currentPageNo</code>.</p>
	 *
	 * @param currentPageNo a {@link java.lang.Long} object.
	 */
	public void setCurrentPageNo(Long currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	/**
	 * <p>Getter for the field <code>currentPageNo</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCurrentPageNo( ) {
		return this.currentPageNo;
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
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageSize( ) {
		return this.pageSize;
	}

	/**
	 * <p>Setter for the field <code>totalItems</code>.</p>
	 *
	 * @param totalItems a {@link java.lang.Long} object.
	 */
	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	/**
	 * <p>Getter for the field <code>totalItems</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalItems( ) {
		return this.totalItems;
	}

	/**
	 * <p>Setter for the field <code>totalPageNo</code>.</p>
	 *
	 * @param totalPageNo a {@link java.lang.Long} object.
	 */
	public void setTotalPageNo(Long totalPageNo) {
		this.totalPageNo = totalPageNo;
	}
	/**
	 * <p>Getter for the field <code>totalPageNo</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalPageNo( ) {
		return this.totalPageNo;
	}

}
