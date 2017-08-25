package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 更新服务者可用时间接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDaoweiSpScheduleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1853776348829933758L;

	/**
	 * 服务者的可用时间表。其中Duration和Unit配合使用，例如duration=30，unit=MIN表示将一天分为以30分钟一小段的时间片段。Unit：目前支持MIN（分钟）。Date：YYYY-MM-DD格式。Bitmap：根据定义的间隔长度跟单位，将date的时间切分，例如将2016-11-29整天按30分钟为一段切分为48段： 111111111111111111111111111111111110000011111111 ， 其中0表示不可用，1表示可用，如果工作日全天可用则每个分段都为1
	 */
	@ApiField("calendar_schedule")
	private CalendarScheduleInfo calendarSchedule;

	/**
	 * 商家服务者id，由商家维护的该商家下某个服务者的唯一标识，仅支持数字、字母和下划线的组合
	 */
	@ApiField("out_sp_id")
	private String outSpId;

	/**
	 * <p>Getter for the field <code>calendarSchedule</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.CalendarScheduleInfo} object.
	 */
	public CalendarScheduleInfo getCalendarSchedule() {
		return this.calendarSchedule;
	}
	/**
	 * <p>Setter for the field <code>calendarSchedule</code>.</p>
	 *
	 * @param calendarSchedule a {@link cn.felord.wepay.ali.sdk.api.domain.CalendarScheduleInfo} object.
	 */
	public void setCalendarSchedule(CalendarScheduleInfo calendarSchedule) {
		this.calendarSchedule = calendarSchedule;
	}

	/**
	 * <p>Getter for the field <code>outSpId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutSpId() {
		return this.outSpId;
	}
	/**
	 * <p>Setter for the field <code>outSpId</code>.</p>
	 *
	 * @param outSpId a {@link java.lang.String} object.
	 */
	public void setOutSpId(String outSpId) {
		this.outSpId = outSpId;
	}

}
