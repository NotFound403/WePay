package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 优惠立减奖品折扣模式
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DiscountDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 3754849973474191465L;

	/**
	 * 预算id,商户先调预算创建接口得到预算id,传入
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 折扣幅度必须为0.1到1之间的小数(保留小数点后2位)
	 */
	@ApiField("discount_rate")
	private String discountRate;

	/**
	 * 奖品id  修改传值 ，新增可以不传
	 */
	@ApiField("id")
	private String id;

	/**
	 * 单次优惠上限(元),单笔上限金额只能填写数字，大于等于0，小数点后最多2位，整数部分不能超过10位
	 */
	@ApiField("max_discount_amt")
	private String maxDiscountAmt;

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
	 * <p>Getter for the field <code>discountRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDiscountRate() {
		return this.discountRate;
	}
	/**
	 * <p>Setter for the field <code>discountRate</code>.</p>
	 *
	 * @param discountRate a {@link java.lang.String} object.
	 */
	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
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

}
