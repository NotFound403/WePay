package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 查询个性化扩展区返回对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class QueryExtension extends AlipayObject {

	private static final long serialVersionUID = 5398932797689591259L;

	/**
	 * 扩展区列表
	 */
	@ApiListField("areas")
	@ApiField("extension_area")
	private List<ExtensionArea> areas;

	/**
	 * 扩展区套id
	 */
	@ApiField("extension_key")
	private String extensionKey;

	/**
	 * 标签规则列表
	 */
	@ApiListField("label_rules")
	@ApiField("query_label_rule")
	private List<QueryLabelRule> labelRules;

	/**
	 * 扩展区状态，"ON"代表上线，"OFF"代表下线，只有上线的扩展区才能被用户看到
	 */
	@ApiField("status")
	private String status;

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
	 * <p>Getter for the field <code>extensionKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtensionKey() {
		return this.extensionKey;
	}
	/**
	 * <p>Setter for the field <code>extensionKey</code>.</p>
	 *
	 * @param extensionKey a {@link java.lang.String} object.
	 */
	public void setExtensionKey(String extensionKey) {
		this.extensionKey = extensionKey;
	}

	/**
	 * <p>Getter for the field <code>labelRules</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<QueryLabelRule> getLabelRules() {
		return this.labelRules;
	}
	/**
	 * <p>Setter for the field <code>labelRules</code>.</p>
	 *
	 * @param labelRules a {@link java.util.List} object.
	 */
	public void setLabelRules(List<QueryLabelRule> labelRules) {
		this.labelRules = labelRules;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
