package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 到位的单笔订单拒绝接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDaoweiOrderRefuseModel extends AlipayObject {

	private static final long serialVersionUID = 3275551988294331344L;

	/**
	 * 到位业务订单号，全局唯一，由32位数字组成，用户在到位下单时系统生成并消息同步给商家，商户只能查自己同步到的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 拒单理由，第三方商户拒绝接单时填写的拒单理由，必填，长度不超过500字符
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
