package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 渠道新增接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertCommissionChannelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3557475363789267812L;

	/**
	 * 新增渠道列表
	 */
	@ApiListField("channels")
	@ApiField("kb_advert_add_channel_request")
	private List<KbAdvertAddChannelRequest> channels;

	/**
	 * <p>Getter for the field <code>channels</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KbAdvertAddChannelRequest> getChannels() {
		return this.channels;
	}
	/**
	 * <p>Setter for the field <code>channels</code>.</p>
	 *
	 * @param channels a {@link java.util.List} object.
	 */
	public void setChannels(List<KbAdvertAddChannelRequest> channels) {
		this.channels = channels;
	}

}
