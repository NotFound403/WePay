package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 用户授权信息查询图片信息对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserPicture extends AlipayObject {

	private static final long serialVersionUID = 4598587639678647961L;

	/**
	 * 图片类型，包括身份证正反面、营业执照等
	 */
	@ApiField("picture_type")
	private String pictureType;

	/**
	 * 用于调用alipay.user.certify.image.fetch接口，获取图片资源
	 */
	@ApiField("picture_url")
	private String pictureUrl;

	/**
	 * <p>Getter for the field <code>pictureType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPictureType() {
		return this.pictureType;
	}
	/**
	 * <p>Setter for the field <code>pictureType</code>.</p>
	 *
	 * @param pictureType a {@link java.lang.String} object.
	 */
	public void setPictureType(String pictureType) {
		this.pictureType = pictureType;
	}

	/**
	 * <p>Getter for the field <code>pictureUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPictureUrl() {
		return this.pictureUrl;
	}
	/**
	 * <p>Setter for the field <code>pictureUrl</code>.</p>
	 *
	 * @param pictureUrl a {@link java.lang.String} object.
	 */
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

}
