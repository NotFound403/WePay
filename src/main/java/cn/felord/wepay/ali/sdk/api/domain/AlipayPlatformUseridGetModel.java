package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 根据OpenId获取UserId
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPlatformUseridGetModel extends AlipayObject {

	private static final long serialVersionUID = 8277953562447728978L;

	/**
	 * openId的列表
	 */
	@ApiListField("open_ids")
	@ApiField("string")
	private List<String> openIds;

	/**
	 * <p>Getter for the field <code>openIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getOpenIds() {
		return this.openIds;
	}
	/**
	 * <p>Setter for the field <code>openIds</code>.</p>
	 *
	 * @param openIds a {@link java.util.List} object.
	 */
	public void setOpenIds(List<String> openIds) {
		this.openIds = openIds;
	}

}
