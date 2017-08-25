package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 活动详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CampDetail extends AlipayObject {

	private static final long serialVersionUID = 4736373397284886575L;

	/**
	 * 活动工单列表
	 */
	@ApiListField("activity_orders")
	@ApiField("activity_order_d_t_o")
	private List<ActivityOrderDTO> activityOrders;

	/**
	 * 活动子状态，如审核中
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 是否自动续期该活动,Y表示是，N表示否，默认为N
	 */
	@ApiField("auto_delay_flag")
	private String autoDelayFlag;

	/**
	 * 预算信息
	 */
	@ApiField("budget_info")
	private BudgetInfo budgetInfo;

	/**
	 * 活动约束信息
	 */
	@ApiField("constraint_info")
	private ConstraintInfo constraintInfo;

	/**
	 * 活动描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

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
	 * 营销工具
	 */
	@ApiListField("promo_tools")
	@ApiField("promo_tool")
	private List<PromoTool> promoTools;

	/**
	 * 投放渠道信息
	 */
	@ApiListField("publish_channels")
	@ApiField("publish_channel")
	private List<PublishChannel> publishChannels;

	/**
	 * 招商信息
	 */
	@ApiField("recruit_info")
	private RecruitInfo recruitInfo;

	/**
	 * 活动开始时间
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
	 * <p>Getter for the field <code>budgetInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.BudgetInfo} object.
	 */
	public BudgetInfo getBudgetInfo() {
		return this.budgetInfo;
	}
	/**
	 * <p>Setter for the field <code>budgetInfo</code>.</p>
	 *
	 * @param budgetInfo a {@link cn.felord.wepay.ali.sdk.api.domain.BudgetInfo} object.
	 */
	public void setBudgetInfo(BudgetInfo budgetInfo) {
		this.budgetInfo = budgetInfo;
	}

	/**
	 * <p>Getter for the field <code>constraintInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ConstraintInfo} object.
	 */
	public ConstraintInfo getConstraintInfo() {
		return this.constraintInfo;
	}
	/**
	 * <p>Setter for the field <code>constraintInfo</code>.</p>
	 *
	 * @param constraintInfo a {@link cn.felord.wepay.ali.sdk.api.domain.ConstraintInfo} object.
	 */
	public void setConstraintInfo(ConstraintInfo constraintInfo) {
		this.constraintInfo = constraintInfo;
	}

	/**
	 * <p>Getter for the field <code>desc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDesc() {
		return this.desc;
	}
	/**
	 * <p>Setter for the field <code>desc</code>.</p>
	 *
	 * @param desc a {@link java.lang.String} object.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
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
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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
	 * <p>Getter for the field <code>promoTools</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<PromoTool> getPromoTools() {
		return this.promoTools;
	}
	/**
	 * <p>Setter for the field <code>promoTools</code>.</p>
	 *
	 * @param promoTools a {@link java.util.List} object.
	 */
	public void setPromoTools(List<PromoTool> promoTools) {
		this.promoTools = promoTools;
	}

	/**
	 * <p>Getter for the field <code>publishChannels</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<PublishChannel> getPublishChannels() {
		return this.publishChannels;
	}
	/**
	 * <p>Setter for the field <code>publishChannels</code>.</p>
	 *
	 * @param publishChannels a {@link java.util.List} object.
	 */
	public void setPublishChannels(List<PublishChannel> publishChannels) {
		this.publishChannels = publishChannels;
	}

	/**
	 * <p>Getter for the field <code>recruitInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.RecruitInfo} object.
	 */
	public RecruitInfo getRecruitInfo() {
		return this.recruitInfo;
	}
	/**
	 * <p>Setter for the field <code>recruitInfo</code>.</p>
	 *
	 * @param recruitInfo a {@link cn.felord.wepay.ali.sdk.api.domain.RecruitInfo} object.
	 */
	public void setRecruitInfo(RecruitInfo recruitInfo) {
		this.recruitInfo = recruitInfo;
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
