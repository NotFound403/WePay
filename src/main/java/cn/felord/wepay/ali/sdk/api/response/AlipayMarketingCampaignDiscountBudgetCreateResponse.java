package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.budget.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignDiscountBudgetCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3197296668513182951L;

	/** 
	 * 预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * <p>Setter for the field <code>budgetId</code>.</p>
	 *
	 * @param budgetId a {@link java.lang.String} object.
	 */
	public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}
	/**
	 * <p>Getter for the field <code>budgetId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBudgetId( ) {
		return this.budgetId;
	}

}
