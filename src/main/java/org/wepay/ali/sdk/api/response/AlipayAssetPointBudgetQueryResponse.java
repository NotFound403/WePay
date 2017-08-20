package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.budget.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 18:58:03
 */
public class AlipayAssetPointBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8616933184382622816L;

	/** 
	 * 还可以发放的集分宝个数
	 */
	@ApiField("budget_amount")
	private Long budgetAmount;

	public void setBudgetAmount(Long budgetAmount) {
		this.budgetAmount = budgetAmount;
	}
	public Long getBudgetAmount( ) {
		return this.budgetAmount;
	}

}
