package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.group.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicGroupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1843633461377755827L;

	/** 
	 * 分组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * <p>Setter for the field <code>groupId</code>.</p>
	 *
	 * @param groupId a {@link java.lang.String} object.
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	/**
	 * <p>Getter for the field <code>groupId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGroupId( ) {
		return this.groupId;
	}

}
