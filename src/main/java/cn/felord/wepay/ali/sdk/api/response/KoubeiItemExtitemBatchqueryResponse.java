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
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>modelList</code>.</p>
	 *
	 * @param modelList a {@link java.util.List} object.
	 */
	public void setModelList(List<ExtItem> modelList) {
		this.modelList = modelList;
	}
	/**
	 * <p>Getter for the field <code>modelList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ExtItem> getModelList( ) {
		return this.modelList;
	}

	/**
	 * <p>Setter for the field <code>pageNum</code>.</p>
	 *
	 * @param pageNum a {@link java.lang.String} object.
	 */
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	/**
	 * <p>Getter for the field <code>pageNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageNum( ) {
		return this.pageNum;
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
