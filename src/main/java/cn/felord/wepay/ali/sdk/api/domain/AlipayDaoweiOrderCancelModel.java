package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 到位订单取消
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDaoweiOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1191996585725595731L;

	/**
	 * 到位业务订单号。用户在到位下单时，由到位系统生成的32位全局唯一数字 id。
通过应用中的应用网关post发送给商户（应用网关配置参考链接：https%3A%2F%2Fdoc.open.alipay.com%2Fdocs%2Fdoc.htm%3Fspm%3Da219a.7629140.0.0.TcIuKL%26treeId%3D193%26articleId%3D105310%26docType%3D1）。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 取消订单原因。取消订单时必须填写订单取消原因。
	 */
	@ApiField("reason")
	private String reason;

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

	/**
	 * <p>Getter for the field <code>reason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReason() {
		return this.reason;
	}
	/**
	 * <p>Setter for the field <code>reason</code>.</p>
	 *
	 * @param reason a {@link java.lang.String} object.
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

}
