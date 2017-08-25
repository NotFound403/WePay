package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑客渠道删除接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertCommissionChannelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8836855117289978328L;

	/**
	 * 需要删除的渠道ID列表
	 */
	@ApiListField("channel_ids")
	@ApiField("string")
	private List<String> channelIds;

	/**
	 * <p>Getter for the field <code>channelIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getChannelIds() {
		return this.channelIds;
	}
	/**
	 * <p>Setter for the field <code>channelIds</code>.</p>
	 *
	 * @param channelIds a {@link java.util.List} object.
	 */
	public void setChannelIds(List<String> channelIds) {
		this.channelIds = channelIds;
	}

}
