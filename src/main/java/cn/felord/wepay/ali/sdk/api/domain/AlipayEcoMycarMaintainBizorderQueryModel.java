package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 订单查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMaintainBizorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1535535495336438786L;

	/**
	 * 车主平台生成的订单号。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo() {
		return this.orderNo;
	}
	/**
	 * <p>Setter for the field <code>orderNo</code>.</p>
	 *
	 * @param orderNo a {@link java.lang.String} object.
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
