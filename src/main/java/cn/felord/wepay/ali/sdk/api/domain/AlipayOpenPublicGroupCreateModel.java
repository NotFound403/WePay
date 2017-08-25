package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 用户分组创建接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicGroupCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1671482779297862882L;

	/**
	 * 标签规则，满足该规则的粉丝将被圈定，标签id不能重复
	 */
	@ApiListField("label_rule")
	@ApiField("complex_label_rule")
	private List<ComplexLabelRule> labelRule;

	/**
	 * 分组名称，仅支持中文、字母、数字、下划线的组合。
	 */
	@ApiField("name")
	private String name;

	/**
	 * <p>Getter for the field <code>labelRule</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ComplexLabelRule> getLabelRule() {
		return this.labelRule;
	}
	/**
	 * <p>Setter for the field <code>labelRule</code>.</p>
	 *
	 * @param labelRule a {@link java.util.List} object.
	 */
	public void setLabelRule(List<ComplexLabelRule> labelRule) {
		this.labelRule = labelRule;
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

}
