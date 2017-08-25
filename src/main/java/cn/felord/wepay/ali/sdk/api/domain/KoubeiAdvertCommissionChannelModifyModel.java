package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑客渠道管理接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertCommissionChannelModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1533786629195736329L;

	/**
	 * 修改渠道信息(新增、删除、修改渠道不可同时为空)
	 */
	@ApiListField("channels")
	@ApiField("kb_advert_modify_channel_request")
	private List<KbAdvertModifyChannelRequest> channels;

	/**
	 * <p>Getter for the field <code>channels</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KbAdvertModifyChannelRequest> getChannels() {
		return this.channels;
	}
	/**
	 * <p>Setter for the field <code>channels</code>.</p>
	 *
	 * @param channels a {@link java.util.List} object.
	 */
	public void setChannels(List<KbAdvertModifyChannelRequest> channels) {
		this.channels = channels;
	}

}
