package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 云验收单品列表查询(废弃)
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiQualityTestCloudacptItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8831232285189368454L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 批次id
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * partener id
	 */
	@ApiField("pid")
	private String pid;

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
