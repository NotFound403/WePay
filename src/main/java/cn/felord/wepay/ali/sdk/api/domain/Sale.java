package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 促销信息集合，JSON格式
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>describe</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDescribe() {
		return this.describe;
	}
	/**
	 * <p>Setter for the field <code>describe</code>.</p>
	 *
	 * @param describe a {@link java.lang.String} object.
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	/**
	 * <p>Getter for the field <code>endTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEndTime() {
		return this.endTime;
	}
	/**
	 * <p>Setter for the field <code>endTime</code>.</p>
	 *
	 * @param endTime a {@link java.lang.String} object.
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * <p>Getter for the field <code>startTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStartTime() {
		return this.startTime;
	}
	/**
	 * <p>Setter for the field <code>startTime</code>.</p>
	 *
	 * @param startTime a {@link java.lang.String} object.
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
