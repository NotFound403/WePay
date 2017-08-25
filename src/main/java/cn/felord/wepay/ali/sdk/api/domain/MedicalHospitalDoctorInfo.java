package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 医生信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MedicalHospitalDoctorInfo extends AlipayObject {

	private static final long serialVersionUID = 4781348547653844362L;

	/**
	 * 医生唯一标识，编码开发者生成并保证唯一
	 */
	@ApiField("code")
	private String code;

	/**
	 * 医生名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 性别
女性：F
男性：M
未知：U
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
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
	 * <p>Getter for the field <code>sex</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSex() {
		return this.sex;
	}
	/**
	 * <p>Setter for the field <code>sex</code>.</p>
	 *
	 * @param sex a {@link java.lang.String} object.
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

}
