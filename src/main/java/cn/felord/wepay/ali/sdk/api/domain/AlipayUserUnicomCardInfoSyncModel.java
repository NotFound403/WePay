package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝用户联通手机卡信息同步接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserUnicomCardInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1766191891156187747L;

	/**
	 * 状态发生变更的时间，返回自January 1, 1970, 00:00:00 GMT至手机号状态变更发生时的毫秒数, java代码获取示例：new Date().getTime()
	 */
	@ApiField("gmt_status_change")
	private String gmtStatusChange;

	/**
	 * 状态发生变更的用户的联通手机号码(11位，不含国家码)
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 联通手机号码状态（激活: CARD_ACTIVE, 注销: CARD_CLOSE）
	 */
	@ApiField("phone_no_status")
	private String phoneNoStatus;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>gmtStatusChange</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtStatusChange() {
		return this.gmtStatusChange;
	}
	/**
	 * <p>Setter for the field <code>gmtStatusChange</code>.</p>
	 *
	 * @param gmtStatusChange a {@link java.lang.String} object.
	 */
	public void setGmtStatusChange(String gmtStatusChange) {
		this.gmtStatusChange = gmtStatusChange;
	}

	/**
	 * <p>Getter for the field <code>phoneNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPhoneNo() {
		return this.phoneNo;
	}
	/**
	 * <p>Setter for the field <code>phoneNo</code>.</p>
	 *
	 * @param phoneNo a {@link java.lang.String} object.
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * <p>Getter for the field <code>phoneNoStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPhoneNoStatus() {
		return this.phoneNoStatus;
	}
	/**
	 * <p>Setter for the field <code>phoneNoStatus</code>.</p>
	 *
	 * @param phoneNoStatus a {@link java.lang.String} object.
	 */
	public void setPhoneNoStatus(String phoneNoStatus) {
		this.phoneNoStatus = phoneNoStatus;
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
