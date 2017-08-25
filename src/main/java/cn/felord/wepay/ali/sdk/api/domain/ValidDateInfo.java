package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 有效期
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ValidDateInfo extends AlipayObject {

	private static final long serialVersionUID = 3717368843728674357L;

	/**
	 * 截至时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 相对有效期
	 */
	@ApiField("relative_time")
	private PeriodInfo relativeTime;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 时间模式,RELATIVE=相对时间，RELATIVE=绝对模式
	 */
	@ApiField("time_mode")
	private String timeMode;

	/**
	 * <p>Getter for the field <code>endTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEndTime() {
		return this.endTime;
	}
	/**
	 * <p>Setter for the field <code>endTime</code>.</p>
	 *
	 * @param endTime a {@link java.util.Date} object.
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * <p>Getter for the field <code>relativeTime</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.PeriodInfo} object.
	 */
	public PeriodInfo getRelativeTime() {
		return this.relativeTime;
	}
	/**
	 * <p>Setter for the field <code>relativeTime</code>.</p>
	 *
	 * @param relativeTime a {@link cn.felord.wepay.ali.sdk.api.domain.PeriodInfo} object.
	 */
	public void setRelativeTime(PeriodInfo relativeTime) {
		this.relativeTime = relativeTime;
	}

	/**
	 * <p>Getter for the field <code>startTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartTime() {
		return this.startTime;
	}
	/**
	 * <p>Setter for the field <code>startTime</code>.</p>
	 *
	 * @param startTime a {@link java.util.Date} object.
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * <p>Getter for the field <code>timeMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTimeMode() {
		return this.timeMode;
	}
	/**
	 * <p>Setter for the field <code>timeMode</code>.</p>
	 *
	 * @param timeMode a {@link java.lang.String} object.
	 */
	public void setTimeMode(String timeMode) {
		this.timeMode = timeMode;
	}

}
