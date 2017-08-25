package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑商户人群组列表查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignCrowdBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3595621652859386265L;

	/**
	 * 人群名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 分页页码，从1开始计数,如果不填写默认为1
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 分页大小，每页显示的数目，如果不填写默认为20
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>pageNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageNumber() {
		return this.pageNumber;
	}
	/**
	 * <p>Setter for the field <code>pageNumber</code>.</p>
	 *
	 * @param pageNumber a {@link java.lang.String} object.
	 */
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
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
