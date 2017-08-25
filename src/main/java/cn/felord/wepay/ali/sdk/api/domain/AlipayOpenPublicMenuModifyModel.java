package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 更新菜单
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicMenuModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1836459823995525513L;

	/**
	 * 一级菜单列表。最多有4个一级菜单，若开发者在后台打开了"咨询反馈"的开关，则只能有3个一级菜单.
	 */
	@ApiListField("button")
	@ApiField("button_object")
	private List<ButtonObject> button;

	/**
	 * 菜单类型，支持值为icon：icon型菜单，text：文本型菜单，不传时默认为"text"，当传值为"icon"时，菜单节点的icon字段必传。
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
