package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 订单状态推进接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDaoweiOrderTransferModel extends AlipayObject {

	private static final long serialVersionUID = 7331517151676393987L;

	/**
	 * 备注信息。商户在推进订单状态时填写的备注信息，不超过500字符。
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 需要推进的订单状态。目前支持的订单动作是：START_SERVICE(派单模式服务开始)；PROVIDER_CONFIRMED (服务者完成服务)。
	 */
	@ApiField("order_action")
	private String orderAction;

	/**
	 * 到位业务订单号。用户在到位下单时，由到位系统生成的32位全局唯一数字 id。
通过应用中的应用网关post发送给商户（应用网关配置参考链接：https%3A%2F%2Fdoc.open.alipay.com%2Fdocs%2Fdoc.htm%3Fspm%3Da219a.7629140.0.0.TcIuKL%26treeId%3D193%26articleId%3D105310%26docType%3D1）。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>orderAction</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderAction() {
		return this.orderAction;
	}
	/**
	 * <p>Setter for the field <code>orderAction</code>.</p>
	 *
	 * @param orderAction a {@link java.lang.String} object.
	 */
	public void setOrderAction(String orderAction) {
		this.orderAction = orderAction;
	}

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
