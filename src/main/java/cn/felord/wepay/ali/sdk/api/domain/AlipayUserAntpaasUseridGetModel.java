package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝会员注册提前获取userId
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserAntpaasUseridGetModel extends AlipayObject {

	private static final long serialVersionUID = 7118164746136116556L;

	/**
	 * 账户登录号，邮箱或者手机号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * <p>Getter for the field <code>logonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogonId() {
		return this.logonId;
	}
	/**
	 * <p>Setter for the field <code>logonId</code>.</p>
	 *
	 * @param logonId a {@link java.lang.String} object.
	 */
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
