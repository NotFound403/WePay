package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 个性化扩展区创建接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicPersonalizedExtensionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4661928919137947622L;

	/**
	 * 扩展区列表，最大条数为3
	 */
	@ApiListField("areas")
	@ApiField("extension_area")
	private List<ExtensionArea> areas;

	/**
	 * 标签规则，目前限定只能传入1条，在扩展区上线后，满足该标签规则的用户进入生活号首页，将看到该套扩展区。
	 */
	@ApiListField("label_rule")
	@ApiField("label_rule")
	private List<LabelRule> labelRule;

	/**
	 * <p>Getter for the field <code>areas</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ExtensionArea> getAreas() {
		return this.areas;
	}
	/**
	 * <p>Setter for the field <code>areas</code>.</p>
	 *
	 * @param areas a {@link java.util.List} object.
	 */
	public void setAreas(List<ExtensionArea> areas) {
		this.areas = areas;
	}

	/**
	 * <p>Getter for the field <code>labelRule</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<LabelRule> getLabelRule() {
		return this.labelRule;
	}
	/**
	 * <p>Setter for the field <code>labelRule</code>.</p>
	 *
	 * @param labelRule a {@link java.util.List} object.
	 */
	public void setLabelRule(List<LabelRule> labelRule) {
		this.labelRule = labelRule;
	}

}
