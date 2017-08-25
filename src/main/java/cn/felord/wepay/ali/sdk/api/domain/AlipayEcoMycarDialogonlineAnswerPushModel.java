package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 车主在线问答技师回复
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarDialogonlineAnswerPushModel extends AlipayObject {

	private static final long serialVersionUID = 6118187489145379774L;

	/**
	 * 回复内容
	 */
	@ApiField("answer_content")
	private String answerContent;

	/**
	 * 技师ID
	 */
	@ApiField("answer_id")
	private String answerId;

	/**
	 * 技师头像
	 */
	@ApiField("answer_logo")
	private String answerLogo;

	/**
	 * 技师昵称
	 */
	@ApiField("answer_name")
	private String answerName;

	/**
	 * 回复图片
	 */
	@ApiField("answer_pic")
	private String answerPic;

	/**
	 * 回复时间
	 */
	@ApiField("answer_time")
	private String answerTime;

	/**
	 * 1：问题回复， 2：对话回复
	 */
	@ApiField("answer_type")
	private String answerType;

	/**
	 * 内容类型，1：文本， 2：图片
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 问题ID
	 */
	@ApiField("question_id")
	private String questionId;

	/**
	 * <p>Getter for the field <code>answerContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAnswerContent() {
		return this.answerContent;
	}
	/**
	 * <p>Setter for the field <code>answerContent</code>.</p>
	 *
	 * @param answerContent a {@link java.lang.String} object.
	 */
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

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
	 * <p>Getter for the field <code>answerLogo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAnswerLogo() {
		return this.answerLogo;
	}
	/**
	 * <p>Setter for the field <code>answerLogo</code>.</p>
	 *
	 * @param answerLogo a {@link java.lang.String} object.
	 */
	public void setAnswerLogo(String answerLogo) {
		this.answerLogo = answerLogo;
	}

	/**
	 * <p>Getter for the field <code>answerName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAnswerName() {
		return this.answerName;
	}
	/**
	 * <p>Setter for the field <code>answerName</code>.</p>
	 *
	 * @param answerName a {@link java.lang.String} object.
	 */
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}

	/**
	 * <p>Getter for the field <code>answerPic</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAnswerPic() {
		return this.answerPic;
	}
	/**
	 * <p>Setter for the field <code>answerPic</code>.</p>
	 *
	 * @param answerPic a {@link java.lang.String} object.
	 */
	public void setAnswerPic(String answerPic) {
		this.answerPic = answerPic;
	}

	/**
	 * <p>Getter for the field <code>answerTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAnswerTime() {
		return this.answerTime;
	}
	/**
	 * <p>Setter for the field <code>answerTime</code>.</p>
	 *
	 * @param answerTime a {@link java.lang.String} object.
	 */
	public void setAnswerTime(String answerTime) {
		this.answerTime = answerTime;
	}

	/**
	 * <p>Getter for the field <code>answerType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAnswerType() {
		return this.answerType;
	}
	/**
	 * <p>Setter for the field <code>answerType</code>.</p>
	 *
	 * @param answerType a {@link java.lang.String} object.
	 */
	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}

	/**
	 * <p>Getter for the field <code>contentType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContentType() {
		return this.contentType;
	}
	/**
	 * <p>Setter for the field <code>contentType</code>.</p>
	 *
	 * @param contentType a {@link java.lang.String} object.
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * <p>Getter for the field <code>questionId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQuestionId() {
		return this.questionId;
	}
	/**
	 * <p>Setter for the field <code>questionId</code>.</p>
	 *
	 * @param questionId a {@link java.lang.String} object.
	 */
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

}
