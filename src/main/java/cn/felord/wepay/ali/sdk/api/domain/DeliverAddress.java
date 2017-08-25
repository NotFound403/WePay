package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 收货人地址
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DeliverAddress extends AlipayObject {

	private static final long serialVersionUID = 7369431438599312511L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区域编码
	 */
	@ApiField("address_code")
	private String addressCode;

	/**
	 * 是否默认收货地址
	 */
	@ApiField("default_deliver_address")
	private String defaultDeliverAddress;

	/**
	 * 收货人所在区县
	 */
	@ApiField("deliver_area")
	private String deliverArea;

	/**
	 * 收货人所在城市
	 */
	@ApiField("deliver_city")
	private String deliverCity;

	/**
	 * 收货人全名
	 */
	@ApiField("deliver_fullname")
	private String deliverFullname;

	/**
	 * 收货地址的联系人移动电话
	 */
	@ApiField("deliver_mobile")
	private String deliverMobile;

	/**
	 * 收货地址的联系人固定电话
	 */
	@ApiField("deliver_phone")
	private String deliverPhone;

	/**
	 * 收货人所在省份
	 */
	@ApiField("deliver_province")
	private String deliverProvince;

	/**
	 * 邮政编码
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
	 * <p>Getter for the field <code>defaultDeliverAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDefaultDeliverAddress() {
		return this.defaultDeliverAddress;
	}
	/**
	 * <p>Setter for the field <code>defaultDeliverAddress</code>.</p>
	 *
	 * @param defaultDeliverAddress a {@link java.lang.String} object.
	 */
	public void setDefaultDeliverAddress(String defaultDeliverAddress) {
		this.defaultDeliverAddress = defaultDeliverAddress;
	}

	/**
	 * <p>Getter for the field <code>deliverArea</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliverArea() {
		return this.deliverArea;
	}
	/**
	 * <p>Setter for the field <code>deliverArea</code>.</p>
	 *
	 * @param deliverArea a {@link java.lang.String} object.
	 */
	public void setDeliverArea(String deliverArea) {
		this.deliverArea = deliverArea;
	}

	/**
	 * <p>Getter for the field <code>deliverCity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliverCity() {
		return this.deliverCity;
	}
	/**
	 * <p>Setter for the field <code>deliverCity</code>.</p>
	 *
	 * @param deliverCity a {@link java.lang.String} object.
	 */
	public void setDeliverCity(String deliverCity) {
		this.deliverCity = deliverCity;
	}

	/**
	 * <p>Getter for the field <code>deliverFullname</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliverFullname() {
		return this.deliverFullname;
	}
	/**
	 * <p>Setter for the field <code>deliverFullname</code>.</p>
	 *
	 * @param deliverFullname a {@link java.lang.String} object.
	 */
	public void setDeliverFullname(String deliverFullname) {
		this.deliverFullname = deliverFullname;
	}

	/**
	 * <p>Getter for the field <code>deliverMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliverMobile() {
		return this.deliverMobile;
	}
	/**
	 * <p>Setter for the field <code>deliverMobile</code>.</p>
	 *
	 * @param deliverMobile a {@link java.lang.String} object.
	 */
	public void setDeliverMobile(String deliverMobile) {
		this.deliverMobile = deliverMobile;
	}

	/**
	 * <p>Getter for the field <code>deliverPhone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliverPhone() {
		return this.deliverPhone;
	}
	/**
	 * <p>Setter for the field <code>deliverPhone</code>.</p>
	 *
	 * @param deliverPhone a {@link java.lang.String} object.
	 */
	public void setDeliverPhone(String deliverPhone) {
		this.deliverPhone = deliverPhone;
	}

	/**
	 * <p>Getter for the field <code>deliverProvince</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliverProvince() {
		return this.deliverProvince;
	}
	/**
	 * <p>Setter for the field <code>deliverProvince</code>.</p>
	 *
	 * @param deliverProvince a {@link java.lang.String} object.
	 */
	public void setDeliverProvince(String deliverProvince) {
		this.deliverProvince = deliverProvince;
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
