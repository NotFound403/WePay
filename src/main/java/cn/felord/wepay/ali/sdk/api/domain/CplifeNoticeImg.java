package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 物业社区通知通告图片
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CplifeNoticeImg extends AlipayObject {

	private static final long serialVersionUID = 7153127176998611364L;

	/**
	 * 在通知中需要展示的图片链接，API调用之后，该图片将会被自动下载到物业社区平台服务器，用于系统显示。API调用成功之后，手工更改URL对应的图片资源时，用户在支付宝APP端看到的图片将保持不变。
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 在通知中需要展示的图片的缩略图链接，API调用之后，该图片将会被自动下载到物业社区平台服务器，用于系统显示。API调用成功之后，手工更改URL对应的图片资源时，用户在支付宝APP端看到的图片将保持不变。
	 */
	@ApiField("thumbnail_url")
	private String thumbnailUrl;

	/**
	 * <p>Getter for the field <code>imageUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImageUrl() {
		return this.imageUrl;
	}
	/**
	 * <p>Setter for the field <code>imageUrl</code>.</p>
	 *
	 * @param imageUrl a {@link java.lang.String} object.
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * <p>Getter for the field <code>thumbnailUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getThumbnailUrl() {
		return this.thumbnailUrl;
	}
	/**
	 * <p>Setter for the field <code>thumbnailUrl</code>.</p>
	 *
	 * @param thumbnailUrl a {@link java.lang.String} object.
	 */
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

}
