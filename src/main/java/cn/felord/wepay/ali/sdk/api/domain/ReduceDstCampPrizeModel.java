package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 满立减奖品模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ReduceDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 6893591839889293693L;

	/**
	 * 折扣预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 奖品id, 修改必输，新增不输入
	 */
	@ApiField("id")
	private String id;

	/**
	 * 单次优惠上限(元)
	 */
	@ApiField("max_discount_amt")
	private String maxDiscountAmt;

	/**
	 * 满的金额只能填写正整数字，大于0，必须小于9位
	 */
	@ApiField("reduce_amt_pre")
	private String reduceAmtPre;

	/**
	 * 减的金额只能填写数字，大于0，小数点后最多2位，整数部分不能超过8位
	 */
	@ApiField("reduce_amt_suf")
	private String reduceAmtSuf;

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
	 * <p>Getter for the field <code>reduceAmtPre</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReduceAmtPre() {
		return this.reduceAmtPre;
	}
	/**
	 * <p>Setter for the field <code>reduceAmtPre</code>.</p>
	 *
	 * @param reduceAmtPre a {@link java.lang.String} object.
	 */
	public void setReduceAmtPre(String reduceAmtPre) {
		this.reduceAmtPre = reduceAmtPre;
	}

	/**
	 * <p>Getter for the field <code>reduceAmtSuf</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReduceAmtSuf() {
		return this.reduceAmtSuf;
	}
	/**
	 * <p>Setter for the field <code>reduceAmtSuf</code>.</p>
	 *
	 * @param reduceAmtSuf a {@link java.lang.String} object.
	 */
	public void setReduceAmtSuf(String reduceAmtSuf) {
		this.reduceAmtSuf = reduceAmtSuf;
	}

}
