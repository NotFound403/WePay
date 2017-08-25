package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询某个ISV下的指定app_auth_token的授权信息：授权者、授权接口列表、状态、过期时间等
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAuthTokenAppQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7184924658259995412L;

	/**
	 * 应用授权令牌
	 */
	@ApiField("app_auth_token")
	private String appAuthToken;

	/**
	 * <p>Getter for the field <code>appAuthToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppAuthToken() {
		return this.appAuthToken;
	}
	/**
	 * <p>Setter for the field <code>appAuthToken</code>.</p>
	 *
	 * @param appAuthToken a {@link java.lang.String} object.
	 */
	public void setAppAuthToken(String appAuthToken) {
		this.appAuthToken = appAuthToken;
	}

}
