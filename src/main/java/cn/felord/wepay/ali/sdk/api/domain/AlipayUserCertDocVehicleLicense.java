package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 电子证件产品行驶证
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserCertDocVehicleLicense extends AlipayObject {

	private static final long serialVersionUID = 2566763783195685764L;

	/**
	 * base64编码后的主页照片
	 */
	@ApiField("encoded_img_main")
	private String encodedImgMain;

	/**
	 * base64编码后的副页照片
	 */
	@ApiField("encoded_img_vice")
	private String encodedImgVice;

	/**
	 * 发动机号码
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 发证日期
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 品牌型号
	 */
	@ApiField("model")
	private String model;

	/**
	 * 所有人
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 号牌号码
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 注册日期
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 车辆识别代号
	 */
	@ApiField("vin")
	private String vin;

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
	 * <p>Getter for the field <code>engineNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEngineNo() {
		return this.engineNo;
	}
	/**
	 * <p>Setter for the field <code>engineNo</code>.</p>
	 *
	 * @param engineNo a {@link java.lang.String} object.
	 */
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	/**
	 * <p>Getter for the field <code>issueDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIssueDate() {
		return this.issueDate;
	}
	/**
	 * <p>Setter for the field <code>issueDate</code>.</p>
	 *
	 * @param issueDate a {@link java.lang.String} object.
	 */
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	/**
	 * <p>Getter for the field <code>model</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModel() {
		return this.model;
	}
	/**
	 * <p>Setter for the field <code>model</code>.</p>
	 *
	 * @param model a {@link java.lang.String} object.
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * <p>Getter for the field <code>owner</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwner() {
		return this.owner;
	}
	/**
	 * <p>Setter for the field <code>owner</code>.</p>
	 *
	 * @param owner a {@link java.lang.String} object.
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * <p>Getter for the field <code>plateNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPlateNo() {
		return this.plateNo;
	}
	/**
	 * <p>Setter for the field <code>plateNo</code>.</p>
	 *
	 * @param plateNo a {@link java.lang.String} object.
	 */
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	/**
	 * <p>Getter for the field <code>registerDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRegisterDate() {
		return this.registerDate;
	}
	/**
	 * <p>Setter for the field <code>registerDate</code>.</p>
	 *
	 * @param registerDate a {@link java.lang.String} object.
	 */
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	/**
	 * <p>Getter for the field <code>vin</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVin() {
		return this.vin;
	}
	/**
	 * <p>Setter for the field <code>vin</code>.</p>
	 *
	 * @param vin a {@link java.lang.String} object.
	 */
	public void setVin(String vin) {
		this.vin = vin;
	}

}
