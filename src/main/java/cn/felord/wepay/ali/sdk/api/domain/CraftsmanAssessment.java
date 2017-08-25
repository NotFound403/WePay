package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 手艺人评价详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CraftsmanAssessment extends AlipayObject {

	private static final long serialVersionUID = 2756222132616898189L;

	/**
	 * 子评分项
	 */
	@ApiListField("sub_assessments")
	@ApiField("craftsman_sub_assessment")
	private List<CraftsmanSubAssessment> subAssessments;

	/**
	 * 单个手艺人的评价总条数。
	 */
	@ApiField("total_no")
	private Long totalNo;

	/**
	 * 单个手艺人的总评分的均分
	 */
	@ApiField("total_score")
	private Long totalScore;

	/**
	 * <p>Getter for the field <code>subAssessments</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CraftsmanSubAssessment> getSubAssessments() {
		return this.subAssessments;
	}
	/**
	 * <p>Setter for the field <code>subAssessments</code>.</p>
	 *
	 * @param subAssessments a {@link java.util.List} object.
	 */
	public void setSubAssessments(List<CraftsmanSubAssessment> subAssessments) {
		this.subAssessments = subAssessments;
	}

	/**
	 * <p>Getter for the field <code>totalNo</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalNo() {
		return this.totalNo;
	}
	/**
	 * <p>Setter for the field <code>totalNo</code>.</p>
	 *
	 * @param totalNo a {@link java.lang.Long} object.
	 */
	public void setTotalNo(Long totalNo) {
		this.totalNo = totalNo;
	}

	/**
	 * <p>Getter for the field <code>totalScore</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalScore() {
		return this.totalScore;
	}
	/**
	 * <p>Setter for the field <code>totalScore</code>.</p>
	 *
	 * @param totalScore a {@link java.lang.Long} object.
	 */
	public void setTotalScore(Long totalScore) {
		this.totalScore = totalScore;
	}

}
