package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询群基本信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySocialBaseGroupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2512231438842518554L;

	/**
	 * 群的id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * <p>Getter for the field <code>groupId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGroupId() {
		return this.groupId;
	}
	/**
	 * <p>Setter for the field <code>groupId</code>.</p>
	 *
	 * @param groupId a {@link java.lang.String} object.
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
