package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * “蚁盾”智能IP检测服务
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SsdataDataserviceRiskIpprofileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8142168593939243222L;

	/**
	 * IP地址
	 */
	@ApiField("ip_address")
	private String ipAddress;

	/**
	 * 手机号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * <p>Getter for the field <code>ipAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpAddress() {
		return this.ipAddress;
	}
	/**
	 * <p>Setter for the field <code>ipAddress</code>.</p>
	 *
	 * @param ipAddress a {@link java.lang.String} object.
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
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

}
