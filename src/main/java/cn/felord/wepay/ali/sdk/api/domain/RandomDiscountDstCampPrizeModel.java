package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 随机立减奖品模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RandomDiscountDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 3764636855396316794L;

	/**
	 * 折扣预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 随机立减折扣幅度列表
	 */
	@ApiListField("discount_random_model_list")
	@ApiField("discount_random_model")
	private List<DiscountRandomModel> discountRandomModelList;

	/**
	 * 奖品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 最高优惠金额=订单金额X(1-封顶折扣)
折扣幅度必须为0.3到1之间的小数(保留小数点后2位)
	 */
	@ApiField("max_random_discount_rate")
	private String maxRandomDiscountRate;

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
	 * <p>Getter for the field <code>discountRandomModelList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<DiscountRandomModel> getDiscountRandomModelList() {
		return this.discountRandomModelList;
	}
	/**
	 * <p>Setter for the field <code>discountRandomModelList</code>.</p>
	 *
	 * @param discountRandomModelList a {@link java.util.List} object.
	 */
	public void setDiscountRandomModelList(List<DiscountRandomModel> discountRandomModelList) {
		this.discountRandomModelList = discountRandomModelList;
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
	 * <p>Getter for the field <code>maxRandomDiscountRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMaxRandomDiscountRate() {
		return this.maxRandomDiscountRate;
	}
	/**
	 * <p>Setter for the field <code>maxRandomDiscountRate</code>.</p>
	 *
	 * @param maxRandomDiscountRate a {@link java.lang.String} object.
	 */
	public void setMaxRandomDiscountRate(String maxRandomDiscountRate) {
		this.maxRandomDiscountRate = maxRandomDiscountRate;
	}

}
