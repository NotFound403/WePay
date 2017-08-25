package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 用于服务商回查服务市场订单明细信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenServicemarketOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3217381144942241361L;

	/**
	 * 商户订单ID号
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 从第几页开始查询
	 */
	@ApiField("start_page")
	private String startPage;

	/**
	 * <p>Getter for the field <code>commodityOrderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommodityOrderId() {
		return this.commodityOrderId;
	}
	/**
	 * <p>Setter for the field <code>commodityOrderId</code>.</p>
	 *
	 * @param commodityOrderId a {@link java.lang.String} object.
	 */
	public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

	/**
	 * <p>Getter for the field <code>startPage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStartPage() {
		return this.startPage;
	}
	/**
	 * <p>Setter for the field <code>startPage</code>.</p>
	 *
	 * @param startPage a {@link java.lang.String} object.
	 */
	public void setStartPage(String startPage) {
		this.startPage = startPage;
	}

}
