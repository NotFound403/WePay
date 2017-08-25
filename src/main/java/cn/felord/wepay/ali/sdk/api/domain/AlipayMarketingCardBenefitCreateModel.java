package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 会员卡模板外部权益创建
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardBenefitCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1178732326515796278L;

	/**
	 * 会员卡模板外部权益
	 */
	@ApiField("mcard_template_benefit")
	private McardTemplateBenefit mcardTemplateBenefit;

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
