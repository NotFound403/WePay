package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 添加广告的渠道关系接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertCommissionAdvchannelBindModel extends AlipayObject {

	private static final long serialVersionUID = 2594646565485736684L;

	/**
	 * 广告id
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 渠道ID列表
	 */
	@ApiListField("channel_id_list")
	@ApiField("string")
	private List<String> channelIdList;

	/**
	 * <p>Getter for the field <code>advId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdvId() {
		return this.advId;
	}
	/**
	 * <p>Setter for the field <code>advId</code>.</p>
	 *
	 * @param advId a {@link java.lang.String} object.
	 */
	public void setAdvId(String advId) {
		this.advId = advId;
	}

	/**
	 * <p>Getter for the field <code>channelIdList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getChannelIdList() {
		return this.channelIdList;
	}
	/**
	 * <p>Setter for the field <code>channelIdList</code>.</p>
	 *
	 * @param channelIdList a {@link java.util.List} object.
	 */
	public void setChannelIdList(List<String> channelIdList) {
		this.channelIdList = channelIdList;
	}

}
