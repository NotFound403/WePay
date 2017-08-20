package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ExtItem;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-06 10:48:09
 */
public class KoubeiItemExtitemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2879974585137275312L;

	/** 
	 * 商品信息列表
	 */
	@ApiListField("model_list")
	@ApiField("ext_item")
	private List<ExtItem> modelList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setModelList(List<ExtItem> modelList) {
		this.modelList = modelList;
	}
	public List<ExtItem> getModelList( ) {
		return this.modelList;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
