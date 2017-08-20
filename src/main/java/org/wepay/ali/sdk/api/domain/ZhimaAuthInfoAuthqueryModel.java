package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询是否授权的接口
 *
 * @author auto create
 * @since 1.0, 2016-09-21 19:49:58
 */
public class ZhimaAuthInfoAuthqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7469464687422927985L;

	/**
	 * json格式的内容,包含userId,userId为支付宝用户id,用户授权后商户可以拿到这个支付宝userId
	 */
	@ApiField("identity_param")
	private String identityParam;

	public String getIdentityParam() {
		return this.identityParam;
	}
	public void setIdentityParam(String identityParam) {
		this.identityParam = identityParam;
	}

}
