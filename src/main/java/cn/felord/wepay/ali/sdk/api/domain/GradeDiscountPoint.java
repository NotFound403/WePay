package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 权益等级折扣积分
 *
 * @author auto create
 * @version $Id: $Id
 */
public class GradeDiscountPoint extends AlipayObject {

	private static final long serialVersionUID = 7644369119372666881L;

	/**
	 * 蚂蚁会员权益配置的ID
	 */
	@ApiField("benefit_id")
	private Long benefitId;

	/**
	 * 各个等级的等级折扣后的积分
	 */
	@ApiField("discount_point")
	private String discountPoint;

	/**
	 * 蚂蚁会员等级
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * <p>Getter for the field <code>benefitId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getBenefitId() {
		return this.benefitId;
	}
	/**
	 * <p>Setter for the field <code>benefitId</code>.</p>
	 *
	 * @param benefitId a {@link java.lang.Long} object.
	 */
	public void setBenefitId(Long benefitId) {
		this.benefitId = benefitId;
	}

	/**
	 * <p>Getter for the field <code>discountPoint</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDiscountPoint() {
		return this.discountPoint;
	}
	/**
	 * <p>Setter for the field <code>discountPoint</code>.</p>
	 *
	 * @param discountPoint a {@link java.lang.String} object.
	 */
	public void setDiscountPoint(String discountPoint) {
		this.discountPoint = discountPoint;
	}

	/**
	 * <p>Getter for the field <code>grade</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGrade() {
		return this.grade;
	}
	/**
	 * <p>Setter for the field <code>grade</code>.</p>
	 *
	 * @param grade a {@link java.lang.String} object.
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
