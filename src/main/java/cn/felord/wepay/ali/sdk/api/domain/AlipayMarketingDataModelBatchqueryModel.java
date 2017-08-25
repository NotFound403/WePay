package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 分页查询模型列表接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingDataModelBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3362364948998348477L;

	/**
	 * 当前页面。输入参数值为模型页数，一页最多30条；用于查询模型清单
	 */
	@ApiField("page")
	private String page;

	/**
	 * 每页最大条数。输入参数值为模型页面展现条数，最多展现30条；用于查询模型清单条数
	 */
	@ApiField("size")
	private String size;

	/**
	 * <p>Getter for the field <code>page</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPage() {
		return this.page;
	}
	/**
	 * <p>Setter for the field <code>page</code>.</p>
	 *
	 * @param page a {@link java.lang.String} object.
	 */
	public void setPage(String page) {
		this.page = page;
	}

	/**
	 * <p>Getter for the field <code>size</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSize() {
		return this.size;
	}
	/**
	 * <p>Setter for the field <code>size</code>.</p>
	 *
	 * @param size a {@link java.lang.String} object.
	 */
	public void setSize(String size) {
		this.size = size;
	}

}
