package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.YLBTransDetailInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.yulibao.trans.history.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankFinanceYulibaoTransHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3774333317168281852L;

	/** 
	 * 历史交易记录查询的当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 当前查询是否具有下一页的数据，true-有，fasle-没有
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 历史交易详情信息
	 */
	@ApiListField("history_trans_detail_infos")
	@ApiField("y_l_b_trans_detail_info")
	private List<YLBTransDetailInfo> historyTransDetailInfos;

	/** 
	 * 当前查询在不分页情况下的数据总数
	 */
	@ApiField("total_item_count")
	private String totalItemCount;

	/**
	 * <p>Setter for the field <code>currentPage</code>.</p>
	 *
	 * @param currentPage a {@link java.lang.Long} object.
	 */
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	/**
	 * <p>Getter for the field <code>currentPage</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	/**
	 * <p>Setter for the field <code>hasNextPage</code>.</p>
	 *
	 * @param hasNextPage a {@link java.lang.Boolean} object.
	 */
	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	/**
	 * <p>Getter for the field <code>hasNextPage</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

	/**
	 * <p>Setter for the field <code>historyTransDetailInfos</code>.</p>
	 *
	 * @param historyTransDetailInfos a {@link java.util.List} object.
	 */
	public void setHistoryTransDetailInfos(List<YLBTransDetailInfo> historyTransDetailInfos) {
		this.historyTransDetailInfos = historyTransDetailInfos;
	}
	/**
	 * <p>Getter for the field <code>historyTransDetailInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<YLBTransDetailInfo> getHistoryTransDetailInfos( ) {
		return this.historyTransDetailInfos;
	}

	/**
	 * <p>Setter for the field <code>totalItemCount</code>.</p>
	 *
	 * @param totalItemCount a {@link java.lang.String} object.
	 */
	public void setTotalItemCount(String totalItemCount) {
		this.totalItemCount = totalItemCount;
	}
	/**
	 * <p>Getter for the field <code>totalItemCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalItemCount( ) {
		return this.totalItemCount;
	}

}
