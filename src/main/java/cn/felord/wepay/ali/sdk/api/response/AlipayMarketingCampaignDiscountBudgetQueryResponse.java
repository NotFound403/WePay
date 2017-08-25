package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.budget.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignDiscountBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3379696383344494147L;

	/** 
	 * 预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/** 
	 * 预算总金额，单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 已使用金额
	 */
	@ApiField("used_amount")
	private String usedAmount;

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

	/**
	 * <p>Setter for the field <code>totalAmount</code>.</p>
	 *
	 * @param totalAmount a {@link java.lang.String} object.
	 */
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * <p>Getter for the field <code>totalAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	/**
	 * <p>Setter for the field <code>usedAmount</code>.</p>
	 *
	 * @param usedAmount a {@link java.lang.String} object.
	 */
	public void setUsedAmount(String usedAmount) {
		this.usedAmount = usedAmount;
	}
	/**
	 * <p>Getter for the field <code>usedAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUsedAmount( ) {
		return this.usedAmount;
	}

}
