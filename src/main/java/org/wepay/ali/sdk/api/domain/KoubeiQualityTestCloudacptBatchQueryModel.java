package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 云验收单品列表查询
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:16
 */
public class KoubeiQualityTestCloudacptBatchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3134737217466818652L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

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

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
