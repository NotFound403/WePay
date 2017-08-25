package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 集卡信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CardInfo extends AlipayObject {

	private static final long serialVersionUID = 6166462994774851812L;

	/**
	 * 领取时间
	 */
	@ApiField("taken_time")
	private String takenTime;

	/**
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * <p>Getter for the field <code>takenTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTakenTime() {
		return this.takenTime;
	}
	/**
	 * <p>Setter for the field <code>takenTime</code>.</p>
	 *
	 * @param takenTime a {@link java.lang.String} object.
	 */
	public void setTakenTime(String takenTime) {
		this.takenTime = takenTime;
	}

	/**
	 * <p>Getter for the field <code>userName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * <p>Setter for the field <code>userName</code>.</p>
	 *
	 * @param userName a {@link java.lang.String} object.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
