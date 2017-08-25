package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 手机归属地对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SecuritydataMobileCity extends AlipayObject {

	private static final long serialVersionUID = 3725367851241217766L;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 手机号前七位
	 */
	@ApiField("phone_first_7_digits")
	private String phoneFirst7Digits;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

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
	 * <p>Getter for the field <code>phoneFirst7Digits</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPhoneFirst7Digits() {
		return this.phoneFirst7Digits;
	}
	/**
	 * <p>Setter for the field <code>phoneFirst7Digits</code>.</p>
	 *
	 * @param phoneFirst7Digits a {@link java.lang.String} object.
	 */
	public void setPhoneFirst7Digits(String phoneFirst7Digits) {
		this.phoneFirst7Digits = phoneFirst7Digits;
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

}
