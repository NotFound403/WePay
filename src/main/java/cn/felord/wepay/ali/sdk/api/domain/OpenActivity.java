package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 云验收活动明细
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OpenActivity extends AlipayObject {

	private static final long serialVersionUID = 3741263136582255233L;

	/**
	 * 活动结束时间
	 */
	@ApiField("activity_end_date")
	private String activityEndDate;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动开始时间
	 */
	@ApiField("activity_start_date")
	private String activityStartDate;

	/**
	 * 活动验证状态
0，未检测
1，未通过
2，已通过
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * <p>Getter for the field <code>activityEndDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityEndDate() {
		return this.activityEndDate;
	}
	/**
	 * <p>Setter for the field <code>activityEndDate</code>.</p>
	 *
	 * @param activityEndDate a {@link java.lang.String} object.
	 */
	public void setActivityEndDate(String activityEndDate) {
		this.activityEndDate = activityEndDate;
	}

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
	 * <p>Getter for the field <code>activityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityName() {
		return this.activityName;
	}
	/**
	 * <p>Setter for the field <code>activityName</code>.</p>
	 *
	 * @param activityName a {@link java.lang.String} object.
	 */
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	/**
	 * <p>Getter for the field <code>activityStartDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityStartDate() {
		return this.activityStartDate;
	}
	/**
	 * <p>Setter for the field <code>activityStartDate</code>.</p>
	 *
	 * @param activityStartDate a {@link java.lang.String} object.
	 */
	public void setActivityStartDate(String activityStartDate) {
		this.activityStartDate = activityStartDate;
	}

	/**
	 * <p>Getter for the field <code>activityStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityStatus() {
		return this.activityStatus;
	}
	/**
	 * <p>Setter for the field <code>activityStatus</code>.</p>
	 *
	 * @param activityStatus a {@link java.lang.String} object.
	 */
	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	/**
	 * <p>Getter for the field <code>storeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStoreId() {
		return this.storeId;
	}
	/**
	 * <p>Setter for the field <code>storeId</code>.</p>
	 *
	 * @param storeId a {@link java.lang.String} object.
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
