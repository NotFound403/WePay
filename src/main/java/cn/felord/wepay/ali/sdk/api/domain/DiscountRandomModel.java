package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 随机立减折扣幅度模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DiscountRandomModel extends AlipayObject {

	private static final long serialVersionUID = 2695619671266364568L;

	/**
	 * 最高优惠金额
	 */
	@ApiField("max_amount")
	private String maxAmount;

	/**
	 * 最低优惠金额
	 */
	@ApiField("min_amount")
	private String minAmount;

	/**
	 * 概率 金额区间、占比支持小数点后两位
区间为前闭、后闭，最多可以设置10种金额区间，所有区间占比和需要等于100%
	 */
	@ApiField("probability")
	private String probability;

	/**
	 * <p>Getter for the field <code>maxAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMaxAmount() {
		return this.maxAmount;
	}
	/**
	 * <p>Setter for the field <code>maxAmount</code>.</p>
	 *
	 * @param maxAmount a {@link java.lang.String} object.
	 */
	public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}

	/**
	 * <p>Getter for the field <code>minAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMinAmount() {
		return this.minAmount;
	}
	/**
	 * <p>Setter for the field <code>minAmount</code>.</p>
	 *
	 * @param minAmount a {@link java.lang.String} object.
	 */
	public void setMinAmount(String minAmount) {
		this.minAmount = minAmount;
	}

	/**
	 * <p>Getter for the field <code>probability</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProbability() {
		return this.probability;
	}
	/**
	 * <p>Setter for the field <code>probability</code>.</p>
	 *
	 * @param probability a {@link java.lang.String} object.
	 */
	public void setProbability(String probability) {
		this.probability = probability;
	}

}
