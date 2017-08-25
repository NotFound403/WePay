package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 会员卡模板外部权益修改
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardBenefitModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4717884934413394243L;

	/**
	 * 权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 会员卡模板外部权益
	 */
	@ApiField("mcard_template_benefit")
	private McardTemplateBenefit mcardTemplateBenefit;

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
	 * <p>Getter for the field <code>mcardTemplateBenefit</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.McardTemplateBenefit} object.
	 */
	public McardTemplateBenefit getMcardTemplateBenefit() {
		return this.mcardTemplateBenefit;
	}
	/**
	 * <p>Setter for the field <code>mcardTemplateBenefit</code>.</p>
	 *
	 * @param mcardTemplateBenefit a {@link cn.felord.wepay.ali.sdk.api.domain.McardTemplateBenefit} object.
	 */
	public void setMcardTemplateBenefit(McardTemplateBenefit mcardTemplateBenefit) {
		this.mcardTemplateBenefit = mcardTemplateBenefit;
	}

}
