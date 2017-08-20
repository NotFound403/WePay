package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 证照中心身份证
 *
 * @author auto create
 * @since 1.0, 2017-05-25 14:02:44
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

	public String getEncodedImgEmblem() {
		return this.encodedImgEmblem;
	}
	public void setEncodedImgEmblem(String encodedImgEmblem) {
		this.encodedImgEmblem = encodedImgEmblem;
	}

	public String getEncodedImgIdentity() {
		return this.encodedImgIdentity;
	}
	public void setEncodedImgIdentity(String encodedImgIdentity) {
		this.encodedImgIdentity = encodedImgIdentity;
	}

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

}
