package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 展示文本和对应取值的映射关系
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Option extends AlipayObject {

	private static final long serialVersionUID = 3539151167889479944L;

	/**
	 * 文本，通常用于理解对应的取值
	 */
	@ApiField("text")
	private String text;

	/**
	 * 取值，通常使用简单的数字或字符串
	 */
	@ApiField("value")
	private String value;

	/**
	 * <p>Getter for the field <code>text</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getText() {
		return this.text;
	}
	/**
	 * <p>Setter for the field <code>text</code>.</p>
	 *
	 * @param text a {@link java.lang.String} object.
	 */
	public void setText(String text) {
		this.text = text;
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
