package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 销售产品
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SaleProduct extends AlipayObject {

	private static final long serialVersionUID = 2678668855794364482L;

	/**
	 * 宝贝来源 例如：TAOBAO ALIPAY
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 销售产品DB ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 面额
	 */
	@ApiField("market_price")
	private String marketPrice;

	/**
	 * 充值产品提供商
	 */
	@ApiField("product_provider")
	private ProductProvider productProvider;

	/**
	 * 销售价格
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 产品状态, 0为不可用，1为可用
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>channelType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelType() {
		return this.channelType;
	}
	/**
	 * <p>Setter for the field <code>channelType</code>.</p>
	 *
	 * @param channelType a {@link java.lang.String} object.
	 */
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * <p>Getter for the field <code>marketPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMarketPrice() {
		return this.marketPrice;
	}
	/**
	 * <p>Setter for the field <code>marketPrice</code>.</p>
	 *
	 * @param marketPrice a {@link java.lang.String} object.
	 */
	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}

	/**
	 * <p>Getter for the field <code>productProvider</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ProductProvider} object.
	 */
	public ProductProvider getProductProvider() {
		return this.productProvider;
	}
	/**
	 * <p>Setter for the field <code>productProvider</code>.</p>
	 *
	 * @param productProvider a {@link cn.felord.wepay.ali.sdk.api.domain.ProductProvider} object.
	 */
	public void setProductProvider(ProductProvider productProvider) {
		this.productProvider = productProvider;
	}

	/**
	 * <p>Getter for the field <code>salePrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSalePrice() {
		return this.salePrice;
	}
	/**
	 * <p>Setter for the field <code>salePrice</code>.</p>
	 *
	 * @param salePrice a {@link java.lang.String} object.
	 */
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
