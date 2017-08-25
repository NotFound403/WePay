package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 修改技师信息
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>answerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAnswerId() {
		return this.answerId;
	}
	/**
	 * <p>Setter for the field <code>answerId</code>.</p>
	 *
	 * @param answerId a {@link java.lang.String} object.
	 */
	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}

	/**
	 * <p>Getter for the field <code>answerStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAnswerStatus() {
		return this.answerStatus;
	}
	/**
	 * <p>Setter for the field <code>answerStatus</code>.</p>
	 *
	 * @param answerStatus a {@link java.lang.String} object.
	 */
	public void setAnswerStatus(String answerStatus) {
		this.answerStatus = answerStatus;
	}

}
