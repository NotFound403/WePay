package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.benefit.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:35
 */
public class AlipayMarketingCardBenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5399448677664479352L;

	/** 
	 * 权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

}
