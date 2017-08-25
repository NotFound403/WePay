package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CPCommunitySet;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.community.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeCommunityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2292692797521666464L;

	/** 
	 * 若查询到符合条件的小区，返回物业小区摘要信息列表
	 */
	@ApiListField("community_list")
	@ApiField("c_p_community_set")
	private List<CPCommunitySet> communityList;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_num")
	private Long currentPageNum;

	/** 
	 * 开发者帮助物业创建成功并符合查询条件的小区总数。
若不传入app_auth_token参数，则返回开发者代创建成功的所有小区总数。
若传入app_auth_token参数，则返回对应开发者帮助该授权物业公司创建成功的小区总数。
	 */
	@ApiField("total_community_count")
	private Long totalCommunityCount;

	/**
	 * <p>Setter for the field <code>communityList</code>.</p>
	 *
	 * @param communityList a {@link java.util.List} object.
	 */
	public void setCommunityList(List<CPCommunitySet> communityList) {
		this.communityList = communityList;
	}
	/**
	 * <p>Getter for the field <code>communityList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CPCommunitySet> getCommunityList( ) {
		return this.communityList;
	}

	/**
	 * <p>Setter for the field <code>currentPageNum</code>.</p>
	 *
	 * @param currentPageNum a {@link java.lang.Long} object.
	 */
	public void setCurrentPageNum(Long currentPageNum) {
		this.currentPageNum = currentPageNum;
	}
	/**
	 * <p>Getter for the field <code>currentPageNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCurrentPageNum( ) {
		return this.currentPageNum;
	}

	/**
	 * <p>Setter for the field <code>totalCommunityCount</code>.</p>
	 *
	 * @param totalCommunityCount a {@link java.lang.Long} object.
	 */
	public void setTotalCommunityCount(Long totalCommunityCount) {
		this.totalCommunityCount = totalCommunityCount;
	}
	/**
	 * <p>Getter for the field <code>totalCommunityCount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalCommunityCount( ) {
		return this.totalCommunityCount;
	}

}
