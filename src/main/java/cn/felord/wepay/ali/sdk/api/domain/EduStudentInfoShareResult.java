package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 学生信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class EduStudentInfoShareResult extends AlipayObject {

	private static final long serialVersionUID = 3562464124272711555L;

	/**
	 * 教育分类
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 学生详细信息
	 */
	@ApiListField("student_infos")
	@ApiField("student_info")
	private List<StudentInfo> studentInfos;

	/**
	 * 用户的userid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>studentInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<StudentInfo> getStudentInfos() {
		return this.studentInfos;
	}
	/**
	 * <p>Setter for the field <code>studentInfos</code>.</p>
	 *
	 * @param studentInfos a {@link java.util.List} object.
	 */
	public void setStudentInfos(List<StudentInfo> studentInfos) {
		this.studentInfos = studentInfos;
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
