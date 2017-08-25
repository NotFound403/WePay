package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 手艺人子评分项
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CraftsmanSubAssessment extends AlipayObject {

	private static final long serialVersionUID = 3679352893381766727L;

	/**
	 * 子评分
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 子评分项名
	 */
	@ApiField("title")
	private String title;

	/**
	 * <p>Getter for the field <code>score</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getScore() {
		return this.score;
	}
	/**
	 * <p>Setter for the field <code>score</code>.</p>
	 *
	 * @param score a {@link java.lang.Long} object.
	 */
	public void setScore(Long score) {
		this.score = score;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
