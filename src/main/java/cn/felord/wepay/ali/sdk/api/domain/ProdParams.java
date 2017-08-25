package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 签约产品属性
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ProdParams extends AlipayObject {

	private static final long serialVersionUID = 8161186651122232791L;

	/**
	 * 预授权业务信息
	 */
	@ApiField("auth_biz_params")
	private String authBizParams;

	/**
	 * <p>Getter for the field <code>authBizParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthBizParams() {
		return this.authBizParams;
	}
	/**
	 * <p>Setter for the field <code>authBizParams</code>.</p>
	 *
	 * @param authBizParams a {@link java.lang.String} object.
	 */
	public void setAuthBizParams(String authBizParams) {
		this.authBizParams = authBizParams;
	}

}
