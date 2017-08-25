package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险机构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsMerchant extends AlipayObject {

	private static final long serialVersionUID = 6871182277625889912L;

	/**
	 * 机构全称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 机构简称
	 */
	@ApiField("short_name")
	private String shortName;

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
	 * <p>Getter for the field <code>servicePhone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServicePhone() {
		return this.servicePhone;
	}
	/**
	 * <p>Setter for the field <code>servicePhone</code>.</p>
	 *
	 * @param servicePhone a {@link java.lang.String} object.
	 */
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	/**
	 * <p>Getter for the field <code>shortName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShortName() {
		return this.shortName;
	}
	/**
	 * <p>Setter for the field <code>shortName</code>.</p>
	 *
	 * @param shortName a {@link java.lang.String} object.
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}
