package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.VoucherTemplateLiteInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.templatelist.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingVoucherTemplatelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6647192412594495992L;

	/** 
	 * 当前页码,页码从1开始
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页条数
	 */
	@ApiField("items_per_page")
	private Long itemsPerPage;

	/** 
	 * 总条数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 券模板列表
	 */
	@ApiListField("voucher_templates")
	@ApiField("voucher_template_lite_info")
	private List<VoucherTemplateLiteInfo> voucherTemplates;

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
	 * <p>Setter for the field <code>itemsPerPage</code>.</p>
	 *
	 * @param itemsPerPage a {@link java.lang.Long} object.
	 */
	public void setItemsPerPage(Long itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}
	/**
	 * <p>Getter for the field <code>itemsPerPage</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getItemsPerPage( ) {
		return this.itemsPerPage;
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
	 * <p>Setter for the field <code>totalPages</code>.</p>
	 *
	 * @param totalPages a {@link java.lang.Long} object.
	 */
	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	/**
	 * <p>Getter for the field <code>totalPages</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	/**
	 * <p>Setter for the field <code>voucherTemplates</code>.</p>
	 *
	 * @param voucherTemplates a {@link java.util.List} object.
	 */
	public void setVoucherTemplates(List<VoucherTemplateLiteInfo> voucherTemplates) {
		this.voucherTemplates = voucherTemplates;
	}
	/**
	 * <p>Getter for the field <code>voucherTemplates</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<VoucherTemplateLiteInfo> getVoucherTemplates( ) {
		return this.voucherTemplates;
	}

}
