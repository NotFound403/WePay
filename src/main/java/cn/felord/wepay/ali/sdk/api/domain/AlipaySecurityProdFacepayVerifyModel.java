package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 人脸支付验证接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdFacepayVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 7545835411461294713L;

	/**
	 * 用户输入的扫脸付邀请码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * Base64编码的人脸图片。与ftoken参数二选一，当商户先前未调用人脸识别接口时使用此参数。
	 */
	@ApiField("face_image")
	private String faceImage;

	/**
	 * 商户调用人脸上传接口时获得的ftoken。与face_image参数二选一，当商户先前调用了人脸识别接口并获得了ftoken时使用此参数
	 */
	@ApiField("ftoken")
	private String ftoken;

	/**
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 用户认证标识。传入完整的用户标识（例如用户输入的完整的11位用户手机号码,13800138000）或部分信息脱敏的用户标识（例如138****8000）。当热点人脸库命中成功时，可以使用部分信息脱敏的用户标识
	 */
	@ApiField("user_auth_id")
	private String userAuthId;

	/**
	 * 用户标识类型。目前支持手机号码，即mobile
	 */
	@ApiField("user_auth_type")
	private String userAuthType;

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
	 * <p>Getter for the field <code>ftoken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFtoken() {
		return this.ftoken;
	}
	/**
	 * <p>Setter for the field <code>ftoken</code>.</p>
	 *
	 * @param ftoken a {@link java.lang.String} object.
	 */
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
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

	/**
	 * <p>Getter for the field <code>userAuthId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserAuthId() {
		return this.userAuthId;
	}
	/**
	 * <p>Setter for the field <code>userAuthId</code>.</p>
	 *
	 * @param userAuthId a {@link java.lang.String} object.
	 */
	public void setUserAuthId(String userAuthId) {
		this.userAuthId = userAuthId;
	}

	/**
	 * <p>Getter for the field <code>userAuthType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserAuthType() {
		return this.userAuthType;
	}
	/**
	 * <p>Setter for the field <code>userAuthType</code>.</p>
	 *
	 * @param userAuthType a {@link java.lang.String} object.
	 */
	public void setUserAuthType(String userAuthType) {
		this.userAuthType = userAuthType;
	}

}
