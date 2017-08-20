package org.wepay.ali.sdk.api.domain;

import java.util.List;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 手艺人评价详情
 *
 * @author auto create
 * @since 1.0, 2017-01-13 16:27:52
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

	public List<CraftsmanSubAssessment> getSubAssessments() {
		return this.subAssessments;
	}
	public void setSubAssessments(List<CraftsmanSubAssessment> subAssessments) {
		this.subAssessments = subAssessments;
	}

	public Long getTotalNo() {
		return this.totalNo;
	}
	public void setTotalNo(Long totalNo) {
		this.totalNo = totalNo;
	}

	public Long getTotalScore() {
		return this.totalScore;
	}
	public void setTotalScore(Long totalScore) {
		this.totalScore = totalScore;
	}

}
