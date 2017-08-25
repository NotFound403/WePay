package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 产品参与者关联信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ProdIPRelationVO extends AlipayObject {

	private static final long serialVersionUID = 7821357964194465629L;

	/**
	 * 参与者别名
	 */
	@ApiField("ip_alias_name")
	private String ipAliasName;

	/**
	 * 参与者所属平台
	 */
	@ApiField("ip_belong_platform")
	private String ipBelongPlatform;

	/**
	 * 参与者编码
	 */
	@ApiField("ip_code")
	private String ipCode;

	/**
	 * 参与者名称
	 */
	@ApiField("ip_name")
	private String ipName;

	/**
	 * 参与者子类型
	 */
	@ApiField("ip_sub_type")
	private String ipSubType;

	/**
	 * 参与者类型
	 */
	@ApiField("ip_type")
	private String ipType;

	/**
	 * 产品编码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 参与者平台Id
	 */
	@ApiField("role_id")
	private String roleId;

	/**
	 * <p>Getter for the field <code>ipAliasName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpAliasName() {
		return this.ipAliasName;
	}
	/**
	 * <p>Setter for the field <code>ipAliasName</code>.</p>
	 *
	 * @param ipAliasName a {@link java.lang.String} object.
	 */
	public void setIpAliasName(String ipAliasName) {
		this.ipAliasName = ipAliasName;
	}

	/**
	 * <p>Getter for the field <code>ipBelongPlatform</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpBelongPlatform() {
		return this.ipBelongPlatform;
	}
	/**
	 * <p>Setter for the field <code>ipBelongPlatform</code>.</p>
	 *
	 * @param ipBelongPlatform a {@link java.lang.String} object.
	 */
	public void setIpBelongPlatform(String ipBelongPlatform) {
		this.ipBelongPlatform = ipBelongPlatform;
	}

	/**
	 * <p>Getter for the field <code>ipCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpCode() {
		return this.ipCode;
	}
	/**
	 * <p>Setter for the field <code>ipCode</code>.</p>
	 *
	 * @param ipCode a {@link java.lang.String} object.
	 */
	public void setIpCode(String ipCode) {
		this.ipCode = ipCode;
	}

	/**
	 * <p>Getter for the field <code>ipName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpName() {
		return this.ipName;
	}
	/**
	 * <p>Setter for the field <code>ipName</code>.</p>
	 *
	 * @param ipName a {@link java.lang.String} object.
	 */
	public void setIpName(String ipName) {
		this.ipName = ipName;
	}

	/**
	 * <p>Getter for the field <code>ipSubType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpSubType() {
		return this.ipSubType;
	}
	/**
	 * <p>Setter for the field <code>ipSubType</code>.</p>
	 *
	 * @param ipSubType a {@link java.lang.String} object.
	 */
	public void setIpSubType(String ipSubType) {
		this.ipSubType = ipSubType;
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

	/**
	 * <p>Getter for the field <code>prodCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdCode() {
		return this.prodCode;
	}
	/**
	 * <p>Setter for the field <code>prodCode</code>.</p>
	 *
	 * @param prodCode a {@link java.lang.String} object.
	 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	/**
	 * <p>Getter for the field <code>prodVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdVersion() {
		return this.prodVersion;
	}
	/**
	 * <p>Setter for the field <code>prodVersion</code>.</p>
	 *
	 * @param prodVersion a {@link java.lang.String} object.
	 */
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

	/**
	 * <p>Getter for the field <code>roleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRoleId() {
		return this.roleId;
	}
	/**
	 * <p>Setter for the field <code>roleId</code>.</p>
	 *
	 * @param roleId a {@link java.lang.String} object.
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
