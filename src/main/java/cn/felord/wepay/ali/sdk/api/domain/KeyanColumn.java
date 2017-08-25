package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 字段
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KeyanColumn extends AlipayObject {

	private static final long serialVersionUID = 3714993799279781192L;

	/**
	 * 密码
	 */
	@ApiField("password")
	private String password;

	/**
	 * <p>Getter for the field <code>password</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPassword() {
		return this.password;
	}
	/**
	 * <p>Setter for the field <code>password</code>.</p>
	 *
	 * @param password a {@link java.lang.String} object.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
