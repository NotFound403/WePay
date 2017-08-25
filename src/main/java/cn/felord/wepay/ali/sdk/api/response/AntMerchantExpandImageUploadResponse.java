package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.image.upload response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntMerchantExpandImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7685368495732173693L;

	/** 
	 * 图片在sfs中的标识
	 */
	@ApiField("image_id")
	private String imageId;

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

}
