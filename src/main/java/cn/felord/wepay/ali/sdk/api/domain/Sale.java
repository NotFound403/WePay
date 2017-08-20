package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 促销信息集合，JSON格式
 *
 * @author auto create
 * @since 1.0, 2017-07-13 14:24:14
 */
public class Sale extends AlipayObject {

	private static final long serialVersionUID = 4699679955682632277L;

	/**
	 * 促销描述内容，有活动的情况下必填
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 促销活动结束时间，有活动的情况下必填
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 促销活动开始时间，有活动的情况下必填
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 活动状态，0：有效；1：停用；默认状态0：有效。有活动的情况下必填
	 */
	@ApiField("status")
	private String status;

	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
