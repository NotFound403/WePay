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
 * @since 1.0, 2017-06-20 21:12:59
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

	public void setMerchantStores(List<ShopQueryInfo> merchantStores) {
		this.merchantStores = merchantStores;
	}
	public List<ShopQueryInfo> getMerchantStores( ) {
		return this.merchantStores;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
