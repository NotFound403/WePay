package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝会员注册提前获取userId
 *
 * @author auto create
 * @since 1.0, 2016-10-25 19:01:45
 */
public class AlipayUserAntpaasUseridGetModel extends AlipayObject {

	private static final long serialVersionUID = 7118164746136116556L;

	/**
	 * 账户登录号，邮箱或者手机号
	 */
	@ApiField("logon_id")
	private String logonId;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
