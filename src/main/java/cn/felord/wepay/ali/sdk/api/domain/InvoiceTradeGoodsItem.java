package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝交易模型交易内容项模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvoiceTradeGoodsItem extends AlipayObject {

	private static final long serialVersionUID = 4644127364228171765L;

	/**
	 * 商品类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商户设置的商品编号
	 */
	@ApiField("goods_no")
	private String goodsNo;

	/**
	 * 商品项支付金额
	 */
	@ApiField("goods_sum_amount")
	private String goodsSumAmount;

	/**
	 * 商品单价，单位元，精确到小数点后两位
	 */
	@ApiField("price")
	private String price;

	/**
	 * 购买数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 购买商品规格型号描述
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 购买商品单位描述
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * <p>Getter for the field <code>category</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategory() {
		return this.category;
	}
	/**
	 * <p>Setter for the field <code>category</code>.</p>
	 *
	 * @param category a {@link java.lang.String} object.
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * <p>Getter for the field <code>goodsName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGoodsName() {
		return this.goodsName;
	}
	/**
	 * <p>Setter for the field <code>goodsName</code>.</p>
	 *
	 * @param goodsName a {@link java.lang.String} object.
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * <p>Getter for the field <code>goodsNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGoodsNo() {
		return this.goodsNo;
	}
	/**
	 * <p>Setter for the field <code>goodsNo</code>.</p>
	 *
	 * @param goodsNo a {@link java.lang.String} object.
	 */
	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	/**
	 * <p>Getter for the field <code>goodsSumAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGoodsSumAmount() {
		return this.goodsSumAmount;
	}
	/**
	 * <p>Setter for the field <code>goodsSumAmount</code>.</p>
	 *
	 * @param goodsSumAmount a {@link java.lang.String} object.
	 */
	public void setGoodsSumAmount(String goodsSumAmount) {
		this.goodsSumAmount = goodsSumAmount;
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
	 * @return a {@link java.lang.String} object.
	 */
	public String getQuantity() {
		return this.quantity;
	}
	/**
	 * <p>Setter for the field <code>quantity</code>.</p>
	 *
	 * @param quantity a {@link java.lang.String} object.
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	/**
	 * <p>Getter for the field <code>specification</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpecification() {
		return this.specification;
	}
	/**
	 * <p>Setter for the field <code>specification</code>.</p>
	 *
	 * @param specification a {@link java.lang.String} object.
	 */
	public void setSpecification(String specification) {
		this.specification = specification;
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
