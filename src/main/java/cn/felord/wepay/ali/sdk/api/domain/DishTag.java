package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 菜品标签
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DishTag extends AlipayObject {

	private static final long serialVersionUID = 5771813798439148233L;

	/**
	 * 标签类型 : 如"菜属性"，"菜推荐"
	 */
	@ApiField("type")
	private String type;

	/**
	 * 标签值：如"重辣","中辣","招牌菜","创意菜"
	 */
	@ApiField("value")
	private String value;

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
