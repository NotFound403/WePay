package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 渠道查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertCommissionChannelBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1327926234962862598L;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * <p>Getter for the field <code>pageIndex</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageIndex() {
		return this.pageIndex;
	}
	/**
	 * <p>Setter for the field <code>pageIndex</code>.</p>
	 *
	 * @param pageIndex a {@link java.lang.String} object.
	 */
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.String} object.
	 */
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
