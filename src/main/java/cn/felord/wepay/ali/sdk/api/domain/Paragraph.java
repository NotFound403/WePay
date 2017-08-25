package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 段落
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Paragraph extends AlipayObject {

	private static final long serialVersionUID = 7646859486714974829L;

	/**
	 * 图片列表
	 */
	@ApiListField("pictures")
	@ApiField("picture")
	private List<Picture> pictures;

	/**
	 * 正文介绍
	 */
	@ApiField("text")
	private String text;

	/**
	 * <p>Getter for the field <code>pictures</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Picture> getPictures() {
		return this.pictures;
	}
	/**
	 * <p>Setter for the field <code>pictures</code>.</p>
	 *
	 * @param pictures a {@link java.util.List} object.
	 */
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

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

}
