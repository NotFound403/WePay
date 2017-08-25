package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 钱包扫码的产品上下文对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingProductContext extends AlipayObject {

	private static final long serialVersionUID = 4516572721269377516L;

	/**
	 * 客户端client_id
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * product需要接入的时候和支付宝码平台约定。
目前仅支持建行app使用ccb_wallet
	 */
	@ApiField("product")
	private String product;

	/**
	 * 版本号
	 */
	@ApiField("product_version")
	private String productVersion;

	/**
	 * <p>Getter for the field <code>clientId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClientId() {
		return this.clientId;
	}
	/**
	 * <p>Setter for the field <code>clientId</code>.</p>
	 *
	 * @param clientId a {@link java.lang.String} object.
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * <p>Getter for the field <code>product</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProduct() {
		return this.product;
	}
	/**
	 * <p>Setter for the field <code>product</code>.</p>
	 *
	 * @param product a {@link java.lang.String} object.
	 */
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * <p>Getter for the field <code>productVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductVersion() {
		return this.productVersion;
	}
	/**
	 * <p>Setter for the field <code>productVersion</code>.</p>
	 *
	 * @param productVersion a {@link java.lang.String} object.
	 */
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

}
