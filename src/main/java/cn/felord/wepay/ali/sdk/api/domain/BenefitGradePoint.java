package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 权益等级折扣积分模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BenefitGradePoint extends AlipayObject {

	private static final long serialVersionUID = 6839189589494618273L;

	/**
	 * 蚂蚁会员权益配置的ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 蚂蚁会员权益配置在各个用户等级下的折扣积分
	 */
	@ApiListField("grade_points")
	@ApiField("grade_discount_point")
	private List<GradeDiscountPoint> gradePoints;

	/**
	 * 蚂蚁会员权益配置的原始积分
	 */
	@ApiField("original_point")
	private String originalPoint;

	/**
	 * 蚂蚁会员权益的专享等级列表
	 */
	@ApiField("own_grades")
	private String ownGrades;

	/**
	 * <p>Getter for the field <code>benefitId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitId() {
		return this.benefitId;
	}
	/**
	 * <p>Setter for the field <code>benefitId</code>.</p>
	 *
	 * @param benefitId a {@link java.lang.String} object.
	 */
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	/**
	 * <p>Getter for the field <code>gradePoints</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<GradeDiscountPoint> getGradePoints() {
		return this.gradePoints;
	}
	/**
	 * <p>Setter for the field <code>gradePoints</code>.</p>
	 *
	 * @param gradePoints a {@link java.util.List} object.
	 */
	public void setGradePoints(List<GradeDiscountPoint> gradePoints) {
		this.gradePoints = gradePoints;
	}

	/**
	 * <p>Getter for the field <code>originalPoint</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginalPoint() {
		return this.originalPoint;
	}
	/**
	 * <p>Setter for the field <code>originalPoint</code>.</p>
	 *
	 * @param originalPoint a {@link java.lang.String} object.
	 */
	public void setOriginalPoint(String originalPoint) {
		this.originalPoint = originalPoint;
	}

	/**
	 * <p>Getter for the field <code>ownGrades</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwnGrades() {
		return this.ownGrades;
	}
	/**
	 * <p>Setter for the field <code>ownGrades</code>.</p>
	 *
	 * @param ownGrades a {@link java.lang.String} object.
	 */
	public void setOwnGrades(String ownGrades) {
		this.ownGrades = ownGrades;
	}

}
