package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 用户信息和权益配置查询结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class UserInfoAndBenefitQueryResult extends AlipayObject {

	private static final long serialVersionUID = 1897213965621314365L;

	/**
	 * 用户的蚂蚁会员积分余额
	 */
	@ApiField("balance")
	private Long balance;

	/**
	 * 蚂蚁会员权益配置信息列表
	 */
	@ApiListField("benefit_info_list")
	@ApiField("benefit_grade_point")
	private List<BenefitGradePoint> benefitInfoList;

	/**
	 * 用户的蚂蚁会员等级
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * <p>Getter for the field <code>balance</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getBalance() {
		return this.balance;
	}
	/**
	 * <p>Setter for the field <code>balance</code>.</p>
	 *
	 * @param balance a {@link java.lang.Long} object.
	 */
	public void setBalance(Long balance) {
		this.balance = balance;
	}

	/**
	 * <p>Getter for the field <code>benefitInfoList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<BenefitGradePoint> getBenefitInfoList() {
		return this.benefitInfoList;
	}
	/**
	 * <p>Setter for the field <code>benefitInfoList</code>.</p>
	 *
	 * @param benefitInfoList a {@link java.util.List} object.
	 */
	public void setBenefitInfoList(List<BenefitGradePoint> benefitInfoList) {
		this.benefitInfoList = benefitInfoList;
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
