package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 业务下拉列表API
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>searchType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSearchType() {
		return this.searchType;
	}
	/**
	 * <p>Setter for the field <code>searchType</code>.</p>
	 *
	 * @param searchType a {@link java.lang.String} object.
	 */
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

}
