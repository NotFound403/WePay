package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 实习生职位推送（新增/修改）接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoEduCampusJobCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7527816362949491468L;

	/**
	 * 城市编码
	 */
	@ApiField("area_city_code")
	private String areaCityCode;

	/**
	 * 城市名称
	 */
	@ApiField("area_city_name")
	private String areaCityName;

	/**
	 * 区编码
	 */
	@ApiField("area_district_code")
	private String areaDistrictCode;

	/**
	 * 区名称
	 */
	@ApiField("area_district_name")
	private String areaDistrictName;

	/**
	 * 工作详细地址
	 */
	@ApiField("area_job_address")
	private String areaJobAddress;

	/**
	 * 省份编码（直辖市
	 */
	@ApiField("area_province_code")
	private Long areaProvinceCode;

	/**
	 * 省份名称（直辖市）
	 */
	@ApiField("area_province_name")
	private String areaProvinceName;

	/**
	 * 街道名称
	 */
	@ApiField("area_street_name")
	private String areaStreetName;

	/**
	 * 企业法律名称
	 */
	@ApiField("company_lawname")
	private String companyLawname;

	/**
	 * 参数描述企业Logo
	 */
	@ApiField("company_logo")
	private String companyLogo;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 第三方公司ID
	 */
	@ApiField("company_source")
	private String companySource;

	/**
	 * 过期时间(毫秒数)
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 刷新时间(毫秒数)
	 */
	@ApiField("gmt_refresh")
	private String gmtRefresh;

	/**
	 * 职位描述
	 */
	@ApiField("job_desc")
	private String jobDesc;

	/**
	 * 招聘人数
	 */
	@ApiField("job_hire_number")
	private Long jobHireNumber;

	/**
	 * 职位名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 职业亮点/关键字
	 */
	@ApiField("job_perk")
	private String jobPerk;

	/**
	 * 要求简历语言（1中文；2英文）
	 */
	@ApiField("job_resume_lg")
	private Long jobResumeLg;

	/**
	 * 学历要求专科（1:大专以下2:大专3:本科4:硕士5:博士6:其他7:不限）
	 */
	@ApiField("job_rq_education")
	private Long jobRqEducation;

	/**
	 * 职业一级分类code
	 */
	@ApiField("job_tier_one_code")
	private String jobTierOneCode;

	/**
	 * 职业一级分类name
	 */
	@ApiField("job_tier_one_name")
	private String jobTierOneName;

	/**
	 * 职业三级分类code
	 */
	@ApiField("job_tier_three_code")
	private String jobTierThreeCode;

	/**
	 * 职业三级分类name
	 */
	@ApiField("job_tier_three_name")
	private String jobTierThreeName;

	/**
	 * 职业二级分类code
	 */
	@ApiField("job_tier_two_code")
	private String jobTierTwoCode;

	/**
	 * 职业二级分类name
	 */
	@ApiField("job_tier_two_name")
	private String jobTierTwoName;

	/**
	 * 职位类型枚举（1实习；2兼职；3全职；）
	 */
	@ApiField("job_type")
	private Long jobType;

	/**
	 * 最大薪资（单位￥）
	 */
	@ApiField("payment_max")
	private Long paymentMax;

	/**
	 * 最小薪资（单位￥）
	 */
	@ApiField("payment_min")
	private Long paymentMin;

	/**
	 * 薪资单位(1:天2:月3:周)
	 */
	@ApiField("payment_unit")
	private Long paymentUnit;

	/**
	 * 职位来源方编码
	 */
	@ApiField("source_code")
	private String sourceCode;

	/**
	 * 职位在合作方的ID
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 每周到岗天数
	 */
	@ApiField("tra_job_freq")
	private Long traJobFreq;

	/**
	 * 实习时间长度(单位月)
	 */
	@ApiField("tra_job_period")
	private Long traJobPeriod;

	/**
	 * 是否可转正(1可以；0不可以)
	 */
	@ApiField("tra_job_promot")
	private Long traJobPromot;

	/**
	 * <p>Getter for the field <code>areaCityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAreaCityCode() {
		return this.areaCityCode;
	}
	/**
	 * <p>Setter for the field <code>areaCityCode</code>.</p>
	 *
	 * @param areaCityCode a {@link java.lang.String} object.
	 */
	public void setAreaCityCode(String areaCityCode) {
		this.areaCityCode = areaCityCode;
	}

	/**
	 * <p>Getter for the field <code>areaCityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAreaCityName() {
		return this.areaCityName;
	}
	/**
	 * <p>Setter for the field <code>areaCityName</code>.</p>
	 *
	 * @param areaCityName a {@link java.lang.String} object.
	 */
	public void setAreaCityName(String areaCityName) {
		this.areaCityName = areaCityName;
	}

	/**
	 * <p>Getter for the field <code>areaDistrictCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAreaDistrictCode() {
		return this.areaDistrictCode;
	}
	/**
	 * <p>Setter for the field <code>areaDistrictCode</code>.</p>
	 *
	 * @param areaDistrictCode a {@link java.lang.String} object.
	 */
	public void setAreaDistrictCode(String areaDistrictCode) {
		this.areaDistrictCode = areaDistrictCode;
	}

	/**
	 * <p>Getter for the field <code>areaDistrictName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAreaDistrictName() {
		return this.areaDistrictName;
	}
	/**
	 * <p>Setter for the field <code>areaDistrictName</code>.</p>
	 *
	 * @param areaDistrictName a {@link java.lang.String} object.
	 */
	public void setAreaDistrictName(String areaDistrictName) {
		this.areaDistrictName = areaDistrictName;
	}

	/**
	 * <p>Getter for the field <code>areaJobAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAreaJobAddress() {
		return this.areaJobAddress;
	}
	/**
	 * <p>Setter for the field <code>areaJobAddress</code>.</p>
	 *
	 * @param areaJobAddress a {@link java.lang.String} object.
	 */
	public void setAreaJobAddress(String areaJobAddress) {
		this.areaJobAddress = areaJobAddress;
	}

	/**
	 * <p>Getter for the field <code>areaProvinceCode</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getAreaProvinceCode() {
		return this.areaProvinceCode;
	}
	/**
	 * <p>Setter for the field <code>areaProvinceCode</code>.</p>
	 *
	 * @param areaProvinceCode a {@link java.lang.Long} object.
	 */
	public void setAreaProvinceCode(Long areaProvinceCode) {
		this.areaProvinceCode = areaProvinceCode;
	}

	/**
	 * <p>Getter for the field <code>areaProvinceName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAreaProvinceName() {
		return this.areaProvinceName;
	}
	/**
	 * <p>Setter for the field <code>areaProvinceName</code>.</p>
	 *
	 * @param areaProvinceName a {@link java.lang.String} object.
	 */
	public void setAreaProvinceName(String areaProvinceName) {
		this.areaProvinceName = areaProvinceName;
	}

	/**
	 * <p>Getter for the field <code>areaStreetName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAreaStreetName() {
		return this.areaStreetName;
	}
	/**
	 * <p>Setter for the field <code>areaStreetName</code>.</p>
	 *
	 * @param areaStreetName a {@link java.lang.String} object.
	 */
	public void setAreaStreetName(String areaStreetName) {
		this.areaStreetName = areaStreetName;
	}

	/**
	 * <p>Getter for the field <code>companyLawname</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompanyLawname() {
		return this.companyLawname;
	}
	/**
	 * <p>Setter for the field <code>companyLawname</code>.</p>
	 *
	 * @param companyLawname a {@link java.lang.String} object.
	 */
	public void setCompanyLawname(String companyLawname) {
		this.companyLawname = companyLawname;
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
	 * <p>Getter for the field <code>companySource</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompanySource() {
		return this.companySource;
	}
	/**
	 * <p>Setter for the field <code>companySource</code>.</p>
	 *
	 * @param companySource a {@link java.lang.String} object.
	 */
	public void setCompanySource(String companySource) {
		this.companySource = companySource;
	}

	/**
	 * <p>Getter for the field <code>gmtExpired</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtExpired() {
		return this.gmtExpired;
	}
	/**
	 * <p>Setter for the field <code>gmtExpired</code>.</p>
	 *
	 * @param gmtExpired a {@link java.lang.String} object.
	 */
	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	/**
	 * <p>Getter for the field <code>gmtRefresh</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtRefresh() {
		return this.gmtRefresh;
	}
	/**
	 * <p>Setter for the field <code>gmtRefresh</code>.</p>
	 *
	 * @param gmtRefresh a {@link java.lang.String} object.
	 */
	public void setGmtRefresh(String gmtRefresh) {
		this.gmtRefresh = gmtRefresh;
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
	 * <p>Getter for the field <code>jobHireNumber</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getJobHireNumber() {
		return this.jobHireNumber;
	}
	/**
	 * <p>Setter for the field <code>jobHireNumber</code>.</p>
	 *
	 * @param jobHireNumber a {@link java.lang.Long} object.
	 */
	public void setJobHireNumber(Long jobHireNumber) {
		this.jobHireNumber = jobHireNumber;
	}

	/**
	 * <p>Getter for the field <code>jobName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJobName() {
		return this.jobName;
	}
	/**
	 * <p>Setter for the field <code>jobName</code>.</p>
	 *
	 * @param jobName a {@link java.lang.String} object.
	 */
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	/**
	 * <p>Getter for the field <code>jobPerk</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJobPerk() {
		return this.jobPerk;
	}
	/**
	 * <p>Setter for the field <code>jobPerk</code>.</p>
	 *
	 * @param jobPerk a {@link java.lang.String} object.
	 */
	public void setJobPerk(String jobPerk) {
		this.jobPerk = jobPerk;
	}

	/**
	 * <p>Getter for the field <code>jobResumeLg</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getJobResumeLg() {
		return this.jobResumeLg;
	}
	/**
	 * <p>Setter for the field <code>jobResumeLg</code>.</p>
	 *
	 * @param jobResumeLg a {@link java.lang.Long} object.
	 */
	public void setJobResumeLg(Long jobResumeLg) {
		this.jobResumeLg = jobResumeLg;
	}

	/**
	 * <p>Getter for the field <code>jobRqEducation</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getJobRqEducation() {
		return this.jobRqEducation;
	}
	/**
	 * <p>Setter for the field <code>jobRqEducation</code>.</p>
	 *
	 * @param jobRqEducation a {@link java.lang.Long} object.
	 */
	public void setJobRqEducation(Long jobRqEducation) {
		this.jobRqEducation = jobRqEducation;
	}

	/**
	 * <p>Getter for the field <code>jobTierOneCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJobTierOneCode() {
		return this.jobTierOneCode;
	}
	/**
	 * <p>Setter for the field <code>jobTierOneCode</code>.</p>
	 *
	 * @param jobTierOneCode a {@link java.lang.String} object.
	 */
	public void setJobTierOneCode(String jobTierOneCode) {
		this.jobTierOneCode = jobTierOneCode;
	}

	/**
	 * <p>Getter for the field <code>jobTierOneName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJobTierOneName() {
		return this.jobTierOneName;
	}
	/**
	 * <p>Setter for the field <code>jobTierOneName</code>.</p>
	 *
	 * @param jobTierOneName a {@link java.lang.String} object.
	 */
	public void setJobTierOneName(String jobTierOneName) {
		this.jobTierOneName = jobTierOneName;
	}

	/**
	 * <p>Getter for the field <code>jobTierThreeCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJobTierThreeCode() {
		return this.jobTierThreeCode;
	}
	/**
	 * <p>Setter for the field <code>jobTierThreeCode</code>.</p>
	 *
	 * @param jobTierThreeCode a {@link java.lang.String} object.
	 */
	public void setJobTierThreeCode(String jobTierThreeCode) {
		this.jobTierThreeCode = jobTierThreeCode;
	}

	/**
	 * <p>Getter for the field <code>jobTierThreeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJobTierThreeName() {
		return this.jobTierThreeName;
	}
	/**
	 * <p>Setter for the field <code>jobTierThreeName</code>.</p>
	 *
	 * @param jobTierThreeName a {@link java.lang.String} object.
	 */
	public void setJobTierThreeName(String jobTierThreeName) {
		this.jobTierThreeName = jobTierThreeName;
	}

	/**
	 * <p>Getter for the field <code>jobTierTwoCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJobTierTwoCode() {
		return this.jobTierTwoCode;
	}
	/**
	 * <p>Setter for the field <code>jobTierTwoCode</code>.</p>
	 *
	 * @param jobTierTwoCode a {@link java.lang.String} object.
	 */
	public void setJobTierTwoCode(String jobTierTwoCode) {
		this.jobTierTwoCode = jobTierTwoCode;
	}

	/**
	 * <p>Getter for the field <code>jobTierTwoName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJobTierTwoName() {
		return this.jobTierTwoName;
	}
	/**
	 * <p>Setter for the field <code>jobTierTwoName</code>.</p>
	 *
	 * @param jobTierTwoName a {@link java.lang.String} object.
	 */
	public void setJobTierTwoName(String jobTierTwoName) {
		this.jobTierTwoName = jobTierTwoName;
	}

	/**
	 * <p>Getter for the field <code>jobType</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getJobType() {
		return this.jobType;
	}
	/**
	 * <p>Setter for the field <code>jobType</code>.</p>
	 *
	 * @param jobType a {@link java.lang.Long} object.
	 */
	public void setJobType(Long jobType) {
		this.jobType = jobType;
	}

	/**
	 * <p>Getter for the field <code>paymentMax</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPaymentMax() {
		return this.paymentMax;
	}
	/**
	 * <p>Setter for the field <code>paymentMax</code>.</p>
	 *
	 * @param paymentMax a {@link java.lang.Long} object.
	 */
	public void setPaymentMax(Long paymentMax) {
		this.paymentMax = paymentMax;
	}

	/**
	 * <p>Getter for the field <code>paymentMin</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPaymentMin() {
		return this.paymentMin;
	}
	/**
	 * <p>Setter for the field <code>paymentMin</code>.</p>
	 *
	 * @param paymentMin a {@link java.lang.Long} object.
	 */
	public void setPaymentMin(Long paymentMin) {
		this.paymentMin = paymentMin;
	}

	/**
	 * <p>Getter for the field <code>paymentUnit</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPaymentUnit() {
		return this.paymentUnit;
	}
	/**
	 * <p>Setter for the field <code>paymentUnit</code>.</p>
	 *
	 * @param paymentUnit a {@link java.lang.Long} object.
	 */
	public void setPaymentUnit(Long paymentUnit) {
		this.paymentUnit = paymentUnit;
	}

	/**
	 * <p>Getter for the field <code>sourceCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceCode() {
		return this.sourceCode;
	}
	/**
	 * <p>Setter for the field <code>sourceCode</code>.</p>
	 *
	 * @param sourceCode a {@link java.lang.String} object.
	 */
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	/**
	 * <p>Getter for the field <code>sourceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceId() {
		return this.sourceId;
	}
	/**
	 * <p>Setter for the field <code>sourceId</code>.</p>
	 *
	 * @param sourceId a {@link java.lang.String} object.
	 */
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	/**
	 * <p>Getter for the field <code>traJobFreq</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTraJobFreq() {
		return this.traJobFreq;
	}
	/**
	 * <p>Setter for the field <code>traJobFreq</code>.</p>
	 *
	 * @param traJobFreq a {@link java.lang.Long} object.
	 */
	public void setTraJobFreq(Long traJobFreq) {
		this.traJobFreq = traJobFreq;
	}

	/**
	 * <p>Getter for the field <code>traJobPeriod</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTraJobPeriod() {
		return this.traJobPeriod;
	}
	/**
	 * <p>Setter for the field <code>traJobPeriod</code>.</p>
	 *
	 * @param traJobPeriod a {@link java.lang.Long} object.
	 */
	public void setTraJobPeriod(Long traJobPeriod) {
		this.traJobPeriod = traJobPeriod;
	}

	/**
	 * <p>Getter for the field <code>traJobPromot</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTraJobPromot() {
		return this.traJobPromot;
	}
	/**
	 * <p>Setter for the field <code>traJobPromot</code>.</p>
	 *
	 * @param traJobPromot a {@link java.lang.Long} object.
	 */
	public void setTraJobPromot(Long traJobPromot) {
		this.traJobPromot = traJobPromot;
	}

}
