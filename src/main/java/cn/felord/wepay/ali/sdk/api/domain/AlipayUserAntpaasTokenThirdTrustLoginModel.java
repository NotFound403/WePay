package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 申请第三方app与蚂蚁通行证免登token
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserAntpaasTokenThirdTrustLoginModel extends AlipayObject {

	private static final long serialVersionUID = 4872278758492264327L;

	/**
	 * 登录的目标业务，目前已经分配的有autoins，代表车险业务
	 */
	@ApiField("login_target")
	private String loginTarget;

	/**
	 * <p>Getter for the field <code>loginTarget</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoginTarget() {
		return this.loginTarget;
	}
	/**
	 * <p>Setter for the field <code>loginTarget</code>.</p>
	 *
	 * @param loginTarget a {@link java.lang.String} object.
	 */
	public void setLoginTarget(String loginTarget) {
		this.loginTarget = loginTarget;
	}

}
