package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 视频动态的描述数据结构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class NewsfeedMediaVideoInfo extends AlipayObject {

	private static final long serialVersionUID = 7526535993983336337L;

	/**
	 * 高度
	 */
	@ApiField("height")
	private String height;

	/**
	 * 视频缩略图的ID（支持djangoId）
	 */
	@ApiField("img_id")
	private String imgId;

	/**
	 * 视频的id（支持djangoId）
	 */
	@ApiField("video_id")
	private String videoId;

	/**
	 * 宽度
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
	 * <p>Getter for the field <code>imgId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImgId() {
		return this.imgId;
	}
	/**
	 * <p>Setter for the field <code>imgId</code>.</p>
	 *
	 * @param imgId a {@link java.lang.String} object.
	 */
	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	/**
	 * <p>Getter for the field <code>videoId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVideoId() {
		return this.videoId;
	}
	/**
	 * <p>Setter for the field <code>videoId</code>.</p>
	 *
	 * @param videoId a {@link java.lang.String} object.
	 */
	public void setVideoId(String videoId) {
		this.videoId = videoId;
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
