package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 洗车保养服务商品变更
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMaintainServiceproductUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 5689699555487928155L;

	/**
	 * 请求操作（INSERT：新增；MODIFY：修改；DELETE：删除；QUERY：查询）
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 外部服务商品标示，ISV保证唯一性。ISV同一门店同一服务项同一产品名称，只能配置一个商品。（存在同一服务项类目对应多个产品情况，5座普通洗车、5座SUV洗车）
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * 查询删除：否
新增修改：必填
	 */
	@ApiField("shop_product")
	private MaitainShopProduct shopProduct;

	/**
	 * <p>Getter for the field <code>operationType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperationType() {
		return this.operationType;
	}
	/**
	 * <p>Setter for the field <code>operationType</code>.</p>
	 *
	 * @param operationType a {@link java.lang.String} object.
	 */
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	/**
	 * <p>Getter for the field <code>outProductId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutProductId() {
		return this.outProductId;
	}
	/**
	 * <p>Setter for the field <code>outProductId</code>.</p>
	 *
	 * @param outProductId a {@link java.lang.String} object.
	 */
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

	/**
	 * <p>Getter for the field <code>shopProduct</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MaitainShopProduct} object.
	 */
	public MaitainShopProduct getShopProduct() {
		return this.shopProduct;
	}
	/**
	 * <p>Setter for the field <code>shopProduct</code>.</p>
	 *
	 * @param shopProduct a {@link cn.felord.wepay.ali.sdk.api.domain.MaitainShopProduct} object.
	 */
	public void setShopProduct(MaitainShopProduct shopProduct) {
		this.shopProduct = shopProduct;
	}

}
