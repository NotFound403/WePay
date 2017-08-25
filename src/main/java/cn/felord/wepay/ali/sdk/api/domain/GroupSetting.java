package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 建群时的群设置
 *
 * @author auto create
 * @version $Id: $Id
 */
public class GroupSetting extends AlipayObject {

	private static final long serialVersionUID = 8474695326816633865L;

	/**
	 * 群名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 是否开放群成员邀请
	 */
	@ApiField("is_openinv")
	private Boolean isOpeninv;

	/**
	 * 群公告
	 */
	@ApiField("public_notice")
	private String publicNotice;

	/**
	 * <p>Getter for the field <code>groupName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGroupName() {
		return this.groupName;
	}
	/**
	 * <p>Setter for the field <code>groupName</code>.</p>
	 *
	 * @param groupName a {@link java.lang.String} object.
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * <p>Getter for the field <code>isOpeninv</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIsOpeninv() {
		return this.isOpeninv;
	}
	/**
	 * <p>Setter for the field <code>isOpeninv</code>.</p>
	 *
	 * @param isOpeninv a {@link java.lang.Boolean} object.
	 */
	public void setIsOpeninv(Boolean isOpeninv) {
		this.isOpeninv = isOpeninv;
	}

	/**
	 * <p>Getter for the field <code>publicNotice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicNotice() {
		return this.publicNotice;
	}
	/**
	 * <p>Setter for the field <code>publicNotice</code>.</p>
	 *
	 * @param publicNotice a {@link java.lang.String} object.
	 */
	public void setPublicNotice(String publicNotice) {
		this.publicNotice = publicNotice;
	}

}
