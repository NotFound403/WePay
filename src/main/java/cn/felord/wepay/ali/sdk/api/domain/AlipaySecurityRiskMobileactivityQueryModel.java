package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 客户风险评级客户绑定手机活跃度服务
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityRiskMobileactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3666259531636973458L;

	/**
	 * 账户绑定手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 场景名称
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

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
