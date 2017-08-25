package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Keyword extends AlipayObject {

	private static final long serialVersionUID = 2799878114896553341L;

	/**
	 * 当前文字颜色
	 */
	@ApiField("color")
	private String color;

	/**
	 * 模板中占位符的值
	 */
	@ApiField("value")
	private String value;

	/**
	 * <p>Getter for the field <code>color</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getColor() {
		return this.color;
	}
	/**
	 * <p>Setter for the field <code>color</code>.</p>
	 *
	 * @param color a {@link java.lang.String} object.
	 */
	public void setColor(String color) {
		this.color = color;
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
