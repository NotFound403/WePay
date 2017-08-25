package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 发放规则
 *
 * @author auto create
 * @version $Id: $Id
 */
public class GetRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 8741722747379622856L;

	/**
	 * 截至时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 发放次数限制
	 */
	@ApiField("get_count_limit")
	private PeriodInfo getCountLimit;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

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
	 * <p>Getter for the field <code>getCountLimit</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.PeriodInfo} object.
	 */
	public PeriodInfo getGetCountLimit() {
		return this.getCountLimit;
	}
	/**
	 * <p>Setter for the field <code>getCountLimit</code>.</p>
	 *
	 * @param getCountLimit a {@link cn.felord.wepay.ali.sdk.api.domain.PeriodInfo} object.
	 */
	public void setGetCountLimit(PeriodInfo getCountLimit) {
		this.getCountLimit = getCountLimit;
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

}
