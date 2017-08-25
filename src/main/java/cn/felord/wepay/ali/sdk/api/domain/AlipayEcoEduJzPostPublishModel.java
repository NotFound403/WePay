package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 兼职平台贴子发布接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoEduJzPostPublishModel extends AlipayObject {

	private static final long serialVersionUID = 3126679568445349295L;

	/**
	 * 年龄要求范围
	 */
	@ApiField("age_demand")
	private EduAgeDemand ageDemand;

	/**
	 * 工资/提成信息备注
	 */
	@ApiField("commission")
	private String commission;

	/**
	 * 客服联系方式
	 */
	@ApiField("company_contact")
	private String companyContact;

	/**
	 * 商户 Logo
	 */
	@ApiField("company_logo")
	private String companyLogo;

	/**
	 * 职位所属公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 联系方式 手机座机
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 工作结束的日期
	 */
	@ApiField("date_end")
	private String dateEnd;

	/**
	 * 工作开始的日期
	 */
	@ApiField("date_start")
	private String dateStart;

	/**
	 * 报名截止日期
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 性别要求 0:不限；1:男；2:女
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 招聘人数
	 */
	@ApiField("hire_number")
	private String hireNumber;

	/**
	 * 有无提成0:没有1:有
	 */
	@ApiField("is_commission")
	private String isCommission;

	/**
	 * 职位描述：工作内容、岗位要求
	 */
	@ApiField("job_desc")
	private String jobDesc;

	/**
	 * 工作类型，0:短期兼职，1:长期兼职，2:周末兼职
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 类型代码：兼职类型
1：传单派发
2：促销导购
3：话务客服
4：礼仪模特
5：家教助教
6：服务员
7：问卷调查
8：审核录入
9：地推拉访
10：其他
11：打包分拣
12：展会协助
13：充场
14：实习生
15：安保
16：送餐员
17：演出
18：翻译
19：校园代理
20：义工
21：食品促销
22：临时工
	 */
	@ApiField("part_time_type")
	private String partTimeType;

	/**
	 * 薪资待遇
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * 薪资待遇备注
	 */
	@ApiField("payment_remark")
	private String paymentRemark;

	/**
	 * 结算方式：0日结；1次日结； 2周结；3半月结； 4月结； 5完工结；
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 工资
	 */
	@ApiField("salary")
	private String salary;

	/**
	 * 薪资单位：元/天；元/周；元/月(与结算方式匹配)
	 */
	@ApiField("salary_unit")
	private String salaryUnit;

	/**
	 * 兼职服务商职位id
	 */
	@ApiField("service_post_id")
	private String servicePostId;

	/**
	 * 职位供应商信息
	 */
	@ApiField("source_info")
	private EduSourceInfo sourceInfo;

	/**
	 * 职位特殊要求多选项目：
- 普通话熟练；
- 有健康证； 
- 自备正装；
- 携带学生证；
- 沟通能力强；
- 形象好；
- 服从安排；
- 积极主动；
- 认真负责；
- 活泼开朗；
- 吃苦耐劳；
	 */
	@ApiListField("special_demand")
	@ApiField("string")
	private List<String> specialDemand;

	/**
	 * 职位标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 福利，1:包工作餐；2:包住宿；3:交通补助
	 */
	@ApiListField("welfare")
	@ApiField("string")
	private List<String> welfare;

	/**
	 * 工作地点
	 */
	@ApiListField("work_address")
	@ApiField("edu_work_address")
	private List<EduWorkAddress> workAddress;

	/**
	 * 工作时间备注
	 */
	@ApiField("work_time_remark")
	private String workTimeRemark;

	/**
	 * 每天工作时长 以小时计
	 */
	@ApiField("working_hours")
	private String workingHours;

	/**
	 * <p>Getter for the field <code>ageDemand</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.EduAgeDemand} object.
	 */
	public EduAgeDemand getAgeDemand() {
		return this.ageDemand;
	}
	/**
	 * <p>Setter for the field <code>ageDemand</code>.</p>
	 *
	 * @param ageDemand a {@link cn.felord.wepay.ali.sdk.api.domain.EduAgeDemand} object.
	 */
	public void setAgeDemand(EduAgeDemand ageDemand) {
		this.ageDemand = ageDemand;
	}

	/**
	 * <p>Getter for the field <code>commission</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommission() {
		return this.commission;
	}
	/**
	 * <p>Setter for the field <code>commission</code>.</p>
	 *
	 * @param commission a {@link java.lang.String} object.
	 */
	public void setCommission(String commission) {
		this.commission = commission;
	}

	/**
	 * <p>Getter for the field <code>companyContact</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompanyContact() {
		return this.companyContact;
	}
	/**
	 * <p>Setter for the field <code>companyContact</code>.</p>
	 *
	 * @param companyContact a {@link java.lang.String} object.
	 */
	public void setCompanyContact(String companyContact) {
		this.companyContact = companyContact;
	}

	/**
	 * <p>Getter for the field <code>companyLogo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompanyLogo() {
		return this.companyLogo;
	}
	/**
	 * <p>Setter for the field <code>companyLogo</code>.</p>
	 *
	 * @param companyLogo a {@link java.lang.String} object.
	 */
	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	/**
	 * <p>Getter for the field <code>companyName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompanyName() {
		return this.companyName;
	}
	/**
	 * <p>Setter for the field <code>companyName</code>.</p>
	 *
	 * @param companyName a {@link java.lang.String} object.
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * <p>Getter for the field <code>contactPhone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactPhone() {
		return this.contactPhone;
	}
	/**
	 * <p>Setter for the field <code>contactPhone</code>.</p>
	 *
	 * @param contactPhone a {@link java.lang.String} object.
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	/**
	 * <p>Getter for the field <code>dateEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDateEnd() {
		return this.dateEnd;
	}
	/**
	 * <p>Setter for the field <code>dateEnd</code>.</p>
	 *
	 * @param dateEnd a {@link java.lang.String} object.
	 */
	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	/**
	 * <p>Getter for the field <code>dateStart</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDateStart() {
		return this.dateStart;
	}
	/**
	 * <p>Setter for the field <code>dateStart</code>.</p>
	 *
	 * @param dateStart a {@link java.lang.String} object.
	 */
	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	/**
	 * <p>Getter for the field <code>deadline</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeadline() {
		return this.deadline;
	}
	/**
	 * <p>Setter for the field <code>deadline</code>.</p>
	 *
	 * @param deadline a {@link java.lang.String} object.
	 */
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	/**
	 * <p>Getter for the field <code>gender</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGender() {
		return this.gender;
	}
	/**
	 * <p>Setter for the field <code>gender</code>.</p>
	 *
	 * @param gender a {@link java.lang.String} object.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * <p>Getter for the field <code>hireNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHireNumber() {
		return this.hireNumber;
	}
	/**
	 * <p>Setter for the field <code>hireNumber</code>.</p>
	 *
	 * @param hireNumber a {@link java.lang.String} object.
	 */
	public void setHireNumber(String hireNumber) {
		this.hireNumber = hireNumber;
	}

	/**
	 * <p>Getter for the field <code>isCommission</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsCommission() {
		return this.isCommission;
	}
	/**
	 * <p>Setter for the field <code>isCommission</code>.</p>
	 *
	 * @param isCommission a {@link java.lang.String} object.
	 */
	public void setIsCommission(String isCommission) {
		this.isCommission = isCommission;
	}

	/**
	 * <p>Getter for the field <code>jobDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJobDesc() {
		return this.jobDesc;
	}
	/**
	 * <p>Setter for the field <code>jobDesc</code>.</p>
	 *
	 * @param jobDesc a {@link java.lang.String} object.
	 */
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	/**
	 * <p>Getter for the field <code>jobType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJobType() {
		return this.jobType;
	}
	/**
	 * <p>Setter for the field <code>jobType</code>.</p>
	 *
	 * @param jobType a {@link java.lang.String} object.
	 */
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	/**
	 * <p>Getter for the field <code>partTimeType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartTimeType() {
		return this.partTimeType;
	}
	/**
	 * <p>Setter for the field <code>partTimeType</code>.</p>
	 *
	 * @param partTimeType a {@link java.lang.String} object.
	 */
	public void setPartTimeType(String partTimeType) {
		this.partTimeType = partTimeType;
	}

	/**
	 * <p>Getter for the field <code>payment</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayment() {
		return this.payment;
	}
	/**
	 * <p>Setter for the field <code>payment</code>.</p>
	 *
	 * @param payment a {@link java.lang.String} object.
	 */
	public void setPayment(String payment) {
		this.payment = payment;
	}

	/**
	 * <p>Getter for the field <code>paymentRemark</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentRemark() {
		return this.paymentRemark;
	}
	/**
	 * <p>Setter for the field <code>paymentRemark</code>.</p>
	 *
	 * @param paymentRemark a {@link java.lang.String} object.
	 */
	public void setPaymentRemark(String paymentRemark) {
		this.paymentRemark = paymentRemark;
	}

	/**
	 * <p>Getter for the field <code>paymentType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentType() {
		return this.paymentType;
	}
	/**
	 * <p>Setter for the field <code>paymentType</code>.</p>
	 *
	 * @param paymentType a {@link java.lang.String} object.
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * <p>Getter for the field <code>salary</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSalary() {
		return this.salary;
	}
	/**
	 * <p>Setter for the field <code>salary</code>.</p>
	 *
	 * @param salary a {@link java.lang.String} object.
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	/**
	 * <p>Getter for the field <code>salaryUnit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSalaryUnit() {
		return this.salaryUnit;
	}
	/**
	 * <p>Setter for the field <code>salaryUnit</code>.</p>
	 *
	 * @param salaryUnit a {@link java.lang.String} object.
	 */
	public void setSalaryUnit(String salaryUnit) {
		this.salaryUnit = salaryUnit;
	}

	/**
	 * <p>Getter for the field <code>servicePostId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServicePostId() {
		return this.servicePostId;
	}
	/**
	 * <p>Setter for the field <code>servicePostId</code>.</p>
	 *
	 * @param servicePostId a {@link java.lang.String} object.
	 */
	public void setServicePostId(String servicePostId) {
		this.servicePostId = servicePostId;
	}

	/**
	 * <p>Getter for the field <code>sourceInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.EduSourceInfo} object.
	 */
	public EduSourceInfo getSourceInfo() {
		return this.sourceInfo;
	}
	/**
	 * <p>Setter for the field <code>sourceInfo</code>.</p>
	 *
	 * @param sourceInfo a {@link cn.felord.wepay.ali.sdk.api.domain.EduSourceInfo} object.
	 */
	public void setSourceInfo(EduSourceInfo sourceInfo) {
		this.sourceInfo = sourceInfo;
	}

	/**
	 * <p>Getter for the field <code>specialDemand</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getSpecialDemand() {
		return this.specialDemand;
	}
	/**
	 * <p>Setter for the field <code>specialDemand</code>.</p>
	 *
	 * @param specialDemand a {@link java.util.List} object.
	 */
	public void setSpecialDemand(List<String> specialDemand) {
		this.specialDemand = specialDemand;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * <p>Getter for the field <code>welfare</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getWelfare() {
		return this.welfare;
	}
	/**
	 * <p>Setter for the field <code>welfare</code>.</p>
	 *
	 * @param welfare a {@link java.util.List} object.
	 */
	public void setWelfare(List<String> welfare) {
		this.welfare = welfare;
	}

	/**
	 * <p>Getter for the field <code>workAddress</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<EduWorkAddress> getWorkAddress() {
		return this.workAddress;
	}
	/**
	 * <p>Setter for the field <code>workAddress</code>.</p>
	 *
	 * @param workAddress a {@link java.util.List} object.
	 */
	public void setWorkAddress(List<EduWorkAddress> workAddress) {
		this.workAddress = workAddress;
	}

	/**
	 * <p>Getter for the field <code>workTimeRemark</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getWorkTimeRemark() {
		return this.workTimeRemark;
	}
	/**
	 * <p>Setter for the field <code>workTimeRemark</code>.</p>
	 *
	 * @param workTimeRemark a {@link java.lang.String} object.
	 */
	public void setWorkTimeRemark(String workTimeRemark) {
		this.workTimeRemark = workTimeRemark;
	}

	/**
	 * <p>Getter for the field <code>workingHours</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getWorkingHours() {
		return this.workingHours;
	}
	/**
	 * <p>Setter for the field <code>workingHours</code>.</p>
	 *
	 * @param workingHours a {@link java.lang.String} object.
	 */
	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

}
