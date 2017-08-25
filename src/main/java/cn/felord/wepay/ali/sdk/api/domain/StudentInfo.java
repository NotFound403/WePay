package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 学生详细信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class StudentInfo extends AlipayObject {

	private static final long serialVersionUID = 5159846648539722799L;

	/**
	 * 学校所在行政区域编码
	 */
	@ApiField("city_no")
	private String cityNo;

	/**
	 * 班级
	 */
	@ApiField("class_name")
	private String className;

	/**
	 * 学校名称
	 */
	@ApiField("college_name")
	private String collegeName;

	/**
	 * 学校机构编号
	 */
	@ApiField("college_no")
	private String collegeNo;

	/**
	 * 学历
	 */
	@ApiField("degree")
	private String degree;

	/**
	 * 院系
	 */
	@ApiField("departments")
	private String departments;

	/**
	 * 入校时间
	 */
	@ApiField("gmt_enrollment")
	private Date gmtEnrollment;

	/**
	 * 毕业时间
	 */
	@ApiField("gmt_graduation")
	private Date gmtGraduation;

	/**
	 * 专业
	 */
	@ApiField("major")
	private String major;

	/**
	 * 学生证号
	 */
	@ApiField("student_id")
	private String studentId;

	/**
	 * <p>Getter for the field <code>cityNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityNo() {
		return this.cityNo;
	}
	/**
	 * <p>Setter for the field <code>cityNo</code>.</p>
	 *
	 * @param cityNo a {@link java.lang.String} object.
	 */
	public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}

	/**
	 * <p>Getter for the field <code>className</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClassName() {
		return this.className;
	}
	/**
	 * <p>Setter for the field <code>className</code>.</p>
	 *
	 * @param className a {@link java.lang.String} object.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * <p>Getter for the field <code>collegeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCollegeName() {
		return this.collegeName;
	}
	/**
	 * <p>Setter for the field <code>collegeName</code>.</p>
	 *
	 * @param collegeName a {@link java.lang.String} object.
	 */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	/**
	 * <p>Getter for the field <code>collegeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCollegeNo() {
		return this.collegeNo;
	}
	/**
	 * <p>Setter for the field <code>collegeNo</code>.</p>
	 *
	 * @param collegeNo a {@link java.lang.String} object.
	 */
	public void setCollegeNo(String collegeNo) {
		this.collegeNo = collegeNo;
	}

	/**
	 * <p>Getter for the field <code>degree</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDegree() {
		return this.degree;
	}
	/**
	 * <p>Setter for the field <code>degree</code>.</p>
	 *
	 * @param degree a {@link java.lang.String} object.
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}

	/**
	 * <p>Getter for the field <code>departments</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDepartments() {
		return this.departments;
	}
	/**
	 * <p>Setter for the field <code>departments</code>.</p>
	 *
	 * @param departments a {@link java.lang.String} object.
	 */
	public void setDepartments(String departments) {
		this.departments = departments;
	}

	/**
	 * <p>Getter for the field <code>gmtEnrollment</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtEnrollment() {
		return this.gmtEnrollment;
	}
	/**
	 * <p>Setter for the field <code>gmtEnrollment</code>.</p>
	 *
	 * @param gmtEnrollment a {@link java.util.Date} object.
	 */
	public void setGmtEnrollment(Date gmtEnrollment) {
		this.gmtEnrollment = gmtEnrollment;
	}

	/**
	 * <p>Getter for the field <code>gmtGraduation</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtGraduation() {
		return this.gmtGraduation;
	}
	/**
	 * <p>Setter for the field <code>gmtGraduation</code>.</p>
	 *
	 * @param gmtGraduation a {@link java.util.Date} object.
	 */
	public void setGmtGraduation(Date gmtGraduation) {
		this.gmtGraduation = gmtGraduation;
	}

	/**
	 * <p>Getter for the field <code>major</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMajor() {
		return this.major;
	}
	/**
	 * <p>Setter for the field <code>major</code>.</p>
	 *
	 * @param major a {@link java.lang.String} object.
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * <p>Getter for the field <code>studentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStudentId() {
		return this.studentId;
	}
	/**
	 * <p>Setter for the field <code>studentId</code>.</p>
	 *
	 * @param studentId a {@link java.lang.String} object.
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
