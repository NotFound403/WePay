package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝账户风险风险
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityRiskCustomerriskrankGetModel extends AlipayObject {

	private static final long serialVersionUID = 3681739823348744276L;

	/**
	 * 证件号码，除了场景id必填，其他几个参数不能同时为空
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 证件类型，除了场景id必填，其他几个参数不能同时为空
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 手机号，除了场景id必填，其他几个参数不能同时为空
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 支付宝账户id ，除了场景id必填，其他几个参数不能同时为空
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>cardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardNo() {
		return this.cardNo;
	}
	/**
	 * <p>Setter for the field <code>cardNo</code>.</p>
	 *
	 * @param cardNo a {@link java.lang.String} object.
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * <p>Getter for the field <code>cardType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardType() {
		return this.cardType;
	}
	/**
	 * <p>Setter for the field <code>cardType</code>.</p>
	 *
	 * @param cardType a {@link java.lang.String} object.
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * <p>Getter for the field <code>mobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobile() {
		return this.mobile;
	}
	/**
	 * <p>Setter for the field <code>mobile</code>.</p>
	 *
	 * @param mobile a {@link java.lang.String} object.
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * <p>Getter for the field <code>sceneId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSceneId() {
		return this.sceneId;
	}
	/**
	 * <p>Setter for the field <code>sceneId</code>.</p>
	 *
	 * @param sceneId a {@link java.lang.String} object.
	 */
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
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
