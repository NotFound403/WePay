package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 证照中心身份证
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserCertDocIDCard extends AlipayObject {

	private static final long serialVersionUID = 8524945425144478382L;

	/**
	 * 身份证国徽页照片BASE64编码
	 */
	@ApiField("encoded_img_emblem")
	private String encodedImgEmblem;

	/**
	 * 头像页照片BASE64编码
	 */
	@ApiField("encoded_img_identity")
	private String encodedImgIdentity;

	/**
	 * 有效期至
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 身份证姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 身份证号码
	 */
	@ApiField("number")
	private String number;

	/**
	 * <p>Getter for the field <code>encodedImgEmblem</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEncodedImgEmblem() {
		return this.encodedImgEmblem;
	}
	/**
	 * <p>Setter for the field <code>encodedImgEmblem</code>.</p>
	 *
	 * @param encodedImgEmblem a {@link java.lang.String} object.
	 */
	public void setEncodedImgEmblem(String encodedImgEmblem) {
		this.encodedImgEmblem = encodedImgEmblem;
	}

	/**
	 * <p>Getter for the field <code>encodedImgIdentity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEncodedImgIdentity() {
		return this.encodedImgIdentity;
	}
	/**
	 * <p>Setter for the field <code>encodedImgIdentity</code>.</p>
	 *
	 * @param encodedImgIdentity a {@link java.lang.String} object.
	 */
	public void setEncodedImgIdentity(String encodedImgIdentity) {
		this.encodedImgIdentity = encodedImgIdentity;
	}

	/**
	 * <p>Getter for the field <code>expireDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpireDate() {
		return this.expireDate;
	}
	/**
	 * <p>Setter for the field <code>expireDate</code>.</p>
	 *
	 * @param expireDate a {@link java.lang.String} object.
	 */
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>number</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNumber() {
		return this.number;
	}
	/**
	 * <p>Setter for the field <code>number</code>.</p>
	 *
	 * @param number a {@link java.lang.String} object.
	 */
	public void setNumber(String number) {
		this.number = number;
	}

}
