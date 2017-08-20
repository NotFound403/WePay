package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 修改技师信息
 *
 * @author auto create
 * @since 1.0, 2016-10-13 14:02:30
 */
public class AlipayEcoMycarDialogonlineAnswererUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 2424873132657413263L;

	/**
	 * 技师ID
	 */
	@ApiField("answer_id")
	private String answerId;

	/**
	 * 技师状态，0：可用，1：停用
	 */
	@ApiField("answer_status")
	private String answerStatus;

	public String getAnswerId() {
		return this.answerId;
	}
	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}

	public String getAnswerStatus() {
		return this.answerStatus;
	}
	public void setAnswerStatus(String answerStatus) {
		this.answerStatus = answerStatus;
	}

}
