package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 和谁在一起
 *
 * @author auto create
 * @version $Id: $Id
 */
public class NewsfeedWithMeInfo extends AlipayObject {

	private static final long serialVersionUID = 6872728284897756717L;

	/**
	 * 登录ID
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>loginId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoginId() {
		return this.loginId;
	}
	/**
	 * <p>Setter for the field <code>loginId</code>.</p>
	 *
	 * @param loginId a {@link java.lang.String} object.
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
