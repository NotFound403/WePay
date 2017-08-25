package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.order.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMaintainOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7251124311753246945L;

	/** 
	 * 业务订单编号，规则28位；yyMMddHHmmss&#160;+&#160;&#160;行业标识3位+模块标识2位&#160;+uid（后六位）&#160;+序列值（5位）
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * <p>Setter for the field <code>orderNo</code>.</p>
	 *
	 * @param orderNo a {@link java.lang.String} object.
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
