package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CashCampaignInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cash.list.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignCashListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4298678993239427386L;

	/** 
	 * 活动列表
	 */
	@ApiListField("camp_list")
	@ApiField("cash_campaign_info")
	private List<CashCampaignInfo> campList;

	/** 
	 * 分页的页码,起始从1开始
	 */
	@ApiField("page_index")
	private String pageIndex;

	/** 
	 * 分页每页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 活动总个数
	 */
	@ApiField("total_size")
	private String totalSize;

	/**
	 * <p>Setter for the field <code>campList</code>.</p>
	 *
	 * @param campList a {@link java.util.List} object.
	 */
	public void setCampList(List<CashCampaignInfo> campList) {
		this.campList = campList;
	}
	/**
	 * <p>Getter for the field <code>campList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CashCampaignInfo> getCampList( ) {
		return this.campList;
	}

	/**
	 * <p>Setter for the field <code>pageIndex</code>.</p>
	 *
	 * @param pageIndex a {@link java.lang.String} object.
	 */
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}
	/**
	 * <p>Getter for the field <code>pageIndex</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageIndex( ) {
		return this.pageIndex;
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
	 * <p>Setter for the field <code>totalSize</code>.</p>
	 *
	 * @param totalSize a {@link java.lang.String} object.
	 */
	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	/**
	 * <p>Getter for the field <code>totalSize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
