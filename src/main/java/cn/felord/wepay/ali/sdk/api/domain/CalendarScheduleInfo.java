package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 服务者的时间表信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CalendarScheduleInfo extends AlipayObject {

	private static final long serialVersionUID = 4493284997996445342L;

	/**
	 * 时间分段时长，字段unit为单位，如duration=30，unit=MIN，则表示二进制的时间表表示将一天分为30分钟一小段的时间片段，用来表示服务者的时间是否可用
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 服务者的服务时间表
	 */
	@ApiListField("schedule")
	@ApiField("schedule_info")
	private List<ScheduleInfo> schedule;

	/**
	 * 间隔长度单位，默认为MIN（分钟），允许的单位有DAY（天）、WEEK（周）、MONTH(月)
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * <p>Getter for the field <code>duration</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getDuration() {
		return this.duration;
	}
	/**
	 * <p>Setter for the field <code>duration</code>.</p>
	 *
	 * @param duration a {@link java.lang.Long} object.
	 */
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	/**
	 * <p>Getter for the field <code>schedule</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ScheduleInfo> getSchedule() {
		return this.schedule;
	}
	/**
	 * <p>Setter for the field <code>schedule</code>.</p>
	 *
	 * @param schedule a {@link java.util.List} object.
	 */
	public void setSchedule(List<ScheduleInfo> schedule) {
		this.schedule = schedule;
	}

	/**
	 * <p>Getter for the field <code>unit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUnit() {
		return this.unit;
	}
	/**
	 * <p>Setter for the field <code>unit</code>.</p>
	 *
	 * @param unit a {@link java.lang.String} object.
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
