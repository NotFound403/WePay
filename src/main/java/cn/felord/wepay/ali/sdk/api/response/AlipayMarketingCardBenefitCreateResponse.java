package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.benefit.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardBenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5399448677664479352L;

	/** 
	 * 权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * <p>Setter for the field <code>benefitId</code>.</p>
	 *
	 * @param benefitId a {@link java.lang.String} object.
	 */
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	/**
	 * <p>Getter for the field <code>benefitId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitId( ) {
		return this.benefitId;
	}

}
