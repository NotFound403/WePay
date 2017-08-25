package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 红包数据结构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class NewsfeedMediaGiftInfo extends AlipayObject {

	private static final long serialVersionUID = 5831712676137812962L;

	/**
	 * 地址
	 */
	@ApiField("action")
	private String action;

	/**
	 * 安卓的高度
	 */
	@ApiField("adr_height")
	private String adrHeight;

	/**
	 * 安卓缩略图
	 */
	@ApiField("adr_thumb")
	private String adrThumb;

	/**
	 * 安卓宽度
	 */
	@ApiField("adr_width")
	private String adrWidth;

	/**
	 * ios高度
	 */
	@ApiField("ios_height")
	private String iosHeight;

	/**
	 * ios缩略图
	 */
	@ApiField("ios_thumb")
	private String iosThumb;

	/**
	 * ios宽度
	 */
	@ApiField("ios_width")
	private String iosWidth;

	/**
	 * 大图
	 */
	@ApiField("theme")
	private String theme;

	/**
	 * 红包类型all、f、m
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>action</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAction() {
		return this.action;
	}
	/**
	 * <p>Setter for the field <code>action</code>.</p>
	 *
	 * @param action a {@link java.lang.String} object.
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * <p>Getter for the field <code>adrHeight</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdrHeight() {
		return this.adrHeight;
	}
	/**
	 * <p>Setter for the field <code>adrHeight</code>.</p>
	 *
	 * @param adrHeight a {@link java.lang.String} object.
	 */
	public void setAdrHeight(String adrHeight) {
		this.adrHeight = adrHeight;
	}

	/**
	 * <p>Getter for the field <code>adrThumb</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdrThumb() {
		return this.adrThumb;
	}
	/**
	 * <p>Setter for the field <code>adrThumb</code>.</p>
	 *
	 * @param adrThumb a {@link java.lang.String} object.
	 */
	public void setAdrThumb(String adrThumb) {
		this.adrThumb = adrThumb;
	}

	/**
	 * <p>Getter for the field <code>adrWidth</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdrWidth() {
		return this.adrWidth;
	}
	/**
	 * <p>Setter for the field <code>adrWidth</code>.</p>
	 *
	 * @param adrWidth a {@link java.lang.String} object.
	 */
	public void setAdrWidth(String adrWidth) {
		this.adrWidth = adrWidth;
	}

	/**
	 * <p>Getter for the field <code>iosHeight</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIosHeight() {
		return this.iosHeight;
	}
	/**
	 * <p>Setter for the field <code>iosHeight</code>.</p>
	 *
	 * @param iosHeight a {@link java.lang.String} object.
	 */
	public void setIosHeight(String iosHeight) {
		this.iosHeight = iosHeight;
	}

	/**
	 * <p>Getter for the field <code>iosThumb</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIosThumb() {
		return this.iosThumb;
	}
	/**
	 * <p>Setter for the field <code>iosThumb</code>.</p>
	 *
	 * @param iosThumb a {@link java.lang.String} object.
	 */
	public void setIosThumb(String iosThumb) {
		this.iosThumb = iosThumb;
	}

	/**
	 * <p>Getter for the field <code>iosWidth</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIosWidth() {
		return this.iosWidth;
	}
	/**
	 * <p>Setter for the field <code>iosWidth</code>.</p>
	 *
	 * @param iosWidth a {@link java.lang.String} object.
	 */
	public void setIosWidth(String iosWidth) {
		this.iosWidth = iosWidth;
	}

	/**
	 * <p>Getter for the field <code>theme</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTheme() {
		return this.theme;
	}
	/**
	 * <p>Setter for the field <code>theme</code>.</p>
	 *
	 * @param theme a {@link java.lang.String} object.
	 */
	public void setTheme(String theme) {
		this.theme = theme;
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
