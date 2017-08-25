package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 用户步数信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class StepcounterDataInfo extends AlipayObject {

	private static final long serialVersionUID = 4111645942732362788L;

	/**
	 * 用户的日计步值。为用户某个时区下某个日期的步数总值。
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 查询到的步数所在日期。
	 */
	@ApiField("count_date")
	private String countDate;

	/**
	 * 返回的用户日计步数所在时区。若入参中时区不为空，则此返回与入参相同; 若入参中时区为空，则返回用户设备所在时区步数。
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * <p>Getter for the field <code>count</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCount() {
		return this.count;
	}
	/**
	 * <p>Setter for the field <code>count</code>.</p>
	 *
	 * @param count a {@link java.lang.Long} object.
	 */
	public void setCount(Long count) {
		this.count = count;
	}

	/**
	 * <p>Getter for the field <code>countDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCountDate() {
		return this.countDate;
	}
	/**
	 * <p>Setter for the field <code>countDate</code>.</p>
	 *
	 * @param countDate a {@link java.lang.String} object.
	 */
	public void setCountDate(String countDate) {
		this.countDate = countDate;
	}

	/**
	 * <p>Getter for the field <code>timeZone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTimeZone() {
		return this.timeZone;
	}
	/**
	 * <p>Setter for the field <code>timeZone</code>.</p>
	 *
	 * @param timeZone a {@link java.lang.String} object.
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

}
