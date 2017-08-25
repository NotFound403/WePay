package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑客签约查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertCommissionRoleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3515185341798729228L;

	/**
	 * 角色code码，如果不提供该字段，则会遍历所有角色，并返回user_identify是否拥有，
MISSION_PROMO：任务推广角色
MISSION_PUBLISH：任务发布角色
	 */
	@ApiField("role_code")
	private String roleCode;

	/**
	 * 用户身份主键
user_identify_type=user_id -值必须是支付宝账户ID
	 */
	@ApiField("user_identify")
	private String userIdentify;

	/**
	 * 用户身份主键类型
user_id - 支付宝账户ID
	 */
	@ApiField("user_identify_type")
	private String userIdentifyType;

	/**
	 * <p>Getter for the field <code>roleCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRoleCode() {
		return this.roleCode;
	}
	/**
	 * <p>Setter for the field <code>roleCode</code>.</p>
	 *
	 * @param roleCode a {@link java.lang.String} object.
	 */
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	/**
	 * <p>Getter for the field <code>userIdentify</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserIdentify() {
		return this.userIdentify;
	}
	/**
	 * <p>Setter for the field <code>userIdentify</code>.</p>
	 *
	 * @param userIdentify a {@link java.lang.String} object.
	 */
	public void setUserIdentify(String userIdentify) {
		this.userIdentify = userIdentify;
	}

	/**
	 * <p>Getter for the field <code>userIdentifyType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserIdentifyType() {
		return this.userIdentifyType;
	}
	/**
	 * <p>Setter for the field <code>userIdentifyType</code>.</p>
	 *
	 * @param userIdentifyType a {@link java.lang.String} object.
	 */
	public void setUserIdentifyType(String userIdentifyType) {
		this.userIdentifyType = userIdentifyType;
	}

}
