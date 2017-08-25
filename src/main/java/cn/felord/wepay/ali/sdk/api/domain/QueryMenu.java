package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 查询个性化菜单返回对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class QueryMenu extends AlipayObject {

	private static final long serialVersionUID = 3548122576675123163L;

	/**
	 * 一级菜单列表
	 */
	@ApiListField("button")
	@ApiField("button_object")
	private List<ButtonObject> button;

	/**
	 * 标签规则项列表
	 */
	@ApiListField("label_rule")
	@ApiField("query_label_rule")
	private List<QueryLabelRule> labelRule;

	/**
	 * 菜单唯一id
	 */
	@ApiField("menu_key")
	private String menuKey;

	/**
	 * 菜单类型，icon：icon型菜单，text：文本型菜单
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>button</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ButtonObject> getButton() {
		return this.button;
	}
	/**
	 * <p>Setter for the field <code>button</code>.</p>
	 *
	 * @param button a {@link java.util.List} object.
	 */
	public void setButton(List<ButtonObject> button) {
		this.button = button;
	}

	/**
	 * <p>Getter for the field <code>labelRule</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<QueryLabelRule> getLabelRule() {
		return this.labelRule;
	}
	/**
	 * <p>Setter for the field <code>labelRule</code>.</p>
	 *
	 * @param labelRule a {@link java.util.List} object.
	 */
	public void setLabelRule(List<QueryLabelRule> labelRule) {
		this.labelRule = labelRule;
	}

	/**
	 * <p>Getter for the field <code>menuKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMenuKey() {
		return this.menuKey;
	}
	/**
	 * <p>Setter for the field <code>menuKey</code>.</p>
	 *
	 * @param menuKey a {@link java.lang.String} object.
	 */
	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
