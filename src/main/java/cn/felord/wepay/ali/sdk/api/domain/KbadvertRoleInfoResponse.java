package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 签约情况
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbadvertRoleInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 2159192631177557717L;

	/**
	 * 角色code
	 */
	@ApiField("role_code")
	private String roleCode;

	/**
	 * NOT_OPEN:未开通
OPENED:已经开通
	 */
	@ApiField("status")
	private String status;

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
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
