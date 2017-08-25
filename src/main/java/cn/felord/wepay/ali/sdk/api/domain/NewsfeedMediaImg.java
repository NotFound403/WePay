package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 发布动态的图片类型数据结构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class NewsfeedMediaImg extends AlipayObject {

	private static final long serialVersionUID = 8686454365617532796L;

	/**
	 * 图片高度
	 */
	@ApiField("height")
	private String height;

	/**
	 * 图片地址
	 */
	@ApiField("src")
	private String src;

	/**
	 * 图片宽度
	 */
	@ApiField("width")
	private String width;

	/**
	 * <p>Getter for the field <code>height</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHeight() {
		return this.height;
	}
	/**
	 * <p>Setter for the field <code>height</code>.</p>
	 *
	 * @param height a {@link java.lang.String} object.
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * <p>Getter for the field <code>src</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSrc() {
		return this.src;
	}
	/**
	 * <p>Setter for the field <code>src</code>.</p>
	 *
	 * @param src a {@link java.lang.String} object.
	 */
	public void setSrc(String src) {
		this.src = src;
	}

	/**
	 * <p>Getter for the field <code>width</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getWidth() {
		return this.width;
	}
	/**
	 * <p>Setter for the field <code>width</code>.</p>
	 *
	 * @param width a {@link java.lang.String} object.
	 */
	public void setWidth(String width) {
		this.width = width;
	}

}
