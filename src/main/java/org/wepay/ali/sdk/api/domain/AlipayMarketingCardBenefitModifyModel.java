package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 会员卡模板外部权益修改
 *
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:45
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

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public McardTemplateBenefit getMcardTemplateBenefit() {
		return this.mcardTemplateBenefit;
	}
	public void setMcardTemplateBenefit(McardTemplateBenefit mcardTemplateBenefit) {
		this.mcardTemplateBenefit = mcardTemplateBenefit;
	}

}
