package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 自定义数据报表数据查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataCustomreportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8271552766568244283L;

	/**
	 * 规则KEY
	 */
	@ApiField("condition_key")
	private String conditionKey;

	/**
	 * 额外增加的查询过滤条件
	 */
	@ApiListField("filter_tags")
	@ApiField("filter_tag")
	private List<FilterTag> filterTags;

	/**
	 * 一次拉多少条
	 */
	@ApiField("max_count")
	private String maxCount;

	/**
	 * <p>Getter for the field <code>conditionKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConditionKey() {
		return this.conditionKey;
	}
	/**
	 * <p>Setter for the field <code>conditionKey</code>.</p>
	 *
	 * @param conditionKey a {@link java.lang.String} object.
	 */
	public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}

	/**
	 * <p>Getter for the field <code>filterTags</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<FilterTag> getFilterTags() {
		return this.filterTags;
	}
	/**
	 * <p>Setter for the field <code>filterTags</code>.</p>
	 *
	 * @param filterTags a {@link java.util.List} object.
	 */
	public void setFilterTags(List<FilterTag> filterTags) {
		this.filterTags = filterTags;
	}

	/**
	 * <p>Getter for the field <code>maxCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMaxCount() {
		return this.maxCount;
	}
	/**
	 * <p>Setter for the field <code>maxCount</code>.</p>
	 *
	 * @param maxCount a {@link java.lang.String} object.
	 */
	public void setMaxCount(String maxCount) {
		this.maxCount = maxCount;
	}

}
