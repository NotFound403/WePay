package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 贴子发布接口中的工作地点
 *
 * @author auto create
 * @version $Id: $Id
 */
public class EduWorkAddress extends AlipayObject {

	private static final long serialVersionUID = 7248367699773471348L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 区
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 北京市
	 */
	@ApiField("province")
	private String province;

	/**
	 * 街道
	 */
	@ApiField("street_name")
	private String streetName;

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
	 * <p>Getter for the field <code>districtName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDistrictName() {
		return this.districtName;
	}
	/**
	 * <p>Setter for the field <code>districtName</code>.</p>
	 *
	 * @param districtName a {@link java.lang.String} object.
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
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
	 * <p>Getter for the field <code>streetName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStreetName() {
		return this.streetName;
	}
	/**
	 * <p>Setter for the field <code>streetName</code>.</p>
	 *
	 * @param streetName a {@link java.lang.String} object.
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

}
