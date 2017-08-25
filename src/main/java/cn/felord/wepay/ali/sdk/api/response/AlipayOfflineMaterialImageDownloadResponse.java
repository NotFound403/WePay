package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.material.image.download response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMaterialImageDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1849332717914942845L;

	/** 
	 * 图片地址列表，按入参id顺序返回，如果某个id转化失败，则用空字符占位
	 */
	@ApiListField("image_urls")
	@ApiField("string")
	private List<String> imageUrls;

	/**
	 * <p>Setter for the field <code>imageUrls</code>.</p>
	 *
	 * @param imageUrls a {@link java.util.List} object.
	 */
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}
	/**
	 * <p>Getter for the field <code>imageUrls</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getImageUrls( ) {
		return this.imageUrls;
	}

}
