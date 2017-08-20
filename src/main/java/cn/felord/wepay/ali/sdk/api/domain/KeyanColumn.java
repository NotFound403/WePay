package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 字段
 *
 * @author auto create
 * @since 1.0, 2017-06-08 15:02:24
 */
public class KeyanColumn extends AlipayObject {

	private static final long serialVersionUID = 3714993799279781192L;

	/**
	 * 密码
	 */
	@ApiField("password")
	private String password;

	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
