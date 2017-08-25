package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 自定义标签的枚举值信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DataEnumValue extends AlipayObject {

	private static final long serialVersionUID = 3277533188855728766L;

	/**
	 * 过滤条件
	 */
	@ApiListField("filter_tags")
	@ApiField("filter_tag")
	private List<FilterTag> filterTags;

	/**
	 * 枚举的展示文本
	 */
	@ApiField("label")
	private String label;

	/**
	 * 自定义标签的枚举值
	 */
	@ApiField("value")
	private String value;

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
	 * <p>Getter for the field <code>label</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabel() {
		return this.label;
	}
	/**
	 * <p>Setter for the field <code>label</code>.</p>
	 *
	 * @param label a {@link java.lang.String} object.
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * <p>Getter for the field <code>value</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValue() {
		return this.value;
	}
	/**
	 * <p>Setter for the field <code>value</code>.</p>
	 *
	 * @param value a {@link java.lang.String} object.
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
