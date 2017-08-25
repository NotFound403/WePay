package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 活动修改接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignActivityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2665449242311131375L;

	/**
	 * 是否自动续期活动，仅当活动下券的有效期均为相对有效期时才能设置成Y
	 */
	@ApiField("auto_delay_flag")
	private String autoDelayFlag;

	/**
	 * 活动预算
	 */
	@ApiField("budget_info")
	private BudgetInfo budgetInfo;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 活动限制信息
	 */
	@ApiField("constraint_info")
	private ConstraintInfo constraintInfo;

	/**
	 * 活动详细说明
不允许修改，必须与活动详情查询的结果保持一致
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 活动结束时间
活动结束时间只允许延长
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 活动的扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 活动名称
不允许修改，必须与活动详情查询的结果保持一致
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作人id，必须和operator_type配对出现，不填时默认是商户
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 外部批次ID，用户指定,每次请求保持唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 营销工具集
	 */
	@ApiListField("promo_tools")
	@ApiField("promo_tool")
	private List<PromoTool> promoTools;

	/**
	 * 投放渠道集，当活动类型为DIRECT_SEND或者REAL_TIME_SEND时必填，为CONSUME_SEND时必须为空
	 */
	@ApiListField("publish_channels")
	@ApiField("publish_channel")
	private List<PublishChannel> publishChannels;

	/**
	 * 招商工具
	 */
	@ApiField("recruit_tool")
	private RecruitTool recruitTool;

	/**
	 * 活动开始时间
不允许修改，必须与活动详情查询的结果保持一致
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 活动类型
不允许修改，必须与活动详情查询的结果保持一致
	 */
	@ApiField("type")
	private String type;

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
	 * <p>Getter for the field <code>campId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampId() {
		return this.campId;
	}
	/**
	 * <p>Setter for the field <code>campId</code>.</p>
	 *
	 * @param campId a {@link java.lang.String} object.
	 */
	public void setCampId(String campId) {
		this.campId = campId;
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
	 * <p>Getter for the field <code>operatorId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	/**
	 * <p>Setter for the field <code>operatorId</code>.</p>
	 *
	 * @param operatorId a {@link java.lang.String} object.
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * <p>Getter for the field <code>operatorType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorType() {
		return this.operatorType;
	}
	/**
	 * <p>Setter for the field <code>operatorType</code>.</p>
	 *
	 * @param operatorType a {@link java.lang.String} object.
	 */
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
	 * <p>Getter for the field <code>recruitTool</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.RecruitTool} object.
	 */
	public RecruitTool getRecruitTool() {
		return this.recruitTool;
	}
	/**
	 * <p>Setter for the field <code>recruitTool</code>.</p>
	 *
	 * @param recruitTool a {@link cn.felord.wepay.ali.sdk.api.domain.RecruitTool} object.
	 */
	public void setRecruitTool(RecruitTool recruitTool) {
		this.recruitTool = recruitTool;
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
