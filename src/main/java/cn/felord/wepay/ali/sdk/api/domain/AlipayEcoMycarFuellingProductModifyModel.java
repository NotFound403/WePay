package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 加油站门店商品营销信息设置接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarFuellingProductModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7524749891429474733L;

	/**
	 * 外部门店编号系统唯一，该值添加后不可修改，与字段shop_id不能同时为空
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 商品信息集合，JSON格式,注意，该参数将覆盖原有已经设置的数据,即如想除去某一商品，去除后重新设置该字段值。
	 */
	@ApiListField("product")
	@ApiField("product")
	private List<Product> product;

	/**
	 * 促销信息集合，JSON格式
	 */
	@ApiListField("sale")
	@ApiField("sale")
	private List<Sale> sale;

	/**
	 * 车主平台内部门店编号，系统唯一,与字段out_shop_id不能同时为空
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * <p>Getter for the field <code>outShopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutShopId() {
		return this.outShopId;
	}
	/**
	 * <p>Setter for the field <code>outShopId</code>.</p>
	 *
	 * @param outShopId a {@link java.lang.String} object.
	 */
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	/**
	 * <p>Getter for the field <code>product</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Product> getProduct() {
		return this.product;
	}
	/**
	 * <p>Setter for the field <code>product</code>.</p>
	 *
	 * @param product a {@link java.util.List} object.
	 */
	public void setProduct(List<Product> product) {
		this.product = product;
	}

	/**
	 * <p>Getter for the field <code>sale</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Sale> getSale() {
		return this.sale;
	}
	/**
	 * <p>Setter for the field <code>sale</code>.</p>
	 *
	 * @param sale a {@link java.util.List} object.
	 */
	public void setSale(List<Sale> sale) {
		this.sale = sale;
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
