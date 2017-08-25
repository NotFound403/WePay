package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询转账订单退票接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayFundTransDishonorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5784598122672175783L;

	/**
	 * 查询退票起始时间:（大于等于），格式为yyyyMMdd。
用于查询退票起始日期00:00:00后发生的退票。
与refund_end差距不得大于15天。
	 */
	@ApiField("dishonor_begin")
	private String dishonorBegin;

	/**
	 * 查询退票截止时间：（小于），格式为yyyyMMdd。
用于查询退票截止日期24:00:00前发生的退票。
与refund_begin差距不得大于15天。
	 */
	@ApiField("dishonor_end")
	private String dishonorEnd;

	/**
	 * 查询页号。
必须是正整数。
默认值为1。
	 */
	@ApiField("page")
	private String page;

	/**
	 * <p>Getter for the field <code>dishonorBegin</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDishonorBegin() {
		return this.dishonorBegin;
	}
	/**
	 * <p>Setter for the field <code>dishonorBegin</code>.</p>
	 *
	 * @param dishonorBegin a {@link java.lang.String} object.
	 */
	public void setDishonorBegin(String dishonorBegin) {
		this.dishonorBegin = dishonorBegin;
	}

	/**
	 * <p>Getter for the field <code>dishonorEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDishonorEnd() {
		return this.dishonorEnd;
	}
	/**
	 * <p>Setter for the field <code>dishonorEnd</code>.</p>
	 *
	 * @param dishonorEnd a {@link java.lang.String} object.
	 */
	public void setDishonorEnd(String dishonorEnd) {
		this.dishonorEnd = dishonorEnd;
	}

	/**
	 * <p>Getter for the field <code>page</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPage() {
		return this.page;
	}
	/**
	 * <p>Setter for the field <code>page</code>.</p>
	 *
	 * @param page a {@link java.lang.String} object.
	 */
	public void setPage(String page) {
		this.page = page;
	}

}
