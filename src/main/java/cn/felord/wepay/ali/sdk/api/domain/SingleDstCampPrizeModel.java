package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 单笔减奖品模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SingleDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 3436255958668719431L;

	/**
	 * 预算id
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 奖品id,新增不传，修改传
	 */
	@ApiField("id")
	private String id;

	/**
	 * 折扣幅度只能填写数字，大于0，小数点后最多2位，整数部分不能超过8位
	 */
	@ApiField("reduce_amt")
	private String reduceAmt;

	/**
	 * <p>Getter for the field <code>budgetId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBudgetId() {
		return this.budgetId;
	}
	/**
	 * <p>Setter for the field <code>budgetId</code>.</p>
	 *
	 * @param budgetId a {@link java.lang.String} object.
	 */
	public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * <p>Getter for the field <code>reduceAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReduceAmt() {
		return this.reduceAmt;
	}
	/**
	 * <p>Setter for the field <code>reduceAmt</code>.</p>
	 *
	 * @param reduceAmt a {@link java.lang.String} object.
	 */
	public void setReduceAmt(String reduceAmt) {
		this.reduceAmt = reduceAmt;
	}

}
