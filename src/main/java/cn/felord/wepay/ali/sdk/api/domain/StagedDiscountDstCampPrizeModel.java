package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 阶梯优惠
 *
 * @author auto create
 * @version $Id: $Id
 */
public class StagedDiscountDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 1658732955522849126L;

	/**
	 * 折扣预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 折扣幅度列表.
	 */
	@ApiListField("discount_rate_model_list")
	@ApiField("discount_rate_model")
	private List<DiscountRateModel> discountRateModelList;

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
	 * <p>Getter for the field <code>discountRateModelList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<DiscountRateModel> getDiscountRateModelList() {
		return this.discountRateModelList;
	}
	/**
	 * <p>Setter for the field <code>discountRateModelList</code>.</p>
	 *
	 * @param discountRateModelList a {@link java.util.List} object.
	 */
	public void setDiscountRateModelList(List<DiscountRateModel> discountRateModelList) {
		this.discountRateModelList = discountRateModelList;
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
