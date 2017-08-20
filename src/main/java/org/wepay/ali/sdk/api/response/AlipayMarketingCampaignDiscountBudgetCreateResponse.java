package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.budget.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-08 12:53:36
 */
public class AlipayMarketingCampaignDiscountBudgetCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3197296668513182951L;

	/** 
	 * 预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}
	public String getBudgetId( ) {
		return this.budgetId;
	}

}
