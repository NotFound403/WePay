package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 电子证件产品-驾驶证
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserCertDocDrivingLicense extends AlipayObject {

	private static final long serialVersionUID = 2814217159261898258L;

	/**
	 * 准驾车型
	 */
	@ApiField("clazz")
	private String clazz;

	/**
	 * 证号
	 */
	@ApiField("driving_license_no")
	private String drivingLicenseNo;

	/**
	 * base64后的主页照片
	 */
	@ApiField("encoded_img_main")
	private String encodedImgMain;

	/**
	 * base64编码后的副页图片
	 */
	@ApiField("encoded_img_vice")
	private String encodedImgVice;

	/**
	 * 失效日期
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 档案编号
	 */
	@ApiField("file_no")
	private String fileNo;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 生效日期
	 */
	@ApiField("valide_date")
	private String valideDate;

	/**
	 * <p>Getter for the field <code>clazz</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClazz() {
		return this.clazz;
	}
	/**
	 * <p>Setter for the field <code>clazz</code>.</p>
	 *
	 * @param clazz a {@link java.lang.String} object.
	 */
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	/**
	 * <p>Getter for the field <code>drivingLicenseNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDrivingLicenseNo() {
		return this.drivingLicenseNo;
	}
	/**
	 * <p>Setter for the field <code>drivingLicenseNo</code>.</p>
	 *
	 * @param drivingLicenseNo a {@link java.lang.String} object.
	 */
	public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}

	/**
	 * <p>Getter for the field <code>encodedImgMain</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEncodedImgMain() {
		return this.encodedImgMain;
	}
	/**
	 * <p>Setter for the field <code>encodedImgMain</code>.</p>
	 *
	 * @param encodedImgMain a {@link java.lang.String} object.
	 */
	public void setEncodedImgMain(String encodedImgMain) {
		this.encodedImgMain = encodedImgMain;
	}

	/**
	 * <p>Getter for the field <code>encodedImgVice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEncodedImgVice() {
		return this.encodedImgVice;
	}
	/**
	 * <p>Setter for the field <code>encodedImgVice</code>.</p>
	 *
	 * @param encodedImgVice a {@link java.lang.String} object.
	 */
	public void setEncodedImgVice(String encodedImgVice) {
		this.encodedImgVice = encodedImgVice;
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
	 * <p>Getter for the field <code>fileNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFileNo() {
		return this.fileNo;
	}
	/**
	 * <p>Setter for the field <code>fileNo</code>.</p>
	 *
	 * @param fileNo a {@link java.lang.String} object.
	 */
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
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
	 * <p>Getter for the field <code>valideDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValideDate() {
		return this.valideDate;
	}
	/**
	 * <p>Setter for the field <code>valideDate</code>.</p>
	 *
	 * @param valideDate a {@link java.lang.String} object.
	 */
	public void setValideDate(String valideDate) {
		this.valideDate = valideDate;
	}

}
