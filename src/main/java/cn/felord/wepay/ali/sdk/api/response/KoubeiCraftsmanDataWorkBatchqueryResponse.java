package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CraftsmanWorkOpenModel;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.craftsman.data.work.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiCraftsmanDataWorkBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7575513915583936372L;

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
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private Long totalPageNo;

	/** 
	 * 总共手艺人作品数目
	 */
	@ApiField("total_works")
	private Long totalWorks;

	/** 
	 * 作品信息列表
	 */
	@ApiListField("works")
	@ApiField("craftsman_work_open_model")
	private List<CraftsmanWorkOpenModel> works;

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

	/**
	 * <p>Setter for the field <code>totalWorks</code>.</p>
	 *
	 * @param totalWorks a {@link java.lang.Long} object.
	 */
	public void setTotalWorks(Long totalWorks) {
		this.totalWorks = totalWorks;
	}
	/**
	 * <p>Getter for the field <code>totalWorks</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalWorks( ) {
		return this.totalWorks;
	}

	/**
	 * <p>Setter for the field <code>works</code>.</p>
	 *
	 * @param works a {@link java.util.List} object.
	 */
	public void setWorks(List<CraftsmanWorkOpenModel> works) {
		this.works = works;
	}
	/**
	 * <p>Getter for the field <code>works</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CraftsmanWorkOpenModel> getWorks( ) {
		return this.works;
	}

}
