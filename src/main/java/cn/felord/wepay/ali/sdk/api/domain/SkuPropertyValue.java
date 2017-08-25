package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商品库存单元属性值详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SkuPropertyValue extends AlipayObject {

	private static final long serialVersionUID = 6268631313698377378L;

	/**
	 * 外部sku属性值ID,由外部商户定义
	 */
	@ApiField("out_pv_id")
	private String outPvId;

	/**
	 * 外部商户sku属性值
	 */
	@ApiField("value")
	private String value;

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
	 * <p>Getter for the field <code>value</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValue() {
		return this.value;
	}
	/**
	 * <p>Setter for the field <code>value</code>.</p>
	 *
	 * @param value a {@link java.lang.String} object.
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
