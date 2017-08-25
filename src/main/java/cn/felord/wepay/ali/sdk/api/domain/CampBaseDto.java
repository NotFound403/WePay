package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 活动基本信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CampBaseDto extends AlipayObject {

	private static final long serialVersionUID = 7345923383749529666L;

	/**
	 * 活动工单列表
	 */
	@ApiListField("activity_orders")
	@ApiField("activity_order_d_t_o")
	private List<ActivityOrderDTO> activityOrders;

	/**
	 * 活动审核状态，AUDITING为审核中,REJECT为驳回，不返回为成功
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 是否自动续期，Y为是，N为否，为空表示否
	 */
	@ApiField("auto_delay_flag")
	private String autoDelayFlag;

	/**
	 * 截至时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 活动id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 招商状态,GOING招商中，ENDED招商结束，OFFLINE下架
	 */
	@ApiField("plan_status")
	private String planStatus;

	/**
	 * 启动时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 活动状态,CREATED:草稿，ENABLED：生效，DISABLED：无效，STARTED：启动，CLOSED：停止，FINISHED：完成
	 */
	@ApiField("status")
	private String status;

	/**
	 * 活动类型.DIRECT_SEND:直发奖,CONSUME_SEND:消费送
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>activityOrders</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ActivityOrderDTO> getActivityOrders() {
		return this.activityOrders;
	}
	/**
	 * <p>Setter for the field <code>activityOrders</code>.</p>
	 *
	 * @param activityOrders a {@link java.util.List} object.
	 */
	public void setActivityOrders(List<ActivityOrderDTO> activityOrders) {
		this.activityOrders = activityOrders;
	}

	/**
	 * <p>Getter for the field <code>auditStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditStatus() {
		return this.auditStatus;
	}
	/**
	 * <p>Setter for the field <code>auditStatus</code>.</p>
	 *
	 * @param auditStatus a {@link java.lang.String} object.
	 */
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	/**
	 * <p>Getter for the field <code>autoDelayFlag</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAutoDelayFlag() {
		return this.autoDelayFlag;
	}
	/**
	 * <p>Setter for the field <code>autoDelayFlag</code>.</p>
	 *
	 * @param autoDelayFlag a {@link java.lang.String} object.
	 */
	public void setAutoDelayFlag(String autoDelayFlag) {
		this.autoDelayFlag = autoDelayFlag;
	}

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
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>planStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPlanStatus() {
		return this.planStatus;
	}
	/**
	 * <p>Setter for the field <code>planStatus</code>.</p>
	 *
	 * @param planStatus a {@link java.lang.String} object.
	 */
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
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

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
