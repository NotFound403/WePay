package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商品信息集合，JSON格式,注意，该参数将覆盖原有已经设置的数据,即如想除去某一商品，去除后重新设置该字段值。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Product extends AlipayObject {

	private static final long serialVersionUID = 2698213785762688748L;

	/**
	 * 油品编号。（可设置的油品编号名称：89#，92#，95#，98#，101#，10#，5#，0#，-10#，-20#，-35#，-50#）。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 油品价格（元/升），加油站列表页展示给用户。保留小数点后两位，单位元
	 */
	@ApiField("price")
	private String price;

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

}
