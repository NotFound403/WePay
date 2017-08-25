package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 手艺人作品
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CraftsmanWorkCreateOpenModel extends AlipayObject {

	private static final long serialVersionUID = 1258997683722248196L;

	/**
	 * 视频资源必传，视频时长，单位(秒)
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 媒体资源id（通过 alipay.offline.material.image.upload 接口上传图片获取的资源id）。图片上限最大5M,支持bmp,png,jpeg,jpg,gif格式的图片。视频上限最大50M,支持MP4格式。
	 */
	@ApiField("media_id")
	private String mediaId;

	/**
	 * 媒体类型。仅支持图片/视频格式，图片类型时传入PICTURE；视频类型时传入VIDEO
	 */
	@ApiField("media_type")
	private String mediaType;

	/**
	 * 外部作品id,isv的appId+外部作品id全局唯一
	 */
	@ApiField("out_work_id")
	private String outWorkId;

	/**
	 * 作品标题，上限10个字。
	 */
	@ApiField("title")
	private String title;

	/**
	 * <p>Getter for the field <code>duration</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getDuration() {
		return this.duration;
	}
	/**
	 * <p>Setter for the field <code>duration</code>.</p>
	 *
	 * @param duration a {@link java.lang.Long} object.
	 */
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	/**
	 * <p>Getter for the field <code>mediaId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMediaId() {
		return this.mediaId;
	}
	/**
	 * <p>Setter for the field <code>mediaId</code>.</p>
	 *
	 * @param mediaId a {@link java.lang.String} object.
	 */
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	/**
	 * <p>Getter for the field <code>mediaType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMediaType() {
		return this.mediaType;
	}
	/**
	 * <p>Setter for the field <code>mediaType</code>.</p>
	 *
	 * @param mediaType a {@link java.lang.String} object.
	 */
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	/**
	 * <p>Getter for the field <code>outWorkId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutWorkId() {
		return this.outWorkId;
	}
	/**
	 * <p>Setter for the field <code>outWorkId</code>.</p>
	 *
	 * @param outWorkId a {@link java.lang.String} object.
	 */
	public void setOutWorkId(String outWorkId) {
		this.outWorkId = outWorkId;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
