package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 全息信用2.0联系人信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class HoloGraphicContactInfo extends AlipayObject {

	private static final long serialVersionUID = 6491273548451933416L;

	/**
	 * 主叫通话频次
	 */
	@ApiField("call_frequency")
	private Long callFrequency;

	/**
	 * 主叫通话时长
	 */
	@ApiField("call_time")
	private Long callTime;

	/**
	 * 被叫通话频次
	 */
	@ApiField("called_frequency")
	private Long calledFrequency;

	/**
	 * 被叫通话时长
	 */
	@ApiField("called_time")
	private Long calledTime;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 通话频次
	 */
	@ApiField("talk_frequency")
	private Long talkFrequency;

	/**
	 * 通话时长
	 */
	@ApiField("talk_time")
	private Long talkTime;

	/**
	 * <p>Getter for the field <code>callFrequency</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCallFrequency() {
		return this.callFrequency;
	}
	/**
	 * <p>Setter for the field <code>callFrequency</code>.</p>
	 *
	 * @param callFrequency a {@link java.lang.Long} object.
	 */
	public void setCallFrequency(Long callFrequency) {
		this.callFrequency = callFrequency;
	}

	/**
	 * <p>Getter for the field <code>callTime</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCallTime() {
		return this.callTime;
	}
	/**
	 * <p>Setter for the field <code>callTime</code>.</p>
	 *
	 * @param callTime a {@link java.lang.Long} object.
	 */
	public void setCallTime(Long callTime) {
		this.callTime = callTime;
	}

	/**
	 * <p>Getter for the field <code>calledFrequency</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCalledFrequency() {
		return this.calledFrequency;
	}
	/**
	 * <p>Setter for the field <code>calledFrequency</code>.</p>
	 *
	 * @param calledFrequency a {@link java.lang.Long} object.
	 */
	public void setCalledFrequency(Long calledFrequency) {
		this.calledFrequency = calledFrequency;
	}

	/**
	 * <p>Getter for the field <code>calledTime</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCalledTime() {
		return this.calledTime;
	}
	/**
	 * <p>Setter for the field <code>calledTime</code>.</p>
	 *
	 * @param calledTime a {@link java.lang.Long} object.
	 */
	public void setCalledTime(Long calledTime) {
		this.calledTime = calledTime;
	}

	/**
	 * <p>Getter for the field <code>mobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobile() {
		return this.mobile;
	}
	/**
	 * <p>Setter for the field <code>mobile</code>.</p>
	 *
	 * @param mobile a {@link java.lang.String} object.
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * <p>Getter for the field <code>talkFrequency</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTalkFrequency() {
		return this.talkFrequency;
	}
	/**
	 * <p>Setter for the field <code>talkFrequency</code>.</p>
	 *
	 * @param talkFrequency a {@link java.lang.Long} object.
	 */
	public void setTalkFrequency(Long talkFrequency) {
		this.talkFrequency = talkFrequency;
	}

	/**
	 * <p>Getter for the field <code>talkTime</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTalkTime() {
		return this.talkTime;
	}
	/**
	 * <p>Setter for the field <code>talkTime</code>.</p>
	 *
	 * @param talkTime a {@link java.lang.Long} object.
	 */
	public void setTalkTime(Long talkTime) {
		this.talkTime = talkTime;
	}

}
