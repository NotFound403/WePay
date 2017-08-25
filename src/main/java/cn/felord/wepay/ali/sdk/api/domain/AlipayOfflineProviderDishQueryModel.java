package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑菜品热度查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineProviderDishQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7721281852127758538L;

	/**
	 * 数据是根据alipay.offline.provider.shopaction.record的插入菜品接口获取，对应字段是：dishTypeName。
	 */
	@ApiField("dish_type_name")
	private String dishTypeName;

	/**
	 * order_by：1，菜品热度升序查询，order_by：2，菜品热度降序查询。不设置时默认为2(菜品热度降序查询)
	 */
	@ApiField("order_by")
	private String orderBy;

	/**
	 * ISV自己的菜品ID，数据的计算根据：alipay.offline.provider.shopaction.record接口中插入菜品与alipay.offline.provider.useraction.record上传用户点菜菜单作为元数据，通过分析得到的数据。当前的ID就是插入菜品中的outerDishId，同时也是上传用户点菜中的action_type是order_dishes里面的dish对象的goodsId
	 */
	@ApiField("outer_dish_id")
	private String outerDishId;

	/**
	 * 需要查询的第几页信息。非必填。默认为1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 分页查询每页的条数，默认为20条，每次最大拉去条数100,超过限制直接返回错误
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 口碑店铺id，商户订购开发者服务插件后，口碑会通过服务市场管理推送订购信息给开发者，开发者可通过其中的订购插件订单明细查询获取此参数值，或通过商户授权口碑开店接口来获取。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * <p>Getter for the field <code>dishTypeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDishTypeName() {
		return this.dishTypeName;
	}
	/**
	 * <p>Setter for the field <code>dishTypeName</code>.</p>
	 *
	 * @param dishTypeName a {@link java.lang.String} object.
	 */
	public void setDishTypeName(String dishTypeName) {
		this.dishTypeName = dishTypeName;
	}

	/**
	 * <p>Getter for the field <code>orderBy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderBy() {
		return this.orderBy;
	}
	/**
	 * <p>Setter for the field <code>orderBy</code>.</p>
	 *
	 * @param orderBy a {@link java.lang.String} object.
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	/**
	 * <p>Getter for the field <code>outerDishId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOuterDishId() {
		return this.outerDishId;
	}
	/**
	 * <p>Setter for the field <code>outerDishId</code>.</p>
	 *
	 * @param outerDishId a {@link java.lang.String} object.
	 */
	public void setOuterDishId(String outerDishId) {
		this.outerDishId = outerDishId;
	}

	/**
	 * <p>Getter for the field <code>page</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPage() {
		return this.page;
	}
	/**
	 * <p>Setter for the field <code>page</code>.</p>
	 *
	 * @param page a {@link java.lang.Long} object.
	 */
	public void setPage(Long page) {
		this.page = page;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.Long} object.
	 */
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
