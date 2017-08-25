package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保养数据变更通知
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMaintainDataUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 7399534922993122879L;

	/**
	 * 门店或者服务的编码
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 事件类型(1:上下线 2:服务价格)
	 */
	@ApiField("event_id")
	private Long eventId;

	/**
	 * 来源(1:汽车超人)
	 */
	@ApiField("source")
	private String source;

	/**
	 * 类型(1:门店 2:服务)
	 */
	@ApiField("type_id")
	private String typeId;

	/**
	 * <p>Getter for the field <code>bizId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizId() {
		return this.bizId;
	}
	/**
	 * <p>Setter for the field <code>bizId</code>.</p>
	 *
	 * @param bizId a {@link java.lang.String} object.
	 */
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	/**
	 * <p>Getter for the field <code>eventId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getEventId() {
		return this.eventId;
	}
	/**
	 * <p>Setter for the field <code>eventId</code>.</p>
	 *
	 * @param eventId a {@link java.lang.Long} object.
	 */
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	/**
	 * <p>Getter for the field <code>source</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSource() {
		return this.source;
	}
	/**
	 * <p>Setter for the field <code>source</code>.</p>
	 *
	 * @param source a {@link java.lang.String} object.
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * <p>Getter for the field <code>typeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTypeId() {
		return this.typeId;
	}
	/**
	 * <p>Setter for the field <code>typeId</code>.</p>
	 *
	 * @param typeId a {@link java.lang.String} object.
	 */
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

}
