package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 贴子发布接口职位供应商信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class EduSourceInfo extends AlipayObject {

	private static final long serialVersionUID = 3378867855291383497L;

	/**
	 * 供应商的LOGO
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 供应商电话
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 供应商名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * <p>Getter for the field <code>logo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogo() {
		return this.logo;
	}
	/**
	 * <p>Setter for the field <code>logo</code>.</p>
	 *
	 * @param logo a {@link java.lang.String} object.
	 */
	public void setLogo(String logo) {
		this.logo = logo;
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

}
