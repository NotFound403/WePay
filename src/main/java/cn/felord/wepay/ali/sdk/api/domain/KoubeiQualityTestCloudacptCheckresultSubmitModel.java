package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 云验收检测结果提交
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiQualityTestCloudacptCheckresultSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 3895739164188112335L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 付款码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 批次ID
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * partenter id
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * user id
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * <p>Getter for the field <code>activityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityId() {
		return this.activityId;
	}
	/**
	 * <p>Setter for the field <code>activityId</code>.</p>
	 *
	 * @param activityId a {@link java.lang.String} object.
	 */
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	/**
	 * <p>Getter for the field <code>authCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthCode() {
		return this.authCode;
	}
	/**
	 * <p>Setter for the field <code>authCode</code>.</p>
	 *
	 * @param authCode a {@link java.lang.String} object.
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	/**
	 * <p>Getter for the field <code>batchId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchId() {
		return this.batchId;
	}
	/**
	 * <p>Setter for the field <code>batchId</code>.</p>
	 *
	 * @param batchId a {@link java.lang.String} object.
	 */
	public void setBatchId(String batchId) {
		this.batchId = batchId;
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
	 * <p>Getter for the field <code>pid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPid() {
		return this.pid;
	}
	/**
	 * <p>Setter for the field <code>pid</code>.</p>
	 *
	 * @param pid a {@link java.lang.String} object.
	 */
	public void setPid(String pid) {
		this.pid = pid;
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
	 * <p>Getter for the field <code>uid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUid() {
		return this.uid;
	}
	/**
	 * <p>Setter for the field <code>uid</code>.</p>
	 *
	 * @param uid a {@link java.lang.String} object.
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

}
