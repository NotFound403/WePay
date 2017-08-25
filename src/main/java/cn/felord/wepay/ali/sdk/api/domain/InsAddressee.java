package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保单邮寄地址
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsAddressee extends AlipayObject {

	private static final long serialVersionUID = 3291735665867132689L;

	/**
	 * 收件人详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区域编码
	 */
	@ApiField("address_code")
	private String addressCode;

	/**
	 * 联系地址-城区
	 */
	@ApiField("area")
	private String area;

	/**
	 * 联系地址-城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 联系方式(mobile登录号)
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 收件人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系地址-电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 联系地址-省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 联系地址-邮编
	 */
	@ApiField("zip")
	private String zip;

	/**
	 * <p>Getter for the field <code>address</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * <p>Setter for the field <code>address</code>.</p>
	 *
	 * @param address a {@link java.lang.String} object.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * <p>Getter for the field <code>addressCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddressCode() {
		return this.addressCode;
	}
	/**
	 * <p>Setter for the field <code>addressCode</code>.</p>
	 *
	 * @param addressCode a {@link java.lang.String} object.
	 */
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

	/**
	 * <p>Getter for the field <code>area</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArea() {
		return this.area;
	}
	/**
	 * <p>Setter for the field <code>area</code>.</p>
	 *
	 * @param area a {@link java.lang.String} object.
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * <p>Getter for the field <code>city</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCity() {
		return this.city;
	}
	/**
	 * <p>Setter for the field <code>city</code>.</p>
	 *
	 * @param city a {@link java.lang.String} object.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * <p>Getter for the field <code>mobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobile() {
		return this.mobile;
	}
	/**
	 * <p>Setter for the field <code>mobile</code>.</p>
	 *
	 * @param mobile a {@link java.lang.String} object.
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	 * <p>Getter for the field <code>phone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPhone() {
		return this.phone;
	}
	/**
	 * <p>Setter for the field <code>phone</code>.</p>
	 *
	 * @param phone a {@link java.lang.String} object.
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * <p>Getter for the field <code>province</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProvince() {
		return this.province;
	}
	/**
	 * <p>Setter for the field <code>province</code>.</p>
	 *
	 * @param province a {@link java.lang.String} object.
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * <p>Getter for the field <code>zip</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getZip() {
		return this.zip;
	}
	/**
	 * <p>Setter for the field <code>zip</code>.</p>
	 *
	 * @param zip a {@link java.lang.String} object.
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

}
