package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 到位通用的描述信息对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CommonDescInfo extends AlipayObject {

	private static final long serialVersionUID = 6177789155228627964L;

	/**
	 * 图片URL地址，最大不超过60K，必须使用https
	 */
	@ApiField("img")
	private String img;

	/**
	 * 文本描述
	 */
	@ApiField("text")
	private String text;

	/**
	 * <p>Getter for the field <code>img</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImg() {
		return this.img;
	}
	/**
	 * <p>Setter for the field <code>img</code>.</p>
	 *
	 * @param img a {@link java.lang.String} object.
	 */
	public void setImg(String img) {
		this.img = img;
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
