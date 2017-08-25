package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 减至指定折扣奖品模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ReduceToDiscountDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 4515724698552784778L;

	/**
	 * 折扣预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 奖品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 单次优惠上限(元)
	 */
	@ApiField("max_discount_amt")
	private String maxDiscountAmt;

	/**
	 * 折扣幅度减至必须为0.3到1之间的小数(保留小数点后2位)
	 */
	@ApiField("reduce_to_discount_rate")
	private String reduceToDiscountRate;

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
	 * <p>Getter for the field <code>maxDiscountAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMaxDiscountAmt() {
		return this.maxDiscountAmt;
	}
	/**
	 * <p>Setter for the field <code>maxDiscountAmt</code>.</p>
	 *
	 * @param maxDiscountAmt a {@link java.lang.String} object.
	 */
	public void setMaxDiscountAmt(String maxDiscountAmt) {
		this.maxDiscountAmt = maxDiscountAmt;
	}

	/**
	 * <p>Getter for the field <code>reduceToDiscountRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReduceToDiscountRate() {
		return this.reduceToDiscountRate;
	}
	/**
	 * <p>Setter for the field <code>reduceToDiscountRate</code>.</p>
	 *
	 * @param reduceToDiscountRate a {@link java.lang.String} object.
	 */
	public void setReduceToDiscountRate(String reduceToDiscountRate) {
		this.reduceToDiscountRate = reduceToDiscountRate;
	}

}
