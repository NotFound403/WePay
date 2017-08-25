package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 延迟生效信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DelayInfo extends AlipayObject {

	private static final long serialVersionUID = 4439848625245145127L;

	/**
	 * 延迟类型，目前支持以下类型
ABSOLUTELY：按绝对值延迟
BYDAY：按天延迟
	 */
	@ApiField("type")
	private String type;

	/**
	 * 延迟值，单位分钟
按绝对值延迟延迟24*60 (1天)表示，当日08:00:00领到的券要到隔日的08:00:00才能使用
按天延迟延迟24*60(1天)表示，当日08:00:00领到的券，隔日00:00:00点就可以用
	 */
	@ApiField("value")
	private String value;

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * <p>Getter for the field <code>value</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValue() {
		return this.value;
	}
	/**
	 * <p>Setter for the field <code>value</code>.</p>
	 *
	 * @param value a {@link java.lang.String} object.
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
