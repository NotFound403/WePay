package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.EduStudentInfoShareResult;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.studentinfo.share response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceEducateStudentinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 5839118851425549971L;

	/** 
	 * 学生信息
	 */
	@ApiField("student_info_share_result")
	private EduStudentInfoShareResult studentInfoShareResult;

	/**
	 * <p>Setter for the field <code>studentInfoShareResult</code>.</p>
	 *
	 * @param studentInfoShareResult a {@link cn.felord.wepay.ali.sdk.api.domain.EduStudentInfoShareResult} object.
	 */
	public void setStudentInfoShareResult(EduStudentInfoShareResult studentInfoShareResult) {
		this.studentInfoShareResult = studentInfoShareResult;
	}
	/**
	 * <p>Getter for the field <code>studentInfoShareResult</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.EduStudentInfoShareResult} object.
	 */
	public EduStudentInfoShareResult getStudentInfoShareResult( ) {
		return this.studentInfoShareResult;
	}

}
