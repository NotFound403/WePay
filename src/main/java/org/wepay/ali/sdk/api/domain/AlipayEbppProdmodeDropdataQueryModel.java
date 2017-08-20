package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 业务下拉列表API
 *
 * @author auto create
 * @since 1.0, 2017-06-22 16:17:29
 */
public class AlipayEbppProdmodeDropdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7752933326617534779L;

	/**
	 * 参数为：缴费业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 参数包含：业务类型、子业务类型、产品模式等
	 */
	@ApiField("search_type")
	private String searchType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getSearchType() {
		return this.searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

}
