package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 证照中心护照
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserCertDocPassport extends AlipayObject {

	private static final long serialVersionUID = 2886891849734748914L;

	/**
	 * base64编码后的主页照片
	 */
	@ApiField("encoded_img")
	private String encodedImg;

	/**
	 * 失效日期
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 姓氏，拼音
	 */
	@ApiField("family_name")
	private String familyName;

	/**
	 * 名，拼音
	 */
	@ApiField("given_name")
	private String givenName;

	/**
	 * 证件号码
	 */
	@ApiField("number")
	private String number;

	/**
	 * <p>Getter for the field <code>encodedImg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEncodedImg() {
		return this.encodedImg;
	}
	/**
	 * <p>Setter for the field <code>encodedImg</code>.</p>
	 *
	 * @param encodedImg a {@link java.lang.String} object.
	 */
	public void setEncodedImg(String encodedImg) {
		this.encodedImg = encodedImg;
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
	 * <p>Getter for the field <code>familyName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFamilyName() {
		return this.familyName;
	}
	/**
	 * <p>Setter for the field <code>familyName</code>.</p>
	 *
	 * @param familyName a {@link java.lang.String} object.
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**
	 * <p>Getter for the field <code>givenName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGivenName() {
		return this.givenName;
	}
	/**
	 * <p>Setter for the field <code>givenName</code>.</p>
	 *
	 * @param givenName a {@link java.lang.String} object.
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
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
