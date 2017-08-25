package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ShopQueryInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.merchant.storelist.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntMerchantExpandMerchantStorelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2817358989781235127L;

	/** 
	 * 商户门店列表
	 */
	@ApiListField("merchant_stores")
	@ApiField("shop_query_info")
	private List<ShopQueryInfo> merchantStores;

	/** 
	 * 当前页码,页码从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	/**
	 * <p>Setter for the field <code>merchantStores</code>.</p>
	 *
	 * @param merchantStores a {@link java.util.List} object.
	 */
	public void setMerchantStores(List<ShopQueryInfo> merchantStores) {
		this.merchantStores = merchantStores;
	}
	/**
	 * <p>Getter for the field <code>merchantStores</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ShopQueryInfo> getMerchantStores( ) {
		return this.merchantStores;
	}

	/**
	 * <p>Setter for the field <code>pageNum</code>.</p>
	 *
	 * @param pageNum a {@link java.lang.Long} object.
	 */
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	/**
	 * <p>Getter for the field <code>pageNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageNum( ) {
		return this.pageNum;
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
	 * <p>Setter for the field <code>totalSize</code>.</p>
	 *
	 * @param totalSize a {@link java.lang.Long} object.
	 */
	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	/**
	 * <p>Getter for the field <code>totalSize</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
