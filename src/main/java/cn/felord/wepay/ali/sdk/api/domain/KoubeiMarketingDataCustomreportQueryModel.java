package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 自定义数据报表数据查询接口
 *
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:51
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

	public String getConditionKey() {
		return this.conditionKey;
	}
	public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}

	public List<FilterTag> getFilterTags() {
		return this.filterTags;
	}
	public void setFilterTags(List<FilterTag> filterTags) {
		this.filterTags = filterTags;
	}

	public String getMaxCount() {
		return this.maxCount;
	}
	public void setMaxCount(String maxCount) {
		this.maxCount = maxCount;
	}

}
