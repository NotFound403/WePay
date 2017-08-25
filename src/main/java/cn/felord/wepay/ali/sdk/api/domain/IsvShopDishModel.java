package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 菜品热度统计模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class IsvShopDishModel extends AlipayObject {

	private static final long serialVersionUID = 4751485472355343375L;

	/**
	 * 菜品库存。 alipay.offline.provider.shopaction.record回传点菜中的desc。建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiField("content")
	private String content;

	/**
	 * 菜品分类ID
alipay.offline.provider.shopaction.record回传点菜中的dishTypeID，建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiField("dish_type_id")
	private String dishTypeId;

	/**
	 * 商家定义菜品的分类名称 alipay.offline.provider.shopaction.record回传点菜中的dishTypeName，建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiField("dish_type_name")
	private String dishTypeName;

	/**
	 * 菜品热度等级（0/0.5/1/1.5/2/2.5/3/3.5/4/4.5/5）该字段是对sort_col做离散化，数字越大越热
	 */
	@ApiField("good_level")
	private String goodLevel;

	/**
	 * 当前店铺的商家最近7天销量（份）
	 */
	@ApiField("merchant_sold_cnt_seven_d")
	private Long merchantSoldCntSevenD;

	/**
	 * 当前店铺的商家最近30天销量（份）
	 */
	@ApiField("merchant_sold_cnt_thirty_d")
	private Long merchantSoldCntThirtyD;

	/**
	 * 当前店铺的商家最近30天购买2次及以上的支付宝用户数
	 */
	@ApiField("merchant_sold_reusercnt_thirty_d")
	private Long merchantSoldReusercntThirtyD;

	/**
	 * 当前店铺的商家最近30天消费支付宝用户数
	 */
	@ApiField("merchant_sold_usercnt_thirty_d")
	private Long merchantSoldUsercntThirtyD;

	/**
	 * alipay.offline.provider.shopaction.record回传点菜中的name
	 */
	@ApiField("name")
	private String name;

	/**
	 * ISV自己的菜品ID，数据的计算根据：alipay.offline.provider.shopaction.record接口中插入菜品与alipay.offline.provider.useraction.record上传用户点菜菜单作为元数据，通过分析得到的数据。当前的ID就是插入菜品中的outerDishId，同时也是上传用户点菜中的action_type是order_dishes里面的dish对象的goodsId
	 */
	@ApiField("outer_dish_id")
	private String outerDishId;

	/**
	 * 废弃，请ISV使用自己的图
	 */
	@ApiField("pict")
	private String pict;

	/**
	 * 当前值来自于alipay.offline.provider.shopaction.record中的outer_shop_do对象里面的 type字段。
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * alipay.offline.provider.shopaction.record回传点菜中的price，建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiField("price")
	private String price;

	/**
	 * 菜品库存。
alipay.offline.provider.shopaction.record回传点菜中的quantity，建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 口碑店铺id，商户订购开发者服务插件后，口碑会通过服务市场管理推送订购信息给开发者，开发者可通过其中的订购插件订单明细查询获取此参数值，或通过商户授权口碑开店接口来获取。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 当前店铺最近7天销量（份）
	 */
	@ApiField("sold_cnt_seven_d")
	private Long soldCntSevenD;

	/**
	 * 当前店铺最近30天销量（份）
	 */
	@ApiField("sold_cnt_thirty_d")
	private Long soldCntThirtyD;

	/**
	 * 当前店铺最近30天购买2次及以上的支付宝用户数
	 */
	@ApiField("sold_reusercnt_thirty_d")
	private Long soldReusercntThirtyD;

	/**
	 * 当前店铺最近30天消费支付宝用户数
	 */
	@ApiField("sold_usercnt_thirty_d")
	private Long soldUsercntThirtyD;

	/**
	 * 排序值。 alipay.offline.provider.shopaction.record回传点菜中的sort。建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiListField("sort_col")
	@ApiField("number")
	private List<Long> sortCol;

	/**
	 * 菜品显示的单位（份/斤/杯） alipay.offline.provider.shopaction.record回传点菜中的unit，建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * <p>Getter for the field <code>content</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * <p>Setter for the field <code>content</code>.</p>
	 *
	 * @param content a {@link java.lang.String} object.
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * <p>Getter for the field <code>dishTypeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDishTypeId() {
		return this.dishTypeId;
	}
	/**
	 * <p>Setter for the field <code>dishTypeId</code>.</p>
	 *
	 * @param dishTypeId a {@link java.lang.String} object.
	 */
	public void setDishTypeId(String dishTypeId) {
		this.dishTypeId = dishTypeId;
	}

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
	 * <p>Getter for the field <code>goodLevel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGoodLevel() {
		return this.goodLevel;
	}
	/**
	 * <p>Setter for the field <code>goodLevel</code>.</p>
	 *
	 * @param goodLevel a {@link java.lang.String} object.
	 */
	public void setGoodLevel(String goodLevel) {
		this.goodLevel = goodLevel;
	}

	/**
	 * <p>Getter for the field <code>merchantSoldCntSevenD</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getMerchantSoldCntSevenD() {
		return this.merchantSoldCntSevenD;
	}
	/**
	 * <p>Setter for the field <code>merchantSoldCntSevenD</code>.</p>
	 *
	 * @param merchantSoldCntSevenD a {@link java.lang.Long} object.
	 */
	public void setMerchantSoldCntSevenD(Long merchantSoldCntSevenD) {
		this.merchantSoldCntSevenD = merchantSoldCntSevenD;
	}

	/**
	 * <p>Getter for the field <code>merchantSoldCntThirtyD</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getMerchantSoldCntThirtyD() {
		return this.merchantSoldCntThirtyD;
	}
	/**
	 * <p>Setter for the field <code>merchantSoldCntThirtyD</code>.</p>
	 *
	 * @param merchantSoldCntThirtyD a {@link java.lang.Long} object.
	 */
	public void setMerchantSoldCntThirtyD(Long merchantSoldCntThirtyD) {
		this.merchantSoldCntThirtyD = merchantSoldCntThirtyD;
	}

	/**
	 * <p>Getter for the field <code>merchantSoldReusercntThirtyD</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getMerchantSoldReusercntThirtyD() {
		return this.merchantSoldReusercntThirtyD;
	}
	/**
	 * <p>Setter for the field <code>merchantSoldReusercntThirtyD</code>.</p>
	 *
	 * @param merchantSoldReusercntThirtyD a {@link java.lang.Long} object.
	 */
	public void setMerchantSoldReusercntThirtyD(Long merchantSoldReusercntThirtyD) {
		this.merchantSoldReusercntThirtyD = merchantSoldReusercntThirtyD;
	}

	/**
	 * <p>Getter for the field <code>merchantSoldUsercntThirtyD</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getMerchantSoldUsercntThirtyD() {
		return this.merchantSoldUsercntThirtyD;
	}
	/**
	 * <p>Setter for the field <code>merchantSoldUsercntThirtyD</code>.</p>
	 *
	 * @param merchantSoldUsercntThirtyD a {@link java.lang.Long} object.
	 */
	public void setMerchantSoldUsercntThirtyD(Long merchantSoldUsercntThirtyD) {
		this.merchantSoldUsercntThirtyD = merchantSoldUsercntThirtyD;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
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
	 * <p>Getter for the field <code>pict</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPict() {
		return this.pict;
	}
	/**
	 * <p>Setter for the field <code>pict</code>.</p>
	 *
	 * @param pict a {@link java.lang.String} object.
	 */
	public void setPict(String pict) {
		this.pict = pict;
	}

	/**
	 * <p>Getter for the field <code>platform</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPlatform() {
		return this.platform;
	}
	/**
	 * <p>Setter for the field <code>platform</code>.</p>
	 *
	 * @param platform a {@link java.lang.String} object.
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * <p>Getter for the field <code>price</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrice() {
		return this.price;
	}
	/**
	 * <p>Setter for the field <code>price</code>.</p>
	 *
	 * @param price a {@link java.lang.String} object.
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * <p>Getter for the field <code>quantity</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getQuantity() {
		return this.quantity;
	}
	/**
	 * <p>Setter for the field <code>quantity</code>.</p>
	 *
	 * @param quantity a {@link java.lang.Long} object.
	 */
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
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

	/**
	 * <p>Getter for the field <code>soldCntSevenD</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getSoldCntSevenD() {
		return this.soldCntSevenD;
	}
	/**
	 * <p>Setter for the field <code>soldCntSevenD</code>.</p>
	 *
	 * @param soldCntSevenD a {@link java.lang.Long} object.
	 */
	public void setSoldCntSevenD(Long soldCntSevenD) {
		this.soldCntSevenD = soldCntSevenD;
	}

	/**
	 * <p>Getter for the field <code>soldCntThirtyD</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getSoldCntThirtyD() {
		return this.soldCntThirtyD;
	}
	/**
	 * <p>Setter for the field <code>soldCntThirtyD</code>.</p>
	 *
	 * @param soldCntThirtyD a {@link java.lang.Long} object.
	 */
	public void setSoldCntThirtyD(Long soldCntThirtyD) {
		this.soldCntThirtyD = soldCntThirtyD;
	}

	/**
	 * <p>Getter for the field <code>soldReusercntThirtyD</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getSoldReusercntThirtyD() {
		return this.soldReusercntThirtyD;
	}
	/**
	 * <p>Setter for the field <code>soldReusercntThirtyD</code>.</p>
	 *
	 * @param soldReusercntThirtyD a {@link java.lang.Long} object.
	 */
	public void setSoldReusercntThirtyD(Long soldReusercntThirtyD) {
		this.soldReusercntThirtyD = soldReusercntThirtyD;
	}

	/**
	 * <p>Getter for the field <code>soldUsercntThirtyD</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getSoldUsercntThirtyD() {
		return this.soldUsercntThirtyD;
	}
	/**
	 * <p>Setter for the field <code>soldUsercntThirtyD</code>.</p>
	 *
	 * @param soldUsercntThirtyD a {@link java.lang.Long} object.
	 */
	public void setSoldUsercntThirtyD(Long soldUsercntThirtyD) {
		this.soldUsercntThirtyD = soldUsercntThirtyD;
	}

	/**
	 * <p>Getter for the field <code>sortCol</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Long> getSortCol() {
		return this.sortCol;
	}
	/**
	 * <p>Setter for the field <code>sortCol</code>.</p>
	 *
	 * @param sortCol a {@link java.util.List} object.
	 */
	public void setSortCol(List<Long> sortCol) {
		this.sortCol = sortCol;
	}

	/**
	 * <p>Getter for the field <code>unit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUnit() {
		return this.unit;
	}
	/**
	 * <p>Setter for the field <code>unit</code>.</p>
	 *
	 * @param unit a {@link java.lang.String} object.
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
