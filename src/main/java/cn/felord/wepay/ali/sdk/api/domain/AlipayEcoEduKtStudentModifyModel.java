package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 学生信息更新
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoEduKtStudentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6392592156146764477L;

	/**
	 * 修改后的姓名
	 */
	@ApiField("child_name")
	private String childName;

	/**
	 * Isv pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 学校编号，同步学校返回的编号
	 */
	@ApiField("school_no")
	private String schoolNo;

	/**
	 * 学校pid
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 区分ISV操作，“D”表示删除，“U”表示更新，区分大小写。
如果为U，则学生名字，学号，省份证至少填写一项
	 */
	@ApiField("status")
	private String status;

	/**
	 * 修改后的学号
	 */
	@ApiField("student_code")
	private String studentCode;

	/**
	 * 修改后的身份证号码
	 */
	@ApiField("student_identify")
	private String studentIdentify;

	/**
	 * 学生编号，发送账单接口返回的学生编号
	 */
	@ApiField("student_no")
	private String studentNo;

	/**
	 * <p>Getter for the field <code>childName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChildName() {
		return this.childName;
	}
	/**
	 * <p>Setter for the field <code>childName</code>.</p>
	 *
	 * @param childName a {@link java.lang.String} object.
	 */
	public void setChildName(String childName) {
		this.childName = childName;
	}

	/**
	 * <p>Getter for the field <code>isvPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvPid() {
		return this.isvPid;
	}
	/**
	 * <p>Setter for the field <code>isvPid</code>.</p>
	 *
	 * @param isvPid a {@link java.lang.String} object.
	 */
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	/**
	 * <p>Getter for the field <code>schoolNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSchoolNo() {
		return this.schoolNo;
	}
	/**
	 * <p>Setter for the field <code>schoolNo</code>.</p>
	 *
	 * @param schoolNo a {@link java.lang.String} object.
	 */
	public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}

	/**
	 * <p>Getter for the field <code>schoolPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSchoolPid() {
		return this.schoolPid;
	}
	/**
	 * <p>Setter for the field <code>schoolPid</code>.</p>
	 *
	 * @param schoolPid a {@link java.lang.String} object.
	 */
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
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
	 * <p>Getter for the field <code>studentCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStudentCode() {
		return this.studentCode;
	}
	/**
	 * <p>Setter for the field <code>studentCode</code>.</p>
	 *
	 * @param studentCode a {@link java.lang.String} object.
	 */
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	/**
	 * <p>Getter for the field <code>studentIdentify</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStudentIdentify() {
		return this.studentIdentify;
	}
	/**
	 * <p>Setter for the field <code>studentIdentify</code>.</p>
	 *
	 * @param studentIdentify a {@link java.lang.String} object.
	 */
	public void setStudentIdentify(String studentIdentify) {
		this.studentIdentify = studentIdentify;
	}

	/**
	 * <p>Getter for the field <code>studentNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStudentNo() {
		return this.studentNo;
	}
	/**
	 * <p>Setter for the field <code>studentNo</code>.</p>
	 *
	 * @param studentNo a {@link java.lang.String} object.
	 */
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

}
