package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 人脸支付图片上传接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdFacepayUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5183485773956966515L;

	/**
	 * 用户输入的邀请码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * Base64编码的人脸图片
	 */
	@ApiField("face_image")
	private String faceImage;

	/**
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * <p>Getter for the field <code>checkCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCheckCode() {
		return this.checkCode;
	}
	/**
	 * <p>Setter for the field <code>checkCode</code>.</p>
	 *
	 * @param checkCode a {@link java.lang.String} object.
	 */
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	/**
	 * <p>Getter for the field <code>faceImage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFaceImage() {
		return this.faceImage;
	}
	/**
	 * <p>Setter for the field <code>faceImage</code>.</p>
	 *
	 * @param faceImage a {@link java.lang.String} object.
	 */
	public void setFaceImage(String faceImage) {
		this.faceImage = faceImage;
	}

	/**
	 * <p>Getter for the field <code>storeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStoreId() {
		return this.storeId;
	}
	/**
	 * <p>Setter for the field <code>storeId</code>.</p>
	 *
	 * @param storeId a {@link java.lang.String} object.
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
