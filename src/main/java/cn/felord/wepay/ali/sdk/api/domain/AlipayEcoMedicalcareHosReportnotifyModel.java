package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 医疗报告通知接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMedicalcareHosReportnotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7532629366734587973L;

	/**
	 * 科室信息
	 */
	@ApiField("dept_info")
	private MedicalHospitalDeptInfo deptInfo;

	/**
	 * 医生信息
	 */
	@ApiField("doctor_info")
	private MedicalHospitalDoctorInfo doctorInfo;

	/**
	 * 业务扩展参数json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 医院信息
	 */
	@ApiField("hos_info")
	private MedicalHospitalInfo hosInfo;

	/**
	 * 通知时间
	 */
	@ApiField("notify_time")
	private Date notifyTime;

	/**
	 * 操作类型
明确定义数据是创建还是更新
创建并更新CREATE_UPDATE
删除DELETE
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 患者证件号码
获取方式通过支付宝钱包用户信息共享接口中获取证件号或者手工输入证件号
	 */
	@ApiField("patient_card_no")
	private String patientCardNo;

	/**
	 * 证件类型
01	身份证
02	护照
03	军官证
04	士兵证
05	户口本
06	警官证
07	台湾居民来往大陆通行证（简称“台胞证”）
08	港澳居民来往内地通行证（简称“回乡证”）
09	临时身份证
10	港澳通行证
11	营业执照
12	外国人居留证
13	香港身份证
14	武警证
15	组织机构代码证
16	行政机关
17	社会团体
18	军队
19	武警
20	下属机构(具有主管单位批文号)
21	基金会
99	其它
	 */
	@ApiField("patient_card_type")
	private String patientCardType;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 挂号订单号,商户生成
	 */
	@ApiField("reg_out_trade_no")
	private String regOutTradeNo;

	/**
	 * 报告明细
	 */
	@ApiListField("report_list")
	@ApiField("medical_hospital_report_list")
	private List<MedicalHospitalReportList> reportList;

	/**
	 * 第三方唯一序列号（可以是订单号确保唯一）
	 */
	@ApiField("third_no")
	private String thirdNo;

	/**
	 * 诊疗订单号，商户生成
	 */
	@ApiField("treat_out_trade_no")
	private String treatOutTradeNo;

	/**
	 * 支付宝用户Id，可以通过支付宝钱包用户信息共享接口获取支付宝账户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>deptInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MedicalHospitalDeptInfo} object.
	 */
	public MedicalHospitalDeptInfo getDeptInfo() {
		return this.deptInfo;
	}
	/**
	 * <p>Setter for the field <code>deptInfo</code>.</p>
	 *
	 * @param deptInfo a {@link cn.felord.wepay.ali.sdk.api.domain.MedicalHospitalDeptInfo} object.
	 */
	public void setDeptInfo(MedicalHospitalDeptInfo deptInfo) {
		this.deptInfo = deptInfo;
	}

	/**
	 * <p>Getter for the field <code>doctorInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MedicalHospitalDoctorInfo} object.
	 */
	public MedicalHospitalDoctorInfo getDoctorInfo() {
		return this.doctorInfo;
	}
	/**
	 * <p>Setter for the field <code>doctorInfo</code>.</p>
	 *
	 * @param doctorInfo a {@link cn.felord.wepay.ali.sdk.api.domain.MedicalHospitalDoctorInfo} object.
	 */
	public void setDoctorInfo(MedicalHospitalDoctorInfo doctorInfo) {
		this.doctorInfo = doctorInfo;
	}

	/**
	 * <p>Getter for the field <code>extendParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendParams() {
		return this.extendParams;
	}
	/**
	 * <p>Setter for the field <code>extendParams</code>.</p>
	 *
	 * @param extendParams a {@link java.lang.String} object.
	 */
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	/**
	 * <p>Getter for the field <code>hosInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MedicalHospitalInfo} object.
	 */
	public MedicalHospitalInfo getHosInfo() {
		return this.hosInfo;
	}
	/**
	 * <p>Setter for the field <code>hosInfo</code>.</p>
	 *
	 * @param hosInfo a {@link cn.felord.wepay.ali.sdk.api.domain.MedicalHospitalInfo} object.
	 */
	public void setHosInfo(MedicalHospitalInfo hosInfo) {
		this.hosInfo = hosInfo;
	}

	/**
	 * <p>Getter for the field <code>notifyTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getNotifyTime() {
		return this.notifyTime;
	}
	/**
	 * <p>Setter for the field <code>notifyTime</code>.</p>
	 *
	 * @param notifyTime a {@link java.util.Date} object.
	 */
	public void setNotifyTime(Date notifyTime) {
		this.notifyTime = notifyTime;
	}

	/**
	 * <p>Getter for the field <code>operate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperate() {
		return this.operate;
	}
	/**
	 * <p>Setter for the field <code>operate</code>.</p>
	 *
	 * @param operate a {@link java.lang.String} object.
	 */
	public void setOperate(String operate) {
		this.operate = operate;
	}

	/**
	 * <p>Getter for the field <code>patientCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPatientCardNo() {
		return this.patientCardNo;
	}
	/**
	 * <p>Setter for the field <code>patientCardNo</code>.</p>
	 *
	 * @param patientCardNo a {@link java.lang.String} object.
	 */
	public void setPatientCardNo(String patientCardNo) {
		this.patientCardNo = patientCardNo;
	}

	/**
	 * <p>Getter for the field <code>patientCardType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPatientCardType() {
		return this.patientCardType;
	}
	/**
	 * <p>Setter for the field <code>patientCardType</code>.</p>
	 *
	 * @param patientCardType a {@link java.lang.String} object.
	 */
	public void setPatientCardType(String patientCardType) {
		this.patientCardType = patientCardType;
	}

	/**
	 * <p>Getter for the field <code>patientName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPatientName() {
		return this.patientName;
	}
	/**
	 * <p>Setter for the field <code>patientName</code>.</p>
	 *
	 * @param patientName a {@link java.lang.String} object.
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * <p>Getter for the field <code>regOutTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRegOutTradeNo() {
		return this.regOutTradeNo;
	}
	/**
	 * <p>Setter for the field <code>regOutTradeNo</code>.</p>
	 *
	 * @param regOutTradeNo a {@link java.lang.String} object.
	 */
	public void setRegOutTradeNo(String regOutTradeNo) {
		this.regOutTradeNo = regOutTradeNo;
	}

	/**
	 * <p>Getter for the field <code>reportList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<MedicalHospitalReportList> getReportList() {
		return this.reportList;
	}
	/**
	 * <p>Setter for the field <code>reportList</code>.</p>
	 *
	 * @param reportList a {@link java.util.List} object.
	 */
	public void setReportList(List<MedicalHospitalReportList> reportList) {
		this.reportList = reportList;
	}

	/**
	 * <p>Getter for the field <code>thirdNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getThirdNo() {
		return this.thirdNo;
	}
	/**
	 * <p>Setter for the field <code>thirdNo</code>.</p>
	 *
	 * @param thirdNo a {@link java.lang.String} object.
	 */
	public void setThirdNo(String thirdNo) {
		this.thirdNo = thirdNo;
	}

	/**
	 * <p>Getter for the field <code>treatOutTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTreatOutTradeNo() {
		return this.treatOutTradeNo;
	}
	/**
	 * <p>Setter for the field <code>treatOutTradeNo</code>.</p>
	 *
	 * @param treatOutTradeNo a {@link java.lang.String} object.
	 */
	public void setTreatOutTradeNo(String treatOutTradeNo) {
		this.treatOutTradeNo = treatOutTradeNo;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
