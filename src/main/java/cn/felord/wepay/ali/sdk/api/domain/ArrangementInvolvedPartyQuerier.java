package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 合约参与者选择器，根据参与者查询合约编号
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ArrangementInvolvedPartyQuerier extends AlipayObject {

	private static final long serialVersionUID = 1723287712624136844L;

	/**
	 * 参与者id
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 用户uid/参与者角色id
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 参与者角色类型，为空时表示所有类型都查询.
可选值：01 甲方 11 乙方 21丙方
	 */
	@ApiField("ip_type")
	private String ipType;

	/**
	 * <p>Getter for the field <code>ipId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpId() {
		return this.ipId;
	}
	/**
	 * <p>Setter for the field <code>ipId</code>.</p>
	 *
	 * @param ipId a {@link java.lang.String} object.
	 */
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	/**
	 * <p>Getter for the field <code>ipRoleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpRoleId() {
		return this.ipRoleId;
	}
	/**
	 * <p>Setter for the field <code>ipRoleId</code>.</p>
	 *
	 * @param ipRoleId a {@link java.lang.String} object.
	 */
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	/**
	 * <p>Getter for the field <code>ipType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpType() {
		return this.ipType;
	}
	/**
	 * <p>Setter for the field <code>ipType</code>.</p>
	 *
	 * @param ipType a {@link java.lang.String} object.
	 */
	public void setIpType(String ipType) {
		this.ipType = ipType;
	}

}
