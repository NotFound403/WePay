package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 招商报名商品数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RecruitItemApplyData extends AlipayObject {

	private static final long serialVersionUID = 6137898739551433521L;

	/**
	 * 活动价格，单位为元，活动期间以此价格售卖。注：预热期间仍然以原价售卖，但是不消耗活动的库存。
	 */
	@ApiField("activity_price")
	private String activityPrice;

	/**
	 * 活动总库存，活动锁定的库存，是从商品总库存中隔离出来的库存。只有活动期间购买商品会消耗活动库存。
	 */
	@ApiField("activity_stock")
	private String activityStock;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品原价，单位为元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 折扣，8.5表示八五折，9表示九折
	 */
	@ApiField("sales")
	private String sales;

	/**
	 * <p>Getter for the field <code>activityPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityPrice() {
		return this.activityPrice;
	}
	/**
	 * <p>Setter for the field <code>activityPrice</code>.</p>
	 *
	 * @param activityPrice a {@link java.lang.String} object.
	 */
	public void setActivityPrice(String activityPrice) {
		this.activityPrice = activityPrice;
	}

	/**
	 * <p>Getter for the field <code>activityStock</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityStock() {
		return this.activityStock;
	}
	/**
	 * <p>Setter for the field <code>activityStock</code>.</p>
	 *
	 * @param activityStock a {@link java.lang.String} object.
	 */
	public void setActivityStock(String activityStock) {
		this.activityStock = activityStock;
	}

	/**
	 * <p>Getter for the field <code>itemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemId() {
		return this.itemId;
	}
	/**
	 * <p>Setter for the field <code>itemId</code>.</p>
	 *
	 * @param itemId a {@link java.lang.String} object.
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * <p>Getter for the field <code>originalPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginalPrice() {
		return this.originalPrice;
	}
	/**
	 * <p>Setter for the field <code>originalPrice</code>.</p>
	 *
	 * @param originalPrice a {@link java.lang.String} object.
	 */
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	/**
	 * <p>Getter for the field <code>sales</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSales() {
		return this.sales;
	}
	/**
	 * <p>Setter for the field <code>sales</code>.</p>
	 *
	 * @param sales a {@link java.lang.String} object.
	 */
	public void setSales(String sales) {
		this.sales = sales;
	}

}
