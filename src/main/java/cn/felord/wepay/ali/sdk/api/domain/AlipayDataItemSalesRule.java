package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 商品销售规则(数据)
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataItemSalesRule extends AlipayObject {

	private static final long serialVersionUID = 4446885555781964472L;

	/**
	 * 购买人群限制集合，开放平台暂时不支持此字段，如果需要使用，需要评估
	 */
	@ApiField("buyer_crowd_limit")
	private String buyerCrowdLimit;

	/**
	 * 商品单日销售上限
	 */
	@ApiField("daily_sales_limit")
	private Long dailySalesLimit;

	/**
	 * 用户购买策略如不填，则默认值为一个用户一天可以领取三次。
可限制DAY、WEEK、MONTH中n天领取m次，格式为DAY|n|m；
同时也可限制券的1次生命周期中可被领取x次，如ALL|1|x，两个规则可组合使用
	 */
	@ApiListField("user_sales_limit")
	@ApiField("string")
	private List<String> userSalesLimit;

	/**
	 * <p>Getter for the field <code>buyerCrowdLimit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerCrowdLimit() {
		return this.buyerCrowdLimit;
	}
	/**
	 * <p>Setter for the field <code>buyerCrowdLimit</code>.</p>
	 *
	 * @param buyerCrowdLimit a {@link java.lang.String} object.
	 */
	public void setBuyerCrowdLimit(String buyerCrowdLimit) {
		this.buyerCrowdLimit = buyerCrowdLimit;
	}

	/**
	 * <p>Getter for the field <code>dailySalesLimit</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getDailySalesLimit() {
		return this.dailySalesLimit;
	}
	/**
	 * <p>Setter for the field <code>dailySalesLimit</code>.</p>
	 *
	 * @param dailySalesLimit a {@link java.lang.Long} object.
	 */
	public void setDailySalesLimit(Long dailySalesLimit) {
		this.dailySalesLimit = dailySalesLimit;
	}

	/**
	 * <p>Getter for the field <code>userSalesLimit</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getUserSalesLimit() {
		return this.userSalesLimit;
	}
	/**
	 * <p>Setter for the field <code>userSalesLimit</code>.</p>
	 *
	 * @param userSalesLimit a {@link java.util.List} object.
	 */
	public void setUserSalesLimit(List<String> userSalesLimit) {
		this.userSalesLimit = userSalesLimit;
	}

}
