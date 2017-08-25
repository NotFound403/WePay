package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝用户等级信息，暂时包含用户等级和登陆账号
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserLevelInfo extends AlipayObject {

	private static final long serialVersionUID = 1655126377159733684L;

	/**
	 * 支付宝用户登陆账号；邮箱优先，手机号次之
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户等级：可选5、4、3、2、1、0；等级5最高，1最低，0标示无法判断
	 */
	@ApiField("user_level")
	private String userLevel;

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

	/**
	 * <p>Getter for the field <code>userLevel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserLevel() {
		return this.userLevel;
	}
	/**
	 * <p>Setter for the field <code>userLevel</code>.</p>
	 *
	 * @param userLevel a {@link java.lang.String} object.
	 */
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

}
