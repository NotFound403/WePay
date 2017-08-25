package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 渠道修改入参
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertModifyChannelRequest extends AlipayObject {

	private static final long serialVersionUID = 3389991557738589321L;

	/**
	 * 渠道ID（渠道创建接口中，返回的channelID）
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 渠道说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 渠道名称
	 */
	@ApiField("name")
	private String name;

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
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

}
