package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 招商信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RecruitInfo extends AlipayObject {

	private static final long serialVersionUID = 4197912332865531738L;

	/**
	 * 招商结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 是否参与门店参与了招商
	 */
	@ApiField("exclude_constraint_shops")
	private Boolean excludeConstraintShops;

	/**
	 * 招商方案id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 招商开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 招商状态
	 */
	@ApiField("status")
	private String status;

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
	 * <p>Getter for the field <code>excludeConstraintShops</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getExcludeConstraintShops() {
		return this.excludeConstraintShops;
	}
	/**
	 * <p>Setter for the field <code>excludeConstraintShops</code>.</p>
	 *
	 * @param excludeConstraintShops a {@link java.lang.Boolean} object.
	 */
	public void setExcludeConstraintShops(Boolean excludeConstraintShops) {
		this.excludeConstraintShops = excludeConstraintShops;
	}

	/**
	 * <p>Getter for the field <code>planId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPlanId() {
		return this.planId;
	}
	/**
	 * <p>Setter for the field <code>planId</code>.</p>
	 *
	 * @param planId a {@link java.lang.String} object.
	 */
	public void setPlanId(String planId) {
		this.planId = planId;
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
