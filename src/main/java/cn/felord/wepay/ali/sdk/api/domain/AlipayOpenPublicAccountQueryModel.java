package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询绑定商户会员号
 *
 * @author auto create
 * @since 1.0, 2016-08-10 17:28:37
 */
public class AlipayOpenPublicAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5547643319364839756L;

	/**
	 * 支付宝账号userid，2088开头长度为16位的字符串
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
