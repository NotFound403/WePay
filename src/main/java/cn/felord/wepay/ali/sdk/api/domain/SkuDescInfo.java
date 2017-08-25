package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 库存量单位描述对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SkuDescInfo extends AlipayObject {

	private static final long serialVersionUID = 8596768684972796838L;

	/**
	 * 城市行政代码，用于不同城市定价时使用，默认价格使用-1
	 */
	@ApiField("city")
	private String city;

	/**
	 * 第三方商户定义的外部属性值Id,多个id用英文逗号分隔
	 */
	@ApiField("out_pv_id")
	private String outPvId;

	/**
	 * 商户库存量单位id.由外部商户生成,保证同一个商品下的id是唯一，只支持数字、字母和下划线
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * <p>Getter for the field <code>city</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCity() {
		return this.city;
	}
	/**
	 * <p>Setter for the field <code>city</code>.</p>
	 *
	 * @param city a {@link java.lang.String} object.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * <p>Getter for the field <code>outPvId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutPvId() {
		return this.outPvId;
	}
	/**
	 * <p>Setter for the field <code>outPvId</code>.</p>
	 *
	 * @param outPvId a {@link java.lang.String} object.
	 */
	public void setOutPvId(String outPvId) {
		this.outPvId = outPvId;
	}

	/**
	 * <p>Getter for the field <code>outSkuId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutSkuId() {
		return this.outSkuId;
	}
	/**
	 * <p>Setter for the field <code>outSkuId</code>.</p>
	 *
	 * @param outSkuId a {@link java.lang.String} object.
	 */
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

}
