package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 门店评分信息模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ShopCommentInfo extends AlipayObject {

	private static final long serialVersionUID = 6342236815943714935L;

	/**
	 * 门店评分，评分越高，门店质量越高
	 */
	@ApiField("score")
	private String score;

	/**
	 * 门店星级，0~5,越高，店铺质量越高
	 */
	@ApiField("star")
	private String star;

	/**
	 * <p>Getter for the field <code>score</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getScore() {
		return this.score;
	}
	/**
	 * <p>Setter for the field <code>score</code>.</p>
	 *
	 * @param score a {@link java.lang.String} object.
	 */
	public void setScore(String score) {
		this.score = score;
	}

	/**
	 * <p>Getter for the field <code>star</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStar() {
		return this.star;
	}
	/**
	 * <p>Setter for the field <code>star</code>.</p>
	 *
	 * @param star a {@link java.lang.String} object.
	 */
	public void setStar(String star) {
		this.star = star;
	}

}
