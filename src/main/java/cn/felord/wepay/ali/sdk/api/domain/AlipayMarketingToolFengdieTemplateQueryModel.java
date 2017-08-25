package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询当前用户可用的模板列表
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingToolFengdieTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4721762517854663978L;

	/**
	 * 当前页数，默认为1
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 每页记录数，不能超过50，默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * <p>Getter for the field <code>pageNumber</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageNumber() {
		return this.pageNumber;
	}
	/**
	 * <p>Setter for the field <code>pageNumber</code>.</p>
	 *
	 * @param pageNumber a {@link java.lang.Long} object.
	 */
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.Long} object.
	 */
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
