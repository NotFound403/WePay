package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商品列表信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class GoodsDetail extends AlipayObject {

	private static final long serialVersionUID = 4168895484782379963L;

	/**
	 * 支付宝定义的统一商品编号
	 */
	@ApiField("alipay_goods_id")
	private String alipayGoodsId;

	/**
	 * 商品描述信息
	 */
	@ApiField("body")
	private String body;

	/**
	 * 商品类目
	 */
	@ApiField("goods_category")
	private String goodsCategory;

	/**
	 * 商品的编号
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品单价，单位为元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品的展示地址
	 */
	@ApiField("show_url")
	private String showUrl;

	/**
	 * <p>Getter for the field <code>alipayGoodsId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayGoodsId() {
		return this.alipayGoodsId;
	}
	/**
	 * <p>Setter for the field <code>alipayGoodsId</code>.</p>
	 *
	 * @param alipayGoodsId a {@link java.lang.String} object.
	 */
	public void setAlipayGoodsId(String alipayGoodsId) {
		this.alipayGoodsId = alipayGoodsId;
	}

	/**
	 * <p>Getter for the field <code>body</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBody() {
		return this.body;
	}
	/**
	 * <p>Setter for the field <code>body</code>.</p>
	 *
	 * @param body a {@link java.lang.String} object.
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * <p>Getter for the field <code>goodsCategory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGoodsCategory() {
		return this.goodsCategory;
	}
	/**
	 * <p>Setter for the field <code>goodsCategory</code>.</p>
	 *
	 * @param goodsCategory a {@link java.lang.String} object.
	 */
	public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

	/**
	 * <p>Getter for the field <code>goodsId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGoodsId() {
		return this.goodsId;
	}
	/**
	 * <p>Setter for the field <code>goodsId</code>.</p>
	 *
	 * @param goodsId a {@link java.lang.String} object.
	 */
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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
	 * <p>Getter for the field <code>showUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShowUrl() {
		return this.showUrl;
	}
	/**
	 * <p>Setter for the field <code>showUrl</code>.</p>
	 *
	 * @param showUrl a {@link java.lang.String} object.
	 */
	public void setShowUrl(String showUrl) {
		this.showUrl = showUrl;
	}

}
