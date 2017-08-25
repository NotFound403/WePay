package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 生活号用户匹配器
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Matcher extends AlipayObject {

	private static final long serialVersionUID = 8889631868438721647L;

	/**
	 * 身份证号码，与user_id、mobile_no不能同时为空
	 */
	@ApiField("identity_card")
	private String identityCard;

	/**
	 * 手机号码，与user_id、identity_card不能同时为空
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 支付宝用户id，2088开头16位长度的字符串，与mobile_no、identity_card不能同时为空
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>identityCard</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdentityCard() {
		return this.identityCard;
	}
	/**
	 * <p>Setter for the field <code>identityCard</code>.</p>
	 *
	 * @param identityCard a {@link java.lang.String} object.
	 */
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	/**
	 * <p>Getter for the field <code>mobileNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobileNo() {
		return this.mobileNo;
	}
	/**
	 * <p>Setter for the field <code>mobileNo</code>.</p>
	 *
	 * @param mobileNo a {@link java.lang.String} object.
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
