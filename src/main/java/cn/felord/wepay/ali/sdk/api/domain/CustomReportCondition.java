package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 自定义报表规则条件信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CustomReportCondition extends AlipayObject {

	private static final long serialVersionUID = 6736651959372583137L;

	/**
	 * 规则KEY-为空则为创建规则，否则更新规则
	 */
	@ApiField("condition_key")
	private String conditionKey;

	/**
	 * 明细数据标签
	 */
	@ApiListField("data_tags")
	@ApiField("data_tag")
	private List<DataTag> dataTags;

	/**
	 * 分组过滤条件
	 */
	@ApiListField("filter_tags")
	@ApiField("filter_tag")
	private List<FilterTag> filterTags;

	/**
	 * 分组数据标签集合
注意：这个是JSON数组，必须以[开头，以]结尾，[]外层不能加双引号"",正确案例["orpt_ubase_age","orpt_ubase_birthday_mm"]，错误案例："["orpt_ubase_age","orpt_ubase_birthday_mm"]"
	 */
	@ApiField("group_tags")
	private String groupTags;

	/**
	 * 规则描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 自定义报表名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 排序数据标签集合
注意：这个是JSON数组，必须以[开头，以]结尾，[]外层不能加双引号"",正确案例[{"code":"orpt_ubase_age","sortBy":"DESC"}]，错误案例："[{"code":"orpt_ubase_age","sortBy":"DESC"}]"
	 */
	@ApiField("sort_tags")
	private String sortTags;

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
	 * <p>Getter for the field <code>dataTags</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<DataTag> getDataTags() {
		return this.dataTags;
	}
	/**
	 * <p>Setter for the field <code>dataTags</code>.</p>
	 *
	 * @param dataTags a {@link java.util.List} object.
	 */
	public void setDataTags(List<DataTag> dataTags) {
		this.dataTags = dataTags;
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
	 * <p>Getter for the field <code>groupTags</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGroupTags() {
		return this.groupTags;
	}
	/**
	 * <p>Setter for the field <code>groupTags</code>.</p>
	 *
	 * @param groupTags a {@link java.lang.String} object.
	 */
	public void setGroupTags(String groupTags) {
		this.groupTags = groupTags;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

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
	 * <p>Getter for the field <code>sortTags</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSortTags() {
		return this.sortTags;
	}
	/**
	 * <p>Setter for the field <code>sortTags</code>.</p>
	 *
	 * @param sortTags a {@link java.lang.String} object.
	 */
	public void setSortTags(String sortTags) {
		this.sortTags = sortTags;
	}

}
