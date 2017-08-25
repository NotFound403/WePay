package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.point.budget.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPointBudgetGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8355788577649617771L;

	/** 
	 * 还可以发放的集分宝个数
	 */
	@ApiField("budget_amount")
	private Long budgetAmount;

	/**
	 * <p>Setter for the field <code>budgetAmount</code>.</p>
	 *
	 * @param budgetAmount a {@link java.lang.Long} object.
	 */
	public void setBudgetAmount(Long budgetAmount) {
		this.budgetAmount = budgetAmount;
	}
	/**
	 * <p>Getter for the field <code>budgetAmount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getBudgetAmount( ) {
		return this.budgetAmount;
	}

}
