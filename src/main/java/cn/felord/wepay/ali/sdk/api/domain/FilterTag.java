package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 自定义报表过滤标签
 *
 * @author auto create
 * @version $Id: $Id
 */
public class FilterTag extends AlipayObject {

	private static final long serialVersionUID = 2813529333733451343L;

	/**
	 * 过滤条件的标签code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 分组过滤条件
注意：这个是JSON数组，必须以[开头，以]结尾，[]外层不能加双引号"",正确案例[{"operate": "EQ","value": "1" }]，错误案例："[{"operate": "EQ","value": "1" }]"
	 */
	@ApiField("filter_items")
	private String filterItems;

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Getter for the field <code>filterItems</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFilterItems() {
		return this.filterItems;
	}
	/**
	 * <p>Setter for the field <code>filterItems</code>.</p>
	 *
	 * @param filterItems a {@link java.lang.String} object.
	 */
	public void setFilterItems(String filterItems) {
		this.filterItems = filterItems;
	}

}
