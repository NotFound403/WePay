package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 个人信息，包含与商户有关联的个体，如联系人，董事，控股个人，等的姓名，地址，生日，国籍等信息。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class IndividualInfo extends AlipayObject {

	private static final long serialVersionUID = 7885428152925246642L;

	/**
	 * 生日
	 */
	@ApiField("date_of_birth")
	private String dateOfBirth;

	/**
	 * 证件号码
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 个人名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 国籍
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * 个人居住地
	 */
	@ApiField("residential_address")
	private String residentialAddress;

	/**
	 * 该个体的类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>dateOfBirth</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	/**
	 * <p>Setter for the field <code>dateOfBirth</code>.</p>
	 *
	 * @param dateOfBirth a {@link java.lang.String} object.
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * <p>Getter for the field <code>idNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdNumber() {
		return this.idNumber;
	}
	/**
	 * <p>Setter for the field <code>idNumber</code>.</p>
	 *
	 * @param idNumber a {@link java.lang.String} object.
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
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
	 * <p>Getter for the field <code>nationality</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNationality() {
		return this.nationality;
	}
	/**
	 * <p>Setter for the field <code>nationality</code>.</p>
	 *
	 * @param nationality a {@link java.lang.String} object.
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * <p>Getter for the field <code>residentialAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResidentialAddress() {
		return this.residentialAddress;
	}
	/**
	 * <p>Setter for the field <code>residentialAddress</code>.</p>
	 *
	 * @param residentialAddress a {@link java.lang.String} object.
	 */
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
