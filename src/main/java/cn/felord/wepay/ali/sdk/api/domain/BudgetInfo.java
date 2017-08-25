package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 预算信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BudgetInfo extends AlipayObject {

	private static final long serialVersionUID = 1526985786289127149L;

	/**
	 * 预算数量
	 */
	@ApiField("budget_total")
	private String budgetTotal;

	/**
	 * 预算类型
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * <p>Getter for the field <code>budgetTotal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBudgetTotal() {
		return this.budgetTotal;
	}
	/**
	 * <p>Setter for the field <code>budgetTotal</code>.</p>
	 *
	 * @param budgetTotal a {@link java.lang.String} object.
	 */
	public void setBudgetTotal(String budgetTotal) {
		this.budgetTotal = budgetTotal;
	}

	/**
	 * <p>Getter for the field <code>budgetType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBudgetType() {
		return this.budgetType;
	}
	/**
	 * <p>Setter for the field <code>budgetType</code>.</p>
	 *
	 * @param budgetType a {@link java.lang.String} object.
	 */
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

}
