package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.material.image.upload response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMaterialImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4533253153656918399L;

	/** 
	 * 图片/视频在商家中心的唯一标识
	 */
	@ApiField("image_id")
	private String imageId;

	/** 
	 * 图片/视频的访问地址（为了防止盗链，该地址不允许嵌在其他页面展示，只能在新页面展示）
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * <p>Setter for the field <code>imageId</code>.</p>
	 *
	 * @param imageId a {@link java.lang.String} object.
	 */
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	/**
	 * <p>Getter for the field <code>imageId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImageId( ) {
		return this.imageId;
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
	 * <p>Getter for the field <code>imageUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImageUrl( ) {
		return this.imageUrl;
	}

}
