package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 报表列表查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataAlisisReportBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5615635497316591111L;

	/**
	 * 当前页码
	 */
	@ApiField("page")
	private String page;

	/**
	 * 每页最大条数，最大为30
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
