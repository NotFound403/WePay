package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 学生信息查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoEduKtStudentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2296842847611679774L;

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
	 * 学生编号，发送账单接口返回的学生编号
	 */
	@ApiField("student_no")
	private String studentNo;

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
