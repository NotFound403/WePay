package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 券不可用时间
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ForbbidenTime extends AlipayObject {

	private static final long serialVersionUID = 3381687817963418218L;

	/**
	 * 不可用日期区间，仅支持到天
不可用区间起止日期用逗号分隔，多个区间之间用^分隔
如"2016-05-01,2016-05-03^2016-10-01,2016-10-07"表示2016年5月1日至5月3日，10月1日至10月7日券不可用
	 */
	@ApiField("days")
	private String days;

	/**
	 * <p>Getter for the field <code>days</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDays() {
		return this.days;
	}
	/**
	 * <p>Setter for the field <code>days</code>.</p>
	 *
	 * @param days a {@link java.lang.String} object.
	 */
	public void setDays(String days) {
		this.days = days;
	}

}
