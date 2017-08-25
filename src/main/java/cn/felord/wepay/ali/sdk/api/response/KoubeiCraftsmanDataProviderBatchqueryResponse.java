package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CraftsmanOpenModel;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.craftsman.data.provider.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiCraftsmanDataProviderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1294386758927644141L;

	/** 
	 * craftsmans:手艺人信息
	 */
	@ApiListField("craftsmans")
	@ApiField("craftsman_open_model")
	private List<CraftsmanOpenModel> craftsmans;

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
	 * 门店下共手艺人数目
	 */
	@ApiField("total_craftsmans")
	private Long totalCraftsmans;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private Long totalPageNo;

	/**
	 * <p>Setter for the field <code>craftsmans</code>.</p>
	 *
	 * @param craftsmans a {@link java.util.List} object.
	 */
	public void setCraftsmans(List<CraftsmanOpenModel> craftsmans) {
		this.craftsmans = craftsmans;
	}
	/**
	 * <p>Getter for the field <code>craftsmans</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CraftsmanOpenModel> getCraftsmans( ) {
		return this.craftsmans;
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
	 * <p>Setter for the field <code>totalCraftsmans</code>.</p>
	 *
	 * @param totalCraftsmans a {@link java.lang.Long} object.
	 */
	public void setTotalCraftsmans(Long totalCraftsmans) {
		this.totalCraftsmans = totalCraftsmans;
	}
	/**
	 * <p>Getter for the field <code>totalCraftsmans</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalCraftsmans( ) {
		return this.totalCraftsmans;
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
