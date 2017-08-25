package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询是否授权的接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaAuthInfoAuthqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7469464687422927985L;

	/**
	 * json格式的内容,包含userId,userId为支付宝用户id,用户授权后商户可以拿到这个支付宝userId
	 */
	@ApiField("identity_param")
	private String identityParam;

	/**
	 * <p>Getter for the field <code>identityParam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdentityParam() {
		return this.identityParam;
	}
	/**
	 * <p>Setter for the field <code>identityParam</code>.</p>
	 *
	 * @param identityParam a {@link java.lang.String} object.
	 */
	public void setIdentityParam(String identityParam) {
		this.identityParam = identityParam;
	}

}
