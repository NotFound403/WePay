package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 店铺优惠信息查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ShopDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 8522854485391739375L;

	/**
	 * 图片url
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 优惠信息描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 是否全场。
全场：Y，单品：N
	 */
	@ApiField("is_all")
	private String isAll;

	/**
	 * 支付宝商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 子类型
	 */
	@ApiField("promo_sub_type")
	private String promoSubType;

	/**
	 * 优惠类型。
优惠：discount
商品：item
	 */
	@ApiField("promotion_type")
	private String promotionType;

	/**
	 * 领用模式。自动领用：AUTO_OBTAIN。手动领用：OBTAIN
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/**
	 * 已用数量
	 */
	@ApiField("sales_quantity")
	private String salesQuantity;

	/**
	 * 优惠信息标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * <p>Getter for the field <code>cover</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCover() {
		return this.cover;
	}
	/**
	 * <p>Setter for the field <code>cover</code>.</p>
	 *
	 * @param cover a {@link java.lang.String} object.
	 */
	public void setCover(String cover) {
		this.cover = cover;
	}

	/**
	 * <p>Getter for the field <code>description</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * <p>Setter for the field <code>description</code>.</p>
	 *
	 * @param description a {@link java.lang.String} object.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * <p>Getter for the field <code>isAll</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsAll() {
		return this.isAll;
	}
	/**
	 * <p>Setter for the field <code>isAll</code>.</p>
	 *
	 * @param isAll a {@link java.lang.String} object.
	 */
	public void setIsAll(String isAll) {
		this.isAll = isAll;
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
	 * <p>Getter for the field <code>promoSubType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPromoSubType() {
		return this.promoSubType;
	}
	/**
	 * <p>Setter for the field <code>promoSubType</code>.</p>
	 *
	 * @param promoSubType a {@link java.lang.String} object.
	 */
	public void setPromoSubType(String promoSubType) {
		this.promoSubType = promoSubType;
	}

	/**
	 * <p>Getter for the field <code>promotionType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPromotionType() {
		return this.promotionType;
	}
	/**
	 * <p>Setter for the field <code>promotionType</code>.</p>
	 *
	 * @param promotionType a {@link java.lang.String} object.
	 */
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	/**
	 * <p>Getter for the field <code>purchaseMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPurchaseMode() {
		return this.purchaseMode;
	}
	/**
	 * <p>Setter for the field <code>purchaseMode</code>.</p>
	 *
	 * @param purchaseMode a {@link java.lang.String} object.
	 */
	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
	}

	/**
	 * <p>Getter for the field <code>salesQuantity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSalesQuantity() {
		return this.salesQuantity;
	}
	/**
	 * <p>Setter for the field <code>salesQuantity</code>.</p>
	 *
	 * @param salesQuantity a {@link java.lang.String} object.
	 */
	public void setSalesQuantity(String salesQuantity) {
		this.salesQuantity = salesQuantity;
	}

	/**
	 * <p>Getter for the field <code>subject</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubject() {
		return this.subject;
	}
	/**
	 * <p>Setter for the field <code>subject</code>.</p>
	 *
	 * @param subject a {@link java.lang.String} object.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
