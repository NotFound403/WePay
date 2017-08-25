package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统广告渠道模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertAdvChannelResponse extends AlipayObject {

	private static final long serialVersionUID = 7215241498799931661L;

	/**
	 * 广告内容模型
	 */
	@ApiListField("adv_content_list")
	@ApiField("kb_advert_adv_content_response")
	private List<KbAdvertAdvContentResponse> advContentList;

	/**
	 * 广告id
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 渠道ID
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_name")
	private String channelName;

	/**
	 * 渠道类型
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * <p>Getter for the field <code>advContentList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KbAdvertAdvContentResponse> getAdvContentList() {
		return this.advContentList;
	}
	/**
	 * <p>Setter for the field <code>advContentList</code>.</p>
	 *
	 * @param advContentList a {@link java.util.List} object.
	 */
	public void setAdvContentList(List<KbAdvertAdvContentResponse> advContentList) {
		this.advContentList = advContentList;
	}

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
	 * <p>Getter for the field <code>channelId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelId() {
		return this.channelId;
	}
	/**
	 * <p>Setter for the field <code>channelId</code>.</p>
	 *
	 * @param channelId a {@link java.lang.String} object.
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	/**
	 * <p>Getter for the field <code>channelName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelName() {
		return this.channelName;
	}
	/**
	 * <p>Setter for the field <code>channelName</code>.</p>
	 *
	 * @param channelName a {@link java.lang.String} object.
	 */
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	/**
	 * <p>Getter for the field <code>channelType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelType() {
		return this.channelType;
	}
	/**
	 * <p>Setter for the field <code>channelType</code>.</p>
	 *
	 * @param channelType a {@link java.lang.String} object.
	 */
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

}
